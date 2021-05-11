package com.gcyang.yebserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcyang.yebserver.mapper.OplogMapper;
import com.gcyang.yebserver.pojo.Oplog;
import com.gcyang.yebserver.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
