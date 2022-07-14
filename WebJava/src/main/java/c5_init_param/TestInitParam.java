package c5_init_param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { "/TestInitParam" }, 
		initParams = { 
				@WebInitParam(name = "username", value = "hipradeep"), 
				@WebInitParam(name = "password", value = "abc123")
		})
public class TestInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out =response.getWriter();
		
		out.println("Username - "+getInitParameter("username"));
		out.println("Password - "+getInitParameter("password"));
		

		
	}

}
