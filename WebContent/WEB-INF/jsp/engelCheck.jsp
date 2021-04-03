<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エンゲル係数チェック</title>
</head>
<body>
<h1>エンゲル係数チェック</h1>
<form action="/engelCoefficient/EngelCheck" method="post">
家計総支出額:<input type="text" name="totalExpense">円<br>
食費支出額:<input type="text" name="foodExpense">円<br>
<input type="submit" value="チェック">
</form>
</body>
</html>