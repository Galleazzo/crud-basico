<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<c:url value="/EditarAluno" var="Edit"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar</title>
</head>
<body>
	
	
	
    <h1>Editar Aluno</h1>

    <h3>Complete todas as informações:</h3>

    <form action="${Edit }" method="post">

        <p>Nome completo: </p><input type="text" name="nome" value="${aluno.nome }">
        <p>Idade: </p><input type="number" name="idade" value="${aluno.idade }">
        <p>Data de Nascimento: </p><input type="text" name="dataNascimento" value="${aluno.dataNascimento }">
        
        <input type="hidden" name="ra" value="${aluno.ra }" >

        <button type="submit">Salvar</button>
    </form>
	
	
</body>
</html>