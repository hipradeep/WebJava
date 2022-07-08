package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out= response.getWriter();
//		out.println("<h1>username </h1>"+ request.getParameter("username"));
//		out.println("<h2>password <h2>"+request.getParameter("password"));
//		
		if(request.getParameter("username").equals("pp") && request.getParameter("password").equals("123")) {
			RequestDispatcher r=request.getRequestDispatcher("/Registration.html");
			r.include(request, response);
//			PrintWriter out= response.getWriter();
//			out.println("<h1>username </h1>"+ request.getParameter("username"));
//			out.println("<h2>password <h2>"+request.getParameter("password"));
		}else {
			RequestDispatcher r=request.getRequestDispatcher("/Error.html");
			r.forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
