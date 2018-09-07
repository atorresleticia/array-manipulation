/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.torres.arraymanipulation.servlet;

import com.torres.arraymanipulation.core.ArrayManipulationCore;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leticia Torres
 */
public class ArrayManipulationServlet extends HttpServlet {

    int MIN = 10;
    int MAX = 1000;
    int MOD = 10;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Map<String, String> errors = new HashMap<>();
        int userInput = Integer.parseInt(request.getParameter("value"));

        if (!ArrayManipulationCore.isMultiple(userInput, MOD)) {
            errors.put("notMultiple", "O número deve ser múltiplo de " + MOD);
        }
        if (ArrayManipulationCore.notInRange(userInput, MIN, MAX)) {
            errors.put("notInRange", "O número deve estar entre " + MIN + " e " + MAX);
        }

        if (errors.isEmpty()) {

            request.setAttribute("userValue", userInput);

            int[] generatedArray = ArrayManipulationCore.arrayGeneration(userInput);

            request.setAttribute("array", generatedArray);

            String evenOdd = request.getParameter("evenOdd");

            if ("even".equals(evenOdd)) {
                request.setAttribute("sum", ArrayManipulationCore.sum(generatedArray, 'e'));
                request.setAttribute("option", "pares");
            } else if ("odd".equals(evenOdd)) {
                request.setAttribute("sum", ArrayManipulationCore.sum(generatedArray, 'o'));
                request.setAttribute("option", "impares");
            }

            request.getRequestDispatcher("app.jsp").forward(request, response);
        } else {

            request.setAttribute("errors", errors);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
