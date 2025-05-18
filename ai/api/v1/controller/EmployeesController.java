package com.sceen.ai.api.v1.controller;

import com.github.pagehelper.PageInfo;
import com.sceen.ai.domain.entity.Employees;
import com.sceen.ai.app.service.EmployeesService;
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
@RequestMapping("employees")
public class EmployeesController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeesService employeesService;

    /**
     * 分页查询
     *
     * @param employees 筛选条件
     * @param pageNum 页码
     * @param pageSize 每页数量
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<PageInfo<Employees>> queryByPage(Employees employees, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        return ResponseEntity.ok((PageInfo<Employees>) this.employeesService.queryByPage(employees, pageNum, pageSize));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Employees> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.employeesService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param employees 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Employees> add(Employees employees) {
        return ResponseEntity.ok(this.employeesService.insert(employees));
    }

    /**
     * 编辑数据
     *
     * @param employees 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Employees> edit(Employees employees) {
        return ResponseEntity.ok(this.employeesService.update(employees));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.employeesService.deleteById(id));
    }

}

