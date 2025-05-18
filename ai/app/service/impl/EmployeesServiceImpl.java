package com.sceen.ai.app.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sceen.ai.domain.repository.EmployeesRepository;
import com.sceen.ai.infra.mapper.EmployeesMapper;
import com.sceen.ai.domain.entity.Employees;
import com.sceen.ai.app.service.EmployeesService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Employees)表服务实现类
 *
 * @author makejava
 * @since 2025-05-18 09:20:25
 */
@Service("employeesService")
public class EmployeesServiceImpl implements EmployeesService {
    @Resource
    private EmployeesRepository employeesRepository;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Employees queryById(Integer id) {
        return this.employeesRepository.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param employees 筛选条件
     * @param pageNum 页码
     * @param pageSize 每页数量
     * @return 查询结果
     */
    @Override
    public Object queryByPage(Employees employees, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Employees> list = this.employeesRepository.queryAll(employees);
        return new PageInfo<>(list);
    }

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees insert(Employees employees) {
        this.employeesRepository.insert(employees);
        return employees;
    }

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 实例对象
     */
    @Override
    public Employees update(Employees employees) {
        this.employeesRepository.update(employees);
        return this.queryById(employees.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.employeesRepository.deleteById(id) > 0;
    }
}
