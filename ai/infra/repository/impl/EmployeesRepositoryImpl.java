package com.sceen.ai.infra.repository.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sceen.ai.domain.entity.Employees;
import com.sceen.ai.domain.repository.EmployeesRepository;
import com.sceen.ai.infra.mapper.EmployeesMapper;
import jakarta.annotation.Resource;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/18 10:10
 * @version:1.0
 */
@Component
public class EmployeesRepositoryImpl implements EmployeesRepository {
    @Resource
    private EmployeesMapper employeesMapper;


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Employees queryById(Integer id) {
        return this.employeesMapper.queryById(id);
    }

    /**
     * 查询指定行数据
     *
     * @param employees 查询条件
     * @return 对象列表
     */
    @Override
    public List<Employees> queryAll(Employees employees) {
        return null;
    }

    /**
     * 统计总行数
     *
     * @param employees 查询条件
     * @return 总行数
     */
    @Override
    public long count(Employees employees) {
        return 0;
    }

//    /**
//     * 分页查询
//     *
//     * @param employees 筛选条件
//     * @param pageNum 页码
//     * @param pageSize 每页数量
//     * @return 查询结果
//     */
//    @Override
//    public PageInfo<Employees> queryByPage(Employees employees, int pageNum, int pageSize) {
//        PageHelper.startPage(pageNum, pageSize);
//        List<Employees> list = this.employeesMapper.queryAll(employees);
//        return new PageInfo<>(list);
//    }

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees insert(Employees employees) {
        this.employeesMapper.insert(employees);
        return employees;
    }

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Employees> 实例对象列表
     * @return 影响行数
     */
    @Override
    public int insertBatch(List<Employees> entities) {
        return 0;
    }

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Employees> 实例对象列表
     * @return 影响行数
     * @throws BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    @Override
    public int insertOrUpdateBatch(List<Employees> entities) {
        return 0;
    }

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees update(Employees employees) {
        this.employeesMapper.update(employees);
        return employeesMapper.queryById(employees.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.employeesMapper.deleteById(id);
    }

}
