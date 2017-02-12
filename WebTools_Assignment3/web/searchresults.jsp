<%-- 
    Document   : searchpage
    Created on : Feb 10, 2017, 7:18:39 PM
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
        <h1>Hello World!</h1>
        
        <table>
            <thead>

                <tr>

                    <th> Title</th>
                    <th> Actor</th>
                    <th> Actress</th>
                    <th> Genre</th>
                    <th> Year</th>

                </tr>


            </thead>
            <tbody>

                <c:forEach items="${sessionScope.outList}" var="moviebean">
                    <tr>
                        <td>${moviebean.movieTitle}</td>
                        <td>${moviebean.movieActor}</td>
                        <td>${moviebean.movieActress}</td>
                        <td>${moviebean.movieGenre}</td>
                        <td>${moviebean.movieYear}</td>
                        
                    </tr>


                </c:forEach>



            </tbody>


        </table>


        
    </body>
</html>
