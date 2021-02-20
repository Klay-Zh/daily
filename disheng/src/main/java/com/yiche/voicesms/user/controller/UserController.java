package com.yiche.voicesms.user.controller;

import com.yiche.voicesms.user.model.User;
import com.yiche.voicesms.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public ModelAndView list(){
        List<User> users=userService.selectAll();
        ModelMap model = new ModelMap();
        model.addAttribute("users",users);
        return new ModelAndView("userlist",model);
    }

    @RequestMapping(value = "/update", method = { RequestMethod.POST })
    @ResponseBody
    public Map<String,String> update(@RequestBody User user){
        Map<String,String> result=new HashMap<>(1);
        int i = userService.updateByPrimaryKeySelective(user);
        if(i > 0){ result.put("success","ok"); }
        else{ result.put("success","更新失败"); }
        return result;
    }


}
