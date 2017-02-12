<!DOCTYPE html>
<html lang="en">
<head>
  <title>Assignment 1 Part 2 Northeastern Petition Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <style>
  td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
  
  </style>  
</head>
<body>

<div class="container">
	
	<div class= "header">
	<img style="float:left;" src="logo.jpg" alt="logo"/>
	
	<div class="collegeHeader" style="float:left;">
	
	<h1 style="color:red;"> Northeastern University </h1>
	<h1 style="color:gray;"> <i>Graduate School of Engineering </i></h1>
		
	</div>
	<div class="collegeAddress" style="float:left; margin-top: 10px; margin-left: 10px;">
	<h5 style="line-height: 50%;"><b>Graduate School of Engineering</b> </h5>
	<h5><b>130 Snell Engineering Center </b></h5>
	<h5>Northeastern University</h5>
	<h5> 360 Huntington Avenue</h5>
	<h5>Boston, MA 02115-5000</h5>
	</div>
	
	<div class="collegePhone" style="float:left; margin-top: 10px; margin-left: 10px; text-align:right;">
	
	<h5>Phone: 617.373.2711</h5>
	<h5> Fax: 617.373.2571</h5>
	<h5>Website: www.coe.neu.edu/gse</h5>
	</div>
	
	</div>
	
	
	
	<div class="myClass" style="clear:both;">
  <h3 style="clear:both; text-transform: uppercase; text-align:center;"><b>Petition Form</b></h3>
  <hr>
  <h5>
  Follow the instructions on the next page. You must provide <strong><u> all</u></strong> required supporting documents before a final decision is made on your petition.
  
  </h5>
  
  <form method ="post" action='formsubmit'>
  
    <div class="form-group" style="float:left; width:50%;">
      <label for="nuid">NU ID:</label>
      <input type="text" class="form-control" id="nuid" name="nuid" style="width:97%;"  placeholder="Enter your NU ID">
    </div>
    <div class="form-group" style="float:left; width:50%;">
      <label for="currentprogram">Current Program/Concentration:</label>
      <input type="text" class="form-control" id="currentprogram" name="currentprogram" placeholder="Enter your current program">
    </div>
    <div class="form-group" style="clear:both;">
      <label>Name:</label>
	  <p class="row-fluid">
	  
	  <input type="text" class="form-control" style="width:32.8%;display: inline-block;" name="lastName"   placeholder="Enter your last/family name">
	  <input type="text" class="form-control" style="width:32.8%;display: inline-block;" name="firstName"  placeholder="Enter your first name">
	  <input type="text" class="form-control" style="width:32.8%;display: inline-block;" name="middleName" placeholder="Enter your middle name">
	  </p>
    </div>
	<div class="form-group" style="clear:both;">
      <label>Local Address:</label>
	  <p class="row-fluid">
	  
	  <input type="text" class="form-control" style="width:24.5%; display: inline-block;" name="street"   placeholder="Enter your street/street #">
	  <input type="text" class="form-control" style="width:24.5%; display: inline-block;" name="city"  placeholder="Enter your city">
	  <input type="text" class="form-control" style="width:24.5%; display: inline-block;" name="state" placeholder="Enter your state">
	  <input type="text" class="form-control" style="width:24.5%; display: inline-block;" name="zip" placeholder="Enter your zip code">
	  </p>
    </div>
	
	
	<div class="form-group" style="float:left; width:50%;">
      <label for="phone">Phone No:</label>
      <input type="number" class="form-control" id="phone" name="phone" style="width:97%;"  placeholder="Enter your phone number">
    </div>
    <div class="form-group" style="float:left; width:50%;">
      <label for="email">Husky Email ID:</label>
      <input type="email" class="form-control" id="email" name="email" placeholder="Enter your husky email id">
    </div>
	
	
	<div class="form-group" style="float:left; width:50%;">
      <label>Current Degree Level:</label>
     <label><input type="checkbox" id="checkboxMS" value="MS" name="MS"> MS</label>
	 <label><input type="checkbox" id="checkboxPhd" value="Phd" name="PhD"> PhD</label>
	 <label><input type="checkbox" id="checkboxCertificate" value="Certificate" name="Certificate"> Certificate Only</label>
	 <label><input type="checkbox" id="checkboxSpecial" value="Special" name="Special"> Special Student</label>
	 <hr>
    </div>
    <div class="form-group" style="float:left; width:50%;">
     <label><input type="checkbox" id="checkboxInternational" value="International" name="International"> International</label>
	 <label><input type="checkbox" id="checkboxDomestic" value="Domestic" name="Domestic"> Domestic</label>
	<hr>
	  
    </div>
	
	
	
	<div class="form-group" style="float:left; width:50%;">
  
      <label>Check all that apply:</label>
       <label><input type="checkbox" id="electiveOutside" value="Elective outside core curriculum" name="elective"> Elective outside core curriculum</label>
	 <label><input type="checkbox" id="coreCourse" value="Core course waive" name="core"> Core course waive</label>
	 
	 
    </div>
    <div class="form-group" style="float:left; width:50%;">
     <label><input type="checkbox" id="changeStatus" value="Change in status" name="change"> Change in status</label>
	 <label><input type="checkbox" id="courseRepeat" value="Course repeat/official substitution" name="repeat"> Course repeat/official substitution</label>
	 
    </div>
	
	<div class="form-group" style="float:left; width:50%;">
  
     <label><input type="checkbox" id="timeExtend" value="Extension of time limit to program completion" name="extend"> Extension of time limit to program completion</label>
	 
	 
    </div>
    <div class="form-group" style="float:left; width:50%;">
     
	 <label><input type="checkbox" id="othersVal" value="Other Type" name="otherbox"> Other (specify):</label>
	 <input type="text" class="form-control" id="others" name="others" style="width:97%;"  placeholder="Enter other reason">
	 
    </div>
	
	
	<div class="form-group" style="float:left; width:100%;">
  
     <label>1. For each course concerned, please provide the information below:</label>
	 
	 <div>
	 <table style="width:100%;">
  <tr>
    <th>Course Name</th>
    <th>Term</th>
    <th>CRN #</th>
	<th>Course #</th>
	<th># Credits</th>
	
  </tr>
  <tr>
      <td><input type="text" name="coursename"/></td>
    <td><input type="text" name="term"/></td>
    <td><input type="text" name="crn"/></td>
	<td><input type="text" name="courseno"/></td>
    <td><input type="text" name="credits"/></td>
  </tr>
  <tr>
 <td><input type="text" name="coursename"/></td>
    <td><input type="text" name="term"/></td>
    <td><input type="text" name="crn"/></td>
	<td><input type="text" name="courseno"/></td>
    <td><input type="text" name="credits"/></td>
  </tr>
  <tr>
     <td><input type="text" name="coursename"/></td>
    <td><input type="text" name="term"/></td>
    <td><input type="text" name="crn"/></td>
	<td><input type="text" name="courseno"/></td>
    <td><input type="text" name="credits"/></td>
  </tr>
  <tr>
     <td><input type="text" name="coursename"/></td>
    <td><input type="text" name="term"/></td>
    <td><input type="text" name="crn"/></td>
	<td><input type="text" name="courseno"/></td>
    <td><input type="text" name="credits"/></td>
  </tr>
  <tr>
     <td><input type="text" name="coursename"/></td>
    <td><input type="text" name="term"/></td>
    <td><input type="text" name="crn"/></td>
	<td><input type="text" name="courseno"/></td>
    <td><input type="text" name="credits"/></td>
  </tr>
  <tr>
     <td><input type="text" name="coursename"/></td>
    <td><input type="text" name="term"/></td>
    <td><input type="text" name="crn"/></td>
	<td><input type="text" name="courseno"/></td>
    <td><input type="text" name="credits"/></td>
  </tr>
