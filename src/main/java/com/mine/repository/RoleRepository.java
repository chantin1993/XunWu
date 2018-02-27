package com.mine.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mine.entity.Role;

/**
 * 角色数据DAO
 * Created by zjh.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findRolesByUserId(Long userId);
}
