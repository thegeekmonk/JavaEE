package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrtServlet extends HttpServlet 
{
        public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
        {
        	int k = (int)req.getAttribute("k");
        	
        	k = k*k;
        	
        	PrintWriter out = res.getWriter();
        	
        	out.println("Square of Addition is : "+k);
        }
}
