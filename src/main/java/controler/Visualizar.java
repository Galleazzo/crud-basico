package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import model.BancoDeDadosFic;

/**
 * Servlet implementation class Visualizar
 */
@WebServlet("/Visualizar")
public class Visualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RA = request.getParameter("ra");
		Integer ra = Integer.valueOf(RA);
		
		BancoDeDadosFic banco = new BancoDeDadosFic();
		
		Aluno aluno = banco.buscaPorId(ra);
		
		request.setAttribute("aluno", aluno);
		RequestDispatcher rd = request.getRequestDispatcher("/view/EditarAluno.jsp");
		rd.forward(request, response);
	}

}
