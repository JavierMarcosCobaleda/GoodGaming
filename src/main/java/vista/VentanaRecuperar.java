/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.EmailUtil;
import controlador.HibernateUtil;
import controlador.PasswordUtil;
import java.awt.Color;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JOptionPane;
import model.Usuarios;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class VentanaRecuperar extends javax.swing.JFrame {

    //Variables para mover la ventana
    int xMouse,yMouse;
    //Variables de los controladores
    HibernateUtil hibernate;
    PasswordUtil pwdUtil;
    EmailUtil emailUtil;
    String codigo;
    Usuarios usuario;
   
    
    public VentanaRecuperar() {
        initComponents();
        btnEnvio.setForeground(Color.BLACK);
        btnActualizar.setForeground(Color.BLACK);
        
        //Establecer el botón por defecto
        getRootPane().setDefaultButton(btnEnvio);
        
        //alt+e para presionar el boton de enviar
        btnEnvio.setMnemonic('e');
        //alt+a para presionar el boton de actualizar contraseña
        btnActualizar.setMnemonic('a');
        
        //Conecta a la base de datos
        try{
            hibernate=new HibernateUtil();
            hibernate.conectar();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "ERROR, No se ha podido conectar con la base de datos","Error", JOptionPane.ERROR_MESSAGE);
        }
        pwdUtil=new PasswordUtil();
        emailUtil=new EmailUtil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelFondoGris = new javax.swing.JPanel();
        tfCorreoElectronico = new javax.swing.JTextField();
        btnEnvio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfRecUsuario = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPFActualizarPassword = new javax.swing.JPasswordField();
        btnActualizar = new javax.swing.JButton();
        xCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoGGpeque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));
        panelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelFondoMouseDragged(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFondoGris.setBackground(new java.awt.Color(37, 34, 28));
        panelFondoGris.setMinimumSize(new java.awt.Dimension(350, 519));
        panelFondoGris.setPreferredSize(new java.awt.Dimension(358, 519));

        tfCorreoElectronico.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        tfCorreoElectronico.setForeground(new java.awt.Color(153, 153, 153));
        tfCorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCorreoElectronico.setMinimumSize(new java.awt.Dimension(64, 22));
        tfCorreoElectronico.setPreferredSize(new java.awt.Dimension(257, 22));
        tfCorreoElectronico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCorreoElectronicoMousePressed(evt);
            }
        });
        tfCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoElectronicoActionPerformed(evt);
            }
        });

        btnEnvio.setBackground(new java.awt.Color(244, 150, 40));
        btnEnvio.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnEnvio.setText("Enviar Código");
        btnEnvio.setPreferredSize(new java.awt.Dimension(192, 40));
        btnEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo electrónico");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de usuario");

        tfRecUsuario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        tfRecUsuario.setForeground(new java.awt.Color(153, 153, 153));
        tfRecUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRecUsuario.setMinimumSize(new java.awt.Dimension(64, 22));
        tfRecUsuario.setPreferredSize(new java.awt.Dimension(257, 22));
        tfRecUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfRecUsuarioMousePressed(evt);
            }
        });
        tfRecUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRecUsuarioActionPerformed(evt);
            }
        });

        tfCodigo.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        tfCodigo.setForeground(new java.awt.Color(153, 153, 153));
        tfCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCodigo.setMinimumSize(new java.awt.Dimension(64, 22));
        tfCodigo.setPreferredSize(new java.awt.Dimension(257, 22));
        tfCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCodigoMousePressed(evt);
            }
        });
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código de activación");

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nueva contraseña");

        jPFActualizarPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPFActualizarPassword.setText("********");
        jPFActualizarPassword.setMinimumSize(new java.awt.Dimension(257, 22));
        jPFActualizarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPFActualizarPasswordMousePressed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(244, 150, 40));
        btnActualizar.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar Contraseña");
        btnActualizar.setPreferredSize(new java.awt.Dimension(192, 40));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoGrisLayout = new javax.swing.GroupLayout(panelFondoGris);
        panelFondoGris.setLayout(panelFondoGrisLayout);
        panelFondoGrisLayout.setHorizontalGroup(
            panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoGrisLayout.createSequentialGroup()
                .addGroup(panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4))
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfRecUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPFActualizarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoGrisLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        panelFondoGrisLayout.setVerticalGroup(
            panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoGrisLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfRecUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPFActualizarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelFondo.add(panelFondoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 377, 480));

        xCerrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        xCerrar.setForeground(new java.awt.Color(255, 255, 255));
        xCerrar.setText("x");
        xCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xCerrarMousePressed(evt);
            }
        });
        panelFondo.add(xCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 6, -1, 22));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><p>RECUPERAR</p><p>CONTRASEÑA</p></html>");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        logoGGpeque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoGGpeque.png"))); // NOI18N
        panelFondo.add(logoGGpeque, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 51, 140, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCorreoElectronicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoMousePressed
        //Quitar el texto Usuario al entrar
        if(tfCorreoElectronico.getText().equals("Usuario")){
            tfCorreoElectronico.setText("");
            tfCorreoElectronico.setForeground(Color.white);
        }
        //Si el password está vacío escribir los asteriscos en él
        /*if(String.valueOf(jPFRepetirPassword.getPassword()).isEmpty()){
            jPFRepetirPassword.setText("********");
            jPFRepetirPassword.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_tfCorreoElectronicoMousePressed

    private void tfCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoElectronicoActionPerformed

    private void btnEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvioActionPerformed
        
        if(tfRecUsuario.getText().isEmpty() || tfCorreoElectronico.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR, Debe rellenar los campos Usuario y Correo Electrónico","Error", JOptionPane.ERROR_MESSAGE);
        }else{
            //Comprobar email en la base de datos
            usuario=new Usuarios();
            usuario.setUsername(tfRecUsuario.getText());
            usuario.setEmail(tfCorreoElectronico.getText());

            try{

                if(hibernate.comprobarMail(usuario).get(0).getUsername().equals(tfRecUsuario.getText()) && hibernate.comprobarMail(usuario).get(0).getEmail().equals(tfCorreoElectronico.getText()) ){
                    //Generar código de recuperación
                    codigo=pwdUtil.generarCodigo();                 

                    //Enviar mail al usuario
                    //DESDE GMAIL
                    final String fromemail="jamacoaudiovisual@gmail.com";
                    final String password="dcccqdlewojbefei";
                    final String toemail=tfCorreoElectronico.getText();

                    System.out.println("SSLMail Start");
                    Properties props=new Properties();
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.user", fromemail);
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.ssl.protocols","TLSv1.2");

                    Authenticator auth = new Authenticator() {
                        //@Override
                        protected PasswordAuthentication getPasswordAuthentication() {

                            return new PasswordAuthentication(fromemail, password);
                        }
                    };

                    Session session = Session.getDefaultInstance(props, auth);
                    System.out.println("Session created");
                    EmailUtil.sendEmail(session, toemail, "Good Gaming password recovery", "Código de recuperación de contraseña:\n"+codigo);

                    JOptionPane.showMessageDialog(null, "Código enviado, revise su correo electrónico e introduzca el código para generar una nueva contraseña");



                }else{
                    JOptionPane.showMessageDialog(null, "ERROR, No se ha encontrado ningún usuario con ese correro electrónico","Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "ERROR, No se ha podido conectar con la base de datos","Error", JOptionPane.ERROR_MESSAGE);
            }catch(IndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "ERROR,El usuario no tiene registrado ese correo electrónico","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEnvioActionPerformed

    private void tfRecUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRecUsuarioMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfRecUsuarioMousePressed

    private void tfRecUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRecUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRecUsuarioActionPerformed

    private void xCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseClicked
        VentanaLogin ventanaLogin=new VentanaLogin();
        ventanaLogin.setVisible(true);
        //Cerrar ventana
        dispose();

    }//GEN-LAST:event_xCerrarMouseClicked

    private void xCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseEntered
        //Cambiar color al entrar
        xCerrar.setForeground(new Color(244,150,40));
    }//GEN-LAST:event_xCerrarMouseEntered

    private void xCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseExited
        //Cambiar a blanco al salir
        xCerrar.setForeground(Color.white);
    }//GEN-LAST:event_xCerrarMouseExited

    private void xCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMousePressed
        //Cambiar color al pulsar
        xCerrar.setForeground(Color.red);
    }//GEN-LAST:event_xCerrarMousePressed

    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
        // Mover la ventana
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_panelFondoMouseDragged

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        // Obtener x e y para mover la ventana
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed

    private void tfCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCodigoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoMousePressed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(String.valueOf(jPFActualizarPassword.getPassword()).equals("********") || String.valueOf(jPFActualizarPassword.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null, "ERROR, Intruduzca una contraseña","Error", JOptionPane.ERROR_MESSAGE);
        }else{

            //Comprobamos que el codigo insertado es igual al generado       
            if(tfCodigo.getText().equals(codigo)){

                usuario.setPassword(String.valueOf(jPFActualizarPassword.getPassword()));
                pwdUtil.encriptar(usuario);

                if(hibernate.modificarPassword(usuario)==1){
                    JOptionPane.showMessageDialog(null, "Contraseña cambiada con éxito");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR, No se ha podido cambiar la contraseña","Error", JOptionPane.ERROR_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(null, "ERROR, Código incorrecto","Error", JOptionPane.ERROR_MESSAGE);
            }
        }    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jPFActualizarPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPFActualizarPasswordMousePressed
        //vaciar el texto del password
        if(String.valueOf(jPFActualizarPassword.getPassword()).equals("********")){
            jPFActualizarPassword.setText("");
            jPFActualizarPassword.setForeground(Color.white);
        }
    }//GEN-LAST:event_jPFActualizarPasswordMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRecuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRecuperar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEnvio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPFActualizarPassword;
    private javax.swing.JLabel logoGGpeque;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondoGris;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCorreoElectronico;
    private javax.swing.JTextField tfRecUsuario;
    private javax.swing.JLabel xCerrar;
    // End of variables declaration//GEN-END:variables
}
