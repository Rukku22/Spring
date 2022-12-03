package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExController {
@RequestMapping("/")
public String  Ex1(HttpServletRequest req,HttpServletResponse res) {
String name=req.getParameter("name");
String password=req.getParameter("password");
   Login l=new Login();
   String name1=l.add(name,password);
   M m1=new M();
   m1.setViewName("display.jsp");
   m1.addObject("result",name1);
 return m1;
}
}