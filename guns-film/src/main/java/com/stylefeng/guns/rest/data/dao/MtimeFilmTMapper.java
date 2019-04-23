package com.stylefeng.guns.rest.data.dao;

import com.stylefeng.guns.rest.model.MtimeFilmT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.rest.model.SearchFilmVo;

import java.util.LinkedList;

/**
 * <p>
 * 影片主表 Mapper 接口
 * </p>
 *
 * @author zhaolan
 * @since 2019-04-22
 */
public interface MtimeFilmTMapper extends BaseMapper<MtimeFilmT> {
    LinkedList<SearchFilmVo> searchFilmsByMultibleCondition(String showType, String sortId, String catId, String sourceId, String yearId);
}
