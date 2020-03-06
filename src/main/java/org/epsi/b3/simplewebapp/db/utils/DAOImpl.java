package org.epsi.b3.simplewebapp.db.utils;

import org.epsi.b3.simplewebapp.products.Product;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


public class DAOImpl implements ProductDAO{
	private SessionFactorySingleton sessionFactory;
	
	public DAOImpl(SessionFactorySingleton sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addProduct(Product product) {
		final Transaction transaction = sessionFactory.getSessionFactory().getCurrentSession().beginTransaction();
		
		try {
			sessionFactory.getSessionFactory().getCurrentSession().save(product);
			transaction.commit();
		} catch (RuntimeException e) {
			transaction.rollback();
		}
	}

	@Override
	public void updateProduct(Product product) {
		
		
	}

	@Override
	public void deleteProduct(Product product) {
		final Transaction transaction = sessionFactory.getSessionFactory().getCurrentSession().beginTransaction();

		try {
			sessionFactory.getSessionFactory().getCurrentSession().delete(product);
			transaction.commit();
		} catch (RuntimeException e) {
			transaction.rollback();
		}
		
	}

	@Override
	public List<Product> list() {
		final Transaction transaction = sessionFactory.getSessionFactory().getCurrentSession().beginTransaction();


		return null;
	}

	@Override
	public Product findProduct(String code) {
		
		return null;
	}

	
}
