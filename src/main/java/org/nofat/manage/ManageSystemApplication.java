package org.nofat.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class ManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageSystemApplication.class, args);
    }

}
