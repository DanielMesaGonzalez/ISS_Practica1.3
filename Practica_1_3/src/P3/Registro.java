package P3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		if(request.getSession(false)==null) {
			
	    	String url="/WEB-INF/caduca.html";
			getServletContext().getRequestDispatcher(url).forward(request, response);

			
	    }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);
	    String nombre= (String)request.getParameter("username");
	    String apellido= (String)request.getParameter("surname");
	    String email= (String)request.getParameter("email");
	    UsuariosDAO user=new UsuariosDAO(nombre, apellido, email);
	    request.setAttribute("nombre", nombre); 
	    sesion.setAttribute("nombre", nombre);
	    request.setAttribute("apellido", apellido);
	    sesion.setAttribute("apellido", apellido);
	    request.setAttribute("email", email); 
	    sesion.setAttribute("email", email); 
	    sesion.setMaxInactiveInterval(5);
	    
	    String url="/WEB-INF/sesion.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
		

		
		doGet(request,response);
	}

}
