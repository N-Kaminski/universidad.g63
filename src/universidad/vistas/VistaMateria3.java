/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.vistas;

import javax.swing.JOptionPane;
import universidad.controlDatos.MateriaData;
import universidad.entidades.Materia;
import universidad.g63.Utileria;

/**
 *
 * @author Alesio
 */
public class VistaMateria3 extends javax.swing.JInternalFrame {

    // MateriaData md = new MateriaData();
    public VistaMateria3() {
        initComponents();
        defaultNueva();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtAnno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jbCargar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jrNueva = new javax.swing.JRadioButton();
        jrModificar = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");

        jrEstado.setSelected(true);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Materia");

        jbCargar.setText("Cargar");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jrNueva.setSelected(true);
        jrNueva.setText("Nueva");
        jrNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNuevaActionPerformed(evt);
            }
        });

        jrModificar.setText("Modificar");
        jrModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtCodigo)
                                            .addComponent(jtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jrEstado))
                                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 47, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCargar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jrNueva)
                                .addGap(61, 61, 61)
                                .addComponent(jrModificar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrNueva)
                    .addComponent(jrModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCodigo)
                        .addComponent(jbBuscar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNombre)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrEstado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCargar)
                    .addComponent(jbSalir)
                    .addComponent(jbModificar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        MateriaData md = new MateriaData();
        Materia mater = new Materia();
        try {
            if (jtCodigo.getText().equals("")) {
                mater.setIdMateria(0);
            } else {
                mater.setIdMateria(Integer.parseInt(jtCodigo.getText()));
            }
            mater.setNombre(jtNombre.getText());
            md.buscarMateria(mater);
//            if (mater.getIdMateria() == 0 || mater.getNombre() == null) {
            if (mater.getIdMateria() == 0) {
                limpiarCeldas();
            } else {
                jtCodigo.setText(mater.getIdMateria() + "");
                jtNombre.setText(mater.getNombre());
                jtAnno.setText(mater.getAño() + "");
                if (mater.isEstado() == true) {
                    jrEstado.setSelected(true);
                } else {
                    jrEstado.setSelected(false);
                }
                jbModificar.setEnabled(true);
            }

        } catch (NumberFormatException ex) {
            limpiarCeldas();
            Utileria.mensaje("Ingrese numeros donde corresponda");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        MateriaData md = new MateriaData();
        Materia mater = new Materia();
        try {
            mater.setNombre(jtNombre.getText());
            mater.setAño(Integer.parseInt(jtAnno.getText()));
            mater.setEstado(true);
            md.cargarMateria(mater);
            limpiarCeldas();
        } catch (NumberFormatException ex) {
            Utileria.mensaje("Solo puede ingresar numeros en el campo año");
        } catch (NullPointerException ex) {
            Utileria.mensaje("Debe completar el campo año");
        }
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        MateriaData md = new MateriaData();
        Materia mater = new Materia();
        try {
            mater.setIdMateria(Integer.parseInt(jtCodigo.getText()));
            mater.setNombre(jtNombre.getText());
            mater.setAño(Integer.parseInt(jtAnno.getText()));
            mater.setEstado(jrEstado.isSelected());
            md.modificarMateria(mater);
            Utileria.mensaje("Materia modificada exitosamente");
            limpiarCeldas();
        } catch (NumberFormatException ex) {
            Utileria.mensaje("Solo ingrese numeros en los campos correspondientes");
        } catch (NullPointerException ex) {
            Utileria.mensaje("Debe completar todos los campos");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea salir?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevaActionPerformed
        defaultNueva();
    }//GEN-LAST:event_jrNuevaActionPerformed

    private void jrModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrModificarActionPerformed
        defaultModificar();
    }//GEN-LAST:event_jrModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JRadioButton jrModificar;
    private javax.swing.JRadioButton jrNueva;
    private javax.swing.JTextField jtAnno;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCeldas() {
        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnno.setText("");
        jrEstado.setSelected(true);
    }

    public void defaultNueva() {
        jrNueva.setSelected(true);
        jrModificar.setSelected(false);
        jrEstado.setEnabled(false);
        jrEstado.setSelected(true);
        jtCodigo.setEnabled(false);
        jbBuscar.setEnabled(false);
        jbCargar.setEnabled(true);
        jbModificar.setEnabled(false);
    }

    public void defaultModificar() {
        jrNueva.setSelected(false);
        jrModificar.setSelected(true);
        jrEstado.setEnabled(true);
        jtCodigo.setEnabled(true);
        jbBuscar.setEnabled(true);
        jbCargar.setEnabled(false);
        //jbModificar.setEnabled(true);
    }
}
