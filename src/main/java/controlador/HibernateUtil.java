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
import org.hibernate.ObjectNotFoundException;
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
    /**
     * Método para crear la conexión
     */
    public void conectar(){
        sesion=sessionFactory.openSession();
    }
        
    /**
     * Método para agregar un usuario a la base de datos 
     * @param usuario
     * @return booleano que confirma si se ha registrado correctamente
     */   
    public static boolean agregarUsuario(Usuarios usuario){
        //transacciones
	Transaction tx=sesion.beginTransaction();
                
        sesion.save(usuario);
		
        //ejecutamos la transacción
	tx.commit();
        
        if (tx==null){
            return false;
        }
        return true;       
    }
    
    /**Método select de usuario**/
    /**
     * Método para comprobar si hay un usuario registrado con un username concreto
     * @param usuario
     * @return lista de usuarios con el username
     */
    public static List<Usuarios> comprobarLogin(Usuarios usuario)throws IndexOutOfBoundsException{

        Query q=sesion.createQuery("FROM Usuarios WHERE username = :username");
        q.setParameter("username",usuario.getUsername());
        
        List <Usuarios> listaUsuarios=q.getResultList();
        
        return listaUsuarios;
    }
    
    /**Método select de email**/
    /**
     * Método para comprobar si el mail está registrado en la tabla usuarios
     * @param usuario
     * @return lista de usuarios con ese mail
     */
    public static List<Usuarios> comprobarCorreo(Usuarios usuario){

        Query q=sesion.createQuery("FROM Usuarios WHERE email = :email");
        q.setParameter("email",usuario.getEmail());
        
        List <Usuarios> listaUsuarios=q.getResultList();
        
        return listaUsuarios;
    }
    
    /**Método select de usuario y contraseña**/
    /**
     * Método para comprobar el mail de un usuario concreto
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
        
	//String sentencia= "update Usuarios set password= :pwd where username= :username";
	String sentencia= "update Usuarios set password= :pwd where email= :mail";		
	
        Query q=sesion.createQuery(sentencia);
	q.setParameter("pwd", usuario.getPassword());
	q.setParameter("mail", usuario.getEmail());
        
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
    /**
     * Método para insertar un juego en la colección de un usuario
     * @param v
     * @param u
     * @return boolean para confirmar si se ha insertado correctamente
     * @throws PropertyValueException 
     */
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
    /**
     * Método para añadir un juego en la lista de deseos del usuario
     * @param v
     * @param u
     * @return boleano para confirmar si se ha añadido el juego correctamente
     * @throws PropertyValueException 
     */
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
    /**
     * Método para obtener todos los juegos de una plataforma que posee el usuario
     * @param u
     * @param plataforma
     * @return lista con los juegos encontrados
     */
    public static List<Coleccion> listarJuegosPlataforma(Usuarios u, String plataforma){
       
    Query q = sesion.createQuery("SELECT c FROM Coleccion c JOIN c.videojuegos v WHERE c.usuarios.id = :uid AND v.plataforma = :plataforma AND poseido=true");
    q.setParameter("uid", u.getId());
    q.setParameter("plataforma", plataforma);

    List<Coleccion> listaColeccion = q.getResultList();

    return listaColeccion;
        
    }
    /**
     * Método para obtener los juegos de la lista de deseos de un usuario
     * @param u
     * @return Lista con todos los juegos de la lista de deseos
     */
    public static List<Coleccion> listarJuegosDeseados(Usuarios u){
       
    Query q = sesion.createQuery("SELECT c FROM Coleccion c JOIN c.videojuegos v WHERE c.usuarios.id = :uid AND deseado=true");
    q.setParameter("uid", u.getId());
    

    List<Coleccion> listaColeccion = q.getResultList();

    return listaColeccion;
        
    }
    /**
     * Método para obtener la colección de juegos de un usuario
     * @param u
     * @return lista con todos los juegos de la colección
     */
    public static List<Coleccion> obtenerColeccion(Usuarios u){
        Query q=sesion.createQuery("FROM Coleccion where id_usuario=:uid");
        //q.setParameter("plataforma",plataforma);
        q.setParameter("uid",u.getId());
        
        List <Coleccion> listaColeccion=q.getResultList();
        
        return listaColeccion;
    }
    /**
     * Método para cambiar un juego de la lista de deseos a la colección del usuario
     * @param u
     * @param idJuego
     * @return int con el número de filas afectadas
     */
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
    /**
     * Método para eliminar un juego de la lista de deseos de un usuario
     * @param u
     * @param idJuego
     * @return 
     */
    public static int eliminarDeseado(Usuarios u, int idJuego){
   
        Transaction tx=sesion.beginTransaction();
        
        String sql="UPDATE Coleccion SET deseado = false WHERE usuarios.id = :idUsuario AND videojuegos.id = :idJuego";
        Query q=sesion.createQuery(sql);
        q.setParameter("idUsuario", u.getId());
        q.setParameter("idJuego", idJuego);
        
        int filasAfectadas=q.executeUpdate();
        
        tx.commit();
        
        return filasAfectadas;
    }
    
    /**
     * Método para borrar un juego de la base de datos
     * @param idJuego
     * @return boolean que indica si se ha borrado o no
     */
    public static boolean borrarJuego(int idJuego){
        Transaction tx=sesion.beginTransaction();
        /**
         * Cargamos el juego mediante su id
         */
        Videojuegos juegoBorrar=(Videojuegos)sesion.load(Videojuegos.class,idJuego);
        /**
         * Borramos el juego
         */
        sesion.delete(juegoBorrar);
       
        tx.commit();
        if(juegoBorrar!=null){
            return true;
        }else{
            return true;
        }
    }
    /**
     * Método para borrar un juego de la colección
     * @param idJuego
     * @return int con el número de filas afectadas por la consulta
     */
    public static int borrarJuegoColeccion(int idJuego){
        Transaction tx=sesion.beginTransaction();
        
        Query q= sesion.createQuery("DELETE FROM Coleccion WHERE id_juego = :juegoId");
        q.setParameter("juegoId", idJuego);
        
        int filasAfectadas=q.executeUpdate();
       
        tx.commit();
        return filasAfectadas;
    }
    
    public static boolean modificarJuego(int idJuego, Videojuegos v){
        Transaction tx=sesion.beginTransaction();
        /**
         * Cargamos el juego
         */
        Videojuegos juegoModificar=(Videojuegos)sesion.load(Videojuegos.class,idJuego);
        /**
         * Modificamos los datos
         */
        juegoModificar.setTitulo(v.getTitulo());
        juegoModificar.setGenero(v.getGenero());
        juegoModificar.setPlataforma(v.getPlataforma());
        juegoModificar.setConsola(v.getConsola());
        juegoModificar.setFechaSalida(v.getFechaSalida());
        juegoModificar.setEdicion(v.getEdicion());
        juegoModificar.setValoracion(v.getValoracion());

        //Actualizamos el videojuego en la base de datos
        sesion.update(juegoModificar);
        
        tx.commit();
        if(juegoModificar!=null){
            return true;
        }else{
            return false;
        }
    }
    
    public static Videojuegos datosJuego (int id){
        Videojuegos v=null;
        try{
            v=(Videojuegos)sesion.get(Videojuegos.class,(int)id);
        }catch(ObjectNotFoundException e){
            v=null;
            return v;
        }
        return v;
    }
}
