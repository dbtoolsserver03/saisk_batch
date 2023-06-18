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
<title>查询卡的列表</title>
<script type="text/javascript" src="../${pageContext.request.contextPath}/js/card/cardList.js"></script>

</head>
<body>

<form name="cardForm" method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td>card名称： <input type="text"> </td>

				<td>
					<input type="button" value="查询" onclick="queryCard()" />
					<input type="button" value="新規" onclick="addCard()" />
					<input type="button" value="批量删除" onclick="deleteCard()" />
				</td>
			</tr>
		</table>

</form>
</body>

</html>