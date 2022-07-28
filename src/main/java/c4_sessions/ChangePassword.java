package c4_sessions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.Database;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		try {
			String password = request.getParameter("password");
			int rollno;
			HttpSession hs = request.getSession(false);
			if (hs == null) {
				// Session is not created.
				out.println("User Not LoghedIn!");

			} else {
				// Session is already created.
				System.out.println("Session is already exits!");
				rollno = (int) hs.getAttribute("rollnumber");
				Database db = new Database();
				Connection conn = db.getConneection();

				Statement st = db.getStatements();
				System.out.println("CP:  Roll No - "+rollno+ " Passworrd -  "+ password);
				String sql2 = "update student set password=? where rollno=?";
				PreparedStatement ps = conn.prepareStatement(sql2);
				ps.setString(1, password);
				ps.setInt(2, rollno);
				

				int res = ps.executeUpdate();

				out.println(res + " records updated!");

			}

		} catch (SQLException e) {

			System.out.println("Error - " + e.getMessage());
			out.println("Error - " + e.getMessage());

		}

	}

}
