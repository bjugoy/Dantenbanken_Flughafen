package com.example.datenbanken_flughafen;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String terminalNumber = request.getParameter("terminalNumber");
        String aircraftType = request.getParameter("aircraftType");
        String bookingDate = request.getParameter("bookingDate");

        // Hier erfolgt die Verarbeitung der Buchung/Reservierung
        // Beispiel: Speichern der Buchungsinformationen in der Datenbank

        // Beispielhaft leiten wir zur Bestätigungsseite weiter
        response.sendRedirect("confirmation.jsp");
    }
}
