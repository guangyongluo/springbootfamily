<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.vilin.springboot.chapter10.pojo.User" %>
<!DOCTYPE html PUBLIC " -//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <title>测试＠SessionAttributes</title>
</head>
<body>
    <%
    //Session 获取数据
    User user= (User) session.getAttribute("user");
    Long id= (Long) session.getAttribute("id_new");
    //展示数据
    out.print("<br>user_narne = " + user.getUserName());
    out.println("<br>id = " + id);
    %>
</body>
</html>
