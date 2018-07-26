<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table align="center" border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>身份证号</td>
			<td>毕业学校</td>
			<td>学历</td>
			<td>调动管理</td>
		</tr>
		<c:forEach items="${eall }" var="eall">
		<tr>
			<td>${eall.empNum }</td>
			<td>${eall.empName }</td>
			<td>${eall.IDCARD }</td>
			<td>${eall.graduate }</td>
			<td>${eall.lastEducation }</td>
			<td><a href="DD.sch">员工调动</a>and<a href="">查看历史调动</a></td>
		</tr>
		</c:forEach>
	
	
	</table>

</body>
</html>