<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="/src/kadai/baba/Webser2">
駅を選んでください<br><br>

${metoro}<br>
<c:forEach var="han" items="${hanzomon}" varStatus="st">
	<input type="radio" name="radio" value="${han}">${han} <br>
</c:forEach>
<c:forEach var="gin" items="${ginza}" varStatus="st">
	<input type="radio" name="radio" value="${gin}">${gin} <br>
</c:forEach>
<c:forEach var="maru" items="${marunouti}" varStatus="st">
	<input type="radio" name="radio" value="${maru}">${maru} <br>
</c:forEach>
<c:forEach var="nan" items="${nanboku}" varStatus="st">
	<input type="radio" name="radio" value="${nan}">${nan} <br>
</c:forEach>
<c:forEach var="tiyo" items="${tiyoda}" varStatus="st">
	<input type="radio" name="radio" value="${tiyo}">${tiyo} <br>
</c:forEach>
<c:forEach var="hibi" items="${hibiya}" varStatus="st">
	<input type="radio" name="radio" value="${hibi}">${hibi} <br>
</c:forEach>



${toei}<br>
<c:forEach var="oe" items="${oedo}" varStatus="st">
	<input type="radio" name="radio" value="${oe}">${oe} <br>
</c:forEach>
<c:forEach var="asa" items="${asakusa}" varStatus="st">
	<input type="radio" name="radio" value="${asa}">${asa} <br>
</c:forEach>
<c:forEach var="mit" items="${mita}" varStatus="st">
	<input type="radio" name="radio" value="${mit}">${mit} <br>
</c:forEach>

${jr}<br>
<c:forEach var="keito" items="${kehintohoku}" varStatus="st">
	<input type="radio" name="radio" value="${keito}">${keito} <br>
</c:forEach>
<c:forEach var="suka" items="${yokosuka}" varStatus="st">
	<input type="radio" name="radio" value="${suka}">${suka} <br>
</c:forEach>
<c:forEach var="yama" items="${yamanote}" varStatus="st">
	<input type="radio" name="radio" value="${yama}">${yama} <br>
</c:forEach>
<c:forEach var="tokai" items="${tokaido}" varStatus="st">
	<input type="radio" name="radio" value="${tokai}">${tokai} <br>
</c:forEach>

${yurikamome1}<br>
<c:forEach var="yuri" items="${yurikamome}" varStatus="st">
	<input type="radio" name="radio" value="${yuri}">${yuri} <br>
</c:forEach>

${keikyu1}<br>
<c:forEach var="kei" items="${keikyu}" varStatus="st">
	<input type="radio" name="radio" value="${kei}">${kei} <br>
</c:forEach>

${sinkansen1}<br>
<c:forEach var="sinkan" items="${sinkansen}" varStatus="st">
	<input type="radio" name="radio" value="${sinkan}">${sinkan} <br>
</c:forEach>

<input type="submit" value="駅周辺のお店探す" />
	<input type="reset" value="リセット" />

</form>
</body>
</html>
