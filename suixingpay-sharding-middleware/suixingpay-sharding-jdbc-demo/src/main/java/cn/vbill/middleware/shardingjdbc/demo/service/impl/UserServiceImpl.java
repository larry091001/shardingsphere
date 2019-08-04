/**
 *
 */
package cn.vbill.middleware.shardingjdbc.demo.service.impl;

import cn.vbill.middleware.shardingjdbc.demo.entity.User;
import cn.vbill.middleware.shardingjdbc.demo.entity.UserLog;
import cn.vbill.middleware.shardingjdbc.demo.mapper.UserMapper;
import cn.vbill.middleware.shardingjdbc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Override
    public User selectById(Long id) {
        return userDao.selectById(id);
    }

    @Override
    public Integer insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public Integer update(User user) {
        return userDao.update(user);
    }

    @Override
    public List<User> findList(User user) {
        return userDao.findList(user);
    }

    @Override
    public UserLog selectLogById(Long id) {
        return userDao.selectLogById(id);
    }

    @Override
    public Integer insertLog(UserLog log) {
        return userDao.insertLog(log);
    }

    @Override
    public List<UserLog> findLogList(UserLog log) {
        return userDao.findLogList(log);
    }
}
