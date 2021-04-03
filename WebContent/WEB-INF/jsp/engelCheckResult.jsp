<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エンゲル係数チェック</title>
</head>
<body>
<h1>エンゲル係数チェックの結果</h1>
<p>
家計総収入額：<c:out value="${engel.totalExpense}" />円<br>
食費支出額：<c:out value="${engel.foodExpense}" />円<br>
エンゲル係数：<c:out value="${engel.engelCoefficient}" />%<br>
適性値：15%～20%<br>
評価：${engel.adviceMsg}<br>
<a href="/engelCoefficient/EngelCheck">戻る</a>
</p>
</body>
</html>