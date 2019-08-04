/**
 *
 */
package cn.vbill.middleware.shardingjdbc.demo.service.impl;

import cn.vbill.middleware.shardingjdbc.demo.entity.Merchant;
import cn.vbill.middleware.shardingjdbc.demo.mapper.MerchantMapper;
import cn.vbill.middleware.shardingjdbc.demo.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private MerchantMapper merchantDao;


    @Override
    public Merchant selectById(Long id) {
        return merchantDao.selectById(id);
    }

    @Override
    public Integer insert(Merchant merchant) {
        return merchantDao.insert(merchant);
    }

    @Override
    public List<Merchant> findList(Merchant merchant) {
        return merchantDao.findList(merchant);
    }
}
