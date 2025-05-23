package com.sceen.user.api.controller.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sceen.user.app.service.UserService;
import com.sceen.user.domain.entity.User;
import com.sceen.user.domain.repository.UserRepository;

import java.util.List;

/**
 * (User)表控制层
 *
 * @author lu.cheng@purpleori.com
 * @since 2025-05-22 14:25:00
 */

@RestController("userController.v1")
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @PostMapping("/get/user-list")
    public ResponseEntity<List<User>> getUser(@RequestBody User user){
        List<User> userList = userRepository.selectList(user);
        return ResponseEntity.ok(userList);
    }


}

