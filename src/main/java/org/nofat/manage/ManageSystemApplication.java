package org.nofat.manage;

import cn.dev33.satoken.SaManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ManageSystemApplication {
    private static final Logger log = LoggerFactory.getLogger(ManageSystemApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ManageSystemApplication.class, args);
        log.info("启动成功,SA-Token配置如下"+ SaManager.getConfig());
    }

}
