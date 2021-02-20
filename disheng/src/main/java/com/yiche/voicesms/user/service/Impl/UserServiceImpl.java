package com.yiche.voicesms.user.service.Impl;

import com.yiche.voicesms.user.dao.UserMapper;
import com.yiche.voicesms.user.model.User;
import com.yiche.voicesms.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() { return userMapper.selectAll(); }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

}
