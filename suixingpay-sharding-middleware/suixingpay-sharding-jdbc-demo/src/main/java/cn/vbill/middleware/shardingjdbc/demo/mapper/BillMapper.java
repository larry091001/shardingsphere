package cn.vbill.middleware.shardingjdbc.demo.mapper;


import cn.vbill.middleware.shardingjdbc.demo.entity.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Mapper
public interface BillMapper {

    Bill selectById(Long id);


    Integer insert(@Param("bill") Bill user);


    Integer update(@Param("bill") Bill user);


    List<Bill> findList(@Param("id") Long id, @Param("userId") Long userId);

}