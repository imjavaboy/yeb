package com.gcyang.yebserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcyang.yebserver.mapper.AdminMapper;
import com.gcyang.yebserver.pojo.Admin;
import com.gcyang.yebserver.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
