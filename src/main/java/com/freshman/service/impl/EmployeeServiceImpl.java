package com.freshman.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freshman.entity.Employee;
import com.freshman.mapper.EmployeeMapper;
import com.freshman.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
