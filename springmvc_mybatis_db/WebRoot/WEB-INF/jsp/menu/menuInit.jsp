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
<title>功能菜单</title>
</head>
<body>

<a href="${pageContext.request.contextPath }/blandBagInit.action">ブランドバッグ一覧</a>
<br>

<a href="${pageContext.request.contextPath }/foodInit.action">料理一覧</a>
<br>

<a href="${pageContext.request.contextPath }/carInit.action">車一覧</a>
<br>

<a href="${pageContext.request.contextPath }/ballTeamInit.action">ボールチーム一覧</a>
<br>

<a href="${pageContext.request.contextPath }/animalInit.action">動物一覧</a>
<br>
<a href="${pageContext.request.contextPath }/teacherInit.action">老师</a>
<br>
<a href="${pageContext.request.contextPath }/items/initItems.action">商品</a>
<br>
<a href="${pageContext.request.contextPath }/initUserLst.action">用户一览</a>
</body>

</html>