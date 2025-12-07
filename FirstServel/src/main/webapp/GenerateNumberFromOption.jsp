<%@page language="java" contentType="text/html;charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	try {

		String userOption = request.getParameter("option");
		String userInput = request.getParameter("input");

		int input = Integer.parseInt(userInput);

		if (userOption.equals("Multiplication")) {
			out.println("The table of " + userInput + " is :"+"<br></br>");
			for (int i = 1; i < 11; i++) {
		out.println(userInput + " * " + i + " = " + (input * i)+"<br></br>");
			}
		}

		else if (userOption.equals("Fibonacci")) {
			int a = 0;
			int b = 1;
			int c = 0;
			out.println("The Fibonacy Series upto of " + userInput + " is :");
			for (int i = 2; i < input; i++) {
		c = a + b;
		out.print(a + " ");
		a = b;
		b = c;
			}
		}

		else if (userOption.equals("Factorial")) {
			int fact = 1;
			for (int i = 1; i <= input; i++) {
		fact = fact * i;
			}
			out.println(fact);
		}
	} catch (Exception e) {
		out.println(e.getMessage());
	}
	%>
</body>
</html>