package com.benjamin.service.impl;

import com.benjamin.bean.Department;
import com.benjamin.mapper.DepartmentMapper;
import com.benjamin.service.DepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
