package c1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NextPage")
public class NextPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h1> This is /NextPage Servlet</h1>");
		//Receive data from previous servlet, and display here
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		
		
		String action = request.getParameter("action");
		out.println("<b>Name - </b>"+name);
		out.println("<br>");
		out.println("<b>Password -</b> "+ pass);
		out.println("<br>");
		out.println("<b>Action - </b>" + action);
	}

}
