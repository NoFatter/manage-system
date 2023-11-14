package org.nofat.manage.service;


import org.nofat.manage.common.R;
import org.nofat.manage.entity.User;

import java.util.List;

/**
 * UserService 用户服务
 *
 * @author liyutao
 * @version 2023/10/27 15:45
 **/
public interface UserService {
    /**
     * 根据用户名获取用户列表
     * @return R<List<User>>
     * @author NoFat
     */
    R<List<User>> selectByUsername(String username);
    /**
     * 新增用户
     * @return R<User>
     * @author NoFat
     */
    R<User> insertUser(User user);
    /**
     * 通过用户名查找用户
     * @return R<User>
     * @author NoFat
     */
    R<User> selectOneByUsername(String username) throws Exception;

    R<String> login(String username,String password);
}
