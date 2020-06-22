package com.servlet;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
     public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
     {
    	 int i = Integer.parseInt(req.getParameter("num1"));
    	 int j = Integer.parseInt(req.getParameter("num2"));
    	 
    	 int k = i+j;
    	
    	//cookie is maintained by tomcat server 
    	 
    	Cookie cookie = new Cookie("k",k+"");  //we are creating cookie object with new keyword.
    	res.addCookie(cookie);
    	
    	res.sendRedirect("sqrtRequest");
    	
     }
}
