package cn.vbill.middleware.shardingjdbc.demo.service;

import cn.vbill.middleware.shardingjdbc.demo.entity.Merchant;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
public interface MerchantService {
    Merchant selectById(Long id);
    Integer insert(Merchant merchant);
    List<Merchant> findList(Merchant merchant);
}
