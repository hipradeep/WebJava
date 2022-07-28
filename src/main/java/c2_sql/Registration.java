package c2_sql;

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

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }


//	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		out.println(rollno+"");
		String name=request.getParameter("name");
		out.println(name);
		String address=request.getParameter("address");
		out.println(address);
		String mobile=request.getParameter("mobile");
		out.println(mobile);
		String class1=request.getParameter("class");
		out.println(class1);
		String password=request.getParameter("password");
		out.println(password);
	
		
		
	try {
		Database db=new Database();
		Connection conn=db.getConneection();
		
		Statement st=db.getStatements();
		
		String sql ="insert into student(rollno, name, address, mobile, class, password) values('"+rollno+"', '"+name+"', '"+address+"', '"+mobile+"', '"+class1+"', '"+password+"')";
		
		boolean b=st.execute(sql);
		
		response.sendRedirect("Registration.html");
		
	}catch(Exception e) {
		System.out.println("Error - "+e.getMessage());
	}
		
	}

}
