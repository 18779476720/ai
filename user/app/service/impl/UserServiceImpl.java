package com.sceen.user.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.sceen.user.app.service.UserService;
import org.springframework.stereotype.Service;
import com.sceen.user.domain.entity.User;
import com.sceen.user.domain.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * (User)应用服务
 *
 * @author lu.cheng@purpleori.com
 * @since 2025-05-22 14:25:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

}

