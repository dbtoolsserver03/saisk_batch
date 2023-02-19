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
<title>查询料理列表</title>

<script type="text/javascript" src="../${pageContext.request.contextPath}/js/food/foodList.js"></script>

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

	<form name="foodForm"
		action="${pageContext.request.contextPath }/Food/queryFood.action"
		method="post">
		
		查询条件： 料理XXXXXXXXXX
		
		<!-- 
		<table width="100%" border=1>
			<tr>
				<td>料理名称：
				<input name="foodName" value="${food.foodName}" />
				
				</td>
				
				<td>
					<input type="button" value="查询" onclick="queryFoods()" />
					<input type="button" value="新規" onclick="addFood()" />
					<input type="button" value="批量删除" onclick="deleteFoods()" />
				</td>
			</tr>
		</table>

		<c:if test="${foodLst !=null && fn:length(foodLst) > 0}">
		料理一览：
		<table width="100%" border=1>
				<tr>
					<th>选择</th>
					<th>料理名称</th>
					<th>料理性别</th>
					<th>出生日</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${foodLst}" var="food" varStatus="status">
					<tr>
						<td><input type="checkbox" name="foods_id" currentStatusxx="aa_${status.count}"
							value="${food.foodId}"></td>
						<td>${food.foodName }</td>
						<td>
						
						<c:choose>
						    <c:when test="${food.foodSex == 0}">女</c:when>
						    <c:when test="${food.foodSex == 1}">男</c:when>
					        <c:otherwise>未知</c:otherwise>
						</c:choose>						
						</td>
						<td><fmt:formatDate value="${food.foodAge}"	pattern="yyyy/MM/dd" /></td>
						<td><a href="${pageContext.request.contextPath }/editFood.action?id=${food.foodId}">修改</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		 -->
	</form>
</body>

</html>