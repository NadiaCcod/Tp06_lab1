/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import entidades.Producto;
import java.util.TreeSet;

/**
 *
 * @author sapat
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {
    private static TreeSet<Producto> productos;

    /**
     * Creates new form GestionDeProductos
     */
    public GestionDeProductos() {
        initComponents();
        this.productos=productos;
        //llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jtDescripcion = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcRubro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        jLabel2.setText("Código");

        jbNuevo.setForeground(new java.awt.Color(102, 153, 255));
        jbNuevo.setText("Nuevo");

        jbGuardar.setForeground(new java.awt.Color(102, 153, 255));
        jbGuardar.setText("Guardar");

        jLabel3.setText("Descripción");

        jbEliminar.setForeground(new java.awt.Color(102, 153, 255));
        jbEliminar.setText("Eliminar");

        jbSalir.setForeground(new java.awt.Color(255, 102, 102));
        jbSalir.setText("Salir");

        jLabel4.setText("Precio");

        jLabel5.setText("Rubro");

        jcRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestibles", "Limpieza", "Perfumeria" }));

        jLabel6.setText("Stock");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbNuevo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCodigo)
                                    .addComponent(jtDescripcion)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscar)))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       
        
    }//GEN-LAST:event_jbBuscarActionPerformed

//    private void llenarCombo(){
//        jcProducto.addItem(new Categoria(1, "Limpieza"));
//        jcProducto.addItem(new Categoria(2, "Comestibles"));
//        jcProducto.addItem(new Categoria(3, "Perfumeria") );
//    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcRubro;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
