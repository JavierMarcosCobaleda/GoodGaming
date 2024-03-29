/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.icons.FlatSearchIcon;
import controlador.HibernateUtil;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Usuarios;
import model.Videojuegos;

/**
 *
 * @author Javier Marcos Cobaleda
 */
public class PanelDeseos extends javax.swing.JPanel {
    private Usuarios usuario;
    DefaultTableModel model;
    int idJuego;
    /**
     * Creates new form PanelDeseos
     */
    public PanelDeseos(Usuarios usuario) {
        initComponents();
        this.usuario=usuario;
        

        /**
         * Definir la estética de los elementos
         */
        lblDeseos.setForeground(Color.BLACK);
        tfbuscarTitulo.putClientProperty( FlatClientProperties.TEXT_FIELD_LEADING_ICON,new FlatSearchIcon() );
        btnAgregarColeccion.setForeground(Color.BLACK);
        btnBuscar.setForeground(Color.BLACK);
        btnBuscarTodo.setForeground(Color.BLACK);
        tfbuscarTitulo.putClientProperty("FlatLaf.style","arc: 40");
        tfbuscarTitulo.setBackground(Color.WHITE);
        
        model = (DefaultTableModel) tablaDeseos.getModel();
        
        /**Cargamos la tabla**/
        rellenarTabla();
        
        
        /**
         * Hacer seleccionables los elementos de la tabla
         */
        tablaDeseos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tablaDeseos.getSelectedRow();

                    // Verificar si se ha seleccionado alguna fila
                    if (selectedRow != -1) {
                        //Obtener el objeto asociado a la fila seleccionada
                        //Object selectedObject = model.getDataVector().elementAt(selectedRow);
                        //Cogemos el id de la fila seleccionada
                        Object selectedObject = model.getValueAt(selectedRow, 0);
                        
                        //Lo convertimos a entero
                        idJuego=Integer.parseInt(selectedObject.toString());                      
                       
                    }
                }
            }
        });
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
        lblDeseos = new javax.swing.JLabel();
        panelRound2 = new vista.PanelRound();
        tfbuscarTitulo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBuscarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeseos = new javax.swing.JTable();
        btnAgregarColeccion = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        panelFondo.setBackground(new java.awt.Color(30, 30, 30));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(234, 164, 28));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        lblDeseos.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        lblDeseos.setText("LISTA DE DESEOS");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(lblDeseos)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblDeseos)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelFondo.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 519, 113));

        panelRound2.setBackground(new java.awt.Color(0, 0, 0));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        tfbuscarTitulo.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        tfbuscarTitulo.setForeground(new java.awt.Color(153, 153, 153));
        tfbuscarTitulo.setText("Buscar por título");
        tfbuscarTitulo.setToolTipText("Introduce el título del juego que deseas buscar");
        tfbuscarTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfbuscarTituloMousePressed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(234, 164, 28));
        btnBuscar.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setToolTipText("Muestra un juego por su título");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscarTodo.setBackground(new java.awt.Color(234, 164, 28));
        btnBuscarTodo.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnBuscarTodo.setText("MOSTAR TODO");
        btnBuscarTodo.setToolTipText("Muestra todos los juegos de Nintendo");
        btnBuscarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfbuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelRound2Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)
                            .addComponent(btnBuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(tfbuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        panelFondo.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 520, 160));

        tablaDeseos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Género", "Fecha Salida", "Consola", "Edición", "Valoración"
            }
        ));
        tablaDeseos.setToolTipText("Colección Nintendo");
        tablaDeseos.setGridColor(new java.awt.Color(70, 69, 68));
        jScrollPane1.setViewportView(tablaDeseos);

        panelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 330, 520, 310));

        btnAgregarColeccion.setBackground(new java.awt.Color(234, 164, 28));
        btnAgregarColeccion.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnAgregarColeccion.setText("<html><center>AGREGAR A<br>MI COLECCIÓN</center></html>");
        btnAgregarColeccion.setToolTipText("Añade el juego seleccionado a tu colección");
        btnAgregarColeccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarColeccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarColeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarColeccionActionPerformed(evt);
            }
        });
        panelFondo.add(btnAgregarColeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 134, 50));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Eras Medium ITC", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(234, 164, 28));
        btnEliminar.setText("<html><center>ELIMINAR<br>DE LA LISTA</center></html>");
        btnEliminar.setToolTipText("Elimina un juego de la lista de deseos");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 670, 134, 50));

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
    /**
     * Método para limpiar el texto del textfield buscar
     * @param evt 
     */
    private void tfbuscarTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfbuscarTituloMousePressed
        /**
        * Limpiar el texto al clickar
        */
        if(!tfbuscarTitulo.getText().isEmpty()){
            tfbuscarTitulo.setText("");
            tfbuscarTitulo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfbuscarTituloMousePressed
    /**
     * Método de funcionalidad del botón buscar
     * @param evt 
     */
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        /**
        * Si hay algo escrito en textfield que no sea el texto por defecto hacemos la búsqueda por título
        */
        if(!tfbuscarTitulo.getText().isEmpty() && !tfbuscarTitulo.getText().equals("Buscar por título")){
            //Vaciamos la tabla
            model.setRowCount(0);
            //Recorremos la lista de juegos nintendo
            for (int i=0; i<HibernateUtil.listarJuegosDeseados(usuario).size();i++){
                //si el título coincide con el introducido lo añadimos a la tabla
                if(HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getTitulo().equals(tfbuscarTitulo.getText())){
                    model.addRow(new Object[]{
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getId(),
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getTitulo(),
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getGenero(),
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getFechaSalida(),
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getConsola(),
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getEdicion(),
                        HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getValoracion()+1}
                    );

                }
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed
    /**
     * Método de funcionalidad del botón buscar todo
     * @param evt 
     */
    private void btnBuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodoActionPerformed
        /**
         * Llamaos al método rellenar tabla
         */
        rellenarTabla();
        
    }//GEN-LAST:event_btnBuscarTodoActionPerformed
    /**
     * Método de funcionalidad del botón agregar a colección
     * @param evt 
     */
    private void btnAgregarColeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarColeccionActionPerformed
        /**
         * Llamamos al método pasarDeseadoaColeccion para pasar el juego a la coleccion del usuario
         */
        if(HibernateUtil.pasarDeseadoaColeccion(usuario, idJuego)>0){
            JOptionPane.showMessageDialog(null, "Se ha añadido el juego a tu colección y ha sido eliminado de su lista de deseos\nPodrás verlo en tu colección la próxima vez que inicies el programa");
            /**
             * Actualizamos la tabla
             */
            rellenarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "ERROR,no se ha podido añadir el videojuego a su colección","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgregarColeccionActionPerformed
    /**
     * Método de funcionalidad del botón Eliminar
     * @param evt 
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /**
         * Llamamos al método eliminarDeseado para borrar el juego de la lista de deseos
         */
        if(HibernateUtil.eliminarDeseado(usuario, idJuego)>0){
            JOptionPane.showMessageDialog(null, "El juego ha sido eliminado de su lista de deseos");
            /**
             * Ofrecemos la opción al usuario de borrarlo también de la base de datos
             */
            confirmarBorradoTotal();
            /**
             * Actualizamos la tabla
             */
            rellenarTabla();
            
        }else{
            JOptionPane.showMessageDialog(null, "ERROR,no se ha podido eliminar el juego de tu lista de deseos","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarColeccion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarTodo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeseos;
    private javax.swing.JPanel panelFondo;
    private vista.PanelRound panelRound1;
    private vista.PanelRound panelRound2;
    private javax.swing.JTable tablaDeseos;
    private javax.swing.JTextField tfbuscarTitulo;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Método para mostrar ventana de diálogo y eliminar un juego de la base de datos
     */
    public void confirmarBorradoTotal(){
            int opcion = JOptionPane.showConfirmDialog( null,"¿Desea borrar también el juego completamente de la base de datos?","Confirmar Borrado Total",JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                /**
                 * Borramos el juego de la colección y de la base de datos
                 */
                if(HibernateUtil.borrarJuegoColeccion(idJuego)>0 && HibernateUtil.borrarJuego(idJuego)){
                    JOptionPane.showMessageDialog(null, "El videojuego ha sido eliminado completamente");
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR, No se ha podido elimiar el juego de la base de datos","Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la eliminación del juego");
            }
    }
    /**
     * Método para rellenar la tabla con todos los juegos deseados
     */
    public void rellenarTabla(){
        //Vaciamos la tabla
        model.setRowCount(0);
        /**
        * Mostramos todos los videojuegos de nintendo
        */
        for (int i=0; i<HibernateUtil.listarJuegosDeseados(usuario).size();i++){
            model.addRow(new Object[]{
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getId(),
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getTitulo(),
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getGenero(),
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getFechaSalida(),
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getConsola(),
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getEdicion(),
                HibernateUtil.listarJuegosDeseados(usuario).get(i).getVideojuegos().getValoracion()+1}
                );       
        }           
    }

}
