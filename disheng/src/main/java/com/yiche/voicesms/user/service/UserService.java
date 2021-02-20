package com.yiche.voicesms.user.service;

import com.yiche.voicesms.user.model.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    int updateByPrimaryKeySelective(User record);

}
