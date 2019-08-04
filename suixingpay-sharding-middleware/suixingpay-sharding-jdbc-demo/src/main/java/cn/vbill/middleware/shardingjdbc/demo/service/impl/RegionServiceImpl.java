/**
 *
 */
package cn.vbill.middleware.shardingjdbc.demo.service.impl;

import cn.vbill.middleware.shardingjdbc.demo.entity.Region;
import cn.vbill.middleware.shardingjdbc.demo.mapper.RegionMapper;
import cn.vbill.middleware.shardingjdbc.demo.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionMapper regionDao;


    @Override
    public Region selectById(Long id) {
        return regionDao.selectById(id);
    }

    @Override
    public Integer insert(Region region) {
        return regionDao.insert(region);
    }

    @Override
    public List<Region> findList(Region region) {
        return regionDao.findList(region);
    }
}
