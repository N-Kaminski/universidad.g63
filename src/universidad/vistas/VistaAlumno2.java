package universidad.vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import universidad.controlDatos.AlumnoData;
import universidad.entidades.Alumno;
import universidad.g63.Utileria;

/**
 *
 * @author Alesio
 */
public class VistaAlumno2 extends javax.swing.JInternalFrame {

    private static int contador = 0;

    public VistaAlumno2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jbBuscar = new javax.swing.JButton();
        jbCargar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(213, 220, 223));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 103, 115), 1, true));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(480, 410));

        jSeparator1.setForeground(new java.awt.Color(80, 103, 115));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 103, 115));
        jLabel1.setText("Documento:");
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 103, 115));
        jLabel2.setText("Apellido:");
        jLabel2.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(80, 103, 115));
        jLabel3.setText("Nombre:");
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(80, 103, 115));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Estado:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(80, 103, 115));
        jLabel5.setText("Fecha Nac:");

        jrEstado.setBackground(new java.awt.Color(213, 220, 223));
        jrEstado.setSelected(true);

        jbBuscar.setBackground(new java.awt.Color(80, 103, 115));
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
        jbCargar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        jbEliminar.setBackground(new java.awt.Color(80, 103, 115));
        jbEliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(213, 220, 223));
        jbEliminar.setText("Eliminar");
        jbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 103, 115));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALUMNO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDocumento)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar))
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrEstado)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscar))
                                .addGap(18, 18, 18)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jrEstado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCargar)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (contador == 0) {
            Utileria.mensaje("Debe buscar un alumno por DNI primero, para eliminarlo.");
        } else {
            if (jtDocumento.getText().equals("")) {
                Utileria.mensaje("Debe completar el campo DNI");
            } else {
                AlumnoData adata = new AlumnoData();
                Alumno alum = new Alumno();
                try {
                    int dni = Integer.parseInt(jtDocumento.getText());
                    alum = adata.buscarAlumnoPorDni(dni);
                    Object[] op = {"Aceptar", "Cancelar"};
                    int i = JOptionPane.showOptionDialog(this, "Esta seguro que desea dar de baja al alumno: " + "\n" + alum.stringEliminar(), title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
                    if (i == JOptionPane.YES_OPTION) {
                        adata.eliminarAlumno(alum.getIdAlumno());
//                        limpiarCeldas();
                        contador = 0;
                    }
                } catch (NumberFormatException e) {
                    Utileria.mensaje("Solo puede ingresar numeros en documento");
                } catch (NullPointerException ex) {
                    limpiarCeldas();
                }
                limpiarCeldas();
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea salir?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jtDocumento.getText().equals("")) {
            Utileria.mensaje("Debe ingresar un DNI valido para realizar la busqueda");
        } else {
            AlumnoData adata = new AlumnoData();
            Alumno alum = new Alumno();
            try {
                int dni = Integer.parseInt(jtDocumento.getText());
                alum = adata.buscarAlumnoPorDni(dni);
                jtApellido.setText(alum.getApellido());
                jtNombre.setText(alum.getNombre());
                jrEstado.setSelected(alum.isEstado());
                jdFechaNac.setDate(Utileria.convertirDate(alum.getFechaNac()));
                contador += 1;  // se utiliza para activar/desactivar el boton "Modificar"
            } catch (NumberFormatException e) {
                Utileria.mensaje("Solo puede ingresar numeros en documento");
            } catch (NullPointerException e) {
                int docu = Integer.parseInt(jtDocumento.getText());
                limpiarCeldas();
                jtDocumento.setText(docu + "");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (contador == 0) {
            Utileria.mensaje("Debe buscar un alumno por dni primero, antes de efectuar una modificacion.");
        } else {
            if (jtDocumento.getText().equals("") || jtApellido.getText().equals("") || jtNombre.getText().equals("") || jdFechaNac.getDate().equals("")) {
                Utileria.mensaje("Debe llenar todos los campos");
            } else {
                AlumnoData adata = new AlumnoData();
                Alumno alum = new Alumno();
                try {
                    alum = adata.buscarAlumnoPorDni(Integer.parseInt(jtDocumento.getText()));
                    alum.setDni(Integer.parseInt(jtDocumento.getText()));
                    alum.setApellido(jtApellido.getText());
                    alum.setNombre(jtNombre.getText());
                    alum.setEstado(jrEstado.isSelected());
                    alum.setFechaNac(Utileria.convertirLocalDate(jdFechaNac.getDate()));
                    adata.modificarAlumno(alum);
                    Utileria.mensaje("Alumno modificado exitosamente");
                    limpiarCeldas();
                    contador = 0;
                } catch (NumberFormatException e) {
                    Utileria.mensaje("Solo ingrese numeros en documento");
                } catch (NullPointerException e) {
                    Utileria.mensaje("Debe llenar todos los campos");
                }
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        if (jtDocumento.getText().equals("") || jtApellido.getText().equals("") || jtNombre.getText().equals("") || jdFechaNac.getDate().equals("")) {
            Utileria.mensaje("Debe llenar todos los campos");
        } else {
            AlumnoData adata = new AlumnoData();
            Alumno alum = new Alumno();
            try {
                alum.setDni(Integer.parseInt(jtDocumento.getText()));
                alum.setApellido(jtApellido.getText());
                alum.setNombre(jtNombre.getText());
                alum.setEstado(true);
                alum.setFechaNac(Utileria.convertirLocalDate(jdFechaNac.getDate()));
                adata.guardarAlumno(alum);
                limpiarCeldas();
            } catch (NumberFormatException e) {
                Utileria.mensaje("Solo puede ingresar numeros en documento");
            } catch (NullPointerException e) {
                Utileria.mensaje("Llene todos los campos");
            }
        }
    }//GEN-LAST:event_jbCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCeldas() {
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrEstado.setSelected(true);
        jdFechaNac.setDate(null);
        contador = 0;
    }

} //Llave final
