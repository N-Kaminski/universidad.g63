package universidad.vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.controlDatos.AlumnoData;
import universidad.controlDatos.InscripcionData;
import universidad.entidades.Alumno;
import universidad.entidades.Inscripcion;
import universidad.entidades.Materia;
import universidad.g63.Utileria;

/**
 *
 * @author Alesio
 */
public class VistaInscripciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public VistaInscripciones() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrMatIns = new javax.swing.JRadioButton();
        jrMatNoIns = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbAnularIns = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jcAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Materias");

        buttonGroup1.add(jrMatIns);
        jrMatIns.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrMatIns.setText("Materias inscriptas");
        jrMatIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatInsActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrMatNoIns);
        jrMatNoIns.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jrMatNoIns.setText("Materias no inscriptas");
        jrMatNoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMatNoInsActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMaterias);

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbAnularIns.setText("Anular Inscripcion");
        jbAnularIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrMatIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrMatNoIns))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbInscribir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAnularIns)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrMatIns)
                    .addComponent(jrMatNoIns))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir)
                    .addComponent(jbAnularIns))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jSeparator1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        InscripcionData idata = new InscripcionData();
        Inscripcion insc = new Inscripcion();
        insc.setNota(0);
        insc.setAlumno((Alumno) jcAlumnos.getSelectedItem());
        insc.setMateria(seleccionJTable(jtMaterias.getSelectedRow()));
        idata.cargarInscripcion(insc);
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInsActionPerformed
        // TODO add your handling code here:
        InscripcionData idata = new InscripcionData();
        Inscripcion insc = new Inscripcion();
        insc.setNota(0);
        insc.setAlumno((Alumno) jcAlumnos.getSelectedItem());
        insc.setMateria(seleccionJTable(jtMaterias.getSelectedRow()));

        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea anular la inscripcion del" + "\n" + "Alumno: " + insc.getAlumno().getApellido() + ", " + insc.getAlumno().getNombre()
                + "\n" + "De la materia: " + insc.getMateria().getNombre() + "?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            idata.borrarInscripcionMateriaAlumno(insc.getAlumno().getIdAlumno(), insc.getMateria().getIdMateria());
        }


    }//GEN-LAST:event_jbAnularInsActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea salir?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnosActionPerformed
        borrarFilas();
        InscripcionData Idata = new InscripcionData();
        Alumno alum = new Alumno();
        if (jrMatIns.isSelected()) {
            alum = (Alumno) jcAlumnos.getSelectedItem();
            List<Materia> lista = Idata.obtenerMateriasCursadas(alum.getIdAlumno());
            for (Materia mat : lista) {
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAño()
                });
            }
        } else if (jrMatNoIns.isSelected()) {
            alum = (Alumno) jcAlumnos.getSelectedItem();
            List<Materia> lista = Idata.obtenerMateriasNoCursadas(alum.getIdAlumno());
            for (Materia mat : lista) {
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAño()
                });
            }
        }
    }//GEN-LAST:event_jcAlumnosActionPerformed

    private void jrMatInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatInsActionPerformed
        borrarFilas();
        jbInscribir.setEnabled(false);
        jbAnularIns.setEnabled(true);
        InscripcionData Idata = new InscripcionData();
        Alumno alum = new Alumno();
        if (jcAlumnos.getSelectedItem() != null) {
            alum = (Alumno) jcAlumnos.getSelectedItem();
            List<Materia> lista = Idata.obtenerMateriasCursadas(alum.getIdAlumno());
            for (Materia mat : lista) {
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAño()
                });
            }
        }
    }//GEN-LAST:event_jrMatInsActionPerformed

    private void jrMatNoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMatNoInsActionPerformed
        borrarFilas();
        jbInscribir.setEnabled(true);
        jbAnularIns.setEnabled(false);
        InscripcionData Idata = new InscripcionData();
        Alumno alum = new Alumno();
        if (jcAlumnos.getSelectedItem() != null) {
            alum = (Alumno) jcAlumnos.getSelectedItem();
            List<Materia> lista = Idata.obtenerMateriasNoCursadas(alum.getIdAlumno());
            for (Materia mat : lista) {
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    mat.getAño()
                });
            }
        }
    }//GEN-LAST:event_jrMatNoInsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnularIns;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcAlumnos;
    private javax.swing.JRadioButton jrMatIns;
    private javax.swing.JRadioButton jrMatNoIns;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtMaterias.setModel(modelo);
    }

    private void cargarCombo() {
        AlumnoData ad = new AlumnoData();
        List<Alumno> list = ad.obtenerAlumnos();
        for (Alumno alum : list) {
            jcAlumnos.addItem(alum);
        }
        jcAlumnos.setSelectedIndex(-1);
    }

    private void borrarFilas() {
        int f = jtMaterias.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private Materia seleccionJTable(int fila) {
        Materia mat = new Materia();
        mat.setIdMateria((int) jtMaterias.getValueAt(fila, 0));
        mat.setNombre((String) jtMaterias.getValueAt(fila, 1));
        return mat;
    }
}
