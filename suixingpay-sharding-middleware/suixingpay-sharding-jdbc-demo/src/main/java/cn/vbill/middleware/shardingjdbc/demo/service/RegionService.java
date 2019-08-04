package cn.vbill.middleware.shardingjdbc.demo.service;

import cn.vbill.middleware.shardingjdbc.demo.entity.Region;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
public interface RegionService {
    Region selectById(Long id);
    Integer insert(Region region);
    List<Region> findList(Region region);
}
