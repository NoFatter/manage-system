package org.nofat.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.nofat.manage.common.BaseEntity;

/**
 * Permission 权限
 *
 * @author liyutao
 * @version 2023/11/14 15:50
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class Permission extends BaseEntity {
    private String roleId;
    private String permissionName;
}
