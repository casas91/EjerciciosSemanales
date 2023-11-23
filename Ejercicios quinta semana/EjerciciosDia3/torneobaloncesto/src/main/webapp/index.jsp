<%-- 
    Document   : index
    Created on : 23 nov 2023, 9:32:59
    Author     : David
--%>

<%@page import="com.david.torneobaloncesto.logica.Equipo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.david.torneobaloncesto.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Torneo Baloncesto</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        form {
            width: 300px;
            text-align: center;
        }

        h2 {
            text-align: center;
        }

        table {
            margin-top: 20px;
            width: 80%;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
</head>
<body>
    <h2>Añade un equipo</h2>
    <form action="EquipoSv" method="POST">
        <label for="nombre">Nombre:</label>
        <input type="text" class="form-control" id="nombre1" name="nombre" required>
        <label for="ciudad">Ciudad:</label>
        <input type="text" class="form-control" id="ciudad1" name="ciudad" required>
        <br>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>

    <form action="EquipoSv" method="GET" accept-charset="UTF-8">
        <button type="submit" class="btn btn-primary">Mostrar equipos</button>
    </form>

    <div>
        <% if (request.getAttribute("resultados") != null) { %>
            <h3>Resultados:</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Ciudad</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% }%>
    </div>

    <h2>Añade un partido</h2>
    <form action="PartidoSv" method="POST">
        <label for="fecha">Fecha:</label>
        <input type="date" class="form-control" id="fecha" name="fecha" required><br>
        <label for="equipoLocal">Id equipo Local:</label>
        <input type="number" class="form-control" id="nombre1" name="nombre1" required><br>
        <label for="equipoVisitante">Id equipo Visitante:</label>
        <input type="number" class="form-control" id="nombre2" name="nombre2" required><br>
        <label for="puntosEq1">Puntos equipo 1:</label>
        <input type="number" class="form-control" id="puntos1" name="puntos1" required><br>
        <label for="puntosEq2">Puntos equipo 2:</label>
        <input type="number" class="form-control" id="puntos2" name="puntos2" required>
        <br>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>

    <form action="PartidoSv" method="GET" accept-charset="UTF-8">
        <br>
        <button type="submit" class="btn btn-primary">Mostrar partidos</button>
    </form>

    <div>
        <% if (request.getAttribute("resultado") != null) { %>
            <h3>Resultados:</h3>
            <table class="table">
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Equipo Local</th>
                        <th>Equipo Visitante</th>
                        <th>Puntos Local</th>
                        <th>Puntos Visitante</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("resultado")) {%>
                        <tr>
                            <td><%= partido.getFecha()%></td>
                            <td><%= partido.getEquipo1().getNombre()%></td>
                            <td><%= partido.getEquipo2().getNombre()%></td>
                            <td><%= partido.getResultado1()%></td>
                            <td><%= partido.getResultado2()%></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% }%>
    </div>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>
