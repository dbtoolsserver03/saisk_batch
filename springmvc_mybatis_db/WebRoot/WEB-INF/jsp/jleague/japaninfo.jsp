<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>選手個人情報</title>
</head>
<body>
<link rel="icon" href="pic/222.ico" type="image/vnd.microsoft.icon">

<script type="text/javascript" src="../js/lib/jquery.min.js"></script>

	<script>
	
		$(document).ready(function(){
			if($("#id_mode").val() == "view_mode"){
				$("#id_div_input").find("*").each(function(){
						$(this).attr("disabled",true);
					}
				);
			}
			if($("#id_mode").val() == "update_mode"){
				document.title = document.title + "(修正モード)";
			} else if($("#id_mode").val() == "insert_mode"){
				document.title = document.title + "(新規モード)";
			}if($("#id_mode").val() == "view_mode"){
				document.title = document.title + "(詳細モード)";
			} 
			
		});

		function funOk() {
			if($("#id_mode").val() == "update_mode"){
				document.myform.action="/springmvc_mybatis_db/jleague/updatejapaninfo.action";
			} 
			document.myform.submit();
		}

		
		function backToLast(){
		var url =document.referrer;
		window.location="japanlogin2.action";
		}
// 		 debugger;
// 		 lightbox.option({
//      		'resizeDuration': 200,
//       		'wrapAround': true
//    		})
   		
   		
   		
	</script>
</head>
<body>
<form name="myform" action="/springmvc_mybatis_db/jleague/japaninfo.action" method="post">
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
	

	<div>
	<a style="background-color:azure">
	
		<table width="100%">
			<tr>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">免許正面</p>
			</td> 
			<td width="25%">
				<a href="/springmvc_mybatis_db/img/333.png" data-lightbox="image-1" data-title="免許正面"><img src="/springmvc_mybatis_db/img/333.png" width="300" height="180"></a>
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">免許裏面</p>
			</td> 
			<td width="25%">
				<a href="/springmvc_mybatis_db/img/444.png" data-lightbox="image-1" data-title="免許裏面"><img src="/springmvc_mybatis_db/img/444.png" width="300" height="180"></a>	
			</td> 
		</tr>	
		</table>
	</div>
