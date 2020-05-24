package com.benjamin.service.impl;

import com.benjamin.bean.Employee;
import com.benjamin.mapper.EmployeeMapper;
import com.benjamin.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author li ben
 * @since 2020-05-24
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
