package com.stylefeng.guns.rest.service.impl;

import com.stylefeng.guns.rest.persistence.model.UserInf;
import com.stylefeng.guns.rest.persistence.dao.UserInfMapper;
import com.stylefeng.guns.rest.service.IUserInfService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaolan
 * @since 2019-04-20
 */
@Service
public class UserInfServiceImpl extends ServiceImpl<UserInfMapper, UserInf> implements IUserInfService {

}
