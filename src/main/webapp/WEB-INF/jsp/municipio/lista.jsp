<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Municipios</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Lista de Municipios</h2>


    <hr>

        <h3>Total de Municipios: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Nome</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="m" items="${lista}">
                <tr>
                    <td>${m.nome}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
</div>
</body>
</html>