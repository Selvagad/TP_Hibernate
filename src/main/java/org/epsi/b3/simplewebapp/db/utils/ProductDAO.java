package org.epsi.b3.simplewebapp.db.utils;

import org.epsi.b3.simplewebapp.products.Product;

import java.util.List;

public interface ProductDAO {
	
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);
	List<Product> list();
	Product findProduct(String code);
}
