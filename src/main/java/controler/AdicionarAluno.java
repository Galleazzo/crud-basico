package controler;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import model.BancoDeDadosFic;

/**
 * Servlet implementation class AdicionarAluno
 */
@WebServlet("/AdicionarAluno")
public class AdicionarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Empresa");
		
		BancoDeDadosFic banco = new BancoDeDadosFic();
		Aluno aluno = new Aluno();
		
		String nome = request.getParameter("nome");
		String Idade = request.getParameter("idade");
		Integer idade = Integer.valueOf(Idade);
		String dataNascimento = request.getParameter("dataNascimento");
		
		
		
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setDataNascimento(dataNascimento);
		aluno.setDataDeMatricula(LocalDate.now());
		
		
		
		banco.adicionaAluno(aluno);
		
		response.sendRedirect("Lista");
	
	}

}
