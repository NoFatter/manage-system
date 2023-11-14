package org.nofat.manage;

import org.junit.jupiter.api.Test;
import org.nofat.manage.common.Constants;
import org.nofat.manage.common.R;
import org.nofat.manage.controller.LoginController;
import org.nofat.manage.entity.Role;
import org.nofat.manage.entity.User;
import org.nofat.manage.repository.UserRepository;
import org.nofat.manage.service.RoleService;
import org.nofat.manage.service.UserService;
import org.nofat.manage.vo.login.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class ManageSystemApplicationTests {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    private static final Logger log = LoggerFactory.getLogger(ManageSystemApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Test
    void mongoTest(){
        User user = new User();
        user.setUsername("测试");
        user.setPassword("123456789");
        userRepository.insert(user);
    }

    @Test
    void mongoFind(){

//        List<User> res = userRepository.findByUsername("test");
        User res = userRepository.findOneByUsername("test");
        System.out.println(res);
    }

   @Test
   void mongoTestExist(){
        if(userRepository.existsByUsername("test")){
            System.out.println("已存在");
        }
   }

   @Test
    void userInsertTest() throws Exception {
        User user = new User();
        user.setUsername("insertUser");
        user.setPassword("123456");
        R<User> res= userService.insertUser(user);
        if(res.getCode().equals(Constants.successCode)){
            User test = userService.selectOneByUsername(res.getContent().getUsername()).getContent();
            log.info(user.getUsername());
        }else {
            log.error(res.getMessage());
        }
   }
   @Test
   void addAdminUser() throws Exception {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        R<User> res = userService.insertUser(user);
       if(res.getCode().equals(Constants.successCode)){
           User test = userService.selectOneByUsername(res.getContent().getUsername()).getContent();
           log.info(user.getUsername());
       }else {
           log.error(res.getMessage());
       }
   }

    @Test
    void addAdminRole() throws Exception {
        User user = userService.selectOneByUsername("admin").getContent();
        Role role = new Role();
        role.setUserId(String.valueOf(user.get_id()));
        role.setRoleName("admin");
        R<Role> res = roleService.insertRole(role);
    }

}
