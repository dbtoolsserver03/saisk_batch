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
<title>查询老师列表</title>

<script type="text/javascript" src="../${pageContext.request.contextPath}/js/teacher/teacherList.js"></script>

</head>
<body>

		<table>
			<tr>
				<td>当前用户：${username}</td>
				<c:if test="${username!=null }">
					<td><a href="${pageContext.request.contextPath }/logout.action">退出</a></td>
				</c:if>
				
			</tr>
		</table>

	<form name="teacherForm"
		action="${pageContext.request.contextPath }/Teacher/queryTeacher.action"
		method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td>老师名称：<input name="teacherName" value="${teacher.teacherName}" /></td>
				
				<td>
					<input type="button" value="查询" onclick="queryTeachers()" />
					<input type="button" value="新規" onclick="addTeacher()" />
					<input type="button" value="批量删除" onclick="deleteTeachers()" />
				</td>
			</tr>
		</table>

		<c:if test="${teacherLst !=null && fn:length(teacherLst) > 0}">
		老师一览：
		<table width="100%" border=1>
				<tr>
					<th>选择</th>
					<th>老师名称</th>
					<th>老师性别</th>
					<th>出生日</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${teacherLst}" var="teacher" varStatus="status">
					<tr>
						<td><input type="checkbox" name="teachers_id" currentStatusxx="aa_${status.count}"
							value="${teacher.teacherId}"></td>
						<td>${teacher.teacherName }</td>
						<td>
						
						<c:choose>
						    <c:when test="${teacher.teacherSex == 0}">女</c:when>
						    <c:when test="${teacher.teacherSex == 1}">男</c:when>
					        <c:otherwise>未知</c:otherwise>
						</c:choose>						
						</td>
						<td><fmt:formatDate value="${teacher.teacherAge}"	pattern="yyyy/MM/dd" /></td>
						<td><a href="${pageContext.request.contextPath }/editTeacher.action?id=${teacher.teacherId}">修改</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</form>
</body>

</html>