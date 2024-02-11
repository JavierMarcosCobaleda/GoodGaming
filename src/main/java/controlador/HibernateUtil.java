/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import static javassist.CtMethod.ConstParameter.integer;
import javax.persistence.Query;
import model.Coleccion;
import model.ColeccionId;
import model.Usuarios;
import model.Videojuegos;
import org.hibernate.PropertyValueException;
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
    /**
     * 
     * @param usuario Objeto de la clase Usuarios
     * @return Una lista con los usuarios de la consulta
     */
    public static List<Usuarios> comprobarMail(Usuarios usuario){

        Query q=sesion.createQuery("FROM Usuarios WHERE username = :username AND email = :email");
        q.setParameter("username",usuario.getUsername());
        q.setParameter("email",usuario.getEmail());
        
        List <Usuarios> listaUsuarios=q.getResultList();
        
        return listaUsuarios;
    }
    

    

    /**
     * Método para modificar la contraseña de un usuario en la base de datos
     * @param usuario Objeto de la clase Usuarios
     * @return un entero con el numero de filas afectadas
     */
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
    /**
     * Método para insertar un videojuego en la base de datos
     * @param v Objeto Videojuegos
     * @return true si se ha insertado correctamente
     */
    public static boolean insertarJuego(Videojuegos v)throws PropertyValueException{
        Transaction tx=sesion.beginTransaction();       
        sesion.save(v);       
        tx.commit();
        if(sesion.save(v)!=null){
            return true;
        }else{
            return false;
        }       
    }
    
    public static boolean insertarColeccion(Videojuegos v, Usuarios u)throws PropertyValueException{
        
        /**
         * LLamamos al método insertar juego, si es true añadir a la coleccion del usuario
         */
        if(HibernateUtil.insertarJuego(v)){
            Transaction tx=sesion.beginTransaction();
            
            if (u.getId() == null) {
                sesion.save(u);
            }
            Coleccion c=new Coleccion();
            //Claves primarias
            ColeccionId coleccionId = new ColeccionId();
            coleccionId.setIdJuego(v.getId());
            coleccionId.setIdUsuario(u.getId());
            //Asignar la clave primaria compuesta
            c.setId(coleccionId);
            
            c.setUsuarios(u);
            c.setVideojuegos(v);
            c.setDeseado(false);
            c.setPoseido(true);
            sesion.save(c);

            tx.commit();
            return true;
        }else{
            return false;
        }       
    }
    
    public static boolean insertarListaDeseos(Videojuegos v, Usuarios u)throws PropertyValueException{
        
        /**
         * LLamamos al método insertar juego, si es true añadir a la coleccion del usuario
         */
        if(HibernateUtil.insertarJuego(v)){
            Transaction tx=sesion.beginTransaction();
            
            if (u.getId() == null) {
                sesion.save(u);
            }
            Coleccion c=new Coleccion();
            //Claves primarias
            ColeccionId coleccionId = new ColeccionId();
            coleccionId.setIdJuego(v.getId());
            coleccionId.setIdUsuario(u.getId());
            //Asignar la clave primaria compuesta
            c.setId(coleccionId);
            
            c.setUsuarios(u);
            c.setVideojuegos(v);
            c.setDeseado(true);
            c.setPoseido(false);
            sesion.save(c);

            tx.commit();
            return true;
        }else{
            return false;
        }       
    }
    
    public static List<Coleccion> listarJuegosPlataforma(Usuarios u, String plataforma){
       
    Query q = sesion.createQuery("SELECT c FROM Coleccion c JOIN c.videojuegos v WHERE c.usuarios.id = :uid AND v.plataforma = :plataforma AND poseido=true");
    q.setParameter("uid", u.getId());
    q.setParameter("plataforma", plataforma);

    List<Coleccion> listaColeccion = q.getResultList();

    return listaColeccion;
        
    }
    
    public static List<Coleccion> listarJuegosDeseados(Usuarios u){
       
    Query q = sesion.createQuery("SELECT c FROM Coleccion c JOIN c.videojuegos v WHERE c.usuarios.id = :uid AND deseado=true");
    q.setParameter("uid", u.getId());
    

    List<Coleccion> listaColeccion = q.getResultList();

    return listaColeccion;
        
    }
    
    public static List<Coleccion> obtenerColeccion(Usuarios u){
        Query q=sesion.createQuery("FROM Coleccion where id_usuario=:uid");
        //q.setParameter("plataforma",plataforma);
        q.setParameter("uid",u.getId());
        
        List <Coleccion> listaColeccion=q.getResultList();
        
        return listaColeccion;
    }
    
    public static int pasarDeseadoaColeccion(Usuarios u, int idJuego){
   
        Transaction tx=sesion.beginTransaction();
        
        String sql="UPDATE Coleccion SET poseido = true, deseado = false WHERE usuarios.id = :idUsuario AND videojuegos.id = :idJuego";
        Query q=sesion.createQuery(sql);
        q.setParameter("idUsuario", u.getId());
        q.setParameter("idJuego", idJuego);
        
        int filasAfectadas=q.executeUpdate();
        
        tx.commit();
        
        return filasAfectadas;
    }
}
