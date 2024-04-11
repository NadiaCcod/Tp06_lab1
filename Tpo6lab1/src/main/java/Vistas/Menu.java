/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.util.TreeSet;

/**
 *
 * @author sapat
 */
import entidades.Producto;

public class Menu extends javax.swing.JFrame {

    private static TreeSet<Producto> productos = new TreeSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProductos = new javax.swing.JMenu();
        jmiProducto = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiPorRubro = new javax.swing.JMenuItem();
        jmiPorNombre = new javax.swing.JMenuItem();
        jmiPorPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Gestión Productos"); // NOI18N

        jdEscritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jdEscritorio.setForeground(new java.awt.Color(153, 153, 255));
        jdEscritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jdEscritorio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jdEscritorio.setPreferredSize(new java.awt.Dimension(500, 450));

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jMenuBar1.setRequestFocusEnabled(false);

        jmProductos.setText("Administracion");
        jmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProductosActionPerformed(evt);
            }
        });

        jmiProducto.setText("Productos");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jmProductos.add(jmiProducto);

        jMenuBar1.add(jmProductos);

        jmConsultas.setText("Consultas");

        jmiPorRubro.setText("Por Rubro");
        jmiPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPorRubroActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPorRubro);

        jmiPorNombre.setText("Por Nombre");
        jmConsultas.add(jmiPorNombre);

        jmiPorPrecio.setText("Por Precio");
        jmConsultas.add(jmiPorPrecio);

        jMenuBar1.add(jmConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPorRubroActionPerformed
        // TODO add your handling code here:jdEscritorio.removeAll();


    }//GEN-LAST:event_jmiPorRubroActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();

        GestionDeProductos gp = new GestionDeProductos();
        gp.setVisible(true);
        jdEscritorio.add(gp);
        jdEscritorio.moveToFront(gp);
    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProductosActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jmProductosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenuItem jmiPorNombre;
    private javax.swing.JMenuItem jmiPorPrecio;
    private javax.swing.JMenuItem jmiPorRubro;
    private javax.swing.JMenuItem jmiProducto;
    // End of variables declaration//GEN-END:variables
}
