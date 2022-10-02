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


<form action="BrugerServlet" method="post">

    <label for="emne">Tilføj emne:</label><br>
    <input type="text" id="emne" name="emne" value="ØlBong"><br><br>
    <input type="submit" value="Tilføj ">
</form>

<br>
<br>
<br>


<form action="BrugerServlet" method="get">

    <input type="submit" value="lock ud">



</body>
</html>
