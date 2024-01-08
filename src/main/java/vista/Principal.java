/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import controlador.HibernateUtil;
import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;



/**
 *
 * @author Javier Marcos Cobaleda
 */
public class Principal {

    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		
        Session sesion=sessionFactory.openSession();
		
	//transacciones
	Transaction tx=sesion.beginTransaction();
		
	Usuarios usuario=new Usuarios();
	usuario.setUsername("admin");
	usuario.setPassword("lonchas");
        usuario.setEmail("lonchassahcnol@hotmail.com");
                
        sesion.save(usuario);
		
        //ejecutamos la transacción
	tx.commit();

        sesion.close();
	}
    }
