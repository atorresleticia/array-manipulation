<%-- 
    Document   : app
    Created on : Sep 2, 2018, 7:21:36 PM
    Author     : Leticia Torres
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Manipulação de vetores e listas</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="appStyle.css">
    </head>
    <body>       
        
        <h1>Manipulação de vetores e listas</h1>
        
        <br>
        
        <div>
            Usuário digitou o valor ${param.value} <br>
        </div>

        <br>

        <div class="array">
            Vetor gerado = [ 
            <c:forEach items="${array}" var="element">
                ${element}  
            </c:forEach> ]
        </div>

        <br>

        <form>
            Soma dos valores 
            <input type="hidden" name="value" value="${param.value}">
            <button type="submit" name="evenOdd" value="even">Pares</button>
            <button type="submit" name="evenOdd" value="odd">Ímpares</button>
            <label>${sum}</label>
        </form>
   
    </body>
</html>
