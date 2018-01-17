<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="student!to_edit" method="post">
		<table>
			
			
			<input id="id" name="student.id" type="hidden" class="input_value" value="${student.id}"></td>
			
			<tr>
			
				<td>姓名：<input id="username" name="student.name" type="text" class="input_value" value="${student.name}"></td>
			</tr>
			<tr>
				<td>年龄：<input id="age" name="student.age" type="text" class="input_value"  value="${student.age}">></td>
			</tr>
			<tr>
				<td>身份证号：<input id="idCard" name="student.idCard" type="text" class="input_value"  value="${student.idCard}">></td>
			</tr>
			<tr>
				<td>自我描述：<input id="persionDescrip" name="student.persionDescrip" type="text" class="input_value"  value="${student.persionDescrip}">></td>
			</tr>
		</table>
	
	<div class="control">
                <button type="submit">提交</button>
                <button type="reset">重置</button>
                <a href="http://localhost:8080/SSH/student!do_query"><button type="button">返回</button></a>
            </div>
	
	</form>
</body>
</html>