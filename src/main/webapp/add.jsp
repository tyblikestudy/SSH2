<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="student!add" method="post">
		<table>
			<tr>
			
				<td>姓名：<input id="username" name="student.name"  type="text" class="input_value" ></td>
			</tr>
			<tr>
				<td>年龄：<input id="age"  name="student.age" type="text" class="input_value"></td>
			</tr>
			<tr>
				<td>身份证号：<input id="age"  name="student.idCard" type="text" class="input_value"></td>
			</tr>
			<tr>
				<td>自我描述：<input id="age"  name="student.persionDescrip" type="text" class="input_value"></td>
			</tr>
		</table>
	
		<div class="control">
                <button type="submit">添加</button>
                <button type="reset">重置</button>
                <a href="http://localhost:8080/SSH/student!do_query"><button type="button">返回</button></a>
            </div>
	
	</form>
</body>
</html>