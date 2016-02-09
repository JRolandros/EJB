

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet_Calculatrice
 */
@WebServlet("/calculatrice")
public class servlet_Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@EJB 
	session.CalculatriceLocal Ejb;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			System.out.println("\n\n Hello EJB : "+Ejb.add(2, 3));

        } finally {            
        	out.close();
        }
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
