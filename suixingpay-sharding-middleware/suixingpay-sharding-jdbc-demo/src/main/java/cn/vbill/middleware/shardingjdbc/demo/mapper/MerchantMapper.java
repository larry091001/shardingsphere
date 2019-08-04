package cn.vbill.middleware.shardingjdbc.demo.mapper;


import cn.vbill.middleware.shardingjdbc.demo.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Mapper
public interface MerchantMapper {
    List<Merchant> findList(@Param("merchant") Merchant merchant);
    Integer insert(@Param("merchant") Merchant merchant);
    Merchant selectById(Long id);
}