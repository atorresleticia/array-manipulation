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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manipulation</title>
    </head>
    <body>        
        <div>
            Usuário digitou o valor ${param.value} <br>
        </div>

        <br>

        <div>
            Vetor = [ 
            <c:forEach items="${array}" var="element">
                ${element}
            </c:forEach> ]
        </div>

        <br>

        <form>
            Somar valores
            <input type="hidden" name="value" value="${param.value}">
            <button type="submit" name="evenOdd" value="even">Pares</button>
            <button type="submit" name="evenOdd" value="odd">Ímpares</button>
        </form>
        
        <br>
        
        Soma dos valores ${option} = ${sum}

    </body>
</html>
