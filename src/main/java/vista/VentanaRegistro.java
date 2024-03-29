/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import controlador.HibernateUtil;
import controlador.OtrosMetodos;
import controlador.PasswordUtil;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class VentanaRegistro extends javax.swing.JFrame {


    /**
     * Variables enteras para mover la ventana
     */
    int xMouse,yMouse;
    HibernateUtil hibernate;
    OtrosMetodos metodos;
    /**
     * Constructor
     */
    public VentanaRegistro() {
        initComponents();
        
        //Iniciar en el centro de la pantalla
        setLocationRelativeTo(null);
        
        //Establecer el botón por defecto
        getRootPane().setDefaultButton(btnRegistro);
        
        //alt+r para presionar el boton de registrarse
        btnRegistro.setMnemonic('r');
        
        //Conectamos con la base de datos
        try{
            hibernate=new HibernateUtil();
            hibernate.conectar();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "ERROR, No se ha podido conectar con la base de datos","Error", JOptionPane.ERROR_MESSAGE);
        }      
        
        btnRegistro.setForeground(Color.BLACK);
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
        btnRegistro = new javax.swing.JButton();
        jPFRepetirPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPFRegPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        tfRegUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbLoggin = new javax.swing.JLabel();
        xCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoGGpeque = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        tfCorreoElectronico.setText("Correo electrónico");
        tfCorreoElectronico.setToolTipText("Introduce un correo electrónico que no haya sido registrado previamente");
        tfCorreoElectronico.setMinimumSize(new java.awt.Dimension(64, 22));
        tfCorreoElectronico.setPreferredSize(new java.awt.Dimension(257, 22));
        tfCorreoElectronico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfCorreoElectronicoMousePressed(evt);
            }
        });

        btnRegistro.setBackground(new java.awt.Color(244, 150, 40));
        btnRegistro.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnRegistro.setText("Registrarse");
        btnRegistro.setToolTipText("Registra un nuevo usuario");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setPreferredSize(new java.awt.Dimension(192, 40));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jPFRepetirPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPFRepetirPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPFRepetirPassword.setText("********");
        jPFRepetirPassword.setToolTipText("Repite la contraseña nuevamente");
        jPFRepetirPassword.setPreferredSize(new java.awt.Dimension(257, 54));
        jPFRepetirPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPFRepetirPasswordMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo electrónico");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de usuario");

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");

        jPFRegPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPFRegPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPFRegPassword.setText("********");
        jPFRegPassword.setToolTipText("Escribe la contraseña que deseas");
        jPFRegPassword.setPreferredSize(new java.awt.Dimension(257, 54));
        jPFRegPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPFRegPasswordMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Repetir contraseña");

        tfRegUsuario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        tfRegUsuario.setForeground(new java.awt.Color(153, 153, 153));
        tfRegUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRegUsuario.setText("Usuario");
        tfRegUsuario.setToolTipText("Introduce un nombre de usuario");
        tfRegUsuario.setMinimumSize(new java.awt.Dimension(64, 22));
        tfRegUsuario.setPreferredSize(new java.awt.Dimension(257, 22));
        tfRegUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfRegUsuarioMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(244, 150, 40));

        lbLoggin.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        lbLoggin.setForeground(new java.awt.Color(244, 150, 40));
        lbLoggin.setText("Loggin");
        lbLoggin.setToolTipText("Vuelve a la pantalla de loggin");
        lbLoggin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLoggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelFondoGrisLayout = new javax.swing.GroupLayout(panelFondoGris);
        panelFondoGris.setLayout(panelFondoGrisLayout);
        panelFondoGrisLayout.setHorizontalGroup(
            panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoGrisLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoGrisLayout.createSequentialGroup()
                        .addGroup(panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jPFRegPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jPFRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoGrisLayout.createSequentialGroup()
                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoGrisLayout.createSequentialGroup()
                        .addComponent(lbLoggin)
                        .addGap(118, 118, 118)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelFondoGrisLayout.setVerticalGroup(
            panelFondoGrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoGrisLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(tfRegUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(jPFRegPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jPFRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLoggin)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        panelFondo.add(panelFondoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 377, 480));

        xCerrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        xCerrar.setForeground(new java.awt.Color(255, 255, 255));
        xCerrar.setText("x");
        xCerrar.setToolTipText("Cierra la ventana y vuelve a la pantalla de loggin");
        xCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel1.setText("<html><p>REGISTRAR</p><p>USUARIO</p></html>");
        panelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        logoGGpeque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoGGpeque.png"))); // NOI18N
        panelFondo.add(logoGGpeque, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 51, 140, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método para vaciar el texto del correo electrónico
     * @param evt 
     */
    private void tfCorreoElectronicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoMousePressed
        //Quitar el texto Usuario al entrar
        if(tfCorreoElectronico.getText().equals("Correo electrónico")){
            tfCorreoElectronico.setText("");
            tfCorreoElectronico.setForeground(Color.white);
        }
        // Rellenar los demás campos
        if(tfRegUsuario.getText().isEmpty()){
            tfRegUsuario.setText("Usuario");
            tfRegUsuario.setForeground(Color.gray);
        }
        
        if(String.valueOf(jPFRegPassword.getPassword()).isEmpty()){
            jPFRegPassword.setText("********");
            jPFRegPassword.setForeground(Color.gray);
        }
        
        if(String.valueOf(jPFRepetirPassword.getPassword()).isEmpty()){
            jPFRepetirPassword.setText("********");
            jPFRepetirPassword.setForeground(Color.gray);
        }

    }//GEN-LAST:event_tfCorreoElectronicoMousePressed
    /**
     * Método para dar funcionalidad al botón de registro
     * @param evt 
     */
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        //Registrar nuevo usuario
               
        try{
            //si coincide la contraseña
            if(String.valueOf(jPFRegPassword.getPassword()).equals(String.valueOf(jPFRepetirPassword.getPassword()))){
                //Encriptar contraseña
                Usuarios usuario=new Usuarios();
                usuario.setUsername(tfRegUsuario.getText());
                usuario.setEmail(tfCorreoElectronico.getText());
 
                /**
                 * Comprobamos que no existe el nombre de usuario en la base de datos llamando al método comprobarLogin
                 */
                if(hibernate.comprobarLogin(usuario).size()>0){
                    JOptionPane.showMessageDialog(null, "ERROR, Ya existe un usuario con ese nombre","Error", JOptionPane.ERROR_MESSAGE);
                /**
                 * Comprobamos que no existe un correo igual en la base de datos llamando al método comprobarCorreo
                 */
                }else if (hibernate.comprobarCorreo(usuario).size()>0){
                    JOptionPane.showMessageDialog(null, "ERROR, Ya existe un usuario con ese correo electrónico","Error", JOptionPane.ERROR_MESSAGE);
                }else if (String.valueOf(jPFRegPassword.getPassword()).length()<8){
                    JOptionPane.showMessageDialog(null, "ERROR, La contraseña debe tener al menos 8 caracteres","Error", JOptionPane.ERROR_MESSAGE);
                }else{    
                    usuario.setPassword(String.valueOf(jPFRegPassword.getPassword()));
                    
                    metodos=new OtrosMetodos();
                    if(!metodos.mailSintaxis(usuario)){
                        JOptionPane.showMessageDialog(null, "ERROR, Correo electrónico mal escrito","Error", JOptionPane.ERROR_MESSAGE);
                    }else{

                        //Cambiamos la contraseña del usuario por la encriptada
                        PasswordUtil pwdUtil=new PasswordUtil();
                        pwdUtil.encriptar(usuario);


                        //Insertamos el usuario en la base de datos
                        if (hibernate.agregarUsuario(usuario)){
                            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null, "ERROR, no se ha podido registrar al usuario","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "ERROR, La contraseña no coincide","Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "ERROR, No se ha podido conectar con la base de datos","Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRegistroActionPerformed
    /**
     * Método para vaciar el texto del campo repetir password
     * @param evt 
     */
    private void jPFRepetirPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPFRepetirPasswordMousePressed
        //Quitar el texto al entrar por primera vez en password
        if(String.valueOf(jPFRepetirPassword.getPassword()).equals("********")){
            jPFRepetirPassword.setText("");
            jPFRepetirPassword.setForeground(Color.white);
        }

        // Rellenar los demás campos
        if(tfRegUsuario.getText().isEmpty()){
            tfRegUsuario.setText("Usuario");
            tfRegUsuario.setForeground(Color.gray);
        }
               
        if(String.valueOf(jPFRegPassword.getPassword()).isEmpty()){
            jPFRegPassword.setText("********");
            jPFRegPassword.setForeground(Color.gray);
        }
        
        if(tfCorreoElectronico.getText().equals("")){
            tfCorreoElectronico.setText("Correo electrónico");
            tfCorreoElectronico.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPFRepetirPasswordMousePressed
    /**
     * Método para cerrar la ventana y volver al loggin
     * @param evt 
     */
    private void xCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseClicked
        VentanaLogin ventanaLogin=new VentanaLogin();
        ventanaLogin.setVisible(true);
        //Cerrar ventana
        dispose();
        
    }//GEN-LAST:event_xCerrarMouseClicked
    /**
     * Método para cambiar el color de la X al entrar con el ratón
     * @param evt 
     */
    private void xCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseEntered
        //Cambiar color al entrar
        xCerrar.setForeground(new Color(244,150,40));
    }//GEN-LAST:event_xCerrarMouseEntered
    /**
     * Método para cambiar el color de la X al salir
     * @param evt 
     */
    private void xCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseExited
        //Cambiar a blanco al salir
        xCerrar.setForeground(Color.white);
    }//GEN-LAST:event_xCerrarMouseExited
    /**
     * Método para cambiar el color de la X al pulsar
     * @param evt 
     */
    private void xCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMousePressed
        //Cambiar color al pulsar
        xCerrar.setForeground(Color.red);
    }//GEN-LAST:event_xCerrarMousePressed
    /**
     * Método para mover la ventana
     * @param evt 
     */
    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
        // Mover la ventana
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_panelFondoMouseDragged
    /**
     * Método para obtener las coordenadas de la ventana
     * @param evt 
     */
    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        // Obtener x e y para mover la ventana
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed
    /**
     * Método para vaciar el campo password
     * @param evt 
     */
    private void jPFRegPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPFRegPasswordMousePressed
        // Vaciar el password por defecto
        if(String.valueOf(jPFRegPassword.getPassword()).equals("********")){
            jPFRegPassword.setText("");
            jPFRegPassword.setForeground(Color.white);
        }
        
        // Rellenar los demás campos
        if(tfRegUsuario.getText().equals("")){
            tfRegUsuario.setText("Usuario");
            tfRegUsuario.setForeground(Color.gray);
        }
               
        if(String.valueOf(jPFRepetirPassword.getPassword()).isEmpty()){
            jPFRepetirPassword.setText("********");
            jPFRepetirPassword.setForeground(Color.gray);
        }
        
        if(tfCorreoElectronico.getText().equals("")){
            tfCorreoElectronico.setText("Correo electrónico");
            tfCorreoElectronico.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPFRegPasswordMousePressed
    /**
     * Método para vaciar el texto del campo usuario
     * @param evt 
     */
    private void tfRegUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRegUsuarioMousePressed
        // Vaciar el texto Usuario
        if(tfRegUsuario.getText().equals("Usuario")){
            tfRegUsuario.setText("");
            tfRegUsuario.setForeground(Color.white);
        }
        
        // Rellenar los demás campos
        if(String.valueOf(jPFRegPassword.getPassword()).isEmpty()){
            jPFRegPassword.setText("********");
            jPFRegPassword.setForeground(Color.gray);
        }
        
        if(String.valueOf(jPFRepetirPassword.getPassword()).isEmpty()){
            jPFRepetirPassword.setText("********");
            jPFRepetirPassword.setForeground(Color.gray);
        }
        
        if(tfCorreoElectronico.getText().equals("")){
            tfCorreoElectronico.setText("Correo electrónico");
            tfCorreoElectronico.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tfRegUsuarioMousePressed
    /**
     * Método para volver al loggin
     * @param evt 
     */
    private void lbLogginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogginMouseClicked
        // TODO add your handling code here:
        VentanaLogin ventanaLogin=new VentanaLogin();
        ventanaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbLogginMouseClicked
    /**
     * Método para cambiar el color al entrar en el label loggin
     * @param evt 
     */
    private void lbLogginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogginMouseEntered
        // TODO add your handling code here:
        lbLoggin.setForeground(Color.white);
    }//GEN-LAST:event_lbLogginMouseEntered
    /**
     * Método para cambiar el color al salir del label loggin
     * @param evt 
     */
    private void lbLogginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogginMouseExited
        // TODO add your handling code here:
        lbLoggin.setForeground(new Color(244,150,40));
    }//GEN-LAST:event_lbLogginMouseExited

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
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPFRegPassword;
    private javax.swing.JPasswordField jPFRepetirPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLoggin;
    private javax.swing.JLabel logoGGpeque;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFondoGris;
    private javax.swing.JTextField tfCorreoElectronico;
    private javax.swing.JTextField tfRegUsuario;
    private javax.swing.JLabel xCerrar;
    // End of variables declaration//GEN-END:variables
}
