<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/AdicionarAluno" var="Adicionar"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h1>Adicionar Aluno</h1>

    <h3>Complete todas as informações:</h3>

    <form action="${Adicionar }" method="post">

        <p>Nome completo: </p><input type="text" name="nome">
        <p>Idade: </p><input type="number" name="idade">
        <p>Data de Nascimento: </p><input type="text" name="dataNascimento">

        <button type="submit">Cadastrar</button>
    </form>

</body>
</html>