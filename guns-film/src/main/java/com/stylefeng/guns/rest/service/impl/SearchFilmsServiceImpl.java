package com.stylefeng.guns.rest.service.impl;

  import com.alibaba.dubbo.config.annotation.Service;
  import com.stylefeng.guns.rest.data.dao.MtimeFilmTMapper;
  import com.stylefeng.guns.rest.model.SearchFilmVo;

  import com.stylefeng.guns.rest.service.SearchFilmsService;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Component;

  import java.util.LinkedList;

/**
 * Created by Flying Elephant
 * Date 2019/4/21 0021 Time 19:29
 */
@Service(interfaceClass = SearchFilmsService.class)
@Component
public class SearchFilmsServiceImpl implements SearchFilmsService {


   @Autowired
   MtimeFilmTMapper mtimeFilmTMapper;


    @Override
    public LinkedList<SearchFilmVo> searchByMultibleCondition(String showType, String sortId, String catId, String sourceId, String yearId) {
        return mtimeFilmTMapper.searchFilmsByMultibleCondition(showType, sortId, catId, sourceId,  yearId);
    }
}
