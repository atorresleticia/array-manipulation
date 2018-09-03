<%-- 
    Document   : index
    Created on : Sep 2, 2018, 6:29:03 PM
    Author     : Leticia Torres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Array and List Manipulation</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Array and List Manipulation Simple App</div>
        
        <br>
        
        <div> 
            Insira um número múltiplo de 10 entre 100 e 1000: 
            
            <form name="numberInputForm" action="array-manipulation">
                <input type="text" name="value">
                <input type="submit" value="Generate Array" name="generateArray">
            </form>   
            
            ${userValue}
        </div>
        <br>
    </body>
</html>
