package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet 
{
	   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	   {   	
		   
           ServletContext con = getServletContext();		   
		   String name = (String) con.getAttribute("tech");
		   
		   PrintWriter out = res.getWriter();
		   
		   out.println("Technology for Servlet2 is : "+name);		   
		   
	   }

}
