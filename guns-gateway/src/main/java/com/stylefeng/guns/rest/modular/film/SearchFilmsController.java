/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: filmController
 * Author:   john
 * Date:     2019/4/21 16:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.model.FIlmVo;
import com.stylefeng.guns.rest.model.FilmRequestVo;
import com.stylefeng.guns.rest.model.SearchFilmVo;
import com.stylefeng.guns.rest.service.SearchFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author john
 * @create 2019/4/21
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/film")
public class SearchFilmsController {
    /*********3影片查询控制器**********/
    @Reference
    SearchFilmsService searchFilmsService;


    @RequestMapping(value = "/getFilms")
    public Map getSearchFilms( FilmRequestVo filmRequestVo){
        HashMap<String, Object> hashMap = new HashMap<>();

        try {
            //分页没做！！！！！！！！！！！！！！！！
            FIlmVo fIlmVo=searchFilmsService.searchFilmVoByMultibleCondition(filmRequestVo);
            hashMap.put("status",0);
            hashMap.put("nowPage ",filmRequestVo.getNowPage());
            hashMap.put("totalPage  ",fIlmVo.getTotalPage());//总页数需要计算
            hashMap.put("data",fIlmVo.getSearchFilmVos());
        } catch (SQLException e) {
            e.printStackTrace();
            hashMap.put("status",1);
            hashMap.put("msg","查询失败,无banner可加载");
        }catch (Exception e) {
            e.printStackTrace();
            hashMap.put("status",999);
            hashMap.put("msg","系统出现异常,请联系管理员");
        }
        //分页没做


        return hashMap;
    }
}
