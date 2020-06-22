package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet 
{
	 
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{   
		int k = 0;
	    Cookie cookie[] = req.getCookies();  //it returns array of cookie hence 
	    
	    for(Cookie ck : cookie)
	    {
	    	if(ck.getName().equals("k"))
	    	{
	    		k = Integer.parseInt(ck.getValue()); // parsing string value returned by getValue() of cookie object
	    		k = k*k;	    		
	    	}
	    }
	    
	    PrintWriter out = res.getWriter();
	    
	    out.println("Square of added numver is : "+k);
	    
	}

}
