package com.ren.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        // querying business logic
        String message = "Hello SpringMVC!";
        modelAndView.addObject("msg", message);

        // redirect to view
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
