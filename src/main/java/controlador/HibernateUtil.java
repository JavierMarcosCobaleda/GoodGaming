/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class HibernateUtil {
   
    //private static final SessionFactory sessionFactory= buildSessionFactory();
    
    private static SessionFactory sessionFactory;
    private static Session sesion=null;
    
    public HibernateUtil(){
        sessionFactory= buildSessionFactory();
              
    }
    
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
    
    public void conectar(){
        sesion=sessionFactory.openSession();
    }
        
    /**Método para agregar un usuario a la base de datos**/    
    public static boolean agregarUsuario(Usuarios usuario){
        //transacciones
	Transaction tx=sesion.beginTransaction();
		
	//Usuarios usuario=new Usuarios();
	/*usuario.setUsername("admin");
	usuario.setPassword("lonchas");
        usuario.setEmail("lonchassahcnol@hotmail.com");*/
                
        sesion.save(usuario);
		
        //ejecutamos la transacción
	tx.commit();
        
        if (tx==null){
            return false;
        }
        return true;       
    }
    
    /**Método select de usuario**/
    public static List<Usuarios> comprobarLogin(Usuarios usuario){

        Query q=sesion.createQuery("FROM Usuarios WHERE username = :username");
        q.setParameter("username",usuario.getUsername());
        
        List <Usuarios> listaUsuarios=q.getResultList();
        
        return listaUsuarios;
    }
    
    /**Método select de email**/
    public static List<Usuarios> comprobarCorreo(Usuarios usuario){

        Query q=sesion.createQuery("FROM Usuarios WHERE email = :email");
        q.setParameter("email",usuario.getEmail());
        
        List <Usuarios> listaUsuarios=q.getResultList();
        
        return listaUsuarios;
    }
    
    /**Método select de usuario y contraseña**/
    public static List<Usuarios> comprobarMail(Usuarios usuario){

        Query q=sesion.createQuery("FROM Usuarios WHERE username = :username AND email = :email");
        q.setParameter("username",usuario.getUsername());
        q.setParameter("email",usuario.getEmail());
        
        List <Usuarios> listaUsuarios=q.getResultList();
        
        return listaUsuarios;
    }
    
    /**Método para modificar Contraseña**/
    public int modificarPassword (Usuarios usuario){
        Transaction tx=sesion.beginTransaction();
			
	String sentencia= "update Usuarios set password= :pwd where username= :username";
			
	Query q=sesion.createQuery(sentencia);
	q.setParameter("pwd", usuario.getPassword());
	q.setParameter("username", usuario.getUsername());
        
        int filasAfectadas=q.executeUpdate();
        
        tx.commit();
        
        return filasAfectadas;
        
    }
}
