package admin;

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



import database.Database;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String userid =request.getParameter("userid");
		String password = request.getParameter("password");
 

		try {
			Database db = new Database();
			Connection conn = db.getConneection();

			Statement st = (Statement) db.getStatements();

			String sql2 = "select userid, pass from admin where userid=" + userid + " and pass=" + password;
			String sql3 = "select * from admin";

			ResultSet rs = st.executeQuery(sql3);
			
//			while(rs.next()) {
//				out.println("UserId- " + rs.getString(2) + " Passworrd -  " + rs.getString(3));
//			}
			
			if (rs.next()) {

				if (userid.equals(rs.getString(2)) && password.equals(rs.getString(3))) {
					
					out.println("UserId- " + rs.getString(2) + " Passworrd -  " + rs.getString(3));
					
				} else {
					System.out.println("UserId- " + rs.getString(2) + " Passworrd -  " + rs.getString(3));
					response.sendRedirect("adminlogin.html");
				}

				
			} else {

				out.println("Invalid");

			}


		} catch (Exception e) {
			System.out.println("Error - " + e.getMessage());
		}

		
		
		
	}

}
