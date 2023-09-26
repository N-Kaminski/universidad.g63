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
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtDocumento1 = new javax.swing.JTextField();
        jtApellido1 = new javax.swing.JTextField();
        jtNombre1 = new javax.swing.JTextField();
        jrEstado1 = new javax.swing.JRadioButton();
        jdFechaNac1 = new com.toedter.calendar.JDateChooser();
        jbBuscar1 = new javax.swing.JButton();
        jbCargar1 = new javax.swing.JButton();
        jbModificar1 = new javax.swing.JButton();
        jbSalir1 = new javax.swing.JButton();
        jbEliminar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

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

        jInternalFrame1.setBackground(new java.awt.Color(213, 220, 223));
        jInternalFrame1.setBorder(new javax.swing.border.MatteBorder(null));
        jInternalFrame1.setName(""); // NOI18N
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(480, 410));

        jSeparator2.setForeground(new java.awt.Color(80, 103, 115));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 103, 115));
        jLabel7.setText("Documento:");
        jLabel7.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 103, 115));
        jLabel8.setText("Apellido:");
        jLabel8.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(80, 103, 115));
        jLabel9.setText("Nombre:");
        jLabel9.setPreferredSize(new java.awt.Dimension(90, 20));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(80, 103, 115));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Estado:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(80, 103, 115));
        jLabel11.setText("Fecha Nac:");

        jrEstado1.setBackground(new java.awt.Color(213, 220, 223));
        jrEstado1.setSelected(true);

        jbBuscar1.setBackground(new java.awt.Color(80, 103, 115));
        jbBuscar1.setForeground(new java.awt.Color(213, 220, 223));
        jbBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 50.png"))); // NOI18N
        jbBuscar1.setBorder(null);
        jbBuscar1.setContentAreaFilled(false);
        jbBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 50.png"))); // NOI18N
        jbBuscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (1) 50.png"))); // NOI18N
        jbBuscar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa (2) 50.png"))); // NOI18N
        jbBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscar1ActionPerformed(evt);
            }
        });

        jbCargar1.setBackground(new java.awt.Color(80, 103, 115));
        jbCargar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbCargar1.setForeground(new java.awt.Color(213, 220, 223));
        jbCargar1.setText("Cargar");
        jbCargar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCargar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCargar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargar1ActionPerformed(evt);
            }
        });

        jbModificar1.setBackground(new java.awt.Color(80, 103, 115));
        jbModificar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbModificar1.setForeground(new java.awt.Color(213, 220, 223));
        jbModificar1.setText("Modificar");
        jbModificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificar1ActionPerformed(evt);
            }
        });

        jbSalir1.setBackground(new java.awt.Color(80, 103, 115));
        jbSalir1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbSalir1.setForeground(new java.awt.Color(213, 220, 223));
        jbSalir1.setText("Cerrar");
        jbSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir1ActionPerformed(evt);
            }
        });

        jbEliminar1.setBackground(new java.awt.Color(80, 103, 115));
        jbEliminar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbEliminar1.setForeground(new java.awt.Color(213, 220, 223));
        jbEliminar1.setText("Eliminar");
        jbEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminar1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(80, 103, 115));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ALUMNO");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrEstado1)
                                            .addComponent(jdFechaNac1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                .addComponent(jtDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jbBuscar1))
                                            .addComponent(jtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jbCargar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbModificar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEliminar1)
                                .addGap(30, 30, 30)
                                .addComponent(jbSalir1))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrEstado1))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCargar1)
                            .addComponent(jbModificar1)
                            .addComponent(jbEliminar1)
                            .addComponent(jbSalir1)))
                    .addComponent(jdFechaNac1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(354, 354, 354)
                                    .addComponent(jbBuscar)
                                    .addGap(26, 26, 26))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbCargar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalir))))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jrEstado))
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrEstado)
                        .addGap(18, 18, 18)
                        .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtApellido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCargar)
                        .addComponent(jbModificar)
                        .addComponent(jbEliminar))
                    .addComponent(jbSalir))
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 182, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 183, Short.MAX_VALUE)))
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
                        limpiarCeldas();
                        contador = 0;
                    }
                } catch (NumberFormatException e) {
                    Utileria.mensaje("Solo puede ingresar numeros en documento");
                }
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

    private void jbBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBuscar1ActionPerformed

    private void jbCargar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCargar1ActionPerformed

    private void jbModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbModificar1ActionPerformed

    private void jbSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalir1ActionPerformed

    private void jbEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbBuscar1;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbCargar1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbEliminar1;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbModificar1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSalir1;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private com.toedter.calendar.JDateChooser jdFechaNac1;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JRadioButton jrEstado1;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtApellido1;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtDocumento1;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombre1;
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
