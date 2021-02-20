package com.yiche.voicesms.dao;

import com.yiche.voicesms.model.NoteMessageSend;

public interface NoteMessageSendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NoteMessageSend record);

    int insertSelective(NoteMessageSend record);

    NoteMessageSend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NoteMessageSend record);

    int updateByPrimaryKey(NoteMessageSend record);
}