package org.nofat.manage.service.impl;

import cn.dev33.satoken.stp.StpInterface;
import org.nofat.manage.entity.Role;
import org.nofat.manage.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * StpInterfaceImpl 自定义权限实现
 *
 * @author liyutao
 * @version 2023/11/14 15:39
 **/
@Component
public class StpInterfaceImpl implements StpInterface {
    @Autowired
    private RoleService roleService;
    private static final Logger log = LoggerFactory.getLogger(StpInterfaceImpl.class);
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        return null;
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        List<String> res = new LinkedList<>();
        List<Role> roles = roleService.selectByUserId((String) loginId).getContent();
        for(Role role:roles){
            res.add(role.getRoleName());
        }
        return res;
    }
}
