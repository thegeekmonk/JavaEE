package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
        public void service(HttpServletRequest req,HttpServletResponse res) throws  ServletException,IOException,NumberFormatException
        {
        	   int i = Integer.parseInt(req.getParameter("num1"));
        	   int j = Integer.parseInt(req.getParameter("num2"));
        	   
        	   int k = i+j;
        	   
        	   PrintWriter out = res.getWriter();  //getting writer object 'out' to write on webpage
        	   
        	   out.println("Addition is : "+k);    //printing on webpage 
        }
        
        
        //deGet() method will only work with method type get() on a client file
        /*
         public void doPost(HttpServletRequest req,HttpServletResponse res) throws  ServletException,IOException,NumberFormatException
        {
        	   int i = Integer.parseInt(req.getParameter("num1"));
        	   int j = Integer.parseInt(req.getParameter("num2"));
        	   
        	   int k = i+j;
        	   
        	   PrintWriter out = res.getWriter();  //getting writer object 'out' to write on webpage
        	   
        	   out.println("Addition is : "+k);    //printing on webpage 
        }
        
         */
        
       //dePost() method will only work with method type post() on a client file
        /*public void doGet(HttpServletRequest req,HttpServletResponse res) throws  ServletException,IOException,NumberFormatException
        {
        	   int i = Integer.parseInt(req.getParameter("num1"));
        	   int j = Integer.parseInt(req.getParameter("num2"));
        	   
        	   int k = i+j;
        	   
        	   PrintWriter out = res.getWriter();  //getting writer object 'out' to write on webpage
        	   
        	   out.println("Addition is : "+k);    //printing on webpage 
        }
        
        */
}
