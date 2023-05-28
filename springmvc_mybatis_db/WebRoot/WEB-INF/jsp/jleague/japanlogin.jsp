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
	<link rel="icon" href="/springmvc_mybatis_db/img/222.ico" type="image/vnd.microsoft.icon">
<title>japanlogin</title>
</head>
<body>
	<form action="/springmvc_mybatis_db/jleague/japanlogin.action" method="post">
	<div align="right">
			<a href="http://www.jfa.jp" >連携協会</a>
			<br>
		</div>
		
		<div style="background-color:blue">
			<table width="100%">
			<tr>
				<td width="25%"></td>
				<td width="25%">
					<div align="right" style="width:50px;height:60px;"> <img src="/springmvc_mybatis_db/img/123.png"></div>	
				</td>
				<td width="25%">
					<p align="center" style="color: azure">日本代表登録システム</p>					
				</td>
				<td width="25%"></td>
			</tr>	
			</table>
		</div>
			
		<div align="center">	
			<br><br><br><br><br>
				<input id="id_user_id" type="text" name="userId" style="background-color:DeepSkyBlue" placeholder="ログインID">
			<br>
				<input type="password" name="password" style="background-color: aqua;" placeholder="パスワード"	>	
			<br><br>
				 <input id="id_my_btn" type="submit"  value="  ログイン  " >	
				 <input id="id_my_btn" type="reset"  value="  キャンセル  " >	
		</div>
		
		<div align="center" class="copyright">© Japan Football Association All Rights Reserved.</div>

	</form>
</body>
</html>