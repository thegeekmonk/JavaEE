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
		   String name = req.getParameter("name");	//Getting parameter from client file	   
		   
		   ServletConfig con = getServletConfig();	     //Getting ServletConfig object from getServletConfig() of HttpServlet class 
		   String tech = con.getInitParameter("tech");   //extracting initial parameter from web.xml file	
		   
		   
		   PrintWriter out = res.getWriter();
		   out.println("Technology for  "+name+"  is : "+tech);
		   
		   
		   ServletContext cont = getServletContext();		   
		   String phone = cont.getInitParameter("phone");
		   
		   out.println(name+" is having "+phone);
		   
		   //res.sendRedirect("request2");
		   
	   }

}
