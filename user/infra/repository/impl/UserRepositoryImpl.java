package com.sceen.user.infra.repository.impl;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import com.sceen.user.domain.entity.User;
import com.sceen.user.domain.repository.UserRepository;
import com.sceen.user.infra.mapper.UserMapper;

import java.util.List;

/**
 * (User)资源库
 *
 * @author lu.cheng@purpleori.com
 * @since 2025-05-22 14:24:59
 */
@Component
public class UserRepositoryImpl implements UserRepository {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectList(User user) {
        return userMapper.selectList(user);
    }

    @Override
    public User selectByPrimary(Long id) {
        User user = new User();
        user.setId(id);
        List<User> users = userMapper.selectList(user);
        if (users.size() == 0) {
            return null;
        }
        return users.get(0);
    }

}

