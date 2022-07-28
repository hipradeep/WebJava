package c4_sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutS")
public class LogoutS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession hs = request.getSession(false); // by passing false it will not create new session if, session not exits
		if (hs == null) {
			// Session is not created.
			out.println("User Not Loghed In!");

		} else {
			System.out.println("Session Exits");
			System.out.println(hs.getAttribute("rollnumber"));
			hs.removeAttribute("rollnumber");
			//hs.removeAttribute("password");
			hs.invalidate();
//			RequestDispatcher rd = request.getRequestDispatcher("/LoginSession.html");
//			rd.forward(request, response); 
			
			response.sendRedirect("LoginSession.html");
		}
		}
	}


