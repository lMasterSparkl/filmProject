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
package com.stylefeng.guns.rest.controll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
public class SearchByClassListController {
    /*********2影片条件列表查询控制器**********/
    @RequestMapping(value = "/film/getConditionList")
    public Map getSearchByClassListFilms(@RequestParam(defaultValue = "99", required = false) String catId,
                                         @RequestParam(defaultValue = "99", required = false) String sourceId,
                                         @RequestParam(defaultValue = "99", required = false) String yearId){
        HashMap<String, Object> hashMap = new HashMap<>();

        hashMap.put("status",0);
        hashMap.put("data","123");
        return hashMap;
    }

}
