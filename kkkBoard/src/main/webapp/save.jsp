<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	Connection conn = null;
	PreparedStatement pt = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "dlwjdgns";
		String pass = "1234";
		String url = "jdbc:mysql://210.219.170.244:3306/dlwjdgns";
		conn = DriverManager.getConnection(url,user,pass);
	} catch(Exception e) {
		System.out.println("드라이버 로드 및 접속 실패");
		e.printStackTrace();
	}
	
	String title = request.getParameter("title");
	String author = request.getParameter("author");
	String detail = request.getParameter("detail");
	String date = request.getParameter("date"); 
	
	String

%>