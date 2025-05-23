package com.sceen.user.domain.repository;

import com.sceen.user.domain.entity.User;

import java.util.List;

/**
 * (User)资源库
 *
 * @author lu.cheng@purpleori.com
 * @since 2025-05-22 14:24:59
 */
public interface UserRepository {
    /**
     * 查询
     *
     * @param user 查询条件
     * @return 返回值
     */
    List<User> selectList(User user);

    /**
     * 根据主键查询（可关联表）
     *
     * @param id 主键
     * @return 返回值
     */
    User selectByPrimary(Long id);
}
