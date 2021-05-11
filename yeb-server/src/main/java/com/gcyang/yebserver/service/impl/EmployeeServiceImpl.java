package com.gcyang.yebserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcyang.yebserver.mapper.EmployeeMapper;
import com.gcyang.yebserver.pojo.Employee;
import com.gcyang.yebserver.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guobenqi
 * @since 2021-05-11
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
