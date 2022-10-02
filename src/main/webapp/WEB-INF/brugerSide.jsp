<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 02/10/2022
  Time: 09.40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bruger side</title>
</head>
<body>

<h1> Velkommen til din bruger side</h1>
du er logget ind med navnet ${requestScope.navn}
og dit sessionid er ${sessionScope.id}

<form action="BrugerServlet">

    <input type="submit" value="lock ud">



</body>
</html>
