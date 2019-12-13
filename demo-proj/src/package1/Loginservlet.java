package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		HttpSession session=request.getSession();

		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			NewUser boy = new NewUser();
			boy.setUsername(username);
			boy.setPassword(password);

			boolean a = JdbcLoginService.Loginuser(boy);
			if (a == true)
			{
				session.setAttribute("enter","omi");
				response.sendRedirect("index.jsp");
			} 
			else
			{
				session.setAttribute("Loginerror", "Invalid Login credentials");
				response.sendRedirect("login.jsp");
			}

//	     	response.sendRedirect("login.jsp");

			response.getWriter().append("Served at: ").append(request.getContextPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
