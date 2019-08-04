/**
 *
 */
package cn.vbill.middleware.shardingjdbc.demo.service.impl;

import cn.vbill.middleware.shardingjdbc.demo.entity.Bill;
import cn.vbill.middleware.shardingjdbc.demo.mapper.BillMapper;
import cn.vbill.middleware.shardingjdbc.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billDao;

    @Override
    public Bill selectById(Long id) {
        return billDao.selectById(id);
    }

    @Override
    public Integer insert(Bill bill) {
        return billDao.insert(bill);
    }

    @Override
    public Integer update(Bill bill) {
        return billDao.update(bill);
    }

    @Override
    public List<Bill> findList(Long id, Long userId) {
        return billDao.findList(id, userId);
    }
}
