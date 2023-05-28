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
			document.getElementById('id_btn_delete').style.display = "NONE";
		});

		function showDiv() {

			document.searchForm.action = "/springmvc_mybatis_db/jleague/japansearch.action";
			document.searchForm.submit();
		}
		function funCheckBoxClick() {

				var elements = document.getElementsByName("chk_select");

				var isSelected = false;
				for(var i=0;i<elements.length;i++) {
					if(elements[i].checked){
						isSelected=true;
						break;
					}
				}

				if(isSelected){
					document.getElementById('id_btn_delete').style.display = "block";
				} else {
					document.getElementById('id_btn_delete').style.display = "NONE";
				}
			}

		function del() {
		    if( window.confirm('削除処理を実行してよろしいでしょうか？') ) {
				document.searchForm.action = "/springmvc_mybatis_db/jleague/deleteJleague.action";
				document.searchForm.submit();
		    }
		}
	</script>
	
	<style type="text/css">
	
		.button{
			display:inline-block;
			background:#d13415;
			padding:10px 30px;
			text-align:center;
			color:#FFF;
			margin:5px;
			border:1px solid;
			cursor:pointer;
		}
	
	</style>
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
				<input id="id_text_sei" name="sei" style="width: 300px;height: 30px;" type="text" value="${obj.sei}">
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
				<input id="id_text_number" name="telnumber" style="width: 300px;height: 30px;" type="text">
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
	
	<table width="100%">
		<td width="60%"></td>
		<td width="10%"><input id="id_btn_delete" type="button"  class="button" value="一括削除" onclick="del()" style="display: NONE"></td>
		<td width="10%"><input id="id_btn_new"  class="button" type="submit" value="新規"></td>
		<td width="10%"><input id="id_btn_search"  class="button" type="button" value="検索" onclick="showDiv()" /></td>
	</table>

		
	<div align="center">
		<table  id="id_table" width="100%" border="1">
		<tr>
			<th width="4%">選択</th>
			<th width="4%">番号</th>
			<th width="5%">姓</th>
			<th width="5%">名</th>
			<th width="15%">生年月日</th>
			<th width="15%">所属チーム</th>
			<th width="15%">携帯番号</th>
			<th width="20%">住所</th>
			<th width="20%">操作</th>
		</tr>
		
		<c:forEach items="${jleagueLst}" var="jleague" varStatus="status">
			<tr>
				<td><input type="checkbox" name="chk_select" value="${jleague.id}" onclick="funCheckBoxClick()"></td>
				<td>${jleague.id}</td>
				<td>${jleague.sei}</td>
				<td>${jleague.na}</td>
				<td><fmt:formatDate value="${jleague.brith}" pattern="yyyy/MM/dd" />  </td>
				<td>${jleague.team}</td>
				<td>${jleague.telnumber}</td>
				<td>${jleague.address}</td>
				<td>
					<a href="${pageContext.request.contextPath }/jleague/editJleague.action?id=${jleague.id}">修正</a>
					<a href="${pageContext.request.contextPath }/jleague/viewJleague.action?id=${jleague.id}">詳細</a>
				</td>
			</tr>
		</c:forEach>
		
		</table>
	<div align="center" class="copyright">© Japan Football Association All Rights Reserved.</div>	
</body>
</html>