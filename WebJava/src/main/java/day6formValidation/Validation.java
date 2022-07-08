package day6formValidation;

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

/**
 * Servlet implementation class Validation
 */
@WebServlet("/validate")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out=response.getWriter();
//		   String userid =request.getParameter("userid");
//			String pass=request.getParameter("pass");
//			out.println(userid);
//			out.println(pass);
		try		{
		Database db= new Database();
	    Connection conn= db.getCon();
	    System.out.println("connection "+ conn);
	    Statement s= conn.createStatement();
	   
  	    String userid =request.getParameter("userid");
		String pass=request.getParameter("pass");
		
		ResultSet rs= s.executeQuery("select * from admin");
		
		if(rs.next()) {
			
			if(!rs.getString(3).equals(pass)) {
				out.println("Wrong pass");
			}else {
				out.println(userid);
				out.println(pass);
			}
			
		}
		
		
		//boolean y= s.execute("insert into std values('"+sid+"' ,'"+name+"')");
		}catch(Exception  r) {
			System.out.println("error ===="+r);
		}
		
		
	}

}
