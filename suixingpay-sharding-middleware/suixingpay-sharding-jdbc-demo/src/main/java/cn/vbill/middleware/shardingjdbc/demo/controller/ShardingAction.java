/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月17日 16:18
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.demo.controller;

import cn.vbill.middleware.shardingjdbc.core.annotation.SharedDataSource;
import cn.vbill.middleware.shardingjdbc.core.routing.algorithm.hint.HintTools;
import cn.vbill.middleware.shardingjdbc.demo.entity.*;
import cn.vbill.middleware.shardingjdbc.demo.service.BillService;
import cn.vbill.middleware.shardingjdbc.demo.service.MerchantService;
import cn.vbill.middleware.shardingjdbc.demo.service.RegionService;
import cn.vbill.middleware.shardingjdbc.demo.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年05月17日 16:18
 * @version: V1.0
 * @review: zkevin/2018年05月17日 16:18
 */
@RequestMapping("/shared")
@RestController
public class ShardingAction {
    @Autowired
    private BillService billService;
    @Autowired
    private UserService userService;
    @Autowired
    private RegionService regionService;

    @Autowired
    private MerchantService merchantService;

    @SharedDataSource("sharding_db")
    private DataSource source;

    @RequestMapping(value = "/newRegion", method = {RequestMethod.GET, RequestMethod.POST})
    public Region create(Long id, String name, String code) {
        regionService.insert(new Region(id,
                StringUtils.isBlank(name) ? System.nanoTime() + "" : name, StringUtils.isBlank(code) ? System.nanoTime() + "" : code));
        return regionService.selectById(id);
    }

    @GetMapping("/regions")
    public List<Region> find(Long id, String name, String code) {
        return regionService.findList(new Region(id, name, code));
    }


    @GetMapping("/newBill")
    public Bill create(Long id, Long userId, Long amount) {
        billService.insert(new Bill(id, userId, null != amount ? amount : System.nanoTime()));
        return billService.selectById(id);
    }

    @GetMapping("/bills")
    public List<Bill> find(Long id, Long userId) {
        return billService.findList(id, userId);
    }


    @GetMapping("/newUser")
    public User newUser(Long id, String name, String token) {
        userService.insert(new User(id, StringUtils.isBlank(name) ? System.nanoTime() + "" : name,
                StringUtils.isBlank(token) ? System.nanoTime() + "" : token));
        return userService.selectById(id);
    }

    @GetMapping("/users")
    public List<User> users(Long id, String name, String token) {
        return userService.findList(new User(id, name, token));
    }


    @GetMapping("/newLog")
    public User newUserLog(Long id, Long userId, String log) {
        userService.insertLog(new UserLog(id, userId,
                StringUtils.isBlank(log) ? System.nanoTime() + "" : log));
        return userService.selectById(id);
    }

    @GetMapping("/logs")
    public List<UserLog> logs(Long id, Long userId, String log) {
        return userService.findLogList(new UserLog(id, userId, log));
    }

    @GetMapping("/newmerchant")
    public Merchant newmerchant(Long id, String name, String tag) {
        merchantService.insert(new Merchant(id,
                StringUtils.isBlank(name) ? System.nanoTime() + "" : name));
        return merchantService.selectById(id);
    }

    /***
     * 
     * @param id
     * @param name
     * @param tag
     * @return
     */
    @GetMapping("/merchants")
    public List<Merchant> merchants(Long id, String name, String tag) {
    	//TODO addDatabaseShardingValue 2.0.3 支持对colum进行分片
        HintTools.addDatabaseShardingValue("t_merchant", tag);
        HintTools.addTableShardingValue("t_merchant", id);
        
        List<Merchant> merchants = merchantService.findList(new Merchant(id, name));
        HintTools.close();
        return merchants;
    }
}
