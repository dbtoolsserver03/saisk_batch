<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新老师信息</title>
<script type="text/javascript" src="js/userinfo/userinfoList.js">
</script>
</head>
<body>
	update teacher info
	<form action="${pageContext.request.contextPath }/teacherupdate.action"
		method="post">
		<input type="hidden" name="teacherId" value="${teacher.teacherId}">
		
		<br>
		先生姓名<input type="text" name="teacherName" value="${teacher.teacherName}">
		<br>
		性別 <label><input type="radio" name="teacherSex" value="1" <c:if test="${teacher.teacherSex==1}" > checked </c:if>>man</label>
			 <label><input type="radio" name="teacherSex" value="0" <c:if test="${teacher.teacherSex==0}" > checked </c:if>>women</label>
		<br>
		生日<input type="date" name="teacherAge" value="<fmt:formatDate value='${teacher.teacherAge}' pattern='yyyy-MM-dd'/>" />
		<br>
		<input type="submit" value="提交">
	</form>

</body>

</html>