package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
		    PrintWriter out = res.getWriter();
		    
		    double principle = Double.parseDouble(req.getParameter("Text1"));
		    
		    double rate = Double.parseDouble(req.getParameter("Text2"));
		    
		    double time = Double.parseDouble(req.getParameter("Text3"));
		    
		    double simpleInterest = (principle*rate*time)/100;
		    
		    double totalAmount = simpleInterest+principle;
		    
		    out.println("<h1>Simple Interest is : "+simpleInterest+"</h1><br>");
		    out.println("<h1>Total Amount is : "+totalAmount+"</h1>");
		
	}

}
