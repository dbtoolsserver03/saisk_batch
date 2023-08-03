<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>システム登録</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/login.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/lib/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/login.js"></script>

<style>
.mytext
{
	background-color:#d0e4fe;
}
</style>

</head>

<script type="text/javascript">

//DOM OLD


function register() {

	//提交form
	document.loginForm.action = "/springmvc_mybatis_db/register.action";
	document.loginForm.submit();

}

</script>

<body background="">
<div class="background-color">
    <table width="100%">
        <tr>
            <td width="5%"></td>
            <td width="20%">
            </td>
            <td width="50%"><p align="center" style="color:rgb(0, 128, 255)">システム登録</p></td>
            <td align="right" width="25%"></td>
        </tr>
    </table>
</div>
<form name="loginForm" action="${pageContext.request.contextPath }/login.action" method="post">

<!-- style="background-color:#d000fe;" -->
<div align="center">
　　　　<br><br><br>
 <table>
<tr><td>アカウント：<tr><td><input id="id_username" class="mytext" style="background-color:#ea9de4;" type="text" name="username"value="${usraaa}" /><tr><td><br/><br/>
<tr><td>パスワード ：<tr><td><input id="id_password" style="background-color:#ea9de4;"　type="password" name="password"  /><tr><td><br/><br/>
<tr><td>暗証番号 ：<tr><td><input name="validateWord"  style="background-color:#ea9de4;"　/><br/><br/> <table>

<input type="submit" class="blue-btn" value="登録"/>
<input type="button" value="キャンセル" onclick="fnclear()"/>

<!-- <input id="id_btn_clear" type="button" value="清除"/> -->
<input id="id_btn_register" type="button" value="発行" onclick="register()"/>
</div>

<br>
<!-- 显示错误信息 -->
<c:if test="${errorList!=null}">
	<div style="background-color:pink">
		<c:forEach var="err" items="${errorList}">
			${err.msgType}${err.msgId} : ${err.msgContent}<br>
		</c:forEach>
	</div>
</c:if>

</form>

<br>

</body>
</html>


<!-- CSS:就近原则 -->
<!-- HTML内部 > HTML CSS > CSS 文件 -->
<!-- JSP HTML 注释快捷键 -->
<!-- CTRL + SHIFT + C -->