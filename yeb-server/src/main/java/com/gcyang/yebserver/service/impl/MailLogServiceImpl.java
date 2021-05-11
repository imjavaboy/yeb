package com.gcyang.yebserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcyang.yebserver.mapper.MailLogMapper;
import com.gcyang.yebserver.pojo.MailLog;
import com.gcyang.yebserver.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
