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
<title> 確認画面</title>
<link rel="stylesheet" href=">
<script  type="text/javascript" src="/springmvc_mybatis_db/jquery-3.6.4.min.js"></script>
	<script>	
	function backAndFresh(){
	var url =document.referrer;
	window.location=url;
	}
	</script>
</head>
<body>
<form action="/springmvc_mybatis_db/jleague/japanlogin2.action" method="post">
	<h2>入力情報を確認して登録ボタンをそひてください</h2>
	名前: <strong><%=request.getParameter("userId")%></strong>
	<br>
	パスワード: <strong><%=request.getParameter("password")%></strong>
	<br><br>
				 <input id="id_my_btn" type="submit"  value="  ログイン  " >	
				 <input id="id_my_btn" class="btn btn-default" onclick="backAndFresh()"type="button"  value=" 切り返す " >	

</body>
</html>