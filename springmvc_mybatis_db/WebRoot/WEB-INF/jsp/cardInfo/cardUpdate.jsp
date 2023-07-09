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
<title>更新Card信息</title>
<script type="text/javascript" src="js/userinfo/userinfoList.js">
</script>
</head>
<body>
update Card info
<form  action="${pageContext.request.contextPath }/cardupdate.action" method="post">

カードID	<input type="text" readonly name="cardId" value="${card.cardId}"><br>
カード名<input type="text" name="cardName" value="${card.cardName}"><br>
种族<input type="text" name="cardZhongzu" value="${card.cardZhongzu}"><br>
属性<input type="date" name="cardShuxing" value="<fmt:formatDate value='${card.cardShuxing}' pattern='yyyy-MM-dd'/>"><br>
攻击力<input type="text" name="cardAttack" value="${card.cardAttack}"><br>


<input type="submit" value="提交">
</form>

</body>

</html>