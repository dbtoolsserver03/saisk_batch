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
<title>追加动物信息</title>
</head>
<body>
add animal info
<form  action="${pageContext.request.contextPath }/animalinsert.action" method="post">
动物ID	<input type="text" name="id"><br>
动物姓<input type="text" name="sei"><br>	
动物名<input type="text" name="mei"><br>	
性別  
		<input type="radio" name="sex" value="1">雄性
       <label><input type="radio" name="sex" value="0">雌性</label>
        <br>
生日<input type="date" name="birthday"><br>
食物kg<input type="textd" name="food"><br>

<input type="submit" value="提交">
</form>
    
</body>

</html>