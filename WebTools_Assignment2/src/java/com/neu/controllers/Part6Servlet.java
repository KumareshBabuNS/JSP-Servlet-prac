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
public class Part6Servlet extends HttpServlet {

    /*    
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"  <title>Assignment 1 Part 2 Northeastern Petition Form</title>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n" +
"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
"\n" +
"  <style>\n" +
"  td, th {\n" +
"    border: 1px solid #dddddd;\n" +
"    text-align: left;\n" +
"    padding: 8px;\n" +
"}\n" +
"\n" +
"tr:nth-child(even) {\n" +
"    background-color: #dddddd;\n" +
"}\n" +
"  \n" +
"  </style>  \n" +
"</head>\n" +
"<body>\n" +
"\n" +
"<div class=\"container\">\n" +
"	\n" +
"	<div class= \"header\">\n" +
"	<img style=\"float:left;\" src=\"logo.jpg\" alt=\"logo\"/>\n" +
"	\n" +
"	<div class=\"collegeHeader\" style=\"float:left;\">\n" +
"	\n" +
"	<h1 style=\"color:red;\"> Northeastern University </h1>\n" +
"	<h1 style=\"color:gray;\"> <i>Graduate School of Engineering </i></h1>\n" +
"		\n" +
"	</div>\n" +
"	<div class=\"collegeAddress\" style=\"float:left; margin-top: 10px; margin-left: 10px;\">\n" +
"	<h5 style=\"line-height: 50%;\"><b>Graduate School of Engineering</b> </h5>\n" +
"	<h5><b>130 Snell Engineering Center </b></h5>\n" +
"	<h5>Northeastern University</h5>\n" +
"	<h5> 360 Huntington Avenue</h5>\n" +
"	<h5>Boston, MA 02115-5000</h5>\n" +
"	</div>\n" +
"	\n" +
"	<div class=\"collegePhone\" style=\"float:left; margin-top: 10px; margin-left: 10px; text-align:right;\">\n" +
"	\n" +
"	<h5>Phone: 617.373.2711</h5>\n" +
"	<h5> Fax: 617.373.2571</h5>\n" +
"	<h5>Website: www.coe.neu.edu/gse</h5>\n" +
"	</div>\n" +
"	\n" +
"	</div>\n" +
"	\n" +
"	\n" +
"	\n" +
"	<div class=\"myClass\" style=\"clear:both;\">\n" +
"  <h3 style=\"clear:both; text-transform: uppercase; text-align:center;\"><b>Petition Form</b></h3>\n" +
"  <hr>\n" +
"  <h5>\n" +
"  Follow the instructions on the next page. You must provide <strong><u> all</u></strong> required supporting documents before a final decision is made on your petition.\n" +
"  \n" +
"  </h5>\n" +
"  \n" +
"  <form method =\"post\" action='formSubmitPart6'>\n" +
"  \n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label for=\"nuid\">NU ID:</label>\n" +
"      <input type=\"text\" class=\"form-control\" id=\"nuid\" name=\"nuid\" style=\"width:97%;\"  placeholder=\"Enter your NU ID\">\n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label for=\"currentprogram\">Current Program/Concentration:</label>\n" +
"      <input type=\"text\" class=\"form-control\" id=\"currentprogram\" name=\"currentprogram\" placeholder=\"Enter your current program\">\n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"clear:both;\">\n" +
"      <label>Name:</label>\n" +
"	  <p class=\"row-fluid\">\n" +
"	  \n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:32.8%;display: inline-block;\" name=\"lastName\"   placeholder=\"Enter your last/family name\">\n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:32.8%;display: inline-block;\" name=\"firstName\"  placeholder=\"Enter your first name\">\n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:32.8%;display: inline-block;\" name=\"middleName\" placeholder=\"Enter your middle name\">\n" +
"	  </p>\n" +
"    </div>\n" +
"	<div class=\"form-group\" style=\"clear:both;\">\n" +
"      <label>Local Address:</label>\n" +
"	  <p class=\"row-fluid\">\n" +
"	  \n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"street\"   placeholder=\"Enter your street/street #\">\n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"city\"  placeholder=\"Enter your city\">\n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"state\" placeholder=\"Enter your state\">\n" +
"	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"zip\" placeholder=\"Enter your zip code\">\n" +
"	  </p>\n" +
"    </div>\n" +
"	\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label for=\"phone\">Phone No:</label>\n" +
"      <input type=\"number\" class=\"form-control\" id=\"phone\" name=\"phone\" style=\"width:97%;\"  placeholder=\"Enter your phone number\">\n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label for=\"email\">Husky Email ID:</label>\n" +
"      <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Enter your husky email id\">\n" +
"    </div>\n" +
"	\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label>Current Degree Level:</label>\n" +
"     <label><input type=\"checkbox\" id=\"checkboxMS\" value=\"MS\" name=\"MS\"> MS</label>\n" +
"	 <label><input type=\"checkbox\" id=\"checkboxPhd\" value=\"Phd\" name=\"PhD\"> PhD</label>\n" +
"	 <label><input type=\"checkbox\" id=\"checkboxCertificate\" value=\"Certificate\" name=\"Certificate\"> Certificate Only</label>\n" +
"	 <label><input type=\"checkbox\" id=\"checkboxSpecial\" value=\"Special\" name=\"Special\"> Special Student</label>\n" +
"	 <hr>\n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"     <label><input type=\"checkbox\" id=\"checkboxInternational\" value=\"International\" name=\"International\"> International</label>\n" +
"	 <label><input type=\"checkbox\" id=\"checkboxDomestic\" value=\"Domestic\" name=\"Domestic\"> Domestic</label>\n" +
"	<hr>\n" +
"	  \n" +
"    </div>\n" +
"	\n" +
"	\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"  \n" +
"      <label>Check all that apply:</label>\n" +
"       <label><input type=\"checkbox\" id=\"electiveOutside\" value=\"Elective outside core curriculum\" name=\"elective\"> Elective outside core curriculum</label>\n" +
"	 <label><input type=\"checkbox\" id=\"coreCourse\" value=\"Core course waive\" name=\"core\"> Core course waive</label>\n" +
"	 \n" +
"	 \n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"     <label><input type=\"checkbox\" id=\"changeStatus\" value=\"Change in status\" name=\"change\"> Change in status</label>\n" +
"	 <label><input type=\"checkbox\" id=\"courseRepeat\" value=\"Course repeat/official substitution\" name=\"repeat\"> Course repeat/official substitution</label>\n" +
"	 \n" +
"    </div>\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"  \n" +
"     <label><input type=\"checkbox\" id=\"timeExtend\" value=\"Extension of time limit to program completion\" name=\"extend\"> Extension of time limit to program completion</label>\n" +
"	 \n" +
"	 \n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"     \n" +
"	 <label><input type=\"checkbox\" id=\"othersVal\" value=\"Other Type\" name=\"otherbox\"> Other (specify):</label>\n" +
"	 <input type=\"text\" class=\"form-control\" id=\"others\" name=\"others\" style=\"width:97%;\"  placeholder=\"Enter other reason\">\n" +
"	 \n" +
"    </div>\n" +
"	\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:100%;\">\n" +
"  \n" +
"     <label>1. For each course concerned, please provide the information below:</label>\n" +
"	 \n" +
"	 <div>\n" +
"	 <table style=\"width:100%;\">\n" +
"  <tr>\n" +
"    <th>Course Name</th>\n" +
"    <th>Term</th>\n" +
"    <th>CRN #</th>\n" +
"	<th>Course #</th>\n" +
"	<th># Credits</th>\n" +
"	\n" +
"  </tr>\n" +
"  <tr>\n" +
"      <td><input type=\"text\" name=\"coursename\"/></td>\n" +
"    <td><input type=\"text\" name=\"term\"/></td>\n" +
"    <td><input type=\"text\" name=\"crn\"/></td>\n" +
"	<td><input type=\"text\" name=\"courseno\"/></td>\n" +
"    <td><input type=\"text\" name=\"credits\"/></td>\n" +
"  </tr>\n" +
"  <tr>\n" +
" <td><input type=\"text\" name=\"coursename\"/></td>\n" +
"    <td><input type=\"text\" name=\"term\"/></td>\n" +
"    <td><input type=\"text\" name=\"crn\"/></td>\n" +
"	<td><input type=\"text\" name=\"courseno\"/></td>\n" +
"    <td><input type=\"text\" name=\"credits\"/></td>\n" +
"  </tr>\n" +
"  <tr>\n" +
"     <td><input type=\"text\" name=\"coursename\"/></td>\n" +
"    <td><input type=\"text\" name=\"term\"/></td>\n" +
"    <td><input type=\"text\" name=\"crn\"/></td>\n" +
"	<td><input type=\"text\" name=\"courseno\"/></td>\n" +
"    <td><input type=\"text\" name=\"credits\"/></td>\n" +
"  </tr>\n" +
"  <tr>\n" +
"     <td><input type=\"text\" name=\"coursename\"/></td>\n" +
"    <td><input type=\"text\" name=\"term\"/></td>\n" +
"    <td><input type=\"text\" name=\"crn\"/></td>\n" +
"	<td><input type=\"text\" name=\"courseno\"/></td>\n" +
"    <td><input type=\"text\" name=\"credits\"/></td>\n" +
"  </tr>\n" +
"  <tr>\n" +
"     <td><input type=\"text\" name=\"coursename\"/></td>\n" +
"    <td><input type=\"text\" name=\"term\"/></td>\n" +
"    <td><input type=\"text\" name=\"crn\"/></td>\n" +
"	<td><input type=\"text\" name=\"courseno\"/></td>\n" +
"    <td><input type=\"text\" name=\"credits\"/></td>\n" +
"  </tr>\n" +
"  <tr>\n" +
"     <td><input type=\"text\" name=\"coursename\"/></td>\n" +
"    <td><input type=\"text\" name=\"term\"/></td>\n" +
"    <td><input type=\"text\" name=\"crn\"/></td>\n" +
"	<td><input type=\"text\" name=\"courseno\"/></td>\n" +
"    <td><input type=\"text\" name=\"credits\"/></td>\n" +
"  </tr>\n" +
"</table>\n" +
"	 </div>\n" +
"	 \n" +
"	 \n" +
"	 \n" +
"	 <label> 2. What are you petitioning? Please explain (attach separate sheet if necessary):</label> \n" +
"    <textarea class=\"form-control\" id=\"petitionReason\" name=\"petitionReason\" placeholder=\"Enter your petition reason\"></textarea>\n" +
"	\n" +
"	<label> 3. Student signature:</label>\n" +
"	<div style=\"display: flex;\"> <!--sign date div-->\n" +
"	\n" +
"	 <input type=\"text\" class=\"form-control\" id=\"sign1\" name=\"sign1\" style=\"width:49%;\"  placeholder=\"Enter your signature\">\n" +
"	<input type=\"date\" class=\"form-control\" id=\"date1\" name=\"date1\" style=\"width:49%; margin-left:25px;\">\n" +
"	</div> <!--end of sign date div-->\n" +
"		\n" +
"	</div>\n" +
"    \n" +
"	<h4 style=\"clear:both; text-align:left;\"><b>SUBMIT PETITION AND ANY SUPPORTING DOCUMENTS TO YOUR PROGRAM ADVISOR</b></h4>\n" +
"  <hr>\n" +
"  \n" +
"	<div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label><strong><i>Program Advisor</i></strong></label>\n" +
"          </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"      <label>Recommendation:</label>\n" +
"      \n" +
"	   <label><input type=\"checkbox\" id=\"checkboxApproved\" value=\"Approved\" name=\"advisorApproved\"> Approved</label>\n" +
"	 <label><input type=\"checkbox\" id=\"checkboxDenied\" value=\"Denied\" name=\"advisorDenied\"> Denied</label>\n" +
"    </div>\n" +
"\n" +
"	<label> Signature:</label>\n" +
"	<div style=\"display: flex;\"> <!--sign date div-->\n" +
"	\n" +
"	 <input type=\"text\" class=\"form-control\" id=\"sign2\" name=\"sign2\" style=\"width:49%;\"  placeholder=\"Advisor's signature\">\n" +
"	<input type=\"text\" class=\"form-control\" id=\"advisorName\" name=\"advisorName\" style=\"width:49%; margin-left:25px;\" placeholder=\"Advisor's Name\">\n" +
"	</div> <!--end of sign date div-->\n" +
"	\n" +
"	<label> Advisor’s comments and/or instructions:</label>\n" +
"	<div style=\"display: flex;\"> <!--comments div-->\n" +
"	\n" +
"	 <input type=\"text\" class=\"form-control\" id=\"comments\" name=\"comments\" style=\"width:49%;\"  placeholder=\"Comments\">\n" +
"	<input type=\"date\" class=\"form-control\" id=\"date2\" name=\"date2\" style=\"width:49%; margin-left:25px;\">\n" +
"	</div> <!--end of comments div-->\n" +
"	\n" +
"	<label> ECE Graduate Committee Chair (ECE students only):</label>\n" +
"	<div style=\"display: flex;\"> <!--comments div-->\n" +
"	\n" +
"	 <input type=\"text\" class=\"form-control\" id=\"eceComm\" name=\"eceComm\" style=\"width:49%;\"  placeholder=\"ECE Committee Chair\">\n" +
"	<input type=\"date\" class=\"form-control\" id=\"date3\" name=\"date3\" style=\"width:49%; margin-left:25px;\">\n" +
"	</div> <!--end of comments div-->\n" +
"	\n" +
"	\n" +
"	<hr>\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"  \n" +
"  \n" +
"    \n" +
"      <label><strong><i>Graduate School</i></strong></label>\n" +
"       <label><input type=\"checkbox\" id=\"approved\" value=\"Approved\" name=\"gradApproved\">Approved</label>\n" +
"	 <label><input type=\"checkbox\" id=\"denied\" value=\"Denied\" name=\"gradDenied\"> Denied</label>\n" +
"	 \n" +
"	 \n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"     <label><input type=\"checkbox\" id=\"noAction\" value=\"No Action\" name=\"gradNoAction\"> No Action</label>\n" +
"	 <label><input type=\"checkbox\" id=\"returned\" value=\"Returned for additional information\" name=\"gradReturned\">Returned for additional information</label>\n" +
"	 <label><input type=\"checkbox\" id=\"ascReportFiled\" value=\"ASC Report filed\" name=\"gradASC\">ASC Report filed</label>\n" +
"	 \n" +
"    </div>\n" +
"	\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:100%;\">\n" +
"  \n" +
"  \n" +
"    \n" +
"      <label for=\"commentsToStud\">Comments to student:</label>\n" +
"     \n" +
"	 <input type=\"text\" class=\"form-control\" id=\"commentsToStud\" name=\"commentsToStud\" style=\"width:100%;\"  placeholder=\"Comments to student\">\n" +
"	 \n" +
"    </div>\n" +
"  \n" +
"  <div class=\"form-group\" style=\"float:left; width:50%;\">\n" +
"  \n" +
"  \n" +
"    \n" +
"      <label for=\"gradSchoolAuthorization\">Graduate school authorization</label>\n" +
"		<input type=\"text\" class=\"form-control\" id=\"gradSchoolAuthorization\" name=\"gradSchoolAuthorization\" style=\"width:100%;\"  placeholder=\"Graduate school authorization\">	 \n" +
"	 \n" +
"    </div>\n" +
"    <div class=\"form-group\" style=\"float:left; width:25%;\">\n" +
"	\n" +
"	<label>Date</label>\n" +
"	<input type=\"date\" class=\"form-control\" id=\"date4\" name=\"date4\" style=\"margin-left:5px;\">    \n" +
"\n" +
"	</div>\n" +
"	\n" +
"	<div class=\"form-group\" style=\"float:left; width:24%;\">\n" +
"\n" +
"	\n" +
"	<label for=\"effectiveTerm\">Effective Term</label>\n" +
"	<input type=\"text\" class=\"form-control\" id=\"effectiveTerm\" name=\"effectiveTerm\" style=\"margin-left:10px;\" placeholder=\"Effective Term\">\n" +
"    \n" +
"	</div>\n" +
"	\n" +
"   \n" +
"    <button type=\"submit\" class=\"btn btn-default\" style=\"width:100%;\">Submit</button>\n" +
"  </form>\n" +
"  \n" +
"  </div>\n" +
"  \n" +
"</div>\n" +
"\n" +
"</body>\n" +
"</html>\n");
        } finally {
            out.close();
        }
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
     
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Part6Servlet</title>");
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
