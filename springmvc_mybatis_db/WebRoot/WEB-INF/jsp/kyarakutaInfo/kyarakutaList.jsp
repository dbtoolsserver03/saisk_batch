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
<title>キャラクター一覧表</title>
<script type="text/javascript" src="../${pageContext.request.contextPath}/js/kyarakuta/kyarakutaList.js">
</script>



</head>
<body>

<form name="kyarakutaForm"method="post">
               一覧：
		<table width="100%" border=2>
			<tr>
				<td align="center">名前： <input type="text" name="kyarakutaName" value="${kyarakutax.kyarakutaName}">
				 </td>
キャラクター
				<td>
					<input type="button" value="表示" onclick="querykyarakuta()" />
					<input type="button" value="新規" onclick="addkyarakuta()" />
					<input type="button" value="削除" onclick="deletekyarakuta()" />
				</td>
			</tr>
		</table>
		<c:if test="${kyarakutaLst !=null && fn:length(kyarakutaLst) > 0}">
		
		キャラクター
		<table width="100%" border=1>
				<tr>
					<th>選択</th>
					<th>名前</th>
					<th>性別</th>
					<th>誕生日</th>
					<th>操作</th>
				</tr>

				<c:forEach items="${kyarakutaLst}" var="kyarakuta" varStatus="status">
					<tr>
						<td><input type="checkbox" name="kyarakuta_id" currentStatusxx="aa_${status.count}"
							value="${kyarakuta.kyarakutaId}"></td>
						<td>${kyarakuta.kyarakutaName }</td>
						<td>
						<c:choose>
         <c:when test="${kyarakuta.kyarakutaSex == 0 }">女</c:when>
         <c:when test="${kyarakuta.kyarakutaSex == 1 }">男</c:when>
     　　　　　　　　　 <c:choose><td>
						<td><fmt:formatDate value="${kyarakuta.kyarakutaAge}"	pattern="yyyy/MM/dd" /></td>
						<td><a href="${pageContext.request.contextPath }/editkyarakuta.action?kyarakutaid=${kyarakuta.kyarakutaId}">更新</a></td>
						
					</tr>
				</c:forEach>
				
			</table>
			
		</c:if>
　　　　　　　<c:if test="${kyarakutaLst ==null || fn:length(kyarakutaLst) == 0}">
			<label style="color: red">探せません</label>
		</c:if>
		
</form>

</body>

</html>