/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelts;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GENIUS
 */
public class UsersServlet extends HttpServlet {

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
       
             /**
         * Firstly, i want to get the username and password, 
         * The if its correct, we would do some things...
         */
        String userEmail = request.getParameter("userEmail");
        String userPassword = request.getParameter("userPassword");
        
        /**
         * Checking...
         */
        if(userEmail.equals("user".toLowerCase()) && userPassword.equals("1234")){
            /**
             * If the user's input matches with the one here, the we do this..
             * 
             * 1. Dispatching the user to a welcome page....
             */
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/welcomeUser.html");
            dispatcher.forward(request, response);
        }
        else if (userEmail.equals("admin".toLowerCase()) && userPassword.equals("1234")) {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/welcomeAdmin.html");
            dispatcher.forward(request, response); 
        }
        
        else{
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/ErrorServlet");
            requestDispatcher.forward(request, response);
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
