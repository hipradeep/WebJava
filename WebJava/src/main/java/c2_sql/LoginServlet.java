package c2_sql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Database;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		String password = request.getParameter("password");
//		 out.println("Name - "+rollno);
//		 out.println("Password - "+ password);
//		 

		try {
			Database db = new Database();
			Connection conn = db.getConneection();

			Statement st = db.getStatements();

			/// String sql ="insert into student(rollno, name, address, mobile, class,
			/// password) values('"+rollno+"', '"+name+"', '"+address+"', '"+mobile+"',
			/// '"+class1+"', '"+password+"')";
			String sql2 = "select rollno, password from student where rollno=" + rollno + " and password=" + password;

			ResultSet rs = st.executeQuery(sql2);
			if (rs.next()) {

				if (rollno == rs.getInt(1) && password.equals(rs.getString(2))) {
					out.println("Roll No - " + rs.getInt(1) + " Passworrd -  " + rs.getString(2));
				} else {
					response.sendRedirect("Login.html");
				}

				// out.println("Roll No - "+rs.getInt(1)+ " Password - "+ rs.getString(2));
			} else {

				out.println("No Data");

			}

			// response.sendRedirect("Registration.html");

		} catch (Exception e) {
			System.out.println("Error - " + e.getMessage());
		}

//		if(rollno.equals("pp") && password.equals("123")) {
//			RequestDispatcher r=request.getRequestDispatcher("/Registration.html");
//			r.include(request, response);
////			PrintWriter out= response.getWriter();
////			out.println("<h1>username </h1>"+ request.getParameter("username"));
////			out.println("<h2>password <h2>"+request.getParameter("password"));
//		}else {
//			RequestDispatcher r=request.getRequestDispatcher("/Error.html");
//			r.forward(request, response);
//		}

	}

}
