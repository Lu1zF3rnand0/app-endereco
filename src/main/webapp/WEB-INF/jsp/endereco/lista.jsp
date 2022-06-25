<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Lista de Enderecos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Cadastramento de Enderecos</h2>

    <c:if test="${not empty mensagem}">
        <div class="alert alert-success">
            <strong>Confirmação!</strong> ${mensagem}
        </div>
    </c:if>

    <hr>

    <c:if test="${not empty lista}">
        <h3>Total de Enderecos: ${lista.size()}</h3>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>CEP</th>
                <th>Logradouro</th>
                <th>Complemento</th>
                <th>Bairro</th>
                <th>Localidade</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="e" items="${lista}">
                <tr>
                    <td>${e.cep}</td>
                    <td>${e.logradouro}</td>
                    <td>${e.complemento}</td>
                    <td>${e.bairro}</td>
                    <td>${e.localidade}</td>
                    <td><a href="/endereco/${e.id}/excluir">excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty lista}">
        <h3>Não existem endereços cadastrados!!!</h3>
    </c:if>

    <form action="/endereco" method="get">
        <button type="submit" class="btn btn-primary">Novo</button>
    </form>
</div>
</body>
</html>