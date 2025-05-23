package com.sceen.ai.api.v1.controller;

import com.github.pagehelper.PageInfo;
import com.sceen.ai.api.v1.dto.UserVO;
import com.sceen.ai.app.service.EmployeesService;
import com.sceen.ai.domain.entity.Employees;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * (Employees)表控制层
 *
 * @author makejava
 * @since 2025-05-18 09:20:25
 */

@RestController
@RequestMapping("login")
public class LoginController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeesService employeesService;

    @PostMapping("/api/login")
    public ResponseEntity<UserVO> login(@RequestBody UserVO userVO) {
        if(userVO==null){
            userVO.setLoginFlag(false);

        }
        if (userVO.getUsername().equals("admin")&&userVO.getPassword().equals("123456")){
            userVO.setLoginFlag(true);
            userVO.setToken("dummy-token");
            return ResponseEntity.ok(userVO);
        }

        return ResponseEntity.ok(userVO);


    }
}

