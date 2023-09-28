package VistasExtra;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.controlDatos.AlumnoData;
import universidad.entidades.Alumno;
import universidad.g63.Utileria;
import universidad.vistas.*;

/**
 *
 * @author Alesio
 */
public class ListaAlumnos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListaAlumnos() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaAlum = new javax.swing.JTable();
        jrTodos = new javax.swing.JRadioButton();
        jrActivos = new javax.swing.JRadioButton();
        jrInactivos = new javax.swing.JRadioButton();
        jcSort = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jbNuevoAlum = new javax.swing.JButton();
        jbEditarAlum = new javax.swing.JButton();
        jbCambiarEstado = new javax.swing.JButton();

        setBackground(new java.awt.Color(213, 220, 223));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 103, 115), 1, true));

        jtListaAlum.setBackground(new java.awt.Color(213, 220, 223));
        jtListaAlum.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtListaAlum.setForeground(new java.awt.Color(80, 103, 115));
        jtListaAlum.setModel(new javax.swing.table.DefaultTableModel(
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
        jtListaAlum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtListaAlum.setSelectionBackground(new java.awt.Color(80, 103, 115));
        jtListaAlum.setSelectionForeground(new java.awt.Color(213, 220, 223));
        jtListaAlum.getTableHeader().setResizingAllowed(false);
        jtListaAlum.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtListaAlum);

        jrTodos.setBackground(new java.awt.Color(213, 220, 223));
        buttonGroup1.add(jrTodos);
        jrTodos.setText("Todos");
        jrTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTodosActionPerformed(evt);
            }
        });

        jrActivos.setBackground(new java.awt.Color(213, 220, 223));
        buttonGroup1.add(jrActivos);
        jrActivos.setForeground(new java.awt.Color(80, 103, 115));
        jrActivos.setText("Activos");
        jrActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivosActionPerformed(evt);
            }
        });

        jrInactivos.setBackground(new java.awt.Color(213, 220, 223));
        buttonGroup1.add(jrInactivos);
        jrInactivos.setForeground(new java.awt.Color(80, 103, 115));
        jrInactivos.setText("Inactivos");
        jrInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInactivosActionPerformed(evt);
            }
        });

        jcSort.setBackground(new java.awt.Color(213, 220, 223));
        jcSort.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jcSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "DNI", "Apellido", "Nombre", "Fecha Nac." }));
        jcSort.setSelectedIndex(-1);
        jcSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSortActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(80, 103, 115));
        jbSalir.setForeground(new java.awt.Color(213, 220, 223));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbNuevoAlum.setBackground(new java.awt.Color(80, 103, 115));
        jbNuevoAlum.setForeground(new java.awt.Color(213, 220, 223));
        jbNuevoAlum.setText("Nuevo Alumno");
        jbNuevoAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumActionPerformed(evt);
            }
        });

        jbEditarAlum.setBackground(new java.awt.Color(80, 103, 115));
        jbEditarAlum.setForeground(new java.awt.Color(213, 220, 223));
        jbEditarAlum.setText("Editar Alumno");
        jbEditarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarAlumActionPerformed(evt);
            }
        });

        jbCambiarEstado.setBackground(new java.awt.Color(80, 103, 115));
        jbCambiarEstado.setForeground(new java.awt.Color(213, 220, 223));
        jbCambiarEstado.setText("Baja/Alta");
        jbCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCambiarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrTodos)
                        .addGap(18, 18, 18)
                        .addComponent(jrActivos)
                        .addGap(18, 18, 18)
                        .addComponent(jrInactivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcSort, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbNuevoAlum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditarAlum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCambiarEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrTodos)
                    .addComponent(jrActivos)
                    .addComponent(jrInactivos)
                    .addComponent(jcSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevoAlum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbSalir)
                        .addComponent(jbEditarAlum)
                        .addComponent(jbCambiarEstado)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTodosActionPerformed
        if (jcSort.getSelectedIndex() >= 0) {
            actualizarTabla(0, jcSort.getSelectedIndex());
        }
    }//GEN-LAST:event_jrTodosActionPerformed

    private void jrActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivosActionPerformed
        if (jcSort.getSelectedIndex() >= 0) {
            actualizarTabla(1, jcSort.getSelectedIndex());
        }
    }//GEN-LAST:event_jrActivosActionPerformed

    private void jrInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInactivosActionPerformed
        if (jcSort.getSelectedIndex() >= 0) {
            actualizarTabla(2, jcSort.getSelectedIndex());
        }
    }//GEN-LAST:event_jrInactivosActionPerformed

    private void jcSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSortActionPerformed
        int estado = -1;
        if (jrTodos.isSelected()) {
            estado = 0;
        } else if (jrActivos.isSelected()) {
            estado = 1;
        } else if (jrInactivos.isSelected()) {
            estado = 2;
        }
        if (estado >= 0) {
            actualizarTabla(estado, jcSort.getSelectedIndex());
        }
    }//GEN-LAST:event_jcSortActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea salir?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumActionPerformed
        NewAlumno va = new NewAlumno();
        va.setVisible(true);
        Escritorio.escritorio.add(va);
        va.toFront();
        Utileria.centrarInternalFrame(Escritorio.escritorio, va);
    }//GEN-LAST:event_jbNuevoAlumActionPerformed

    private void jbEditarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarAlumActionPerformed
//        if (jtListaAlum.getSelectedRow() >= 0) {
            NewAlumnoModificar va = new NewAlumnoModificar();
            va.setVisible(true);
            va.setTitle("Modificacion de Alumno");
            Escritorio.escritorio.add(va);
            va.toFront();
            Utileria.centrarInternalFrame(Escritorio.escritorio, va);
//        } else {
//            Utileria.mensaje("Seleccione un alumno o fila para modificar");
//        }
    }//GEN-LAST:event_jbEditarAlumActionPerformed

    private void jbCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCambiarEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCambiarEstadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCambiarEstado;
    private javax.swing.JButton jbEditarAlum;
    private javax.swing.JButton jbNuevoAlum;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcSort;
    private javax.swing.JRadioButton jrActivos;
    private javax.swing.JRadioButton jrInactivos;
    private javax.swing.JRadioButton jrTodos;
    private javax.swing.JTable jtListaAlum;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Nac.");
        modelo.addColumn("Estado");
        jtListaAlum.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jtListaAlum.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizarTabla(int estado, int orden) {
        borrarFilas();
        AlumnoData adata = new AlumnoData();
        List<Alumno> lista = adata.obtenerListaAlumnos(estado, orden);
        for (Alumno alum : lista) {
            modelo.addRow(new Object[]{
                alum.getIdAlumno(),
                alum.getDni(),
                alum.getApellido(),
                alum.getNombre(),
                alum.getFechaNac(),
                alum.isEstado()
            });
        }
    }

    //
}   //  Llave final
