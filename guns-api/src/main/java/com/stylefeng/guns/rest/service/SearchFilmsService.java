package com.stylefeng.guns.rest.service;

import com.stylefeng.guns.rest.model.FIlmVo;
import com.stylefeng.guns.rest.model.FilmRequestVo;
import com.stylefeng.guns.rest.model.SearchFilmVo;

import java.util.LinkedList;

/**
 * Created by Flying Elephant
 * Date 2019/4/21 0021 Time 19:28
 */
public interface SearchFilmsService {

    FIlmVo searchFilmVoByMultibleCondition(FilmRequestVo filmRequestVo) throws Exception;
}
