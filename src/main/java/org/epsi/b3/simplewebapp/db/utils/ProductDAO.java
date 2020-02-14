package org.epsi.b3.simplewebapp.db.utils;

import org.epsi.b3.simplewebapp.products.Product;

public interface ProductDAO {
	
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);
	Iterable<Product> list();
	Product findProduct(String code);
}
