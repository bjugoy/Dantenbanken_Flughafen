package com.example.datenbanken_flughafen;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DatabaseQueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hier erfolgt die Verarbeitung der Datenbankabfrage
        // Beispiel: Auslesen von Daten aus der Datenbank

        // Beispielhaft leiten wir zur Ergebnisseite weiter
        response.sendRedirect("queryResult.jsp");
    }
}
