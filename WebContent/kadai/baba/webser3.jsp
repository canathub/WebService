<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Wifi-cafe-service</title>
</head>
<body>
${station}駅周辺のWi-Fiがあるカフェは・・・<br><br>



<c:forEach var="cafe" items="${info.cafe}" varStatus="st">
	<c:if test="${st.count==1||st.count==4||st.count==7||st.count==10||st.count==13||st.count==16}">
	${cafe}<br>
	</c:if>

	<c:if test="${st.count==2||st.count==5||st.count==8||st.count==11||st.count==14||st.count==17}">
	<img src = "/web/kadai/baba/${cafe}" width="300" height="200"><br>
	</c:if>

	<c:if test="${st.count==3||st.count==6||st.count==9||st.count==12||st.count==15||st.count==18}">
	<a href = "${cafe}">${cafe}</a><br>
	------------------------------------------------------------------------------
	</c:if>

<br>

</c:forEach>
※基本的に駅から近い順に載せています。
</body>
</html>
<!--
<div id="map" style="width:400px; height:300px"></div>

	<script type="text/javascript">
    function initMap() {
      var opts = {
        zoom: 15,
        center: new google.maps.LatLng(${cafe})};
      var map = new google.maps.Map(document.getElementById("map"), opts);
    }
    </script>

    <script async defer
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBL8IWGsEnqiVb4kHLajITPQoUQBXEuE6g&callback=initMap">
    </script>
    -->

