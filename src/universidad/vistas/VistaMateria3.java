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

        setBackground(new java.awt.Color(213, 220, 223));

        jSeparator1.setBackground(new java.awt.Color(80, 103, 115));

        jLabel1.setBackground(new java.awt.Color(80, 103, 115));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 103, 115));
        jLabel1.setText("Codigo:");

        jtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jbBuscar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(213, 220, 223));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 50.png"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.setContentAreaFilled(false);
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 50.png"))); // NOI18N
        jbBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (1) 50.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 103, 115));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 103, 115));
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 103, 115));
        jLabel4.setText("Estado:");

        jrEstado.setBackground(new java.awt.Color(213, 220, 223));
        jrEstado.setForeground(new java.awt.Color(80, 103, 115));
        jrEstado.setSelected(true);

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 103, 115));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MATERIA");

        jbCargar.setBackground(new java.awt.Color(80, 103, 115));
        jbCargar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbCargar.setForeground(new java.awt.Color(213, 220, 223));
        jbCargar.setText("Cargar");
        jbCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(80, 103, 115));
        jbSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(213, 220, 223));
        jbSalir.setText("Cerrar");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(80, 103, 115));
        jbModificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(213, 220, 223));
        jbModificar.setText("Modificar");
        jbModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jrNueva.setBackground(new java.awt.Color(213, 220, 223));
        jrNueva.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jrNueva.setForeground(new java.awt.Color(80, 103, 115));
        jrNueva.setSelected(true);
        jrNueva.setText("Nueva");
        jrNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNuevaActionPerformed(evt);
            }
        });

        jrModificar.setBackground(new java.awt.Color(213, 220, 223));
        jrModificar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jrModificar.setForeground(new java.awt.Color(80, 103, 115));
        jrModificar.setText("Modificar");
        jrModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                        .addComponent(jbCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrEstado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jrNueva)
                                .addGap(61, 61, 61)
                                .addComponent(jrModificar)
                                .addGap(21, 21, 21)))
                        .addGap(0, 47, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrEstado))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCargar)
                    .addComponent(jbSalir)
                    .addComponent(jbModificar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        MateriaData md = new MateriaData();
        Materia mater = new Materia();
        try {
            String txt = JOptionPane.showInputDialog(this, "Cual es el codigo a buscar?", title, JOptionPane.QUESTION_MESSAGE);
            int codigo = Integer.parseInt(txt);
            if (codigo < 1) {
                Utileria.mensaje("Debe ingresar un codigo mayor a cero");
            }
            mater.setIdMateria(codigo);
            mater.setNombre(jtNombre.getText());
            md.buscarMateria(mater);
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
        } catch (NullPointerException ex) {

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        if (jtNombre.getText().equals("") || jtAnno.getText().equals("")) {
            Utileria.mensaje("Complete los campos disponibles");
        } else {
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
        }
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtNombre.getText().equals("") || jtAnno.getText().equals("")) {
            Utileria.mensaje("Faltan completar campos");
        } else {
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
            }
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
//        jtCodigo.setEnabled(true);
        jbBuscar.setEnabled(true);
        jbCargar.setEnabled(false);
    }

}   //  Llave final
