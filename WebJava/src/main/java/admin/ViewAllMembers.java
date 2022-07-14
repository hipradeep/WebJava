package admin;
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
@WebServlet("/ViewAllMembers")
public class ViewAllMembers extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {

			Database db = new Database();
			Connection con = db.getConneection();
			Statement st = db.getStatements();
			String sql1 = "select * from members";
			
			ResultSet rs = st.executeQuery(sql1);
			
			out.print("<head>");
			out.print("<meta charset=\"ISO-8859-1\">");
			out.print("<title>All Members</title>");
			out.print("  <link rel=\"stylesheet\" href=\"styles.css\">");
			out.print("</head>");
		
			out.print("<body >");
			out.print("<h2>Welcome To <span>C</span>lub  <span>H</span>ouse</h2><hr>");
			out.print(" <h3>All Members</h3>");
			out.println("<table>");
			out.println("<tr>  <th>ID  <th>Adhar   <th>Name   <th>Email   <th>Age   <th>Mobile   <th>Address  </tr>");
			
			while (rs.next()) {
				out.println(
						"<tr><td>"+ rs.getInt(1) + "<td> " + 
						rs.getString(2) + "<td> " + 
						rs.getString(3)	+ "<td> " + 
						rs.getString(4) + "<td> " + 
						rs.getInt(5) + "<td> " + 
						rs.getString(6)	+ "<td> " + 
						rs.getString(7) + " <td>"+
						"<a href=\"#\">Edit</a>" + " <td>"+
						"<a href=\"#\">Delete</a>" + ""
//						"<a href=\"#\">View</a>" + ""
						
						
						);

			}
		} catch (SQLException e) {
			System.out.println("Error - "+e.getMessage());
		}
	}

}
