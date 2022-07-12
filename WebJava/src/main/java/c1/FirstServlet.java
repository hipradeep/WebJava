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
		out.println("This is /FirstServlet Servlet");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

//	out.println("<h3>Name - </h3>"+name);
//	out.println("<h3>Mobile - </h3>"+ mobile);

		// print request data at this servlet
		// out.println("Name - "+name);
		// out.println("Password - "+ pass);

		// redirect to next servlet page

		if (name.equals("admin") && pass.equals("1234")) {
			//url will remain same
			RequestDispatcher rd = request.getRequestDispatcher("/NextPage");
			rd.forward(request, response); // redirect to next page
		} else {

			// if name and password not match then redirect to the same page
			//url will rewritten 
			response.sendRedirect("FirstForm.html");
		}

//	if(name.equals("admin") && pass.equals("1234")) {
//	
//		RequestDispatcher rd=request.getRequestDispatcher("/TestInclude.html");
//		rd.include(request, response); // redirect to next page
//		out.println("Name - "+name);
//		out.println("Password - "+ pass);
//		
//	}else {
//		out.println("Wrong information");
//	}
//	

	}

}
