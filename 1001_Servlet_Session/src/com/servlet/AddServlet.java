package com.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class AddServlet extends HttpServlet 
{
      public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
      {
    	     int i = Integer.parseInt(req.getParameter("num1"));
    	     int j = Integer.parseInt(req.getParameter("num2"));
    	     
    	     int k = i+j;
    	     
    	     HttpSession session = req.getSession();  //using HttpSession so that values will be present during entire session 	     
    	     session.setAttribute("k",k);  //setting attribute in session
    	     
    	     res.sendRedirect("sqrtRequest");   //telling client to go to another servlet
    	     
      }
}
