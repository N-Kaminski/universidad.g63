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

    MateriaData md = new MateriaData();

    public VistaMateria3() {
        initComponents();

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
        jbEliminar = new javax.swing.JButton();
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

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEliminar)
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
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:

        Materia mater = new Materia();

        try {
            if (!jtCodigo.getText().equals("") && jtNombre.getText().equals("")) {
                mater = md.buscarMateria(Integer.parseInt(jtCodigo.getText()));
                //jtCodigo.setText(mater.getIdMateria() + "");
                jtNombre.setText(mater.getNombre());
                jtAnno.setText(mater.getAño() + "");
                if (mater.isEstado() == true) {
                    jrEstado.setSelected(true);
                } else {
                    jrEstado.setSelected(false);
                }
            } else if (!jtNombre.getText().equals("") && jtCodigo.getText().equals("")) {
                mater = md.buscarMateria(jtNombre.getText());
                jtCodigo.setText(mater.getIdMateria() + "");
                //  jtNombre.setText(mater.getNombre());
                jtAnno.setText(mater.getAño() + "");
                if (mater.isEstado() == true) {
                    jrEstado.setSelected(true);
                } else {
                    jrEstado.setSelected(false);
                }
            } else if (!jtNombre.getText().equals("") && !jtCodigo.getText().equals("")) {
                Utileria.mensaje("Solamente complete 1 campo para realizar la busqueda");
                limpiarCeldas();
            }
        } catch (NumberFormatException e) {
            Utileria.mensaje("Solo puede ingresar numeros");
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        // TODO add your handling code here:
        Materia mater = new Materia();
        try {
            mater.setNombre(jtNombre.getText());
            mater.setAño(Integer.parseInt(jtAnno.getText()));
            mater.setEstado(true);
            md.cargarMateria(mater);
        } catch (NumberFormatException ex) {
            Utileria.mensaje("Solo se permiten numeros en el campo 'año'");
        } catch (NullPointerException ex) {
            Utileria.mensaje("Llene todos los campos a excepcion del campo 'codigo'");
        }
        limpiarCeldas();
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        Materia mater = new Materia();
        try {
            mater = md.buscarMateria(Integer.parseInt(jtCodigo.getText()));
            mater.setNombre(jtNombre.getText());
            mater.setAño(Integer.parseInt(jtAnno.getText()));
            mater.isEstado();
            if (jrModificar.isSelected() && mater.isEstado() == true) {
                jrEstado.setEnabled(false); // FALTA VER PORQUE NO FUNCIONA! LA IDEA ES QUE APARESCA EN GRIS SIN POSIBILIDAD DE EDITAR
            } else if (jrModificar.isSelected() && mater.isEstado() == false) {
                if (jrEstado.isSelected()) {
                    mater.setEstado(true);
                } else {
                    mater.setEstado(false);
                }
            }
            md.modificarMateria(mater);
            Utileria.mensaje("Materia modificada exitosamente");
        } catch (NumberFormatException ex) {
            Utileria.mensaje("Solo se permiten numeros en el campo 'año'");
            limpiarCeldas();
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        Materia mater = new Materia();
        try {
            mater = md.buscarMateria(Integer.parseInt(jtCodigo.getText()));
            Object[] op = {"Aceptar", "Cancelar"};
            int i = JOptionPane.showOptionDialog(this, "Esta seguro que desea eliminar la materia?: " + "\n" + mater.getNombre(), title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
            if (i == JOptionPane.YES_OPTION) {
                md.eliminarMateria(mater.getIdMateria());
                Utileria.mensaje("Se elimino la materia");
                limpiarCeldas();
            }
        } catch (NumberFormatException e) {
            Utileria.mensaje("Solo se permiten numeros en el campo 'año'");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea salir?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevaActionPerformed
        jrModificar.setSelected(false);
        jtCodigo.setEnabled(false);
        jtNombre.setEnabled(true);
        jtAnno.setEnabled(true);
        jrEstado.setEnabled(false);
        jrEstado.setSelected(true);
        jbBuscar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbCargar.setEnabled(true);
        jbSalir.setEnabled(true);
    }//GEN-LAST:event_jrNuevaActionPerformed

    private void jrModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrModificarActionPerformed
        jrNueva.setSelected(false);
        jtCodigo.setEnabled(true);
        jtNombre.setEnabled(true);
        jtAnno.setEnabled(false);
        jrEstado.setEnabled(true);
        jbBuscar.setEnabled(true);
        jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbCargar.setEnabled(false);
        jbSalir.setEnabled(true);
    }//GEN-LAST:event_jrModificarActionPerformed

    private void limpiarCeldas() {
        jtNombre.setText("");
        jtAnno.setText("");
        jtCodigo.setText("");
        jrEstado.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JRadioButton jrModificar;
    private javax.swing.JRadioButton jrNueva;
    private javax.swing.JTextField jtAnno;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
