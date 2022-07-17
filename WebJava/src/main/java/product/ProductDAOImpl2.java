package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import database.Database;

public class ProductDAOImpl2 {

	Product p;
	Database db = new Database();
	Connection conn;
	PreparedStatement ps;

	public ProductDAOImpl2(Product p) {
		this.p = p;
		conn = db.getConnection();
	}

	public void addProduct() {
		try {
			ps = conn.prepareStatement("insert into product values(?,?,?,?,?)");
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getPname());
			ps.setString(3, p.getCompany());
			ps.setInt(4, p.getPrice());
			ps.setString(5, p.getVendor());
			ps.executeUpdate();
		} catch (Exception d) {
			
		}
		System.out.println(" hey cursor is comimng to this page " + p.getPid());
	}

	public List<Product> viewProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct() {
		// TODO Auto-generated method stub

	}

	public void searchProduct() {
		// TODO Auto-generated method stub

	}

	public void updateProduct() {
		// TODO Auto-generated method stub

	}

}
