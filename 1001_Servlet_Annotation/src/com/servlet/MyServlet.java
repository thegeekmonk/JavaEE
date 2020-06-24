package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addRequest")
public class MyServlet extends HttpServlet 
{
       public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
       {
    	    int i = Integer.parseInt(req.getParameter("num1"));
    	    int j = Integer.parseInt(req.getParameter("num2"));
    	    
    	    int k = i+j;
    	    
    	    PrintWriter out = res.getWriter();
    	    
    	    out.println("Addition is : "+k);
       }
}
