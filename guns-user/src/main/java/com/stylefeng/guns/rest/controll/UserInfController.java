package com.stylefeng.guns.rest.controll;


import com.stylefeng.guns.rest.common.persistence.model.User;
import com.stylefeng.guns.rest.persistence.model.UserInf;
import com.stylefeng.guns.rest.service.IUserInfService;
import com.stylefeng.guns.rest.service.impl.UserInfServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaolan
 * @since 2019-04-20
 */
@RestController
@RequestMapping("/user")
public class UserInfController {


    @Autowired
    IUserInfService  userInfService;

    @RequestMapping("/select")
    public UserInf findUserById(String id){

        UserInf userInf = userInfService.selectById(id);

        return  userInf;

    }

}

