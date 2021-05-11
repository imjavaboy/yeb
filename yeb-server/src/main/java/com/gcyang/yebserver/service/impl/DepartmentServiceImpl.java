package com.gcyang.yebserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcyang.yebserver.mapper.DepartmentMapper;
import com.gcyang.yebserver.pojo.Department;
import com.gcyang.yebserver.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
