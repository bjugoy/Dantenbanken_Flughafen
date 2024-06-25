<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Buchung/Reservierung</title>
</head>
<body>
<h2>Buchung/Reservierung</h2>
<!-- Beispiel für eine Buchungsformular -->
<form action="BookingServlet" method="post">
    Terminal: <input type="text" name="terminalNumber"><br>
    Flugzeugtyp: <input type="text" name="aircraftType"><br>
    Buchungsdatum: <input type="date" name="bookingDate"><br>
    <input type="submit" value="Buchen">
</form>
</body>
</html>
