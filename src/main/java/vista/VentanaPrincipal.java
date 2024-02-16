/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import model.Usuarios;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Variables para mover la ventana
     */
    int xMouse,yMouse;
    
    static Usuarios usuario;
    /**
     * Constructor
     * @param usuario 
     */
    public VentanaPrincipal(Usuarios usuario) {
        initComponents();
        //Iniciar en el centro de la pantalla
        setLocationRelativeTo(null);        
        
        /**
         * Recibir el usuario
         */
        this.usuario=usuario;
        //Cambiar el color de los textos de los botones
        btnRegistrar.setForeground(Color.BLACK);
        btnGestionar.setForeground(Color.BLACK);
        btnColeccion.setForeground(Color.BLACK);
        btnDeseos.setForeground(Color.BLACK);
        
        lblsuario.setText(usuario.getUsername());
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnGestionar = new javax.swing.JButton();
        btnColeccion = new javax.swing.JButton();
        btnDeseos = new javax.swing.JButton();
        panelSuperior = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xCerrar = new javax.swing.JLabel();
        lblsuario = new javax.swing.JLabel();
        panelVentanas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelFondo.setBackground(new java.awt.Color(30, 30, 30));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLateral.setBackground(new java.awt.Color(0, 0, 0));
        panelLateral.setPreferredSize(new java.awt.Dimension(276, 960));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoGGpeque.png"))); // NOI18N
        jLabel2.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GOOD GAMING.png"))); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(113, 111, 108));
        btnRegistrar.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        btnRegistrar.setText("REGISTRAR JUEGO");
        btnRegistrar.setToolTipText("Registra un juego en tu colección o en tu lista de deseos");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnGestionar.setBackground(new java.awt.Color(113, 111, 108));
        btnGestionar.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        btnGestionar.setText("GESTIONAR JUEGOS");
        btnGestionar.setToolTipText("Modifica los datos de un juego o elimínalo por completo");
        btnGestionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });

        btnColeccion.setBackground(new java.awt.Color(113, 111, 108));
        btnColeccion.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        btnColeccion.setText("MI COLECCIÓN");
        btnColeccion.setToolTipText("Consulta los juegos de tu colección");
        btnColeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColeccionActionPerformed(evt);
            }
        });

        btnDeseos.setBackground(new java.awt.Color(113, 111, 108));
        btnDeseos.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        btnDeseos.setText("LISTA DE DESEOS");
        btnDeseos.setToolTipText("Consulta los juegos de tu lista de deseos");
        btnDeseos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeseos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeseosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLateralLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnColeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeseos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(151, 151, 151)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnDeseos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        panelFondo.add(panelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 276, 960));

        panelSuperior.setBackground(new java.awt.Color(113, 111, 108));
        panelSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        panelSuperior.setPreferredSize(new java.awt.Dimension(1440, 87));
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUsuario.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USUARIO");

        xCerrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        xCerrar.setForeground(new java.awt.Color(255, 255, 255));
        xCerrar.setText("x");
        xCerrar.setToolTipText("Salir del programa");
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

        lblsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblsuario.setText("jLabel6");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel4)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xCerrar)
                        .addGap(14, 14, 14))
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsuario)
                            .addComponent(jLabel5))
                        .addContainerGap(795, Short.MAX_VALUE))))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsuario))
                    .addComponent(jLabel4))
                .addGap(19, 19, 19))
        );

        panelFondo.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 87));

        panelVentanas.setBackground(new java.awt.Color(30, 30, 30));
        panelVentanas.setPreferredSize(new java.awt.Dimension(950, 432));
        panelVentanas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido a Good Gaming");
        panelVentanas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        panelFondo.add(panelVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 950, 810));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método para cerrar la ventana
     * @param evt 
     */
    private void xCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseClicked
        //Cerrar ventana
        System.exit(0);
    }//GEN-LAST:event_xCerrarMouseClicked
    /**
     * Método para cambiar el color al entrar en la x con el ratón
     * @param evt 
     */
    private void xCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseEntered
        //Cambiar color al entrar
        xCerrar.setForeground(new Color(244,150,40));
    }//GEN-LAST:event_xCerrarMouseEntered
    /**
     * Método para cambiar el color de la x al salir con el ratón
     * @param evt 
     */
    private void xCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMouseExited
        //Cambiar a blanco al salir
        xCerrar.setForeground(Color.white);
    }//GEN-LAST:event_xCerrarMouseExited
    /**
     * Método para cambiar el color de la x cuando se haga click en él
     * @param evt 
     */
    private void xCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xCerrarMousePressed
        //Cambiar color al pulsar
        xCerrar.setForeground(Color.red);
    }//GEN-LAST:event_xCerrarMousePressed
    /**
     * Método de funcionalidad del botón registrar
     * @param evt 
     */
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        /**
         *  Mostramos el panel de registrar juegos
         */
        PanelRegistrar preg=new PanelRegistrar(usuario);
        mostrarPanel(preg);
        
        /**
         * cambiamos los colores de los botones de la barra lateral
         */
        btnRegistrar.setBackground(new Color(234,164,28));
        btnGestionar.setBackground(new Color(113,111,108));
        btnColeccion.setBackground(new Color(113,111,108));
        btnDeseos.setBackground(new Color(113,111,108));
    }//GEN-LAST:event_btnRegistrarActionPerformed
    /**
     * Método para dar funcionalidad al botón deseos
     * @param evt 
     */
    private void btnDeseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeseosActionPerformed
        /**
         * Mostramos el paner de la lista de deseos
         */
        PanelDeseos deseos=new PanelDeseos(usuario);
        mostrarPanel(deseos);
        
        /**
         * cambiamos los colores de los botones de la barra lateral
         */
        btnRegistrar.setBackground(new Color(113,111,108));
        btnGestionar.setBackground(new Color(113,111,108));
        btnColeccion.setBackground(new Color(113,111,108));
        btnDeseos.setBackground(new Color(234,164,28));
    }//GEN-LAST:event_btnDeseosActionPerformed
    /**
     * Método para mover la ventana
     * @param evt 
     */
    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        // Mover la ventana
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged
    /**
     * Método para obtener las coordenadas de la ventana
     * @param evt 
     */
    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        // Obtener x e y para mover la ventana
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed
    /**
     * Método para dar funcionalidad al botón Gestionar
     * @param evt 
     */
    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        /**
         *  Mostramos el panel de registrar juegos
         */
        PanelGestionar pges=new PanelGestionar(usuario);
        mostrarPanel(pges);
        
        //cambiamos los colores de los botones de la barra lateral
        btnRegistrar.setBackground(new Color(113,111,108));
        btnGestionar.setBackground(new Color(234,164,28));
        btnColeccion.setBackground(new Color(113,111,108));
        btnDeseos.setBackground(new Color(113,111,108));
    }//GEN-LAST:event_btnGestionarActionPerformed
    /**
     * Método para dar funcionalidad al botón colección
     * @param evt 
     */
    private void btnColeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColeccionActionPerformed
        /**
         *  Mostramos el panel de registrar juegos
         */
        PanelColeccion pcol=new PanelColeccion(usuario);
        mostrarPanel(pcol);
        
        //cambiamos los colores de los botones de la barra lateral
        btnRegistrar.setBackground(new Color(113,111,108));
        btnGestionar.setBackground(new Color(113,111,108));
        btnColeccion.setBackground(new Color(234,164,28));
        btnDeseos.setBackground(new Color(113,111,108));
    }//GEN-LAST:event_btnColeccionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColeccion;
    private javax.swing.JButton btnDeseos;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblsuario;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelVentanas;
    private javax.swing.JLabel xCerrar;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para mostrar paneles
     * @param p 
     */
    public void mostrarPanel(JPanel p){
        p.setSize(1100,810);
        p.setLocation(0,0);   

        panelVentanas.removeAll();
        panelVentanas.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelVentanas.revalidate();
        panelVentanas.repaint();
    }
}
