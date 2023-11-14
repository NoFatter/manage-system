package org.nofat.manage.service.impl;

import org.nofat.manage.common.R;
import org.nofat.manage.entity.User;
import org.nofat.manage.repository.UserRepository;
import org.nofat.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl 用户服务实现类
 *
 * @author liyutao
 * @version 2023/10/27 15:45
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public R<List<User>> selectByUsername(String username) {
        List<User> res = userRepository.findByUsername(username);
        return R.ok(res);
    }

    @Override
    public R<User> insertUser(User user) {
        if(userRepository.existsByUsername(user.getUsername())){
            return R.error("用户名已存在");
        }
        return R.ok(userRepository.insert(user));
    }

    @Override
    public R<User> selectOneByUsername(String username) throws Exception {
        User user = userRepository.findOneByUsername(username);
        if(user==null){
            throw new Exception("未找到该用户");
        }
        return R.ok(user);
    }

    @Override
    public R<String> login(String username, String password) {
        User user = userRepository.findOneByUsername(username);
        if(user==null){
            return R.error("用户不存在");
        }
        if(!user.getPassword().equals(password)){
            return R.error("密码错误");
        }
        return R.ok(user.getUsername());
    }


}
