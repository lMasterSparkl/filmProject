package com.stylefeng.guns.rest.service.impl;

  import com.alibaba.dubbo.config.annotation.Service;
  import com.stylefeng.guns.rest.data.dao.MtimeFilmTMapper;
  import com.stylefeng.guns.rest.model.FIlmVo;
  import com.stylefeng.guns.rest.model.FilmRequestVo;
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
    public FIlmVo searchFilmVoByMultibleCondition(FilmRequestVo filmRequestVo) throws Exception {
        FIlmVo fIlmVo = new FIlmVo();
        LinkedList<SearchFilmVo> searchFilmVos = null;
        Integer limit = filmRequestVo.getPageSize();
//1-按热门搜索 film_box_office   2-按时间搜索  film_time 3-按评价搜索   film_score
        searchFilmVos=mtimeFilmTMapper.searchFilmsOrderByMultibleCondition(filmRequestVo.getShowType(),filmRequestVo.getSortId(),filmRequestVo.getCatId(),filmRequestVo.getSourceId(),filmRequestVo.getYearId());

        int size = searchFilmVos.size();
        int totalpage=(size+limit)/limit;
        fIlmVo.setNowPage(1);
        fIlmVo.setTotalPage(totalpage);
        fIlmVo.setSearchFilmVos(searchFilmVos);
        return fIlmVo;
    }

}
