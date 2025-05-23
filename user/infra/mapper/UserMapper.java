package com.sceen.user.infra.mapper;

import com.sceen.user.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (User)应用服务
 *
 * @author lu.cheng@purpleori.com
 * @since 2025-05-22 14:24:59
 */
@Mapper
public interface UserMapper {
    /**
     * 基础查询
     *
     * @param user 查询条件
     * @return 返回值
     */
    List<User> selectList(User user);
}

