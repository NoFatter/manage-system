package org.nofat.manage.repository;

import org.nofat.manage.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * RoleRepository
 *
 * @author liyutao
 * @version 2023/11/14 15:58
 **/
public interface RoleRepository extends MongoRepository<Role,String> {
    List<Role> findByUserId(String userId);

    Boolean existsByRoleName(String roleName);
}
