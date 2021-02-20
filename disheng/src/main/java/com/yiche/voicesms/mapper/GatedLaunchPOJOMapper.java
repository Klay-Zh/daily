package com.yiche.voicesms.mapper;

import com.yiche.voicesms.model.GatedLaunchPOJO;

public interface GatedLaunchPOJOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GatedLaunchPOJO record);

    int insertSelective(GatedLaunchPOJO record);

    GatedLaunchPOJO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GatedLaunchPOJO record);

    int updateByPrimaryKeyWithBLOBs(GatedLaunchPOJO record);

    int updateByPrimaryKey(GatedLaunchPOJO record);
}