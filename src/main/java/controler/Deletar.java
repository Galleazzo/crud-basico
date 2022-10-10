package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BancoDeDadosFic;

/**
 * Servlet implementation class Deletar
 */
@WebServlet("/Deletar")
public class Deletar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RA = request.getParameter("ra");
		Integer ra = Integer.valueOf(RA);
		
		BancoDeDadosFic banco = new BancoDeDadosFic();
		banco.deletar(ra);
		
		response.sendRedirect("Lista");
	
	}

}
