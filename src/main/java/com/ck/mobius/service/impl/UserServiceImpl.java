package com.ck.mobius.service.impl;

import com.ck.mobius.domain.User;
import com.ck.mobius.repository.UserRepository;
import com.ck.mobius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc:
 * @auther: ck
 * @date: 2018-12-04 13:54
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserRepository userRepository;

    @Override
    public String saveUser(User user) {
        userRepository.save(user);

        return "success";
    }
}
