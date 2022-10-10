package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import model.BancoDeDadosFic;

/**
 * Servlet implementation class EditarAluno
 */
@WebServlet("/EditarAluno")
public class EditarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		BancoDeDadosFic banco = new BancoDeDadosFic();
		
		String RA = request.getParameter("ra");
		Integer ra = Integer.valueOf(RA);
		String nome = request.getParameter("nome");
		String Idade = request.getParameter("idade");
		Integer idade = Integer.valueOf(Idade);
		
		String dataNascimento = request.getParameter("dataNascimento");
		
		Aluno alunoEditado = banco.buscaPorId(ra);
		
		alunoEditado.setNome(nome);
		alunoEditado.setIdade(idade);
		alunoEditado.setDataNascimento(dataNascimento);
		
		response.sendRedirect("Lista");
		
		
	}

}
