package com.ck.mobius.web;

import com.ck.mobius.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @desc:
 * @auther: ck
 * @date: 2018-12-04 13:55
 */
public class UserController {
    @Autowired
    public UserService userService;
}
