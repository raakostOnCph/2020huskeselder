<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Niks huskesedler </title>
</head>
<body>
<h1><%= "Wekommen til dine online huskesedle ! " %>
</h1>
<br/>

<h2> Login som eksisterende bruger </h2>

<form action="login">
    <label for="navnLogin">Navn:</label><br>
    <input type="text" id="navnLogin" name="navnLogin" value=""><br>
    <label for="kodeLogin">Kode:</label><br>
    <input type="text" id="kodeLogin" name="kodeLogin" value=""><br><br>
    <input type="submit" value="login">
</form>



<h2>eller opret dig som ny bruger </h2>

<form action="login" method="post">
    <label for="navn">Navn:</label><br>
    <input type="text" id="navn" name="navn" value=""><br>
    <label for="kode1">Kode:</label><br>
    <input type="text" id="kode1" name="kode1" value=""><br><br>

    <label for="kode2">Skriv kode igen:</label><br>
    <input type="text" id="kode2" name="kode2" value=""><br><br>
    <input type="submit" value="Opret">
</form>




</body>
</html>