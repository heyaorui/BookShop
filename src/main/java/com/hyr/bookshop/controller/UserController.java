package com.hyr.bookshop.controller;

import com.hyr.bookshop.dao.entity.User;
import com.hyr.bookshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(User record){
        User user=userService.getUserByCond(record);
        if(user!=null&&user.getUserName()!=null){
            return "index";
        }
        else{
            return "redirect:login.jsp";
        }
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User record){
        userService.insert(record);
        System.out.println(record.toString());
        return "index";
    }
}
