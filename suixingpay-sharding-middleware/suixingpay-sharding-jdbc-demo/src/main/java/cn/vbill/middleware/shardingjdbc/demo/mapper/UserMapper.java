package cn.vbill.middleware.shardingjdbc.demo.mapper;


import cn.vbill.middleware.shardingjdbc.demo.entity.User;
import cn.vbill.middleware.shardingjdbc.demo.entity.UserLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@Mapper
public interface UserMapper {

    User selectById(Long id);

    Integer insert(@Param("user") User user);

    Integer update(@Param("user") User user);

    List<User> findList(@Param("user") User user);



    UserLog selectLogById(Long id);
    Integer insertLog(@Param("log") UserLog log);
    List<UserLog> findLogList(@Param("log") UserLog log);

}