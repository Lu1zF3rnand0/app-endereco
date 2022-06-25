<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Estados</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Lista de Estados</h2>


    <hr>

        <h3>Total de Estados: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Sigla</th>
                <th>Nome</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td>${e.sigla}</td>
                    <td>${e.nome}</td>
                    <td><a href="/municipios/${e.id}">Municipios</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
</div>
</body>
</html>