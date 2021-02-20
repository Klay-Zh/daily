package com.yiche.bridge.mapper;

import com.yiche.bridge.model.LimitRatePOJO;

public interface LimitRatePOJOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LimitRatePOJO record);

    int insertSelective(LimitRatePOJO record);

    LimitRatePOJO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LimitRatePOJO record);

    int updateByPrimaryKeyWithBLOBs(LimitRatePOJO record);

    int updateByPrimaryKey(LimitRatePOJO record);
}