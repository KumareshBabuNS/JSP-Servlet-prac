<%-- 
    Document   : add
    Created on : Feb 10, 2017, 1:08:34 PM
    Author     : richa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        
        <form class="dataform" method="post" action="additioncontroller">

            <div class="dataheading">
                <h1>Please enter the details below</h1>
            </div>

            
            <div class="datarow">
                <label>
                    <span>Movie Title</span>
                </label>
                    <input type="text" name="movieTitle"/>
                
            </div>
            
            <div class="datarow">
                <label>
                    <span>Lead Actor</span>
                </label>
                    <input type="text" name="movieActor"/>
                
            </div>
            
            <div class="datarow">
                <label>
                    <span>Lead Actress</span>
                </label>
                    <input type="text" name="movieActress"/>
                
            </div>
            
            <div class="datarow">
                <label>
                    <span>Genre</span>
                </label>
                    <input type="text" name="movieGenre"/>
                
            </div>
            
            <div class="datarow">
                <label>
                    <span>Year</span>
                </label>
                    <input type="text" name="movieYear"/>
                
            </div>
            

          
            <div class="datarow">
                
                <input class="submitbutton" type="submit" value="Send">
            </div>

        </form>

    </div>
        
    </body>
</html>
