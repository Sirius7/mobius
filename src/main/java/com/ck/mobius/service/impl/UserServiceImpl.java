package com.ck.mobius.service.impl;

import com.ck.mobius.repository.UserRepository;
import com.ck.mobius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @desc:
 * @auther: ck
 * @date: 2018-12-04 13:54
 */
public class UserServiceImpl implements UserService {
    @Autowired
    public UserRepository userRepository;
}
