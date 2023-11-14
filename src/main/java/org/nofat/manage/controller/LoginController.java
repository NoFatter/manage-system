package org.nofat.manage.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.nofat.manage.common.Constants;
import org.nofat.manage.common.R;
import org.nofat.manage.service.UserService;
import org.nofat.manage.vo.login.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * loginController 登录控制器
 *
 * @author liyutao
 * @version 2023/11/01 09:22
 **/
@RestController
@Api(value = "登录Controller",tags = {"登录访问接口"})
@RequestMapping("/admin")
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    //用户服务
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation(value = "登录")
    public R<String> login(@Validated @RequestBody LoginVo user){
        String username = user.getUsername();
        String password = user.getPassword();
        R<String> res = userService.login(username,password);
        if(res.getCode().equals(Constants.errorCode)){
            return R.error(res.getMessage());
        }
        return R.ok(res.getContent()+"登录成功");
    }
    @GetMapping("/logout")
    @ApiOperation(value = "登出")
    @SaCheckLogin
    public R<String> logout(){
        StpUtil.logout();
        return R.ok();
    }
    @GetMapping(value = "/isLogin")
    @ApiOperation(value = "是否登录")
    public R<String> isLogin(){
        if(!StpUtil.isLogin()){
            return R.error("未登录");
        }
        return R.ok("已登录");
    }
}
