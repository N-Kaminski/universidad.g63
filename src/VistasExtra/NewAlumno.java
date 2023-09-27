package VistasExtra;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import universidad.controlDatos.AlumnoData;
import universidad.entidades.Alumno;
import universidad.g63.Utileria;

/**
 *
 * @author Alesio
 */
public class NewAlumno extends javax.swing.JInternalFrame {

    public NewAlumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCerrar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtApe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Documento:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Nac:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jtNom)
                            .addComponent(jtApe)
                            .addComponent(jtDoc))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtDoc)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtApe)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNom)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar)
                    .addComponent(jbGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar la ventana?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        boolean todok = comprobarCampos();
        if (todok == false) {
            Utileria.mensaje("Debe completar todos los campos");
        } else {
            try {
//                AlumnoData adata = new AlumnoData();
                Alumno alum = new Alumno();
                alum.setDni(Integer.parseInt(jtDoc.getText()));
                alum.setApellido(jtApe.getText());
                alum.setNombre(jtNom.getText());
                alum.setEstado(true);
                alum.setFechaNac(Utileria.convertirLocalDate(jdFecha.getDate()));
//                adata.guardarAlumno(alum);
                Utileria.mensaje("Exito");
            } catch (NumberFormatException ex) {
                Utileria.mensaje("Solo ingrese numeros en el campo 'Documento'");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardar;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField jtApe;
    private javax.swing.JTextField jtDoc;
    private javax.swing.JTextField jtNom;
    // End of variables declaration//GEN-END:variables

    private boolean comprobarCampos() {
        if (jtDoc.getText().equals("") || jtApe.getText().equals("") || jtNom.getText().equals("") || jdFecha.getDate() == null) {
            return false;
        } else {
            return true;
        }
    }
}
