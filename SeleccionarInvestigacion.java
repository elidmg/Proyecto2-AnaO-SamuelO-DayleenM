/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Indatech
 */
public class SeleccionarInvestigacion extends javax.swing.JFrame {
    Fondo fondo = new Fondo();
    Funciones funcion = new Funciones();
       ClaseResumen resumen;
       HashTable tablaresumen; 
       ClaseResumen[] investigacion;
    /**
     * Creates new form SeleccionarInvestigacion
     * @param tablitaresumen
     * 
     */
    public SeleccionarInvestigacion(HashTable tablitaresumen) {
        tablaresumen = tablitaresumen;
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.investigacion = SelecResumen(this.tablaresumen);
        
    }
    public ClaseResumen[] SelecResumen(HashTable tablaHash) {
        ClaseResumen[] invesSelec = new ClaseResumen[tablaHash.getSizeTablaInves()];
        
        String cadena = "";
         int contador = 1;
       for(ListaResumen lista: tablaHash.getTabla()){
           if(lista != null){
              ClaseResumen primero = lista.getFirst();
           for(int x = 0; x <lista.getSize(); x++){
               
            cadena+=Integer.toString(contador)+ " - ";
            cadena += primero.getTitulo()+ "\n";
            invesSelec[contador-1] = primero;
            contador++;
            if(primero != lista.getLast()){
                primero = primero.getNext();
            
           }
           }
           }}
        this.MostrarInvesArea.setText(cadena);
        return invesSelec;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        MostrarInvesArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaParaDetalles = new javax.swing.JTextArea();
        MostratDetBoton = new javax.swing.JButton();
        FieldDetalles = new javax.swing.JTextField();
        RegresarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MostrarInvesArea.setColumns(20);
        MostrarInvesArea.setRows(5);
        jScrollPane3.setViewportView(MostrarInvesArea);

        AreaParaDetalles.setColumns(20);
        AreaParaDetalles.setRows(5);
        jScrollPane1.setViewportView(AreaParaDetalles);

        MostratDetBoton.setText("Mostrar detalles");
        MostratDetBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostratDetBotonActionPerformed(evt);
            }
        });

        FieldDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDetallesActionPerformed(evt);
            }
        });

        RegresarBoton.setText("Regresar");
        RegresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FieldDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostratDetBoton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RegresarBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostratDetBoton)
                    .addComponent(FieldDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(RegresarBoton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostratDetBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostratDetBotonActionPerformed
        // TODO add your handling code here:
        /**
         * Recorrer desde 0 hasta el conrtador -1, inicializar la primera lista luego poner desde 0 hasta la primera lista
         * hasta el leng de la primera lista, revisar si el contador es mayor que cero y menor que el leng de la primera lista 
         * recorrer desde el valor inicial hasta el valor del contador, si no se encuentra, hacer lo mismo desde eleng de la 
         * primera lista  hasta el leng de la segunda y asi sucesivamente, utilizar un for y un while. 
         */
        
        String numero = FieldDetalles.getText();
        //validar entrada numero en el rango del arrey
        String cadena = "";
        cadena +="\n-TITULO: " + this.investigacion[Integer.parseInt(numero)-1].getTitulo() + " \n ";
        cadena += "\n-AUTORES: ";
        for(Autor autor: this.investigacion[Integer.parseInt(numero)-1].getAutores()){
        cadena += autor.getAutor() + " \n ";
        }
        cadena +="\n-CUERPO DEL RESUMEN: "+ this.investigacion[Integer.parseInt(numero)-1].getCuerpo() + " \n ";
        cadena += "\n-PALABRAS CLAVES: ";
       for(PalabraClave claves: this.investigacion[Integer.parseInt(numero)-1].getPalabrasClaves()){
        cadena += claves.getPalabra() + " \n ";
        }
       AreaParaDetalles.setText(cadena);
    }//GEN-LAST:event_MostratDetBotonActionPerformed

    private void RegresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBotonActionPerformed
        Menu vtna = new Menu();
        vtna.show();
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_RegresarBotonActionPerformed

    private void FieldDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldDetallesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FieldDetallesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], HashTable tablitaresumen) {
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
            java.util.logging.Logger.getLogger(SeleccionarInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarInvestigacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarInvestigacion(tablitaresumen).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaParaDetalles;
    private javax.swing.JTextField FieldDetalles;
    private javax.swing.JTextArea MostrarInvesArea;
    private javax.swing.JButton MostratDetBoton;
    private javax.swing.JButton RegresarBoton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
    class Fondo extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagen/Fondo3.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

    }



    }
}
