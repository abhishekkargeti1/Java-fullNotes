package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ThirdServlet extends HttpServlet {
  
       
    
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String confirmPassword = request.getParameter("confirmPassword");
    String phoneNumber = request.getParameter("phoneNumber");
    
    String dateOfBirth = request.getParameter("dateOfBirth");
    String address = request.getParameter("address");
    String gender = request.getParameter("gender");
    
    out.println("<h1>First Name :"+firstName+"<br> Last Name :"+lastName +
        "<br> Email : "+email+" <br> PassWord : "+password+"<br> Address : "+address+"<br> DOB : "+dateOfBirth +
        "<br>Phone Number : "+phoneNumber+"<br> Gender : "+gender+"</h1>");
    
    
  }

}