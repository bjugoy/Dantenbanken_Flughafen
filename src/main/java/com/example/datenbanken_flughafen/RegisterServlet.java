package com.example.datenbanken_flughafen;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String birthdate = request.getParameter("birthdate");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hier erfolgt die Verarbeitung der Registrierung
        // Beispiel: Speichern der Benutzerdaten in der Datenbank
        // Zum Beispiel: Nutzung von JDBC für Datenbankzugriff (Anpassen entsprechend deiner Datenbanklogik)

        // Beispielhaft leiten wir zur Login-Seite weiter
        response.sendRedirect("login.jsp");
    }
}
