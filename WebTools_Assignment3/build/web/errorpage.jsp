<%-- 
    Document   : errorpage
    Created on : Feb 10, 2017, 4:07:37 PM
    Author     : richa
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Welcome to Movie Store</title>
        <link rel="stylesheet" href="style.css">
        
    </head>
    <body>
        
        
        <div class="main-content">

        
        <form class="dataform" method="" action="#">

            <div class="dataheading">
                <h1>Welcome to our Movie Store</h1>
            </div>

            <div class="datarow">
                <label>
                    <span>Error Occurred!</span>
                  </label>
                 <p>
                     <c:out value="${errMsg}"/>
        </p>
            </div>



        </form>

    </div>

    </body>
</html>
