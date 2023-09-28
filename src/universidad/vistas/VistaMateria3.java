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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnno = new javax.swing.JTextField();
        jrNueva = new javax.swing.JRadioButton();
        jrModificar = new javax.swing.JRadioButton();
        jrEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(213, 220, 223));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 103, 115), 1, true));
        setResizable(true);
        setFrameIcon(null);

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 103, 115));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MATERIA");

        jLabel1.setBackground(new java.awt.Color(80, 103, 115));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 103, 115));
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 103, 115));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 103, 115));
        jLabel3.setText("Año:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 103, 115));
        jLabel4.setText("Estado:");

        jtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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

        jrEstado.setBackground(new java.awt.Color(213, 220, 223));
        jrEstado.setForeground(new java.awt.Color(80, 103, 115));
        jrEstado.setSelected(true);

        jbBuscar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(213, 220, 223));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 30.png"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.setContentAreaFilled(false);
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 30.png"))); // NOI18N
        jbBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (1) 30.png"))); // NOI18N
        jbBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 30.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

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

        jSeparator2.setForeground(new java.awt.Color(80, 103, 115));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCargar)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addGap(22, 22, 22)
                                            .addComponent(jrEstado))
                                        .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jrNueva)
                                .addGap(28, 28, 28)
                                .addComponent(jrModificar)
                                .addGap(28, 28, 28)))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrNueva)
                            .addComponent(jrModificar))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtAnno)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCargar)
                    .addComponent(jbModificar)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            MateriaData md = new MateriaData();
            Materia mater = new Materia();
            if (jtCodigo.getText().equals("") && jtNombre.getText().equals("")) {
                Utileria.mensaje("Ingrese un codigo o nombre de materia para buscar");
            } else if (jtCodigo.getText().equals("")) {
                mater.setIdMateria(0);
                mater.setNombre(jtNombre.getText());
                md.buscarMateria(mater);
            } else {
                mater.setIdMateria(Integer.parseInt(jtCodigo.getText()));
                mater.setNombre(jtNombre.getText());
                md.buscarMateria(mater);
            }
            if (mater.getIdMateria() == 0) {
                limpiarCeldas();
            } else {
                jtCodigo.setText(mater.getIdMateria() + "");
                jtNombre.setText(mater.getNombre());
                jtAnno.setText(mater.getAño() + "");
                jtCodigo.setEnabled(false);
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
                
                limpiarCeldas();
                defaultModificar();
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
        limpiarCeldas();
    }//GEN-LAST:event_jrNuevaActionPerformed

    private void jrModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrModificarActionPerformed
        defaultModificar();
        limpiarCeldas();
    }//GEN-LAST:event_jrModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
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
    }
    
}   //  Llave final
