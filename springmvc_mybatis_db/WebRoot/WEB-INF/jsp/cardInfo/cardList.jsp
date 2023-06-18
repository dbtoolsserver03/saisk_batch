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
				<td>card名称： <input type="text" name="cardName" value="${cardx.cardName}"> </td>
				<td>
					<input type="button" value="查询" onclick="queryCard()" />
					<input type="button" value="新規" onclick="addCard()" />
					<input type="button" value="批量删除" onclick="deleteCard()" />
				</td>
			</tr>
		</table>

		<c:if test="${cardLst !=null && fn:length(cardLst) > 0}">
		card一览：
		<table width="100%" border=1>
				<tr>
					<th>選択</th>
					<th>カード名</th>
					<th>种族</th>
					<th>属性日</th>
					<th>攻击力</th>
					<th>操作</th>
				</tr>

				<c:forEach items="${cardLst}" var="card" varStatus="status">
					<tr>
						<td><input type="checkbox" name="cards_id" currentStatusxx="aa_${status.count}"
							value="${card.cardId}"></td>
						<td>${card.cardName }</td>
						<td>${card.cardZhongzu }</td>
						<td><fmt:formatDate value="${card.cardShuxing}"	pattern="yyyy/MM/dd" /></td>
						<td>${card.cardAttack }</td>
						<td><a href="${pageContext.request.contextPath }/editcard.action?id=${card.cardId}">修改</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

		<c:if test="${cardLst ==null || fn:length(cardLst) == 0}">
			<label style="color: red">no result</label>l
		</c:if>

</form>
</body>

</html>