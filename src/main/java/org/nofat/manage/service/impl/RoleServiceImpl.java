package org.nofat.manage.service.impl;

import org.nofat.manage.common.R;
import org.nofat.manage.entity.Role;
import org.nofat.manage.repository.RoleRepository;
import org.nofat.manage.repository.UserRepository;
import org.nofat.manage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RoleServiceImpl 角色服务实现类
 *
 * @author liyutao
 * @version 2023/11/14 15:57
 **/
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public R<List<Role>> selectByUserId(String userId) {
        List<Role> roles = roleRepository.findByUserId(userId);
        return R.ok(roles);
    }

    @Override
    public R<Role> insertRole(Role role) {
        if(roleRepository.existsByRoleName(role.getRoleName())){
            return R.error("该角色已存在");
        }
        return R.ok(roleRepository.insert(role));
    }

}
