

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginserv")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		
		out.print("<title>Login</title>");
		
		out.print("</head>");
		
		out.print("<body>");
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String logn = request.getParameter("lgn");	
		if(pass.equals("abc123"))
		{
			RequestDispatcher dis = request.getRequestDispatcher("profserv");	
			dis.forward(request, response);			
		}
		else
		{
			request.getRequestDispatcher("index.html").include(request, response);
			out.print("<center><p>Wrong password!</p></center>");
		}
		
		
		out.print("</body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
