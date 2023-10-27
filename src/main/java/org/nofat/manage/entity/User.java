package org.nofat.manage.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.nofat.manage.common.BaseEntity;

/**
 * User 用户
 *
 * @author liyutao
 * @version 2023/10/27 14:18
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class User extends BaseEntity {
    private String username;
    private String password;
}
