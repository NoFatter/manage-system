package org.nofat.manage.service;

import org.nofat.manage.common.R;
import org.nofat.manage.entity.Role;

import java.util.List;

/**
 * RoleService 角色服务
 *
 * @author liyutao
 * @version 2023/11/14 15:52
 **/
public interface RoleService {
    R<List<Role>> selectByUserId(String userId);

    R<Role> insertRole(Role role);
}
