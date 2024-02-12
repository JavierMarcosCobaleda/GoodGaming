/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.password4j.Hash;
import com.password4j.Password;
import java.util.Random;
import model.Usuarios;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class PasswordUtil {

    /**
     * Constructor
     */
    public PasswordUtil(){
        
    }
    
    /**
     * Encriptar contraseña
     * @param user usuario
     */
    public void encriptar(Usuarios user)
    {
        Hash hash = Password.hash(user.getPassword())
                            //.addPepper("shared-secret")
                            .addRandomSalt(32)
                            .withArgon2();        
        
        user.setPassword(hash.getResult());
    }    

    /**
     * Método desencriptar contraseña
     * @param usuario usuario sin hashear
     * @param user usuario hasheado
     * @return true sin coinciden
     */
    public boolean desencriptar(Usuarios usuario,Usuarios user){
        return Password.check(usuario.getPassword(), user.getPassword()).withArgon2();
    }
    
    /**
     * Método para generar un código de recuperación
     * @return el código aleatorio
     */
    public String generarCodigo() {
        //array de caracteres con letras mayúsculas, minúsculas y símbolos
        char[] caracteres = new char[93];

        for (int i=0; i<caracteres.length; i++) {
            caracteres[i] = (char)(33+i);
        }
        
        //Crear la cadena aleatoria
        Random rand = new Random();
        StringBuffer codigo = new StringBuffer();

        for (int i=0; i < 8; i++) {
            int caracter = rand.nextInt(caracteres.length);
            codigo.append(caracteres[caracter]);
        }

        return codigo.toString();
    }
}
