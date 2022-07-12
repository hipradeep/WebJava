package day4;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.Database;

/**
 * Servlet implementation class ViewAll
 */
@WebServlet("/ViewAllw")
public class ViewAll1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAll1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql = "SELECT * FROM std";
        try (Connection con = Database.connect();
         PreparedStatement ps = con.prepareStatement(sql)) {

        try (ResultSet rs = ps.executeQuery()) {
            while(rs.next()) {
                System.out.println(rs.getString(2));
            }
        }
    } catch (SQLException e) {
       System.out.println(e.getMessage());
    } catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
    	System.out.println(e1.getMessage());
	}
	}



}
