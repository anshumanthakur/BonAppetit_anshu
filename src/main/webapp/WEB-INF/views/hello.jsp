<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVC/success" method="post">

		<table>

			<tr>
				<td>Food Name</td>

				<td><select id="mySelect" onchange="myFunction()">
						<c:forEach items="${list}" var="list">
							<option value="${list.p_price}">${list.p_name}</option>
						</c:forEach>
				</select></td>

			</tr>
			<tr>
				<td>Quantity</td>

				<td><select id="quantity" onchange="Function()">
						<%
							for (int i = 1; i < 10; i += 1) {
						%>
						<option value="<%=i%>">
							<%
								out.print(i);
							%>
						</option>
						<%
							}
						%>
				</select></td>

			</tr>

			<tr>
				<td>Comment</td>
				<td><input name="email" id="quantity" /></td>
			</tr>
			
			<tr>
				<td><input type="button" value="Add"></td>
			</tr>
			
	
		</table>

	</form>

	<p id="total"></p>

	<script>
		var x = 135;
		function myFunction() {
			x = document.getElementById("mySelect").value;
		}

		function Function() {
			var quantity = document.getElementById("quantity").value;
			document.getElementById("total").innerHTML = "Your total is: "
					+ (parseInt(quantity) * parseInt(x));

		}
	</script>
</body>
</html>