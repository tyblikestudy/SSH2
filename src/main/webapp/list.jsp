<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
    <div id="top">
        <div class="img"><img src="./images/logo.jpg"></div>
        <div class="administer">用户管理系统</div>
        <div class="help">帮助&nbsp;&nbsp;退出</div>
    </div>
    <div id="menu">
        <a class="list" >用户查询</a>
        <button class="add"><a href="http://localhost:8080/SSH/add.jsp">用户新增</a></button>
    </div>
    <div id="content">
        <div class="search">
            用户名称：
            <input type="" name="">
            <button>查询</button>
        </div>
        <div class="user">
            <table align="left" width="100%" border="1" rules="all">
                <thead bgcolor="#CCFFFF">
                    <tr height="40px">
                    	<td>id</td>
                        <td>学生姓名</td>
                        <td>学生年龄</td>
                        
                        <td>操作</td>
                    </tr>
                </thead>
                <tbody>
	                <c:forEach items="${students }" var="temp" varStatus="vs">
	                    <tr height="40px">
	                        <td>${temp.id }</td>
	                        <td>${temp.name }</td>
	                        <td>${temp.age }</td>
	                        <td>
	                        	<a href="student!findStudent?student.id=${temp.id }" class="edit">详情</a>&nbsp;
	                        	<a href="student!edit?student.id=${temp.id }" class="edit">编辑</a>&nbsp;
	                        	<a href="student!remove?student.id=${temp.id }">删除</a>
	                        </td>
	                    </tr>
	                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <script type="text/javascript" src="./plugins/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
</body>
</html>