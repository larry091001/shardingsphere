package cn.vbill.middleware.shardingjdbc.demo.service;

import cn.vbill.middleware.shardingjdbc.demo.entity.User;
import cn.vbill.middleware.shardingjdbc.demo.entity.UserLog;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
public interface UserService {

    User selectById(Long id);

    Integer insert(User user);

    Integer update(User user);

    List<User> findList(User user);

    UserLog selectLogById(Long id);
    Integer insertLog(UserLog log);
    List<UserLog> findLogList(UserLog log);
}
