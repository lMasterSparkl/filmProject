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
import com.stylefeng.guns.rest.model.SearchFilmVo;
import com.stylefeng.guns.rest.service.SearchFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    public Map getSearchFilms(@RequestParam(defaultValue = "1", required = false) String showType,
                              @RequestParam(defaultValue = "1", required = false) String sortId,
                              @RequestParam(defaultValue = "99", required = false) String catId,
                              @RequestParam(defaultValue = "99", required = false) String sourceId,
                              @RequestParam(defaultValue = "99", required = false) String yearId,
                              @RequestParam(defaultValue = "1", required = false) String nowPage,
                              @RequestParam(defaultValue = "18", required = false) String pageSize
                              ){
        HashMap<String, Object> hashMap = new HashMap<>();
        LinkedList<SearchFilmVo>searchFilmVos= searchFilmsService.searchByMultibleCondition(showType,sortId,catId,sourceId,yearId);
        //分页没做

        hashMap.put("status",0);
        hashMap.put("nowPage ",1);
        hashMap.put("totalPage  ",2);
        hashMap.put("data",searchFilmVos);
        return hashMap;
    }
}
