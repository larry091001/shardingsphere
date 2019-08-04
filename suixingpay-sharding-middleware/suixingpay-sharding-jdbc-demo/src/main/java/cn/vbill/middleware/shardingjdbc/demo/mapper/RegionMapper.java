package cn.vbill.middleware.shardingjdbc.demo.mapper;


import cn.vbill.middleware.shardingjdbc.demo.entity.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Mapper
public interface RegionMapper {
    List<Region> findList(@Param("region") Region region);
    Integer insert(@Param("region") Region region);
    Region selectById(Long id);
}