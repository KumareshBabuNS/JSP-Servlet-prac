/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author richa
 */
public class Part4DisplayRequestHeaderServlet extends HttpServlet {

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
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String pageTitle = "Display Request Headers";
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>"+ pageTitle +"</title>");    
            
            out.println("<style>\n" +
"table {\n" +
"    font-family: arial, sans-serif;\n" +
"    border-collapse: collapse;\n" +
"    width: 100%;\n" +
"}\n" +
"\n" +
"td, th {\n" +
"    border: 1px solid #dddddd;\n" +
"    text-align: left;\n" +
"    padding: 8px;\n" +
"}\n" +
"\n" +
"tr:nth-child(even) {\n" +
"    background-color: #dddddd;\n" +
"}\n" +
"</style>");
            
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Homework 2, Part4 Programming Assignment </h1>");
            out.println("<h3> Request Method is: "+request.getMethod()+"</h3>");
            out.println("<h3> Request URI is: "+request.getRequestURI()+"</h3>");
            out.println("<h3> Request Protocol is: "+request.getProtocol()+"</h3>");
            
            out.println("<h3> Using Enumeration getHeaderNames()</h3>");
            Enumeration headerNames= request.getHeaderNames();
            
            out.println("<table> <tr> <th> Header Name </th> <th> Header Value </th> </tr>");
            
            while(headerNames.hasMoreElements())
            {
                String headerName = (String)headerNames.nextElement();
            out.println("<tr> <td>"+headerName+" </td>" + "<td>" + request.getHeader(headerName) +"</td> </tr>");
            
            }
            out.println("</table>");
            
            out.println("<h3> Using Enumeration getHeaders(String name)</h3>");
            
               Enumeration hdNm = request.getHeaderNames();
    while (hdNm.hasMoreElements()) {
      String name = (String) hdNm.nextElement();
      Enumeration hdValues = request.getHeaders(name); 
      
      out.println("<table> <tr> <th> Header Name </th> <th> Header Value </th> </tr>");
            
      
      if (hdValues != null) {
        while (hdValues.hasMoreElements()) {
          String value = (String) hdValues.nextElement();
          
          out.println("<tr> <td>"+name+" </td>" + "<td>" + value +"</td> </tr>");
            
        }
      }
    }
            
            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
