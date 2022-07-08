package day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Databaseconfig.Database;

/**
 * Servlet implementation class Register
 */
@WebServlet("/registration1")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
	
		String sid= request.getParameter("sid");
		String name=request.getParameter("name");
		out.println(request.getParameter("sid"));
		out.println(request.getParameter("name"));
		
		try {
			Connection con=	Database.connect();
			Statement s=con.createStatement();
			
			
			boolean y=s.execute("insert into std values('"+sid+"','"+name+"')");
			
			if(y) {
				System.out.println("Inserted");
			}else {
				System.out.println("Not Inserted");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("HI");
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
