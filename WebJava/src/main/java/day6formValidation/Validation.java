package day6formValidation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.Database;

/**
 * Servlet implementation class Validation
 */
@WebServlet("/validate")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession hs = request.getSession(false); 
		if (hs == null) {
			// Session is not created.
			out.println("User Not Loghed In!");

		} else {
			System.out.println("Session Exits");
			System.out.println(hs.getAttribute("rollnumber"));
		}

		
	}

}
