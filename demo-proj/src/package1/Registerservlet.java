package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Registerservlet
 */
@WebServlet("/Register-servlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 HttpSession session=request.getSession();
		
		try
		{
	     	String username=request.getParameter("username");
	     	String email=request.getParameter("email");
	     	String password=request.getParameter("password");
	     	String mobile=request.getParameter("mobile");
	     	
	     	User user=new User();
	     	user.setUsername(username);
	     	user.setEmail(email);
	     	user.setPassword(password);
	     	user.setMobile(mobile);
	     	
	     	
	     	JdbcRegistrationService.registerUser(user);
	     	
	     	response.sendRedirect("login.jsp");
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
			session.setAttribute("Error", "User Already Exist");
			response.sendRedirect("register.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
