package org.nofat.manage.vo.login;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * LoginVo 登录视图对象
 *
 * @author liyutao
 * @version 2023/11/02 14:35
 **/
@Data
public class LoginVo {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
