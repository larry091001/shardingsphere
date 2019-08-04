package cn.vbill.middleware.shardingjdbc.demo.service;

import cn.vbill.middleware.shardingjdbc.demo.entity.Bill;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
public interface BillService {

    Bill selectById(Long id);

    Integer insert(Bill bill);

    Integer update(Bill bill);

    List<Bill> findList(Long id, Long userId);
}
