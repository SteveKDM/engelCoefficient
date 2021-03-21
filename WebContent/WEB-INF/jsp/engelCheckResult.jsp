<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Engel" %>
<%
	Engel engel = (Engel) request.getAttribute("engel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エンゲル係数チェック</title>
</head>
<body>
<h1>エンゲル係数チェックの結果</h1>
<p>
家計総収入額：<%= engel.getTotalExpense() %>円<br>
食費支出額：<%= engel.getFoodExpense() %>円<br>
エンゲル係数：<%= engel.getEngelCoefficient() %>%<br>
適性値：15%～20%<br>
評価：<%= engel.getAdviceMsg() %><br>
<a href="/engelCoefficient/EngelCheck">戻る</a>
</p>
</body>
</html>