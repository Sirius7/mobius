package com.ck.mobius.repository;

import com.ck.mobius.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @desc:
 * @auther: sirius
 * @date: 2018-12-06 11:20
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
