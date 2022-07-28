package admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Database;
@WebServlet("/AddNewMember")
public class AddNewMember extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
		
		
		String aadhar=request.getParameter("aadhar");
		System.out.println(aadhar);
		
		String name=request.getParameter("name");
		System.out.println(name);
		
		String email=request.getParameter("email");
		System.out.println(email);
		
		String address=request.getParameter("address");
		System.out.println(address);
	
		int age=Integer.parseInt(request.getParameter("age"));
		System.out.println(age+"");
		
		String phone=request.getParameter("phone");
		System.out.println(phone);
	
		String password=request.getParameter("password");
		out.println(password);
		
		try {
			Database db=new Database();
			Connection conn=db.getConneection();
			
			Statement st=db.getStatements();
			
			String sql ="insert into members(aadhar, name, email, address, age,phone,  password) values('"+aadhar+"', '"+name+"', '"+email+"', '"+address+"', '"+age+"', '"+phone+"', '"+password+"')";
			
			boolean b=st.execute(sql);
			
			response.sendRedirect("addnewmember.html");
			
		}catch(Exception e) {
			System.out.println("Error - "+e.getMessage());
		}
		
		///pradeep
		
	}

}
