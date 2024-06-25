<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registrierung</title>
</head>
<body>
<h2>Registrierung</h2>
<form action="RegisterServlet" method="post">
    Vorname: <input type="text" name="firstName"><br>
    Nachname: <input type="text" name="lastName"><br>
    Geburtsdatum: <input type="date" name="birthdate"><br>
    E-Mail: <input type="email" name="email"><br>
    Passwort: <input type="password" name="password"><br>
    <input type="submit" value="Registrieren">
</form>
</body>
</html>
