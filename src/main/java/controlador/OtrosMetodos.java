/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import model.Usuarios;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class OtrosMetodos {
    public OtrosMetodos(){
        
    }

    /**
     * Método para comprobar que un mail tiene @ y al menos un punto tras el arroba
     * @param usuario
     * @return true si cumple las condiciones
     */
    public boolean mailSintaxis(Usuarios usuario){
            String email=usuario.getEmail();
            
            String[]partes=email.split("@");
            //Comprobar que hay arroba
            if(partes.length!=2) {
               return false;
            }
            
            //comprobar que la segunda parte tiene al menos un punto
            String[]segunda=partes[1].split("\\.");
            if(segunda.length<2){
                return false;
            }
            return true;
    }
}
