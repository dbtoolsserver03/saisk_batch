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
<title>追加Card信息</title>
<script type="text/javascript" src="js/userinfo/userinfoList.js">
</script>
</head>
<body>
add Card info
<form  action="${pageContext.request.contextPath }/cardinsert.action" method="post">

カードID	<input type="text" name="cardId"><br>
カード名<input type="text" name="cardName"><br>
种族<input type="text" name="cardZhongzu"><br>
属性<input type="date" name="cardShuxing"><br>
攻击力<input type="text" name="cardAttack"><br>


<input type="submit" value="提交">
</form>

</body>

</html>