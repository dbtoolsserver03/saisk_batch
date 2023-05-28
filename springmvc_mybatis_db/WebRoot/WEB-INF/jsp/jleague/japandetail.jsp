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
	<title>代表情報</title>
	<link rel="icon" href="/springmvc_mybatis_db/img/222.ico" type="image/vnd.microsoft.icon">
<script type="text/javascript" src="../js/lib/jquery.min.js"></script>
	
	<script>	
		$(document).ready(function(){
			$("#id_btn_detail").prop( 'disabled', true );
			
	  		$("#id_btn_search").click(function() {
				$("#id_btn_detail").show();
				$("#id_btn_delete").show();
				$("#id_btn_update").show();
			});
		});

		function showDiv() {
			document.getElementById('id_table').style.display = "block";
			document.getElementById('id_btn_delete').style.display = "block";
			document.getElementById('id_btn_detail').style.display = "block";

			document.searchForm.action = "/springmvc_mybatis_db/jleague/japansearch.action";
			document.searchForm.submit();

			
		}
	</script>
</head>
<body>	
<form name="searchForm" action="/springmvc_mybatis_db/jleague/japandetail.action" method="post">
	<div align="right">
	<a href="http://www.jfa.jp">連携協会 </a>
	</div>
	
	<div style="background-color: blue;">
		<table width="100%">
		<tr>
			<td width="25%"></td>
			<td width="25%">
				<div align="right" style="width:50px;height:60px;"> <img src="/springmvc_mybatis_db/img/123.png"/></div>	
			</td>
			<td width="25%">
				<p align="center" style="color: azure">日本代表登録システム</p>					
			</td>
			<td width="25%"> <p align="right" style="color: aliceblue;">登録ページ</p>
			</td>
		</tr>
		</table>
	</div>		
	
	<div id="id_next" style="background-color: azure;">	
		<table width:"100%">
		<tr>
			<td width:"25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">姓</p>
			</td> 
			<td width="25%">
				<input id="id_text_sei" name="sei" style="width: 300px;height: 30px;" type="text">
			</td>
			<td width:"25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">名</p>
			</td> 
			<td width="25%">
				<input id="id_text_mei"  name="na" style="width: 300px;height: 30px;" type="text">
			</td>
		</tr>
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left"  name="telnumber" style="color: rgb(0, 0, 0)">電話番号</p>
			</td> 
			<td width="25%">	
				<input id="id_text_number" style="width: 300px;height: 30px;" type="text">
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left"  style="color: rgb(0, 0, 0)">住所</p>
			</td> 
			<td width="25%">	
				<input id="id_text_adress" name="address"  style="width: 300px;height: 30px;" type="text">
			</td>
		</tr>	
		</table>
	</div>
	
	<div id="id_btn_all" align="right">
		<input id="id_btn_detail" type= value="詳細" style="display: none; background-color: deeppink;">
		<input id="id_btn_delete" type="button" value="削除" style="display: none; background-color: deeppink;">
		<input id="id_btn_update" type="button" value="更新" style="display: none; background-color: deeppink;">
		<input id="id_btn_new" style="background-color: deeppink;" class="btn-pink" type="submit" value="新規">
		<input id="id_btn_search" style="background-color: deeppink;" class="btn-pink" type="button" value="検索" onclick="showDiv()" />
	</div>
		<br><br>
	<div align="center">
		<table  id="id_table" style="display: none" width="100%" border="1">
		<tr>
			<th width="4%">選択</th>
			<th width="4%">番号</th>
			<th width="10%">姓</th>
			<th width="10%">名</th>
			<th width="15%">生年月日</th>
			<th width="15%">所属チーム</th>
			<th width="15%">携帯番号</th>
			<th width="27%">住所</th>
		</tr>
		</table>
	<div align="center" class="copyright">© Japan Football Association All Rights Reserved.</div>	
</body>
</html>