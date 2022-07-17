package product;

import java.util.List;

public interface ProductDAO {

	void addProduct();

	List<Product> viewProducts();

	void deleteProduct();

	void searchProduct();

	void updateProduct();

}
