package Databaseconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static Connection connect() throws SQLException, ClassNotFoundException {

        try {
 	Class.forName("com.mysql.jdbc.Driver"); 
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/<database_name>", "<user>", "<password>");
            Connection res = DriverManager.getConnection("jdbc:mysql://localhost:3306/org1", "root", "1234");
            if (res != null) {
                System.out.println("Connection working");
            } else {
                System.out.println("Failed to make connection!");
            }
            return res;
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            throw e;
        }
    }

}
