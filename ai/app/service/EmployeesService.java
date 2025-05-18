package com.sceen.ai.app.service;

import com.sceen.ai.domain.entity.Employees;

/**
 * (Employees)表服务接口
 *
 * @author makejava
 * @since 2025-05-18 09:20:25
 */
public interface EmployeesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Employees queryById(Integer id);

    /**
     * 分页查询
     *
     * @param employees 筛选条件
     * @param pageNum 页码
     * @param pageSize 每页数量
     * @return 查询结果
     */
    Object queryByPage(Employees employees, int pageNum, int pageSize);

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    Employees insert(Employees employees);

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    Employees update(Employees employees);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
