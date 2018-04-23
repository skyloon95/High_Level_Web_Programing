<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List,	M201432014.jdbc1.*" %>
<%
String s = request.getParameter("categoryId");
int categoryId = (s == null) ? 0 : Integer.parseInt(s);
List<Product> list;
if (categoryId == 0) list = ProductDAO3.findAll();
else list = ProductDAO3.findByCategoryId(categoryId);
%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
      thead th { background-color: #eee; }
      table.table { width: 700px; margin-top: 10px; }
  </style>
</head>
<body>

<div class="container">

<h1>제품목록</h1>

<form class="form-inline">
  <div class="form-group">
    <label>제품유형</label>
    <select name="categoryId" class="form-control">
      <option value="0" <%= categoryId == 0 ? "selected" : ""%>>전체</option>
      <option value="1" <%= categoryId == 1 ? "selected" : "" %>>음료수</option>
      <option value="2" <%= categoryId == 2 ? "selected" : "" %>>주류</option>
      <option value="3" <%= categoryId == 3 ? "selected" : "" %>>과자</option>
    </select>
  </div>
  <button type="submit" class="btn btn-primary">조회</button>
</form>

<table class="table table-bordered table-condensed">
    <thead>
        <tr>
            <th>id</th>
            <th>제품명</th>
            <th>카테고리</th>
            <th>가격</th>
            <th>수량</th>
        </tr>
    </thead>
    <tbody>
        <% for (Product product : list) { %>
            <tr>
                <td><%= product.getId() %></td>
                <td><%= product.getTitle() %></td>
                <td><%= product.getCategoryName() %></td>
                <td><%= product.getUnitCost() %></td>
                <td><%= product.getQuantity() %></td>
            </tr>
        <% } %>
    </tbody>
</table>

</div>
</body>
</html>
