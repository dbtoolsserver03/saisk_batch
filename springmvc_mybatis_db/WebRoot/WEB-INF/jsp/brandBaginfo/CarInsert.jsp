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
<title>追加老师信息</title>
<script type="text/javascript" src="js/userinfo/userinfoList.js">
</script>
</head>
<body>
add teacher info
<form  action="${pageContext.request.contextPath }/teacherinsert.action" method="post">
先生ID	<input type="text" name="teacherId"><br>
先生姓名<input type="text" name="teacherName"><br>	
性別  
		<input type="radio" name="teacherSex" value="1">man
       <label><input type="radio" name="teacherSex" value="0">women</label>
        <br>
生日<input type="date" name="teacherAge"><br>

<input type="submit" value="提交">
</form>
    
</body>

</html>