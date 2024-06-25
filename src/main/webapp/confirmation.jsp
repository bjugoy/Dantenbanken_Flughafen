<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Buchungsbestätigung</title>
</head>
<body>
<h2>Ihre Buchung wurde erfolgreich durchgeführt!</h2>
<p>Vorname: <%= request.getAttribute("firstName") %></p>
<p>Nachname: <%= request.getAttribute("LastName") %></p>
<p>Terminalnummer: <%= request.getAttribute("terminalNumber") %></p>
<p>Flugzeugtyp: <%= request.getAttribute("aircraftType") %></p>
<p>Buchungsdatum: <%= request.getAttribute("bookingDate") %></p>
</body>
</html>
