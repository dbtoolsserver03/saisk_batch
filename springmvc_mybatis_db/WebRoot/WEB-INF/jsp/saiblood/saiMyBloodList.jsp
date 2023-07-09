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
<title>血型查询</title>


<script type="text/javascript" src="../${pageContext.request.contextPath}/js/saiblood/saiBloodList.js"></script>


</head>
<body>



	<form name="BloodForm"
		action="${pageContext.request.contextPath }/queryBlood.action"
		method="post">

		<table>
			<tr>
				<td>当前用户：${username}</td>
				<c:if test="${username!=null }">
					<td><a href="${pageContext.request.contextPath }/logout.action">退出</a></td>
				</c:if>

			</tr>
		</table>

		查询条件：
		<table width="100%" border=1>
			<tr>
				<td>献血人名称：<input name="bloodName" /></td>

				<td>
					<input type="button" value="查询" onclick="queryBloods()" />
					<input type="button" value="新規" onclick="addBlood()" />
					<input type="button" value="批量删除" onclick="deleteBloods()" />
				</td>
			</tr>
		</table>
</form>

</body>
</html>