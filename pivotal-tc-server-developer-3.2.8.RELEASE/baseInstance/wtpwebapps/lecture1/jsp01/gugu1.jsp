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
		<%
			for (int i = 1; i < 10; i++) {
				out.print("\t<tr>");
				for (int j = 1; j < 10; j++) {
					out.print("\t\t<td>"+j+"x"+i+"="+j*i+"</ td>\n");
				}
				out.print("\t</ tr>\n");
			}
		%>
	</table>

</body>
</html>