<div id="id_div_input">
	<div>
	<a style="background-color:azure">
	
	
		<table width="100%">
			<tr>
			<td width="25%" style="background-color: paleturquoise;">
				 <p align="left" style="color: rgb(0, 0, 0)">ID</p>
			</td> 
			<td width="25%">	
				<input id="id_text_sei" 
				
				<c:if test="${mode == 'update_mode' || mode == 'view_mode'}"> readonly </c:if>
				name="id" style="width: 300px;height: 30px;" type="text" value="${obj.id}" >
			</td>
			<td width="25%">	
			</td> 
			<td width="25%">	
			</td>
		</tr>	
		</table>
	</div>
	
	<div style="background-color:azure">
		<table width="100%">
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				 <p align="left" style="color: rgb(0, 0, 0)">姓</p>
			</td> 
			<td width="25%">	
				<input id="id_text_sei" name="sei" style="width: 300px;height: 30px;" type="text" value="${obj.sei}">
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				 <p align="left" style="color: rgb(0, 0, 0)">名</p>
			</td> 
			<td width="25%">
				<input id="id_text_mei" name ="na" style="width: 300px;height: 30px;" type="text" value="${obj.na}">
			</td>
		</tr>	
		</table>
	</div>
	
	<div style="background-color:azure">
		<table width="100%">
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				 <p align="left" style="color: rgb(0, 0, 0)">電話番号</p>
			</td> 
			<td width="25%">	
				<input id="id_text_number" name ="telnumber" style="width: 300px;height: 30px;" type="text" value="${obj.telnumber}">
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">住所</p>
			</td> 
			<td width="25%">	
				<input id="id_text_adress" name="address" style="width: 300px;height: 30px;" type="text" value="${obj.address}">
			</td>
		</tr>	
		</table>
	</div>
	
	<div style="background-color:azure">
		<table width="100%">
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">生年月日</p>
			</td> 
			<td width="25%">
				<input id="id_text_birthday" name="brith" width="100%" type="date"  value="<fmt:formatDate value='${obj.brith}' pattern='yyyy-MM-dd' />"></td>
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">出身地</p>
			</td> 
			<td width="25%">
				<input id="id_text_city" name="placeOfBirth" style="width: 300px;height: 30px;" type="text" value="${obj.placeOfBirth}">	
			</td>
		</tr>	
		</table>
	</div>
	
	<div style="background-color:azure">
		<table width="100%">
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">所属チーム</p>
			</td> 
			<td width="25%">	
				<input id="id_text_club" name="team" style="width: 300px;height: 30px;" type="text" value="${obj.team}">
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">年収</p>
			</td> 
			<td width="25%">	
				<select id="id_text_salary" name="salary" value="${obj.salary}">
				
					<option value="1" <c:if test="${obj.salary == 1}">selected</c:if> ></option>
					<option value="2" <c:if test="${obj.salary == 2}">selected</c:if> >10W-50W</option>
					<option value="3" <c:if test="${obj.salary == 3}">selected</c:if> >51W-100W</option>
					<option value="4" <c:if test="${obj.salary == 4}">selected</c:if> >101W-500W</option>
					<option value="5" <c:if test="${obj.salary == 5}">selected</c:if> >501W-1000W</option>
					<option value="6" <c:if test="${obj.salary == 6}">selected</c:if> >1001W以上</option>
				</select>
			</td>
		</tr>	
		</table>
	</div>
	
	<div style="background-color:azure">
		<table width="100%">
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">日本代表</p>
			</td> 
			<td width="25%">	
				<input id="id_radio_choose_yes"  name="jpDeputy" type="radio" value="1"  <c:if test="${obj.jpDeputy == 1}">checked</c:if>  />Yes
				<input id="id_radio_choose_no" name="jpDeputy" type="radio" value="0"  <c:if test="${obj.jpDeputy == 0}">checked</c:if> />No
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">スキル</p>
			</td> 
			<td width="25%">
			
			
				

			
				<label><input id="id_skill_chk_speed" name="skill" type="checkbox" value="1"
								<c:forTokens var="element" items="${obj.skill}" delims=",">
									<c:if test="${element == 1}"> checked</c:if>
								</c:forTokens>
						>Speed
				</label>
				
				
				<input id="id_skill_chk_tech" name="skill" type="checkbox" value="2"
								<c:forTokens var="element" items="${obj.skill}" delims=",">
									<c:if test="${element == 2}"> checked</c:if>
								</c:forTokens>
						>Tech
				<input id="id_skill_chk_power" name="skill" type="checkbox" value="3"
								<c:forTokens var="element" items="${obj.skill}" delims=",">
									<c:if test="${element == 3}"> checked</c:if>
								</c:forTokens>
				>Power
				<input id="id_skill_chk_flexibe" name="skill" type="checkbox" value="4"
								<c:forTokens var="element" items="${obj.skill}" delims=",">
									<c:if test="${element == 4}"> checked</c:if>
								</c:forTokens>
				>Flexibe
			</td>
		</tr>
		</table>
	</div>
	
	<div style="background-color:azure">
		<table width="100%">
		<tr>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">ポジション</p>
			</td> 
			<td width="25%">
				<input id="id_chk_position_goalkeeper" type="checkbox" name="position" value="1">GK
				<input id="id_chk_position_defance" type="checkbox" name="position" value="2">D
				<input id="id_chk_position_middle" type="checkbox" name="position" value="3">M
				<input id="id_chk_position_forward" type="checkbox" name="position" value="4">F
			</td>
			<td width="25%" style="background-color: paleturquoise;">
				<p align="left" style="color: rgb(0, 0, 0)">位置</p>
			</td> 
			<td width="25%">	
				<input id="id_chk_area_right" name="rcl" type="checkbox" value="1">R
				<input id="id_chk_area_center" name="rcl" type="checkbox" value="2">C
				<input id="id_chk_area_left" name="rcl" type="checkbox" value="3">L
			</td>
		</tr>
		</table>
	</div>
</div>
	<div align="right">
		<input id="id_btn_back" style="background-color: rgb(125, 100, 210);" class="btn btn-default" onclick="backToLast()"type="button" value="取り返す">
		
		<c:if test="${mode != 'view_mode'}">
			<input id="id_btn_clear" style="background-color: rgb(125, 100, 210);" class="btn-pink" type="reset" value="キャンセル">
			<input id="id_btn_ok" style="background-color: rgb(125, 100, 210);" class="btn-pink" type="button" value="確定" onclick="funOk()">
		</c:if>
	</div>
	
	<div align="center" class="copyright">© Japan Football Association All Rights Reserved.</div>
	
	<input id="id_mode" name="mode" type="hidden" value="${mode}">
	</form>
</body>
</html>