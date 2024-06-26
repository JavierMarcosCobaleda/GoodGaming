/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Date;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import model.Usuarios;

/**
 * Clase controladora de envio de emails
 * @author Javier Marcos Cobaleda
 */
public class EmailUtil {
    /**
     * Metodo para enviar emails
     * @param session sesion
     * @param toEmail email al que se va a enviar el mensaje, tipo String
     * @param subject quien envia el mensaje, tipo String
     * @param body mensaje, tipo String
     */
    public static void sendEmail(Session session,String toEmail,String subject,String body){
            try{
                MimeMessage msg=new MimeMessage(session);
                msg.addHeader("Content-type", "text/HTML; charset-UTF-8");
                msg.addHeader("format", "flowed");
                msg.addHeader("Content-Transfer-Encoding", "8bit");
                msg.setFrom(new InternetAddress("jamacoaudiovisual@gmail.com", "NoReply-GoodGaming"));
                msg.setReplyTo(InternetAddress.parse("jamacoaudiovisual@gmail.com", false));
                msg.setSubject(subject, "UTF-8");
                msg.setText(body, "UTF-8");
                msg.setSentDate(new Date());
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
                System.out.println("Message is ready");
                Transport.send(msg);
                System.out.println("Email sent succesfully");
                
                
            }catch(Exception e) {
                e.printStackTrace();
            }
    }    
    
}