</table>
	 </div>
	 
	 
	 
	 <label> 2. What are you petitioning? Please explain (attach separate sheet if necessary):</label> 
    <textarea class="form-control" id="petitionReason" name="petitionReason" placeholder="Enter your petition reason"></textarea>
	
	<label> 3. Student signature:</label>
	<div style="display: flex;"> <!--sign date div-->
	
	 <input type="text" class="form-control" id="sign1" name="sign1" style="width:49%;"  placeholder="Enter your signature">
	<input type="date" class="form-control" id="date1" name="date1" style="width:49%; margin-left:25px;">
	</div> <!--end of sign date div-->
		
	</div>
    
	<h4 style="clear:both; text-align:left;"><b>SUBMIT PETITION AND ANY SUPPORTING DOCUMENTS TO YOUR PROGRAM ADVISOR</b></h4>
  <hr>
  
	<div class="form-group" style="float:left; width:50%;">
      <label><strong><i>Program Advisor</i></strong></label>
          </div>
    <div class="form-group" style="float:left; width:50%;">
      <label>Recommendation:</label>
      
	   <label><input type="checkbox" id="checkboxApproved" value="Approved" name="advisorApproved"> Approved</label>
	 <label><input type="checkbox" id="checkboxDenied" value="Denied" name="advisorDenied"> Denied</label>
    </div>

	<label> Signature:</label>
	<div style="display: flex;"> <!--sign date div-->
	
	 <input type="text" class="form-control" id="sign2" name="sign2" style="width:49%;"  placeholder="Advisor's signature">
	<input type="text" class="form-control" id="advisorName" name="advisorName" style="width:49%; margin-left:25px;" placeholder="Advisor's Name">
	</div> <!--end of sign date div-->
	
	<label> Advisor?s comments and/or instructions:</label>
	<div style="display: flex;"> <!--comments div-->
	
	 <input type="text" class="form-control" id="comments" name="comments" style="width:49%;"  placeholder="Comments">
	<input type="date" class="form-control" id="date2" name="date2" style="width:49%; margin-left:25px;">
	</div> <!--end of comments div-->
	
	<label> ECE Graduate Committee Chair (ECE students only):</label>
	<div style="display: flex;"> <!--comments div-->
	
	 <input type="text" class="form-control" id="eceComm" name="eceComm" style="width:49%;"  placeholder="ECE Committee Chair">
	<input type="date" class="form-control" id="date3" name="date3" style="width:49%; margin-left:25px;">
	</div> <!--end of comments div-->
	
	
	<hr>
	
	<div class="form-group" style="float:left; width:50%;">
  
  
    
      <label><strong><i>Graduate School</i></strong></label>
       <label><input type="checkbox" id="approved" value="Approved" name="gradApproved">Approved</label>
	 <label><input type="checkbox" id="denied" value="Denied" name="gradDenied"> Denied</label>
	 
	 
    </div>
    <div class="form-group" style="float:left; width:50%;">
     <label><input type="checkbox" id="noAction" value="No Action" name="gradNoAction"> No Action</label>
	 <label><input type="checkbox" id="returned" value="Returned for additional information" name="gradReturned">Returned for additional information</label>
	 <label><input type="checkbox" id="ascReportFiled" value="ASC Report filed" name="gradASC">ASC Report filed</label>
	 
    </div>
	
	
	<div class="form-group" style="float:left; width:100%;">
  
  
    
      <label for="commentsToStud">Comments to student:</label>
     
	 <input type="text" class="form-control" id="commentsToStud" name="commentsToStud" style="width:100%;"  placeholder="Comments to student">
	 
    </div>
  
  <div class="form-group" style="float:left; width:50%;">
  
  
    
      <label for="gradSchoolAuthorization">Graduate school authorization</label>
		<input type="text" class="form-control" id="gradSchoolAuthorization" name="gradSchoolAuthorization" style="width:100%;"  placeholder="Graduate school authorization">	 
	 
    </div>
    <div class="form-group" style="float:left; width:25%;">
	
	<label>Date</label>
	<input type="date" class="form-control" id="date4" name="date4" style="margin-left:5px;">    

	</div>
	
	<div class="form-group" style="float:left; width:24%;">

	
	<label for="effectiveTerm">Effective Term</label>
	<input type="text" class="form-control" id="effectiveTerm" name="effectiveTerm" style="margin-left:10px;" placeholder="Effective Term">
    
	</div>
	
   
    <button type="submit" class="btn btn-default" style="width:100%;">Submit</button>
  </form>
  
  </div>
  
</div>

</body>
</html>
