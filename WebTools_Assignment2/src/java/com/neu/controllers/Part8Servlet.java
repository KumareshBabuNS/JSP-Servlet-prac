/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.controllers;

import com.neu.utility.StringValidations;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author richa
 */
public class Part8Servlet extends HttpServlet {

    
    
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
            out.println("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "<head>\n"
                    + "  <title>Assignment 1 Part 2 Northeastern Petition Form</title>\n"
                    + "  <meta charset=\"utf-8\">\n"
                    + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                    + "  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                    + "  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n"
                    + "  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n"
                    + "\n"
                    + "  <style>\n"
                    + "  td, th {\n"
                    + "    border: 1px solid #dddddd;\n"
                    + "    text-align: left;\n"
                    + "    padding: 8px;\n"
                    + "}\n"
                    + "\n"
                    + "tr:nth-child(even) {\n"
                    + "    background-color: #dddddd;\n"
                    + "}\n"
                    + "  \n"
                    + "  </style>  \n"
                    + "</head>\n"
                    + "<body>\n"
                    + "\n"
                    + "<div class=\"container\">\n"
                    + "	\n"
                    + "	<div class= \"header\">\n"
                    + "	<img style=\"float:left;\" src=\"logo.jpg\" alt=\"logo\"/>\n"
                    + "	\n"
                    + "	<div class=\"collegeHeader\" style=\"float:left;\">\n"
                    + "	\n"
                    + "	<h1 style=\"color:red;\"> Northeastern University </h1>\n"
                    + "	<h1 style=\"color:gray;\"> <i>Graduate School of Engineering </i></h1>\n"
                    + "		\n"
                    + "	</div>\n"
                    + "	<div class=\"collegeAddress\" style=\"float:left; margin-top: 10px; margin-left: 10px;\">\n"
                    + "	<h5 style=\"line-height: 50%;\"><b>Graduate School of Engineering</b> </h5>\n"
                    + "	<h5><b>130 Snell Engineering Center </b></h5>\n"
                    + "	<h5>Northeastern University</h5>\n"
                    + "	<h5> 360 Huntington Avenue</h5>\n"
                    + "	<h5>Boston, MA 02115-5000</h5>\n"
                    + "	</div>\n"
                    + "	\n"
                    + "	<div class=\"collegePhone\" style=\"float:left; margin-top: 10px; margin-left: 10px; text-align:right;\">\n"
                    + "	\n"
                    + "	<h5>Phone: 617.373.2711</h5>\n"
                    + "	<h5> Fax: 617.373.2571</h5>\n"
                    + "	<h5>Website: www.coe.neu.edu/gse</h5>\n"
                    + "	</div>\n"
                    + "	\n"
                    + "	</div>\n"
                    + "	\n"
                    + "	\n"
                    + "	\n"
                    + "	<div class=\"myClass\" style=\"clear:both;\">\n"
                    + "  <h3 style=\"clear:both; text-transform: uppercase; text-align:center;\"><b>Petition Form</b></h3>\n"
                    + "  <hr>\n"
                    + "  <h5>\n"
                    + "  Follow the instructions on the next page. You must provide <strong><u> all</u></strong> required supporting documents before a final decision is made on your petition.\n"
                    + "  \n"
                    + "  </h5>\n"
                    + "  \n"
                    + "  <form method =\"post\" action='formSubmitPart8'>\n"
                    + "  \n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label for=\"nuid\">NU ID:</label>\n"
                    + "      <input type=\"text\" class=\"form-control\" id=\"nuid\" name=\"NUID\" style=\"width:97%;\"  placeholder=\"Enter your NU ID\">\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label for=\"currentprogram\">Current Program/Concentration:</label>\n"
                    + "      <input type=\"text\" class=\"form-control\" id=\"currentprogram\" name=\"Current Program\" placeholder=\"Enter your current program\">\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"clear:both;\">\n"
                    + "      <label>Name:</label>\n"
                    + "	  <p class=\"row-fluid\">\n"
                    + "	  \n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:32.8%;display: inline-block;\" name=\"Last Name\"   placeholder=\"Enter your last/family name\">\n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:32.8%;display: inline-block;\" name=\"First Name\"  placeholder=\"Enter your first name\">\n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:32.8%;display: inline-block;\" name=\"Middle Name\" placeholder=\"Enter your middle name\">\n"
                    + "	  </p>\n"
                    + "    </div>\n"
                    + "	<div class=\"form-group\" style=\"clear:both;\">\n"
                    + "      <label>Local Address:</label>\n"
                    + "	  <p class=\"row-fluid\">\n"
                    + "	  \n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"Street\"   placeholder=\"Enter your street/street #\">\n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"City\"  placeholder=\"Enter your city\">\n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"State\" placeholder=\"Enter your state\">\n"
                    + "	  <input type=\"text\" class=\"form-control\" style=\"width:24.5%; display: inline-block;\" name=\"Zip\" placeholder=\"Enter your zip code\">\n"
                    + "	  </p>\n"
                    + "    </div>\n"
                    + "	\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label for=\"phone\">Phone No:</label>\n"
                    + "      <input type=\"number\" class=\"form-control\" id=\"phone\" name=\"Phone\" style=\"width:97%;\"  placeholder=\"Enter your phone number\">\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label for=\"email\">Husky Email ID:</label>\n"
                    + "      <input type=\"email\" class=\"form-control\" id=\"email\" name=\"Email\" placeholder=\"Enter your husky email id\">\n"
                    + "    </div>\n"
                    + "	\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label>Current Degree Level:</label>\n"
                    + "     <label><input type=\"checkbox\" id=\"checkboxMS\" value=\"MS\" name=\"MS\"> MS</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"checkboxPhd\" value=\"Phd\" name=\"PhD\"> PhD</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"checkboxCertificate\" value=\"Certificate\" name=\"Certificate\"> Certificate Only</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"checkboxSpecial\" value=\"Special\" name=\"Special\"> Special Student</label>\n"
                    + "	 <hr>\n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "     <label><input type=\"checkbox\" id=\"checkboxInternational\" value=\"International\" name=\"International\"> International</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"checkboxDomestic\" value=\"Domestic\" name=\"Domestic\"> Domestic</label>\n"
                    + "	<hr>\n"
                    + "	  \n"
                    + "    </div>\n"
                    + "	\n"
                    + "	\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "  \n"
                    + "      <label>Check all that apply:</label>\n"
                    + "       <label><input type=\"checkbox\" id=\"electiveOutside\" value=\"Elective outside core curriculum\" name=\"Elective\"> Elective outside core curriculum</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"coreCourse\" value=\"Core course waive\" name=\"Core\"> Core course waive</label>\n"
                    + "	 \n"
                    + "	 \n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "     <label><input type=\"checkbox\" id=\"changeStatus\" value=\"Change in status\" name=\"Change\"> Change in status</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"courseRepeat\" value=\"Course repeat/official substitution\" name=\"Repeat\"> Course repeat/official substitution</label>\n"
                    + "	 \n"
                    + "    </div>\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "  \n"
                    + "     <label><input type=\"checkbox\" id=\"timeExtend\" value=\"Extension of time limit to program completion\" name=\"Extend\"> Extension of time limit to program completion</label>\n"
                    + "	 \n"
                    + "	 \n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "     \n"
                    + "	 <label><input type=\"checkbox\" id=\"othersVal\" value=\"Other Type\" name=\"Otherbox\"> Other (specify):</label>\n"
                    + "	 <input type=\"text\" class=\"form-control\" id=\"others\" name=\"others\" style=\"width:97%;\"  placeholder=\"Enter other reason\">\n"
                    + "	 \n"
                    + "    </div>\n"
                    + "	\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:100%;\">\n"
                    + "  \n"
                    + "     <label>1. For each course concerned, please provide the information below:</label>\n"
                    + "	 \n"
                    + "	 <div>\n"
                    + "	 <table style=\"width:100%;\">\n"
                    + "  <tr>\n"
                    + "    <th>Course Name</th>\n"
                    + "    <th>Term</th>\n"
                    + "    <th>CRN #</th>\n"
                    + "	<th>Course #</th>\n"
                    + "	<th># Credits</th>\n"
                    + "	\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "      <td><input type=\"text\" name=\"Coursename\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Term\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Crn\"/></td>\n"
                    + "	<td><input type=\"text\" name=\"Courseno\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Credits\"/></td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + " <td><input type=\"text\" name=\"Coursename\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Term\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Crn\"/></td>\n"
                    + "	<td><input type=\"text\" name=\"Courseno\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Credits\"/></td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "     <td><input type=\"text\" name=\"Coursename\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Term\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Crn\"/></td>\n"
                    + "	<td><input type=\"text\" name=\"Courseno\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Credits\"/></td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "     <td><input type=\"text\" name=\"Coursename\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Term\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Crn\"/></td>\n"
                    + "	<td><input type=\"text\" name=\"Courseno\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Credits\"/></td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "     <td><input type=\"text\" name=\"Coursename\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Term\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Crn\"/></td>\n"
                    + "	<td><input type=\"text\" name=\"Courseno\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Credits\"/></td>\n"
                    + "  </tr>\n"
                    + "  <tr>\n"
                    + "     <td><input type=\"text\" name=\"Coursename\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Term\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Crn\"/></td>\n"
                    + "	<td><input type=\"text\" name=\"Courseno\"/></td>\n"
                    + "    <td><input type=\"text\" name=\"Credits\"/></td>\n"
                    + "  </tr>\n"
                    + "</table>\n"
                    + "	 </div>\n"
                    + "	 \n"
                    + "	 \n"
                    + "	 \n"
                    + "	 <label> 2. What are you petitioning? Please explain (attach separate sheet if necessary):</label> \n"
                    + "    <textarea class=\"form-control\" id=\"petitionReason\" name=\"Petition Reason\" placeholder=\"Enter your petition reason\"></textarea>\n"
                    + "	\n"
                    + "	<label> 3. Student signature:</label>\n"
                    + "	<div style=\"display: flex;\"> <!--sign date div-->\n"
                    + "	\n"
                    + "	 <input type=\"text\" class=\"form-control\" id=\"sign1\" name=\"Student Sign\" style=\"width:49%;\"  placeholder=\"Enter your signature\">\n"
                    + "	<input type=\"date\" class=\"form-control\" id=\"date1\" name=\"Student Sign Date\" style=\"width:49%; margin-left:25px;\">\n"
                    + "	</div> <!--end of sign date div-->\n"
                    + "		\n"
                    + "	</div>\n"
                    + "    \n"
                    + "	<h4 style=\"clear:both; text-align:left;\"><b>SUBMIT PETITION AND ANY SUPPORTING DOCUMENTS TO YOUR PROGRAM ADVISOR</b></h4>\n"
                    + "  <hr>\n"
                    + "  \n"
                    + "	<div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label><strong><i>Program Advisor</i></strong></label>\n"
                    + "          </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "      <label>Recommendation:</label>\n"
                    + "      \n"
                    + "	   <label><input type=\"checkbox\" id=\"checkboxApproved\" value=\"Approved\" name=\"Advisor Approved\"> Approved</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"checkboxDenied\" value=\"Denied\" name=\"Advisor Denied\"> Denied</label>\n"
                    + "    </div>\n"
                    + "\n"
                    + "	<label> Signature:</label>\n"
                    + "	<div style=\"display: flex;\"> <!--sign date div-->\n"
                    + "	\n"
                    + "	 <input type=\"text\" class=\"form-control\" id=\"sign2\" name=\"Advisor Sign\" style=\"width:49%;\"  placeholder=\"Advisor's signature\">\n"
                    + "	<input type=\"text\" class=\"form-control\" id=\"advisorName\" name=\"Advisor Name\" style=\"width:49%; margin-left:25px;\" placeholder=\"Advisor's Name\">\n"
                    + "	</div> <!--end of sign date div-->\n"
                    + "	\n"
                    + "	<label> Advisor’s comments and/or instructions:</label>\n"
                    + "	<div style=\"display: flex;\"> <!--comments div-->\n"
                    + "	\n"
                    + "	 <input type=\"text\" class=\"form-control\" id=\"comments\" name=\"Advisor Comments\" style=\"width:49%;\"  placeholder=\"Comments\">\n"
                    + "	<input type=\"date\" class=\"form-control\" id=\"date2\" name=\"Advisor Comment Date\" style=\"width:49%; margin-left:25px;\">\n"
                    + "	</div> <!--end of comments div-->\n"
                    + "	\n"
                    + "	<label> ECE Graduate Committee Chair (ECE students only):</label>\n"
                    + "	<div style=\"display: flex;\"> <!--comments div-->\n"
                    + "	\n"
                    + "	 <input type=\"text\" class=\"form-control\" id=\"eceComm\" name=\"ECE Committee\" style=\"width:49%;\"  placeholder=\"ECE Committee Chair\">\n"
                    + "	<input type=\"date\" class=\"form-control\" id=\"date3\" name=\"ECE Committee Date\" style=\"width:49%; margin-left:25px;\">\n"
                    + "	</div> <!--end of comments div-->\n"
                    + "	\n"
                    + "	\n"
                    + "	<hr>\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "  \n"
                    + "  \n"
                    + "    \n"
                    + "      <label><strong><i>Graduate School</i></strong></label>\n"
                    + "       <label><input type=\"checkbox\" id=\"approved\" value=\"Approved\" name=\"Graduate School Approved\">Approved</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"denied\" value=\"Denied\" name=\"Graduate School Denied\"> Denied</label>\n"
                    + "	 \n"
                    + "	 \n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "     <label><input type=\"checkbox\" id=\"noAction\" value=\"No Action\" name=\"Graduate School NoAction\"> No Action</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"returned\" value=\"Returned for additional information\" name=\"Graduate School Returned\">Returned for additional information</label>\n"
                    + "	 <label><input type=\"checkbox\" id=\"ascReportFiled\" value=\"ASC Report filed\" name=\"Graduate School ASC\">ASC Report filed</label>\n"
                    + "	 \n"
                    + "    </div>\n"
                    + "	\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:100%;\">\n"
                    + "  \n"
                    + "  \n"
                    + "    \n"
                    + "      <label for=\"commentsToStud\">Comments to student:</label>\n"
                    + "     \n"
                    + "	 <input type=\"text\" class=\"form-control\" id=\"commentsToStud\" name=\"Comments To Student\" style=\"width:100%;\"  placeholder=\"Comments to student\">\n"
                    + "	 \n"
                    + "    </div>\n"
                    + "  \n"
                    + "  <div class=\"form-group\" style=\"float:left; width:50%;\">\n"
                    + "  \n"
                    + "  \n"
                    + "    \n"
                    + "      <label for=\"gradSchoolAuthorization\">Graduate school authorization</label>\n"
                    + "		<input type=\"text\" class=\"form-control\" id=\"gradSchoolAuthorization\" name=\"Graduate School Authorization\" style=\"width:100%;\"  placeholder=\"Graduate school authorization\">	 \n"
                    + "	 \n"
                    + "    </div>\n"
                    + "    <div class=\"form-group\" style=\"float:left; width:25%;\">\n"
                    + "	\n"
                    + "	<label>Date</label>\n"
                    + "	<input type=\"date\" class=\"form-control\" id=\"date4\" name=\"Graduate School Sign\" style=\"margin-left:5px;\">    \n"
                    + "\n"
                    + "	</div>\n"
                    + "	\n"
                    + "	<div class=\"form-group\" style=\"float:left; width:24%;\">\n"
                    + "\n"
                    + "	\n"
                    + "	<label for=\"effectiveTerm\">Effective Term</label>\n"
                    + "	<input type=\"text\" class=\"form-control\" id=\"effectiveTerm\" name=\"Effective Term\" style=\"margin-left:10px;\" placeholder=\"Effective Term\">\n"
                    + "    \n"
                    + "	</div>\n"
                    + "	\n"
                    + "   \n"
                    + "    <button type=\"submit\" class=\"btn btn-default\" style=\"width:100%;\">Submit</button>\n"
                    + "  </form>\n"
                    + "  \n"
                    + "  </div>\n"
                    + "  \n"
                    + "</div>\n"
                    + "\n"
                    + "</body>\n"
                    + "</html>\n");
        } 
        catch(Exception e)
        {
            System.out.println("Exception occured in doGet() with message: "+ e.getMessage());
        }
        finally {
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

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Part8Servlet</title>");
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
            out.println("<h1>Homework 2, Part8 Programming Assignment </h1>");
            out.println("<table border=\"1\" cellpadding = \"5\""
                    + " cellspacing = \"5\">");
            out.println("<tr> <th>Form Header</th>"
                    + "<th>Form Value</th></tr>");

            
            Enumeration paramNames = request.getParameterNames();
            
            
            while(paramNames.hasMoreElements()) 
		{
			String formData = (String)paramNames.nextElement();
			out.print("<tr><td>" + StringValidations.sanitizeInput(formData) + "\n</td><td>");
			String[] dataValues = request.getParameterValues(formData);
			if (dataValues.length == 1) 
			{
				String dataValue = dataValues[0];
				if (dataValue.length() == 0)
					out.println("No Value");
				else
					out.println(StringValidations.sanitizeInput(dataValue));
			} 
			else 
			{
				out.println("<ul>");
				for(int i=0; i<dataValues.length; i++) 
				{
					out.println("<li>" + StringValidations.sanitizeInput(dataValues[i]) + "</li>");
				}
				out.println("</ul>");
			}
                        out.print("</td></tr>");
		}
            
            
            out.println("</table></body></html>");

        } catch (Exception e) {
            System.out.println("Exception occured in doPost() with message:" + e.getMessage());
            e.printStackTrace();
        } finally {
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
