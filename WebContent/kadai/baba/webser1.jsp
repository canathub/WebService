<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/WebContent/kadai/baba/Webser1">


	<h3>港区住みリモートワーカー必見！！</h3>
	<h1>港区Wi-Fi（と電源）のあるカフェ案内</h1><br>

	路線を選んでください
	<input type="radio" name="radio1" value="東京メトロ" checked="checked">東京メトロ
	<select name="conbo">
	<option value="半蔵門線" selected="selected">半蔵門線</option>
	<option value="銀座線">銀座線</option>
	<option value="丸の内線">丸の内線</option>
	<option value="南北線">南北線</option>
	<option value="千代田線">千代田線</option>
	<option value="日比谷線">日比谷線</option>
	</select>
	<br><br>

	<input type="radio" name="radio1" value="都営">都営
	<select name="conbo1">
	<option value="浅草線">浅草線</option>
	<option value="大江戸線">大江戸線</option>
	<option value="三田線">三田線</option>
	</select>
	<br><br>

	<input type="radio" name="radio1" value="JR">JR
	<select name="conbo2">
	<option value="京浜東北線">京浜東北線</option>
	<option value="横須賀線">横須賀線</option>
	<option value="山手線">山手線</option>
	<option value="東海道本線">東海道本線</option>
	</select>
	<br><br>

	<input type="radio" name="radio1" value="ゆりかもめ線">ゆりかもめ線
	<input type="radio" name="radio1" value="京浜急行本線">京浜急行本線
	<input type="radio" name="radio1" value="東海道新幹線">東海道新幹線

	<br><br>

	<input type="submit" value="駅を探す" />
	<input type="reset" value="リセット" />
</form>


</body>
</html>
