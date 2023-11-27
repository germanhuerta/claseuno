package cl.duoc.cinehoytsmarkplanet;

import cl.duoc.cinehoytsmarkplanet.DAO.ConexionBD;
import cl.duoc.cinehoytsmarkplanet.View.viewAgregarPelicula;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class CineHoytsMarkPlanett extends javax.swing.JFrame {

   ConexionBD enlace = new ConexionBD();
   Connection conect = enlace.getConnection();
    
   
   public void probar_conexion(){
   if(conect == null){
       JOptionPane.showMessageDialog(null, "No se logro conectar la base de datos");
       }
       
   }
   public CineHoytsMarkPlanett() {
        initComponents();
        probar_conexion();
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        Mnubarra = new javax.swing.JMenuBar();
        MnuHerramientas = new javax.swing.JMenu();
        MnuAgregar = new javax.swing.JMenuItem();
        MListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        MnuHerramientas.setText("Herramientas Cine");

        MnuAgregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MnuAgregar.setText("Agregar, Editar, Modificar y Eliminar Pelicula");
        MnuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuAgregarActionPerformed(evt);
            }
        });
        MnuHerramientas.add(MnuAgregar);

        MListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MListar.setText("Listar Peliculas");
        MListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MListarActionPerformed(evt);
            }
        });
        MnuHerramientas.add(MListar);

        Mnubarra.add(MnuHerramientas);

        setJMenuBar(Mnubarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuAgregarActionPerformed
        viewAgregarPelicula ventana = new viewAgregarPelicula();
        
        escritorio.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_MnuAgregarActionPerformed

    private void MListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MListarActionPerformed
        //era bait lo hicimos en la misma ventana de agregar pelicula :D
    }//GEN-LAST:event_MListarActionPerformed

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
            java.util.logging.Logger.getLogger(CineHoytsMarkPlanett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CineHoytsMarkPlanett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CineHoytsMarkPlanett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CineHoytsMarkPlanett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CineHoytsMarkPlanett().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MListar;
    private javax.swing.JMenuItem MnuAgregar;
    private javax.swing.JMenu MnuHerramientas;
    private javax.swing.JMenuBar Mnubarra;
    private javax.swing.JDesktopPane escritorio;
    // End of variables declaration//GEN-END:variables
}
