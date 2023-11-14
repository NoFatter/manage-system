package org.nofat.manage.controller;

import cn.dev33.satoken.annotation.SaCheckRole;
import org.nofat.manage.common.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController 测试控制器
 *
 * @author liyutao
 * @version 2023/11/14 16:29
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    @SaCheckRole("admin")
    public R<String> testHello(){
        return R.ok();
    }
}
