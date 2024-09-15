<html>
<head>
</head>
<body>
<h1>
<%
 int num1=Integer.parseInt(request.getParameter("one"));
       int num2=Integer.parseInt(request.getParameter("two"));
        int num=(int)request.getAttribute("mul");
 %>
<%
out.println(num);
%>
</h1>
</body>
</html>