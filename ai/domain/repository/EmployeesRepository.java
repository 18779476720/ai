package com.sceen.ai.domain.repository;

import com.sceen.ai.domain.entity.Employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/18 10:09
 * @version:1.0
 */
public interface EmployeesRepository {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Employees queryById(Integer id);
    /**
     * 查询指定行数据
     *
     * @param employees 查询条件
     * @return 对象列表
     */
    List<Employees> queryAll(Employees employees);

    /**
     * 统计总行数
     *
     * @param employees 查询条件
     * @return 总行数
     */
    long count(Employees employees);

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 影响行数
     */
    Employees insert(Employees employees);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Employees> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Employees> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Employees> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Employees> entities);

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 影响行数
     */
    Employees update(Employees employees);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
}
