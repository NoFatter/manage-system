package org.nofat.manage;

import org.junit.jupiter.api.Test;
import org.nofat.manage.entity.User;
import org.nofat.manage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.time.LocalDateTime;

@SpringBootTest
class ManageSystemApplicationTests {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void mongoTest(){
        User user = new User();
        user.setUsername("testTime");
        user.setPassword("password");
//        user.setCreateTime(LocalDateTime.now());
//        user.setUpdateTime(LocalDateTime.now());
        userRepository.insert(user);
    }

}
