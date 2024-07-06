/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
//import Clases.*;
import Clases.Funciones;
import Clases.ClaseResumen;
import Clases.HashTable;
import Clases.Autor;
import Clases.ListaAutor;
import Clases.ListaPC;
import Clases.ListaResumen;
import Clases.PalabraClave;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Indatech
 */
public class Menu extends javax.swing.JFrame {
      Fondo fondo = new Fondo();
       Funciones funcion = new Funciones();
       ClaseResumen resumen;
       HashTable tablas;
      
     
    /**
     * Creates new form Menu
     */
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CargarDataBotton = new javax.swing.JButton();
        MostrarInvestigacionBotton = new javax.swing.JButton();
        BuscarPCBotton = new javax.swing.JButton();
        BuscarAutorBotton = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CargarDataBotton.setBackground(new java.awt.Color(239, 246, 252));
        CargarDataBotton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        CargarDataBotton.setForeground(new java.awt.Color(33, 33, 105));
        CargarDataBotton.setText("Cargar Archivos");
        CargarDataBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarDataBottonActionPerformed(evt);
            }
        });

        MostrarInvestigacionBotton.setBackground(new java.awt.Color(239, 246, 252));
        MostrarInvestigacionBotton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        MostrarInvestigacionBotton.setForeground(new java.awt.Color(33, 33, 105));
        MostrarInvestigacionBotton.setText("Mostrar Investigaciones");
        MostrarInvestigacionBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarInvestigacionBottonActionPerformed(evt);
            }
        });

        BuscarPCBotton.setBackground(new java.awt.Color(239, 246, 252));
        BuscarPCBotton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        BuscarPCBotton.setForeground(new java.awt.Color(33, 33, 105));
        BuscarPCBotton.setText("Buscar Palabra Clave");
        BuscarPCBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPCBottonActionPerformed(evt);
            }
        });

        BuscarAutorBotton.setBackground(new java.awt.Color(239, 246, 252));
        BuscarAutorBotton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        BuscarAutorBotton.setForeground(new java.awt.Color(33, 33, 105));
        BuscarAutorBotton.setText("Buscar Autor");
        BuscarAutorBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAutorBottonActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(239, 246, 252));
        Salir.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(33, 33, 105));
        Salir.setText("Salir y guardar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Salir)
                    .addComponent(MostrarInvestigacionBotton)
                    .addComponent(CargarDataBotton)
                    .addComponent(BuscarPCBotton)
                    .addComponent(BuscarAutorBotton))
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(CargarDataBotton)
                .addGap(18, 18, 18)
                .addComponent(MostrarInvestigacionBotton)
                .addGap(18, 18, 18)
                .addComponent(BuscarPCBotton)
                .addGap(18, 18, 18)
                .addComponent(BuscarAutorBotton)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarDataBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarDataBottonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
            String cadena =  funcion.ReadDoc();
           
            resumen = new ClaseResumen(cadena);
            
            tablas = new HashTable();
            tablas.agregarResumen(resumen);
            tablas.agregarautor(resumen);
            tablas.agregarPC(resumen);
        
            JOptionPane.showMessageDialog(this, "El resúmen ha sido cargada con exito", "Bien", JOptionPane.INFORMATION_MESSAGE);
        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "El archivo no se encontró: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
    }     
    }//GEN-LAST:event_CargarDataBottonActionPerformed

    private void MostrarInvestigacionBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarInvestigacionBottonActionPerformed
        // TODO add your handling code here:
        SeleccionarInvestigacion vtna = new SeleccionarInvestigacion();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_MostrarInvestigacionBottonActionPerformed

    private void BuscarPCBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPCBottonActionPerformed
        // TODO add your handling code here:
        BuscarPC vtna = new BuscarPC();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_BuscarPCBottonActionPerformed

    private void BuscarAutorBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAutorBottonActionPerformed
        // TODO add your handling code here:
        BuscarAutor vtna = new BuscarAutor();
        vtna.show();
        this.dispose();
    }//GEN-LAST:event_BuscarAutorBottonActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SalirActionPerformed

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
    private javax.swing.JButton BuscarAutorBotton;
    private javax.swing.JButton BuscarPCBotton;
    private javax.swing.JButton CargarDataBotton;
    private javax.swing.JButton MostrarInvestigacionBotton;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
    class Fondo extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagen/Fondo1.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

    }

}
}
