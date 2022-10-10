<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Alunos Cadastrados na Escola:</h1>

	<c:if test="${ not empty listaAlunos }">
		<ul>	
			<c:forEach items="${ listaAlunos}" var="alunos">
				<li>Nome: ${alunos.nome } | Idade: ${alunos.idade } | Data de Matricula: ${alunos.dataDeMatricula } 
				
				|| <a href="/CRUD/Deletar?ra=${alunos.ra }">Excluir</a> 
				|| <a href="/CRUD/Visualizar?ra=${alunos.ra }">Editar</a>
				</li>
			</c:forEach>
		
		</ul>
		
	</c:if>
	
	<c:if test="${empty listaAlunos }">
		<h3>Não há alunos cadastrados</h3>
	</c:if>

</body>
</html>