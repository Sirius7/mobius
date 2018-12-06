package com.ck.mobius.repository;

import com.ck.mobius.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @desc:
 * @auther: sirius
 * @date: 2018-12-06 11:21
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
