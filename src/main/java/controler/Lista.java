package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import model.BancoDeDadosFic;

/**
 * Servlet implementation class Lista
 */
@WebServlet("/Lista")
public class Lista extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BancoDeDadosFic banco = new BancoDeDadosFic();
		List<Aluno> alunos = banco.getAlunos();
		
		request.setAttribute("listaAlunos", alunos);
		RequestDispatcher rd = request.getRequestDispatcher("/view/ListaAlunos.jsp");
		rd.forward(request, response);
	}

}
