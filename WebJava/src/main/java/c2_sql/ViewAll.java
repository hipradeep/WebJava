package c2_sql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Database;

/**
 * Servlet implementation class ViewAll
 */
@WebServlet("/ViewAll")
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//out.println("<b>Hi</b>");
		try {

			Database db = new Database();
			Connection con = db.getConneection();
			Statement st = db.getStatements();
			String sql1 = "select * from student";
			
			ResultSet rs = st.executeQuery(sql1);
//			out.println(
//					"<b>Id</b>" + "			" + 
//					"<b>Roll No</b>" + "			" + 
//					"<b>Name</b>"+ "			" + 
//					"<b>Address</b>" + "			" + 
//					"<b>Mobile</b>" + "			" + 
//					"<b>Class</b>"	+ "			" + 
//					"<b>Password</b>" + "			");
//	out.println("\n");
//	
			while (rs.next()) {
				out.println(
						rs.getString(1) + "			" + 
						rs.getString(2) + "			" + 
						rs.getString(3)	+ "			" + 
						rs.getString(4) + "			" + 
						rs.getString(5) + "			" + 
						rs.getString(6)	+ "			" + 
						rs.getString(7) + "			");

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
