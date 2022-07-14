package c1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>This is /FirstServlet Servlet</h1>");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String action = request.getParameter("action");

		//	out.println("<h3>Name - </h3>"+name);
		//	out.println("<h3>Mobile - </h3>"+ mobile);

		// print request data at this servlet
		System.out.println("Name - " + name);
		System.out.println("Password - " + pass);
		System.out.println("Action	 - " + action);

		if (name.equals("admin") && pass.equals("1234")) {

			if (action.equals("forward")) {

				// url will remain same
				RequestDispatcher rd = request.getRequestDispatcher("/NextPage");
				rd.forward(request, response); // redirect to next page

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/TestInclude.html");
				rd.include(request, response); // redirect to next page
				out.println("<b>Name - </b>"+name);
				out.println("<br>");
				out.println("<b>Password -</b> "+ pass);
				out.println("<br>");
				out.println("<b>Action - </b>" + action);
			}

		} else {
			out.println("Wrong information");
		}

	}

}
