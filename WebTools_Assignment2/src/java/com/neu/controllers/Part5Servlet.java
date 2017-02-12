/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controllers;

import com.neu.utility.StringValidations;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author richa
 */
public class Part5Servlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Part5Servlet</title>");
            out.println("<style>\n"
                    + "table {\n"
                    + "    font-family: arial, sans-serif;\n"
                    + "    border-collapse: collapse;\n"
                    + "    width: 100%;\n"
                    + "}\n"
                    + "\n"
                    + "td, th {\n"
                    + "    border: 1px solid #dddddd;\n"
                    + "    text-align: left;\n"
                    + "    padding: 8px;\n"
                    + "}\n"
                    + "\n"
                    + "tr:nth-child(even) {\n"
                    + "    background-color: #dddddd;\n"
                    + "}\n"
                    + "</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Homework 2, Part5 Programming Assignment </h1>");

            out.println("<table> <tr> <th> Name of field </th> <th> Entered Value </th> </tr>");
            out.println("<tr> <td> NU ID: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("nuid")) + "</td> </tr>");
            out.println("<tr> <td> Current Program/Concentration: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("currentprogram")) + "</td> </tr>");

            out.println("<tr> <td> Last Name: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("lastName")) + "</td> </tr>");
            out.println("<tr> <td> First Name: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("firstName")) + "</td> </tr>");
            out.println("<tr> <td> Middle Name: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("middleName")) + "</td> </tr>");

            out.println("<tr> <td> Street Address: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("street")) + "</td> </tr>");
            out.println("<tr> <td> City: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("city")) + "</td> </tr>");
            out.println("<tr> <td> State: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("state")) + "</td> </tr>");
            out.println("<tr> <td> Zip: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("zip")) + "</td> </tr>");

            out.println("<tr> <td> Phone: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("phone")) + "</td> </tr>");
            out.println("<tr> <td> Husky Email Address: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("email")) + "</td> </tr>");

            out.println("<tr> <td> Current Degree: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("MS")) + " " + StringValidations.sanitizeInput(request.getParameter("PhD"))+ " " + StringValidations.sanitizeInput(request.getParameter("Certificate"))+ " " + StringValidations.sanitizeInput(request.getParameter("Special")) + "</td> </tr>");

            out.println("<tr> <td> International/Domestic: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("International"))+ " "+StringValidations.sanitizeInput(request.getParameter("Domestic"))+ "</td> </tr>");
            
            out.println("<tr> <td> Type of Request: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("elective")) +" " +StringValidations.sanitizeInput(request.getParameter("core")) +" " +StringValidations.sanitizeInput(request.getParameter("change"))+" " +StringValidations.sanitizeInput(request.getParameter("repeat"))+" " +StringValidations.sanitizeInput(request.getParameter("extend"))+"</td> </tr>");
            
            if(request.getParameter("otherbox")!= null)
            
            {
                out.println("<tr> <td> Other reason: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("others")) + "</td> </tr>");
            }
            
            String[] coursename = request.getParameterValues("coursename");
            String[] term = request.getParameterValues("term");
            String[] crn = request.getParameterValues("crn");
            String[] courseno = request.getParameterValues("courseno");
            String[] credits = request.getParameterValues("credits");
            
            
            for(int i=0;i<coursename.length;i++)
            {
                if(coursename[i]!="")
                out.println("<tr> <td> Course Name: </td>" + "<td>" + StringValidations.sanitizeInput(coursename[i]) + "</td> </tr>");
            }
            for(int i=0;i<term.length;i++)
            {
                if(term[i]!="")
                out.println("<tr> <td> Term: </td>" + "<td>" + StringValidations.sanitizeInput(term[i]) + "</td> </tr>");
            }
            for(int i=0;i<crn.length;i++)
            {
                if(crn[i]!="")
                out.println("<tr> <td> CRN: </td>" + "<td>" + StringValidations.sanitizeInput(crn[i]) + "</td> </tr>");
            }
            for(int i=0;i<courseno.length;i++)
            {
                if(courseno[i]!="")
                out.println("<tr> <td> Course No: </td>" + "<td>" + StringValidations.sanitizeInput(courseno[i]) + "</td> </tr>");
            }
            for(int i=0;i<credits.length;i++)
            {
                if(credits[i]!="")
             out.println("<tr> <td> Credits: </td>" + "<td>" + StringValidations.sanitizeInput(credits[i]) + "</td> </tr>");
            }
            out.println("<tr> <td> Petition Reason: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("petitionReason")) + "</td> </tr>");
            
            
            out.println("<tr> <td> Student Signature: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("sign1")) + "</td> </tr>");
            out.println("<tr> <td> Student Signature Date: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("date1")) + "</td> </tr>");
            
            
            out.println("<tr> <td> Advisor Decision: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("advisorApproved"))+ " "+StringValidations.sanitizeInput(request.getParameter("advisorDenied")) + "</td> </tr>");
            
            
           
            out.println("<tr> <td> Advisor Signature: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("sign2"))+ "</td> </tr>");
            out.println("<tr> <td> Advisor Name: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("advisorName")) + "</td> </tr>");
            out.println("<tr> <td> Advisor Comments: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("comments")) + "</td> </tr>");
            out.println("<tr> <td> Advisor Decision Date: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("date2"))+ "</td> </tr>");
            out.println("<tr> <td> ECE Committe Chair Signature: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("eceComm")) + "</td> </tr>");
            out.println("<tr> <td> ECE Committe Chair Signature Date: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("date3")) + "</td> </tr>");
            
            out.println("<tr> <td> Graduate School Decision: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("gradApproved"))+ " "+StringValidations.sanitizeInput(request.getParameter("gradDenied"))+ " "+StringValidations.sanitizeInput(request.getParameter("gradNoAction"))+ " "+StringValidations.sanitizeInput(request.getParameter("gradReturned"))+ " "+StringValidations.sanitizeInput(request.getParameter("gradASC")) + "</td> </tr>");
            
            out.println("<tr> <td> Graduate School Comments: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("commentsToStud")) + "</td> </tr>");
            
            out.println("<tr> <td> Graduate School Authorization: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("gradSchoolAuthorization")) + "</td> </tr>");
            out.println("<tr> <td> Graduate School Decision Date: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("date4"))+ "</td> </tr>");
            out.println("<tr> <td> Effective Term: </td>" + "<td>" + StringValidations.sanitizeInput(request.getParameter("effectiveTerm")) + "</td> </tr>");
            
            
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception e)
        {
            System.out.println("Exception occured in processRequest() with message:" + e.getMessage());
        }
        finally {
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
