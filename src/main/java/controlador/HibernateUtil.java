/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory= buildSessionFactory();
	public static SessionFactory buildSessionFactory() {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml"); //ubicacion configuracion
            
		try {
			return new Configuration().configure().buildSessionFactory(new 
					StandardServiceRegistryBuilder().configure().build());
		}catch(Throwable ex) {
			System.err.println(ex);
		}
		return null;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
