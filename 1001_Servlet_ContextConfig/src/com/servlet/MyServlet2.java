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
		   String name = req.getParameter("name");	//Getting parameter from client file	
		   
           ServletContext con = getServletContext();		   
		   String tech = con.getInitParameter("tech");
		   
		   PrintWriter out = res.getWriter();
		   
		   out.println("Technology for "+name+ " Servlet2 is --> "+tech);		   
		   
	   }

}
