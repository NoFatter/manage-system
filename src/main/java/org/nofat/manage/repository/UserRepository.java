package org.nofat.manage.repository;

import org.nofat.manage.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * UserRepository
 *
 * @author liyutao
 * @version 2023/10/27 14:38
 **/
public interface UserRepository extends MongoRepository<User,String> {
    List<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    User findOneByUsername(String username);

}
