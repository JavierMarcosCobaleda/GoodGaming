/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controlador.HibernateUtil;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import model.Usuarios;


/**
 *
 * @author Javier Marcos Cobaleda
 */
public class PanelColeccion extends javax.swing.JPanel {
    private Usuarios usuario;
    /**
     * Creates new form PanelColeccion
     */
    public PanelColeccion(Usuarios usuario) {
        initComponents();
        this.usuario=usuario;
        lblColeccion.setForeground(Color.BLACK);
        /*tfbuscarN.putClientProperty( FlatClientProperties.TEXT_FIELD_LEADING_ICON,new FlatSearchIcon() );
        btnBuscar.setForeground(Color.BLACK);
        tfbuscarN.putClientProperty("FlatLaf.style","arc: 40");
        tfbuscarN.setBackground(Color.WHITE);*/
        
        /**
         * Añadir los paneles al tabbed pane
         */
        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/nintendo-1.svg"),new PanelNintendo(usuario) );       
        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/pslogo.svg"),new PanelPlayStation(usuario) );
        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/logoXbox.svg"),new PanelXbox(usuario) );
        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/pc.svg"),new PanelPC(usuario) );
        /**
         * Ajustar el tamaño de las pestañas
         */
        jTabbedPane1.putClientProperty("JTabbedPane.minimumTabWidth", 130);
        
        
        /*ImageIcon nintendo=new ImageIcon( "img/nintendo.png");
        
        jTabbedPane1.putClientProperty("JTabbedPane.minimumTabWidth", 130);
        
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        //jTabbedPane1.addTab("tab1", jPanel1);
        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/nintendo-1.svg"),jPanel1 );
        jTabbedPane1.putClientProperty("JTabbedPane.tabAreaAlignment", SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/pslogo.svg"), jPanel2);
        jTabbedPane1.putClientProperty("JTabbedPane.tabAreaAlignment", SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/logoXbox.svg"), jPanel3);

        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        
        jTabbedPane1.addTab(null,new FlatSVGIcon( "img/pc.svg"),jPanel4 );
        jTabbedPane1.putClientProperty("JTabbedPane.tabAreaAlignment", SwingConstants.CENTER);

        panelFondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 520, 600));
       */
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
        panelRound1 = new vista.PanelRound();
        lblColeccion = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        panelFondo.setBackground(new java.awt.Color(30, 30, 30));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(234, 164, 28));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        lblColeccion.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        lblColeccion.setText("MI COLECCIÓN");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(lblColeccion)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblColeccion)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelFondo.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 519, 113));
        panelFondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 520, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblColeccion;
    private javax.swing.JPanel panelFondo;
    private vista.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
