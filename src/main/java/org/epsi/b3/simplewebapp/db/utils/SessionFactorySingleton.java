package org.epsi.b3.simplewebapp.db.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactorySingleton {
	
	private static final SessionFactory myInstance = new Configuration().configure().buildSessionFactory();
	
	public static SessionFactory getSessionFactory() {
		return myInstance;
	}
//	pour l'appel on fait: SessionFactory factory = MySingleton.myIstance;
	
}
