package day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }


//	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println(request.getParameter("rollno"));
		out.println(request.getParameter("name"));
		out.println(request.getParameter("address"));
		out.println(request.getParameter("mobile"));
		out.println(request.getParameter("class"));
		
	}

}
