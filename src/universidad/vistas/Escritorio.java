/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alesio
 */
public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
        initComponents();
        this.setTitle("Universidad.G63");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdmins = new javax.swing.JMenu();
        jmFormAlum = new javax.swing.JMenuItem();
        jmFormMat = new javax.swing.JMenuItem();
        jmManejoIns = new javax.swing.JMenuItem();
        jmManipNotas = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmCAlumXMat = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jmAdmins.setText("Administración");

        jmFormAlum.setText("Formulario de Alumno");
        jmFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormAlumActionPerformed(evt);
            }
        });
        jmAdmins.add(jmFormAlum);

        jmFormMat.setText("Formulario de Materia");
        jmFormMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormMatActionPerformed(evt);
            }
        });
        jmAdmins.add(jmFormMat);

        jmManejoIns.setText("Manejo de Inscripciones");
        jmManejoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInsActionPerformed(evt);
            }
        });
        jmAdmins.add(jmManejoIns);

        jmManipNotas.setText("Manipulacion de notas");
        jmManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipNotasActionPerformed(evt);
            }
        });
        jmAdmins.add(jmManipNotas);

        jMenuBar1.add(jmAdmins);

        jmConsultas.setText("Consultas");

        jmCAlumXMat.setText("Alumnos por Materia");
        jmCAlumXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCAlumXMatActionPerformed(evt);
            }
        });
        jmConsultas.add(jmCAlumXMat);

        jMenuBar1.add(jmConsultas);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormAlumActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumno va = new VistaAlumno();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_jmFormAlumActionPerformed

    private void jmFormMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormMatActionPerformed
        // TODO add your handling code here:
          escritorio.removeAll();
        escritorio.repaint();
        VistaMateria va = new VistaMateria();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_jmFormMatActionPerformed

    private void jmManejoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInsActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        VistaInscripciones va = new VistaInscripciones();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_jmManejoInsActionPerformed

    private void jmManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipNotasActionPerformed
        // TODO add your handling code here:
         escritorio.removeAll();
        escritorio.repaint();
        VistaNotas va = new VistaNotas();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_jmManipNotasActionPerformed

    private void jmCAlumXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCAlumXMatActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaConAlumXMat va = new VistaConAlumXMat();
        va.setVisible(true);
        escritorio.add(va);
        escritorio.moveToFront(va);
    }//GEN-LAST:event_jmCAlumXMatActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(
                        escritorio,
                        "¿Estás seguro de que quieres cerrar la aplicación?",
                        "Confirmación de cierre",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
    }//GEN-LAST:event_jmSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdmins;
    private javax.swing.JMenuItem jmCAlumXMat;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuItem jmFormAlum;
    private javax.swing.JMenuItem jmFormMat;
    private javax.swing.JMenuItem jmManejoIns;
    private javax.swing.JMenuItem jmManipNotas;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
