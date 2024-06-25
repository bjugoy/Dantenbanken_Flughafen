package com.example.datenbanken_flughafen;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hier erfolgt die Überprüfung der Eingaben und Authentifizierung
        // Beispiel: Einfache Überprüfung (Anpassen entsprechend deiner Logik)
        if (isValidUser(email, password)) {
            // Benutzer erfolgreich authentifiziert
            // Session starten und Benutzerdaten speichern
            request.getSession().setAttribute("email", email);
            // Weiterleitung zur Datenbankabfrage-Seite
            response.sendRedirect("databaseQuery.jsp");
        } else {
            // Authentifizierung fehlgeschlagen, zurück zum Login
            response.sendRedirect("booking.jsp");
        }
    }

    private boolean isValidUser(String email, String password) {
        // Implementiere hier deine Logik zur Überprüfung der Benutzerdaten
        // Zum Beispiel: Datenbankabfrage oder Service-Aufruf
        // Hier nur ein Dummy-Beispiel:
        return email.equals("user@example.com") && password.equals("password");
    }
}
