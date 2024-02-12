/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controlador.HibernateUtil;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Usuarios;
import model.Videojuegos;


/**
 *
 * @author Javier Marcos Cobaleda
 */
public class PanelPlayStation extends javax.swing.JPanel {
    private Usuarios usuario;
    DefaultTableModel model;
    /**
     * Creates new form PanelPlayStation
     */
    public PanelPlayStation(Usuarios usuario) {
        initComponents();
        this.usuario=usuario;
        
        
        tfbuscarN.putClientProperty( FlatClientProperties.TEXT_FIELD_LEADING_ICON,new FlatSearchIcon() );
        btnBuscar.setForeground(Color.BLACK);
        btnBuscarTodo.setForeground(Color.BLACK);
        tfbuscarN.putClientProperty("FlatLaf.style","arc: 40");
        tfbuscarN.setBackground(Color.WHITE);
        
        //Cargamos la lista de Videjuegos de PlayStation
        model = (DefaultTableModel) tablaPlayStation.getModel();
        
        /**
         * Listamos los juegos de PlayStation llamando al método listarJuegosPlataforma
         */
        for(int i=0;i<HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").size();i++){
            /**
             * Si el juego aparece como poseído lo insertamos en la tabla
             */
            if(HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getPoseido()==true){
                model.addRow(new Object[]{
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getId(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getTitulo(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getGenero(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getFechaSalida(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getConsola(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getEdicion(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getValoracion()+1} 
                );
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPlayStation = new javax.swing.JTable();
        tfbuscarN = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBuscarTodo = new javax.swing.JButton();

        tablaPlayStation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Género", "Fecha Salida", "Consola", "Edición", "Valoración"
            }
        ));
        tablaPlayStation.setToolTipText("Colección PlayStation");
        tablaPlayStation.setGridColor(new java.awt.Color(70, 69, 68));
        jScrollPane1.setViewportView(tablaPlayStation);

        tfbuscarN.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        tfbuscarN.setForeground(new java.awt.Color(153, 153, 153));
        tfbuscarN.setText("Buscar por título");
        tfbuscarN.setToolTipText("Introduce el título del juego que deseas buscar");
        tfbuscarN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfbuscarNMousePressed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(234, 164, 28));
        btnBuscar.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setToolTipText("Muestra un juego por su título");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscarTodo.setBackground(new java.awt.Color(234, 164, 28));
        btnBuscarTodo.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnBuscarTodo.setText("MOSTAR TODO");
        btnBuscarTodo.setToolTipText("Muestra todos los juegos de PlayStation");
        btnBuscarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfbuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnBuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(tfbuscarN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfbuscarNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfbuscarNMousePressed
        /**
        * Limpiar el texto al clickar
        */
        if(!tfbuscarN.getText().isEmpty()){
            tfbuscarN.setText("");
            tfbuscarN.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfbuscarNMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        /**
        * Si hay algo escrito en textfield que no sea el texto por defecto hacemos la búsqueda por título
        */
        if(!tfbuscarN.getText().isEmpty() && !tfbuscarN.getText().equals("Buscar por título")){
            //Vaciamos la tabla
            model.setRowCount(0);
            //Recorremos la lista de juegos nintendo           
            for (int i=0; i<HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").size();i++){
                //si el título coincide con el introducido y aparece como poseido lo añadimos a la tabla
                if(HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getTitulo().equals(tfbuscarN.getText()) && 
                   HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getPoseido()==true){
                    model.addRow(new Object[]{
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getId(),
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getTitulo(),
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getGenero(),
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getFechaSalida(),
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getConsola(),
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getEdicion(),
                        HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getValoracion()+1} 
                    );
                    
                }
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodoActionPerformed
        
        //Vaciamos la tabla
        model.setRowCount(0);
        /**
         * Mostramos todos los videojuegos de nintendo
         */
        for(int i=0;i<HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").size();i++){
            if(HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getPoseido()==true){
                model.addRow(new Object[]{
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getId(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getTitulo(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getGenero(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getFechaSalida(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getConsola(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getEdicion(),
                    HibernateUtil.listarJuegosPlataforma(usuario,"PlayStation").get(i).getVideojuegos().getValoracion()+1} 
                );
            }
        }
    }//GEN-LAST:event_btnBuscarTodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarTodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPlayStation;
    private javax.swing.JTextField tfbuscarN;
    // End of variables declaration//GEN-END:variables
}
