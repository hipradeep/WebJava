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
 * Servlet implementation class LoginSessions
 */
@WebServlet("/LoginSessions")
public class LoginSessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	
		
		try {
			
			int rollno = Integer.parseInt(request.getParameter("rollno"));
			String password = request.getParameter("password");
			Database db=new Database();
			Connection conn=db.getConneection();
			
			Statement st=db.getStatements();
			String sql="select rollno, password from student where rollno=? and password=?";
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setInt(1, rollno);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
			//there is only one record
			if(rs.next()) {
				
				if(rollno == rs.getInt(1) && password.equals(rs.getString(2)) ) {
					System.out.println("PS:  Roll No - "+rs.getInt(1)+ " Passworrd -  "+ rs.getString(2));
					
					HttpSession hs= request.getSession();
					System.out.println(hs);
					System.out.println(hs.getId());
					System.out.println(hs.getCreationTime());
					hs.setAttribute("rollnumber", rollno);
					//hs.setAttribute("password", password);
					
					RequestDispatcher rd = request.getRequestDispatcher("/ChangePassword.html");
					rd.forward(request, response); 
					
				}else {
					response.sendRedirect("LoginSession.html");
				}
				
				out.println("Roll No - "+rs.getInt(1)+ " Password -  "+ rs.getString(2));
			}else {
				out.println("No Data");
			}
			
		} catch (SQLException e) {
	
			System.out.println("Error - "+e.getMessage());
			
		}
		
		
	
	}

}
