<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
table {
	border-collapse: collapse;
}

td {
	padding: 3px;
	border: solid 1px gray;
}
</style>
</head>
<body>

	<table>
	<tr>
		<%for(int i= 2 ; i<10 ; i++) { %>
			<%if(i==6){ %>
	</tr>
	<tr>
			<% } %>
			<%if(i<6){ %>
				<%if(i%2==0) { %>
			<td style="background-color: #DCFDDC">
				<%} else { %>
			<td style="background-color: #FEFDDC">
				<%} %>
			<%} else { %>
				<%if(i%2!=0) { %>
			<td style="background-color: #DCFDDC">
				<%} else { %>
			<td style="background-color: #FEFDDC">
				<%} %>
			<%} %>
			
			<%for(int j=1 ; j<10 ; j++) {%>
				<%out.print(i+" x "+j+" = "+(i*j)); %></br>
			<% } %>
			</td>
		<%} %>	
	</tr>			
	</table>

</body>
</html>