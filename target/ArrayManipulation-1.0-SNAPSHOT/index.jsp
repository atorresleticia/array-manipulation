<%-- 
    Document   : index
    Created on : Sep 2, 2018, 6:29:03 PM
    Author     : Leticia Torres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manipulação de vetores e listas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="indexStyle.css">
    </head>
    <body>
        <h1>Manipulação de vetores e listas</h1>
        
        <br>
        
        <div> 
            <form name="numberInputForm" action="array-manipulation">
                Insira um número múltiplo de 10 entre 100 e 1000: 
                <input class="arrayInput" type="text" name="value" size="6">
                <button type="submit" value="Generate Array" name="generateArray">Gerar Vetor</button>
                <span class="error" >${errors.notMultiple}</span>
                <span class="error" >${errors.notInRange}</span>
            </form>  
        </div>
        <br>
    </body>
</html>
