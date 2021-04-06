/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelts;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GENIUS
 */
public class ErrorServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "\n"
                    + "<head>\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>User</title>\n"
                    + "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n"
                    + "</head>\n"
                    + "\n"
                    + "<body>\n"
                    + "\n"
                    + "\n"
                    + "    <div class=\"hero container text-center mb-5\">\n"
                    + "        <div class=\"row\">\n"
                    + "            <div class=\"col-lg-6 m-auto\">\n"
                    + "                <div class=\"card mt-5\">\n"
                    + "                    <div class=\"card-titlt\">\n"
                    + "                        <h2 class=\"text-center py-2 text-danger\"> Invalid details</h2>\n"
                    + "                        <hr>\n"
                    + "                    </div>\n"
                    + "                    <div class=\"card-body\">\n"
                    + "                        <form action=\"index.html\" method=\"get\">\n"
                    + "                            <input class=\"btn btn-danger\" type=\"submit\" value=\"Try Again\">\n"
                    + "                        </form>\n"
                    + "                    </div>\n"
                    + "\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "\n"
                    + "        </div>\n"
                    + "    </div>\n"
                    + "\n"
                    + "    <script src=\"js/bootstrap.min.js\"></script>\n"
                    + "</body>\n"
                    + "\n"
                    + "</html>");
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
