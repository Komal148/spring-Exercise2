package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    User user=new User();

    @RequestMapping("/")
    public String greeting()
    {
        return "index";
    }

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
    {

        user.setUserName(request.getParameter("t1"));
        user.setUserPass(request.getParameter("t2"));

        AddService addService=new AddService();
        String message=addService.message(user);

        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",message);

        return mv;

    }
}
