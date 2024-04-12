/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import entidades.Categoria;
import entidades.Producto;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sapat
 */
public class PorRubro extends javax.swing.JInternalFrame {
  private TreeSet<Producto> productos;
   private DefaultTableModel modeloTabla;

    public PorRubro(TreeSet<Producto> productos) {
        this.productos = productos;
        initComponents();
        llenarCombo();
        inicializarTabla();
       
    }

    private void inicializarTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Stock");
        jtTablaRubro.setModel(modeloTabla);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcListaRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaRubro = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Listado de Productos por Rubro");

        jLabel2.setText("Elija el Rubro");

        jcListaRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcListaRubroItemStateChanged(evt);
            }
        });

        jtTablaRubro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTablaRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcListaRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcListaRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void llenarCombo() {
        jcListaRubro.addItem(new Categoria(1, "Limpieza"));
        jcListaRubro.addItem(new Categoria(2, "Comestibles"));
        jcListaRubro.addItem(new Categoria(3, "Perfumeria"));
    }

    private void jcListaRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcListaRubroItemStateChanged
      borrarFilas();  
               
      for (Producto p : productos) {
            System.out.println("categoria" +p.getCategoria().getCodigo());
            System.out.println(jcListaRubro.getSelectedItem());
          if(p.getCategoria().getNombre().equalsIgnoreCase(jcListaRubro.getSelectedItem().toString())) {
                modeloTabla.addRow(new Object[]{
                    p.getCodigo(),
                    p.getDescripcion(),
                    p.getPrecio(),
                    p.getStock()

                });
         
            } 

        }
     
    }//GEN-LAST:event_jcListaRubroItemStateChanged
 private void borrarFilas() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jtTablaRubro.getModel();
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcListaRubro;
    private javax.swing.JTable jtTablaRubro;
    // End of variables declaration//GEN-END:variables
}
