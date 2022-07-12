package c3_ps;

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
 * Servlet implementation class Register
 */
@WebServlet("/LoginPS")
public class LoginPS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPS() {
        super();
        // TODO Auto-generated constructor stub
    }

	
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
			
			if(rs.next()) {
				
				if(rollno == rs.getInt(1) && password.equals(rs.getString(2)) ) {
					out.println("PS:  Roll No - "+rs.getInt(1)+ " Passworrd -  "+ rs.getString(2));
				}else {
					response.sendRedirect("LoginPS.html");
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
