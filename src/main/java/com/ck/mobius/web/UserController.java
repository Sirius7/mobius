package com.ck.mobius.web;

import com.ck.mobius.domain.Department;
import com.ck.mobius.domain.Role;
import com.ck.mobius.domain.User;
import com.ck.mobius.repository.DepartmentRepository;
import com.ck.mobius.repository.RoleRepository;
import com.ck.mobius.repository.UserRepository;
import com.ck.mobius.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @desc:
 * @auther: ck
 * @date: 2018-12-04 13:55
 */
@RequestMapping("/user")
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    @Autowired
    public DepartmentRepository departmentRepository;
    @Autowired
    public RoleRepository roleRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getUser() {
        String result = "";
        try{
            Department department = new Department();
            department.setDepartmentName("Mobius集团");
            department.setDescription("母公司集团");

            departmentRepository.save(department);

            Role role = new Role();
            role.setRoleName("超级管理员");
            role.setRemark("超级管理员");
            role.setCreateTime(new Date());

            roleRepository.save(role);

            User user = new User();
            user.setUserName("Admin");
            user.setPassword("1qaz@WSX");
            user.setCreateTime(new Date());
            user.setEmail("1111111@qq.com");

            Set<Department> departmentSet = new HashSet<>();
            departmentSet.add(department);

            Set<Role> roleSet = new HashSet<>();
            roleSet.add(role);

            result = userService.saveUser(user);
        } catch (Exception e) {
            logger.error(e.getMessage());
            result = "fail";
        }
        return result;
    }
}
