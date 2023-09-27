package universidad.vistas;

import VistasExtra.ListaAlumnos;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import universidad.g63.Utileria;

/**
 *
 * @author Alesio
 */
public class Escritorio extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Escritorio() {
        initComponents();
        this.setTitle("Universidad.G63 - color");
        this.setLocationRelativeTo(null);
        Dimension desktopSize = escritorio.getSize();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        JLabel fondo = new JLabel(icono);
        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
    }

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
        jmExtra = new javax.swing.JMenu();
        jmListaAlumnos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(80, 103, 115));
        jMenuBar1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(250, 30));
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuBar1MousePressed(evt);
            }
        });

        jmAdmins.setForeground(new java.awt.Color(213, 220, 223));
        jmAdmins.setText("Administración");
        jmAdmins.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmAdmins.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmFormAlum.setBackground(new java.awt.Color(213, 220, 223));
        jmFormAlum.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmFormAlum.setForeground(new java.awt.Color(80, 103, 115));
        jmFormAlum.setText("Formulario de Alumno");
        jmFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormAlumActionPerformed(evt);
            }
        });
        jmAdmins.add(jmFormAlum);

        jmFormMat.setBackground(new java.awt.Color(213, 220, 223));
        jmFormMat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmFormMat.setForeground(new java.awt.Color(80, 103, 115));
        jmFormMat.setText("Formulario de Materia");
        jmFormMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormMatActionPerformed(evt);
            }
        });
        jmAdmins.add(jmFormMat);

        jmManejoIns.setBackground(new java.awt.Color(213, 220, 223));
        jmManejoIns.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmManejoIns.setForeground(new java.awt.Color(80, 103, 115));
        jmManejoIns.setText("Manejo de Inscripciones");
        jmManejoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInsActionPerformed(evt);
            }
        });
        jmAdmins.add(jmManejoIns);

        jmManipNotas.setBackground(new java.awt.Color(213, 220, 223));
        jmManipNotas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmManipNotas.setForeground(new java.awt.Color(80, 103, 115));
        jmManipNotas.setText("Manipulacion de notas");
        jmManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipNotasActionPerformed(evt);
            }
        });
        jmAdmins.add(jmManipNotas);

        jMenuBar1.add(jmAdmins);

        jmConsultas.setForeground(new java.awt.Color(213, 220, 223));
        jmConsultas.setText("Consultas");
        jmConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmConsultas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmCAlumXMat.setBackground(new java.awt.Color(213, 220, 223));
        jmCAlumXMat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmCAlumXMat.setForeground(new java.awt.Color(80, 103, 115));
        jmCAlumXMat.setText("Alumnos por Materia");
        jmCAlumXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCAlumXMatActionPerformed(evt);
            }
        });
        jmConsultas.add(jmCAlumXMat);

        jMenuBar1.add(jmConsultas);

        jmSalir.setForeground(new java.awt.Color(213, 220, 223));
        jmSalir.setText("Salir");
        jmSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        jmExtra.setForeground(new java.awt.Color(213, 220, 223));
        jmExtra.setText("Extra");
        jmExtra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmExtra.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jmListaAlumnos.setBackground(new java.awt.Color(213, 220, 223));
        jmListaAlumnos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jmListaAlumnos.setForeground(new java.awt.Color(80, 103, 115));
        jmListaAlumnos.setText("Lista Alumnos");
        jmListaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaAlumnosActionPerformed(evt);
            }
        });
        jmExtra.add(jmListaAlumnos);

        jMenuBar1.add(jmExtra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormAlumActionPerformed
        VistaAlumno2 va = new VistaAlumno2();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        Utileria.fondo(escritorio, va, icono);
    }//GEN-LAST:event_jmFormAlumActionPerformed

    private void jmFormMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormMatActionPerformed
        VistaMateria3 va = new VistaMateria3();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        Utileria.fondo(escritorio, va, icono);
    }//GEN-LAST:event_jmFormMatActionPerformed

    private void jmManejoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInsActionPerformed
        VistaInscripciones va = new VistaInscripciones();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        Utileria.fondo(escritorio, va, icono);
    }//GEN-LAST:event_jmManejoInsActionPerformed

    private void jmManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipNotasActionPerformed
        VistaNotas va = new VistaNotas();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        Utileria.fondo(escritorio, va, icono);
    }//GEN-LAST:event_jmManipNotasActionPerformed

    private void jmCAlumXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCAlumXMatActionPerformed
        VistaConAlumXMat va = new VistaConAlumXMat();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        Utileria.fondo(escritorio, va, icono);
    }//GEN-LAST:event_jmCAlumXMatActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmación de cierre",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmListaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaAlumnosActionPerformed
        ListaAlumnos va = new ListaAlumnos();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/fondo.png"));
        va.setTitle("Listado de Alumnos");
        Utileria.fondo(escritorio, va, icono);
    }//GEN-LAST:event_jmListaAlumnosActionPerformed

    private void jMenuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jMenuBar1MousePressed

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jMenuBar1MouseDragged

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
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdmins;
    private javax.swing.JMenuItem jmCAlumXMat;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenu jmExtra;
    private javax.swing.JMenuItem jmFormAlum;
    private javax.swing.JMenuItem jmFormMat;
    private javax.swing.JMenuItem jmListaAlumnos;
    private javax.swing.JMenuItem jmManejoIns;
    private javax.swing.JMenuItem jmManipNotas;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
