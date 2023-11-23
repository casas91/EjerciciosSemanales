<%@ page import="servlet.VotacionSv" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Votacion</title>
    <style>
        table {
            width: 30%;   
        }

        th, td {
            border: 1px solid black;   
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>!Bienvenido al sistema de votación de partidos!</h1>
    <h2>Seleccione a que partido quiere votar:</h2>
    <form action="VotacionSv" method="post">
         <input type="radio" name="voto" value="PARTIDO A"> PARTIDO A<br>
         <input type="radio" name="voto" value="PARTIDO B"> PARTIDO B<br>
         <input type="radio" name="voto" value="PARTIDO C"> PARTIDO C<br>
         <input type="hidden" name="action" value="votar">
         <input type="submit" value="Votar">
    </form>
    
    <br>
    
    <%
        Boolean mostrarResultados = (Boolean) request.getAttribute("mostrarResultados");
        if (mostrarResultados != null && mostrarResultados) {
    %>
        <h2>Resultados de la votación:</h2>
        <table>
            <tr><th>Partido</th><th>Cantidad Votos</th></tr>
            <% for (Map.Entry<String, Integer> entry : VotacionSv.resultados.entrySet()) { %>
                <tr><td><%= entry.getKey() %></td><td><%= entry.getValue() %></td></tr>
            <% } %>
        </table>
    <%
        }
    %>

    <form action="VotacionSv" method="post">
        <input type="hidden" name="action" value="mostrarResultados">
        <input type="submit" value="Mostrar resultados">
    </form>
</body>
</html>