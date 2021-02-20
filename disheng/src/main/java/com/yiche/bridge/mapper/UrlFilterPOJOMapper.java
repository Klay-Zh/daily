package com.yiche.bridge.mapper;

import com.yiche.bridge.model.UrlFilterPOJO;

import java.util.List;

public interface UrlFilterPOJOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UrlFilterPOJO record);

    int insertSelective(UrlFilterPOJO record);

    UrlFilterPOJO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UrlFilterPOJO record);

    int updateByPrimaryKey(UrlFilterPOJO record);

    List<UrlFilterPOJO> selectAll();

    int deleteByKey(String rule);

    UrlFilterPOJO selectUrlFilter(Integer id);

    UrlFilterPOJO selectByRule(String rule);

    int updateByRule(UrlFilterPOJO record);

    int updateState(UrlFilterPOJO record);
}