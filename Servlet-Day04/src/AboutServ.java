

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/aboserv")
public class AboutServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<head>");
		out.print("<title>About</title>");
		out.print("<style>");
		out.print(".navb{margin: 3pc;font-size: 25px;font-weight: bold;line-height:30px;color: navy;list-style:none;padding-left: 20pc;}");
		out.print("a{text-decoration: none;padding:0 30px;margin: 30px;color: navy;}");
		
		out.print("</style>");
		
		out.print("</head>");
		
		out.print("<body style='background-color: paleturquoise;'>");
		out.print("<div class='navb'>");
		
		out.print("<a href='index.html'>Home</a>");
		out.print("<a href='aboserv'>About</a>");
		out.print("<a href='contserv'>Contact</a>");
		out.print("<a href='profserv'>Profile</a>");
		
		out.print("</div>");
		
		out.print("<center><div style='margin-top:8pc;background-color: rgb(226, 215, 200);width:35%;border-radius:10px;padding-top:10px;padding-bottom:20px;font-size: 20px;'>");
		String name1 = request.getParameter("uname");
		String pass1 = request.getParameter("upass");
		
		out.print("<h1>Welcome to About page</h1>");
		out.println("User Name : "+name1);
		out.println("<br/>User Password : "+pass1);
		
		out.print("</div></center>");
		out.print("</body>");
		
		RequestDispatcher dis = request.getRequestDispatcher("contserv");	
		dis.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
