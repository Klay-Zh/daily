package com.yiche.voicesms.dao;

import com.yiche.voicesms.model.VoiceSmsStatusReport;

public interface VoiceSmsStatusReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VoiceSmsStatusReport record);

    int insertSelective(VoiceSmsStatusReport record);

    VoiceSmsStatusReport selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoiceSmsStatusReport record);

    int updateByPrimaryKey(VoiceSmsStatusReport record);
}