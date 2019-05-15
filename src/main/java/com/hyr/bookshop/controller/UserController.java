package com.hyr.bookshop.controller;

import com.hyr.bookshop.dao.entity.User;
import com.hyr.bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User record){
        User user=userService.getUserByCond(record);
        if(user!=null&&user.getUserName()!=null){
            return "index";
        }
        else{
            return "redirect:login.jsp";
        }
    }
}
