package com.ck.mobius.repository;

import com.ck.mobius.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @desc:
 * @auther: ck
 * @date: 2018-12-04 13:56
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
}