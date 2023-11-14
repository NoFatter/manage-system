package org.nofat.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.nofat.manage.common.BaseEntity;

/**
 * Role 角色
 *
 * @author liyutao
 * @version 2023/11/14 15:47
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class Role extends BaseEntity {
    private String roleName;
    private String userId;
}
