<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Introduction</title>
</head>
<body>
      <form action="index.jsp" method="get">
        
        User Name:
        <input type="text" name="username"><br>
        Password :
        <input type="password" name="password">  
        <br>
        <input type="submit" value="submit">
        
      </form>
      
      <%
      String username = request.getParameter("username");
    %>
		<%if(username == null){ %>
		<h1>Welcome waiting for username</h1>
    <% }else{%>
    <h1>Welcome <%=username %></h1>    
    <%} %>
</body>
</html>