package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet 
{
	   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	   {
		   String name = req.getParameter("name");		   
		   
		   ServletConfig con = getServletConfig();		   
		   String tech = con.getInitParameter("tech");
		   
		   
		   PrintWriter out = res.getWriter();
		   out.println("Technology for  "+name+"  is : "+tech);
		   
		   //res.sendRedirect("request2");
		   
	   }

}
