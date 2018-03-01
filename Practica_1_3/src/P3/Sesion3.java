package P3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sesion3
 */
@WebServlet("/Sesion3")
public class Sesion3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sesion3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<UsuariosDAO> usuarios = new ArrayList<UsuariosDAO>();
		UsuariosDAO user1= new UsuariosDAO("Diego","Ortega","doc_95@hotmail.com");
		UsuariosDAO user2= new UsuariosDAO("Antonio","Trujillo","atd@hotmail.com");
		UsuariosDAO user3= new UsuariosDAO("Salvador","Trujillo","std@hotmail.com");
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		request.setAttribute("usuarios", usuarios);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String usuario=request.getParameter("usuario");
		String passwd=request.getParameter("clave");
		String url="";
		UsuariosDAO db= new UsuariosDAO();
		if(db.checkAdmin(usuario,passwd)) {
			doGet(request, response);
			url="/WEB-INF/admin.jsp";
			
		}else url="/WEB-INF/registro.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);

		
		
	}

}