<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
  input.form-control { width: 200px; }
</style>
</head>
<body>
  <div class="container">
    <form action="exam2.jsp" method="get">
      <div class="form-group">
        <label>text1</label> 
        <input type="text" name="text1" class="form-control" value='<%= request.getParameter("text1")==null?"hello":request.getParameter("text1")%>' />
      </div>

      <div class="form-group">
        <label>text2</label> 
        <input type="text" name="text2" class="form-control" value='<%= request.getParameter("text2")==null?"world":request.getParameter("text2")%>' />
      </div>
      
      <div class="form-group">
        <input type="submit" class="btn btn-primary" name="cmd" value="확인">
      </div>

    </form>
  </div>
</body>
</html>
