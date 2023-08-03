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
<title>キャラクター更新</title>
<script type="text/javascript" src="js/userinfo/userinfoList.js">
</script>
</head>
<body>
<div class="background-color">
    <table width="100%">
        <tr>
            <td width="5%"></td>
            <td width="20%">
            </td>
            <td width="50%"><p align="center" style="color:rgb(0, 128, 255)">キャラクター追加</p></td>
            <td align="right" width="25%"></td>
        </tr>
    </table>
</div>
<form  action="${pageContext.request.contextPath }/kyarakutaupdate.action" method="post">
<div align="center">
    <br><br><br><br><br>
    <table>
<tr><td>キャラクターID<tr><td><input type="text" readonly="readonly" style="background-color:DeepSkyBlue" name="kyarakutaId" value="${kyarakuta.kyarakutaId}"><tr><td><br><br>
<tr><td>キャラクター名前<tr><td><input type="text" style="background-color:rgb(255, 0, 0)" name="kyarakutaName"value="${kyarakuta.kyarakutaName}"><tr><td><br><br>
    </table>	
性別  
		<input type="radio" name="kyarakutaSex" value="1">man
       <label><input type="radio" name="kyarakutaSex" value="0">women</label>
        <br><br>
誕生日<input type="date" name="kyarakutaAge"value="<fmt:formatDate value='${kyarakuta.kyarakutaAge}'pattern='yyyy/MM/dd'/>"><br><br>
       

<input type="submit"  value="提出">
</div>
</form>
    
</body>

</html>