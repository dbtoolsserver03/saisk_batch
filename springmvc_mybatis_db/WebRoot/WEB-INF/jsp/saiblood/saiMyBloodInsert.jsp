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
<title>追加血液信息</title>
</head>
<body>
add 血液 info


<form  action="${pageContext.request.contextPath }/saiBloodInsert.action" method="post">
ID	<input type="text" name="personId"><br>
献血人姓名<input type="text" name="personName"><br>
献血人性別
		<input type="radio" name="gender" value="01">man
       <label><input type="radio" name="gender" value="00">women</label>
        <br>
献血人生日<input type="date" name="age"><br>
献血量(CC)<input type="text" name="bloodCc"><br>
<input type="submit" value="提交">
</form>

</body>

</html>