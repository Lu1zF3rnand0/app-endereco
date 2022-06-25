<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Eleitores</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Cadastramento de Eleitores</h2>

    <c:if test="${not empty mensagem}">
        <div class="alert alert-success">
            <strong>Confirmação!</strong> ${mensagem}
        </div>
    </c:if>

    <hr>

    <c:if test="${not empty lista}">
        <h3>Total de Eleitores: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Código</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Telefone</th>
                <th>Token</th>
                <th>Votos</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.codigo}</td>
                    <td>${e.nome}</td>
                    <td>${e.email}</td>
                    <td>${e.telefone}</td>
                    <td>${e.token}</td>
                    <td>${e.votos.size()}</td>
                    <td><a href="/eleitor/${e.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty lista}">
        <h3>Não existem eleitores cadastrados!!!</h3>
    </c:if>

    <form action="/eleitor" method="get">
        <button type="submit" class="btn btn-primary">Novo</button>
    </form>
</div>
</body>
</html>