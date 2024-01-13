/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.password4j.Hash;
import com.password4j.Password;
import model.Usuarios;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class PasswordUtil {
    /**Constructor**/
    public PasswordUtil(){
        
    }
    
    /**Encriptar contraseña**/
    public void encriptar(Usuarios user)
    {
        Hash hash = Password.hash(user.getPassword())
                            //.addPepper("shared-secret")
                            .addRandomSalt(32)
                            .withArgon2();        
        
        user.setPassword(hash.getResult());
    }
}
