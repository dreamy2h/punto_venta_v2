package formularios;

import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.conexionMySQL;
import modelos.provincias;
import modelos.regiones;
import modelos.comunas;
import java.util.regex.*;  
import javax.swing.JTextField;

public class frm_mantenedor_proveedores extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    String opcion;
    String estado = "";
    String usuario;
    
    public frm_mantenedor_proveedores() {
        initComponents();
        llenar_cmb_regiones();
        llenar_cmb_provincias();
        llenar_cmb_comunas();
        actualizar_grid_proveedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_desactivar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_proveedores = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_razon_social = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cmb_regiones = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmb_provincias = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmb_comunas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_dv = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_calle = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_fono_1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_fono_2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_resto_direccion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenedor de Proveedores");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar);

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btn_modificar.setEnabled(false);
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar);

        btn_desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btn_desactivar.setEnabled(false);
        btn_desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desactivarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_desactivar);

        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aceptar.png"))); // NOI18N
        btn_aceptar.setEnabled(false);
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar);

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);

        grid_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grid_proveedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        grid_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_proveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_proveedores);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proveedor"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setLabelFor(txt_rut);
        jLabel2.setText("RUT");
        jLabel2.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(61, 14));
        jLabel2.setRequestFocusEnabled(false);

        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutKeyTyped(evt);
            }
        });

        jLabel3.setLabelFor(txt_razon_social);
        jLabel3.setText("Razón Social");
        jLabel3.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(61, 14));

        txt_razon_social.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_razon_socialFocusLost(evt);
            }
        });
        txt_razon_social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_razon_socialKeyTyped(evt);
            }
        });

        jLabel9.setText("Región");
        jLabel9.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel9.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel9.setPreferredSize(new java.awt.Dimension(61, 14));

        cmb_regiones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_regionesItemStateChanged(evt);
            }
        });
        cmb_regiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_regionesActionPerformed(evt);
            }
        });

        jLabel10.setText("Provincia");
        jLabel10.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(61, 14));

        cmb_provincias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_provinciasItemStateChanged(evt);
            }
        });

        jLabel11.setText("Comuna");

        jLabel8.setText("-");

        txt_dv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dvKeyTyped(evt);
            }
        });

        txt_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numeroKeyTyped(evt);
            }
        });

        jLabel4.setText("Calle");

        txt_calle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_calleFocusLost(evt);
            }
        });
        txt_calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_calleKeyTyped(evt);
            }
        });

        jLabel12.setText("Número");

        jLabel5.setText("Correo Electrónico");

        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_emailFocusLost(evt);
            }
        });
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });

        jLabel7.setText("Fono 1");

        txt_fono_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fono_1ActionPerformed(evt);
            }
        });
        txt_fono_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fono_1KeyTyped(evt);
            }
        });

        jLabel6.setText("Fono 2");

        txt_fono_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fono_2KeyTyped(evt);
            }
        });

        jLabel13.setLabelFor(txt_razon_social);
        jLabel13.setText("Resto Dirección");
        jLabel13.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel13.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel13.setName(""); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(61, 14));

        txt_resto_direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_resto_direccionFocusLost(evt);
            }
        });
        txt_resto_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_resto_direccionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_comunas, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmb_regiones, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_resto_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_fono_1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_regiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_provincias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_comunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_resto_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_fono_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fono_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 959, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        des_habilitar_proveedores(false, true);
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea limpiar el formulario?", "¿Limpiar formulario?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            limpiar_form_proveedores();
        }
        opcion = "nuevo";
        txt_rut.requestFocus();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        des_habilitar_proveedores(false, true);
        txt_rut.setEnabled(false);
        txt_dv.setEnabled(false);
        opcion = "modificar";
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        validar_formulario();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        des_habilitar_proveedores(true, true);
        btn_modificar.setEnabled(false);
        btn_desactivar.setEnabled(false);
        btn_aceptar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        limpiar_form_proveedores();
        actualizar_grid_proveedores();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void grid_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_proveedoresMouseClicked
        seleccionar_proveedor();
    }//GEN-LAST:event_grid_proveedoresMouseClicked

    private void cmb_regionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_regionesItemStateChanged
        llenar_cmb_provincias();
    }//GEN-LAST:event_cmb_regionesItemStateChanged

    private void cmb_provinciasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_provinciasItemStateChanged
        llenar_cmb_comunas();
    }//GEN-LAST:event_cmb_provinciasItemStateChanged

    private void cmb_regionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_regionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_regionesActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_fono_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fono_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fono_1ActionPerformed

    private void txt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyTyped
        valida_caracteres(8, txt_rut, evt);
    }//GEN-LAST:event_txt_rutKeyTyped

    private void txt_dvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dvKeyTyped
        valida_caracteres(1, txt_dv, evt);
    }//GEN-LAST:event_txt_dvKeyTyped

    private void txt_razon_socialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_razon_socialKeyTyped
        valida_caracteres(100, txt_razon_social, evt);
    }//GEN-LAST:event_txt_razon_socialKeyTyped

    private void txt_resto_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_resto_direccionKeyTyped
        valida_caracteres(100, txt_resto_direccion, evt);
    }//GEN-LAST:event_txt_resto_direccionKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        actualizar_grid_proveedores();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_calleKeyTyped
        valida_caracteres(100, txt_calle, evt);
    }//GEN-LAST:event_txt_calleKeyTyped

    private void txt_numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroKeyTyped
        valida_caracteres(11, txt_numero, evt);
    }//GEN-LAST:event_txt_numeroKeyTyped

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        valida_caracteres(100, txt_email, evt);
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_fono_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fono_1KeyTyped
        valida_caracteres(11, txt_fono_1, evt);
    }//GEN-LAST:event_txt_fono_1KeyTyped

    private void txt_fono_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fono_2KeyTyped
        valida_caracteres(11, txt_fono_2, evt);
    }//GEN-LAST:event_txt_fono_2KeyTyped

    private void txt_razon_socialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_razon_socialFocusLost
        String razon_social = txt_razon_social.getText();
        txt_razon_social.setText(razon_social.toUpperCase());
    }//GEN-LAST:event_txt_razon_socialFocusLost

    private void txt_calleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_calleFocusLost
        String calle = txt_calle.getText();
        txt_calle.setText(calle.toUpperCase());
    }//GEN-LAST:event_txt_calleFocusLost

    private void txt_resto_direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_resto_direccionFocusLost
        String resto_direccion = txt_resto_direccion.getText();
        txt_resto_direccion.setText(resto_direccion.toUpperCase());
    }//GEN-LAST:event_txt_resto_direccionFocusLost

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
        String email = txt_email.getText();
        txt_email.setText(email.toUpperCase());
    }//GEN-LAST:event_txt_emailFocusLost

    private void btn_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desactivarActionPerformed
        String estado_ = "activar";
        if ("Activo".equals(estado)) {
            estado_ = "desactivar";
        }
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea " + estado_ + " al proveedor " + txt_razon_social.getText() + "?", "¿Desactivar Proveedor?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            desactivar_proveedor();
        }
    }//GEN-LAST:event_btn_desactivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cmb_comunas;
    private javax.swing.JComboBox<String> cmb_provincias;
    private javax.swing.JComboBox<String> cmb_regiones;
    private javax.swing.JTable grid_proveedores;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fono_1;
    private javax.swing.JTextField txt_fono_2;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_razon_social;
    private javax.swing.JTextField txt_resto_direccion;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables

    private void llenar_cmb_regiones() {
        regiones rg =  new regiones(WIDTH, title);
        DefaultComboBoxModel modeloRegiones = new DefaultComboBoxModel(rg.mostrarRegiones());
        cmb_regiones.setModel(modeloRegiones);
    }
    
    private void llenar_cmb_provincias() {
        regiones rg = (regiones) cmb_regiones.getSelectedItem();
        provincias pv =  new provincias(WIDTH, title);
        DefaultComboBoxModel modeloProvincias = new DefaultComboBoxModel(pv.mostrarProvincias(rg.getId()));
        cmb_provincias.setModel(modeloProvincias);
    }
    
    private void llenar_cmb_comunas() {
        provincias pv = (provincias) cmb_provincias.getSelectedItem();
        comunas cm =  new comunas(WIDTH, title);
        DefaultComboBoxModel modeloComunas = new DefaultComboBoxModel(cm.mostrarComunas(pv.getId()));
        cmb_comunas.setModel(modeloComunas);
    }
    
    private void des_habilitar_proveedores(boolean a, boolean b) {
        btn_nuevo.setEnabled(a);
        btn_buscar.setEnabled(a);
        btn_modificar.setEnabled(a);
        btn_desactivar.setEnabled(a);
        
        btn_aceptar.setEnabled(b);
        btn_cancelar.setEnabled(b);
        
        txt_rut.setEnabled(b);
        txt_dv.setEnabled(b);
        txt_razon_social.setEnabled(b);
        cmb_regiones.setEnabled(b);
        cmb_provincias.setEnabled(b);
        cmb_comunas.setEnabled(b);
        txt_calle.setEnabled(b);
        txt_numero.setEnabled(b);
        txt_resto_direccion.setEnabled(b);
        txt_email.setEnabled(b);
        txt_fono_1.setEnabled(b);
        txt_fono_2.setEnabled(b);
    }

    private void limpiar_form_proveedores() {
        txt_rut.setText("");
        txt_dv.setText("");
        txt_razon_social.setText("");
        txt_calle.setText("");
        txt_numero.setText("");
        txt_resto_direccion.setText("");
        txt_email.setText("");
        txt_fono_1.setText("");
        txt_fono_2.setText("");
        
        cmb_regiones.setSelectedIndex(0);
        llenar_cmb_provincias();
        llenar_cmb_comunas();
    }

    private void actualizar_grid_proveedores() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String rut = txt_rut.getText();
        String dv = txt_dv.getText();
        String razon_social = txt_razon_social.getText();
        String calle = txt_calle.getText();
        String numero = txt_numero.getText();
        String resto_direccion = txt_resto_direccion.getText();
        String fono_1 = txt_fono_1.getText();
        String fono_2 = txt_fono_2.getText();
        String email = txt_email.getText();
        
        provincias pv = (provincias) cmb_provincias.getSelectedItem();
        int id_provincia = pv.getId();
        regiones rg = (regiones) cmb_regiones.getSelectedItem();
        int id_region = rg.getId();
        comunas cm = (comunas) cmb_comunas.getSelectedItem();
        int id_comuna = cm.getId();
        
        
        String consulta = "SELECT \n" +
                        "    concat(p.rut, '-', p.dv) as rut, \n" +
                        "    p.razon_social, \n" +
                        "    c.nombre as comuna,\n" +
                        "    p.calle, \n" +
                        "    p.numero, \n" +
                        "    p.resto_direccion,\n" +
                        "    p.email, \n" +
                        "    p.fono_1, \n" +
                        "    p.fono_2, \n" +
                        "    case when p.estado = 1 then 'Activo' else 'Desactivado' end as estado, \n" +
                        "    p.rut as rut_sdv, \n" +
                        "    p.dv,\n" +
                        "    c.nombre as comuna, \n" +
                        "    pr.nombre as provincia, \n" +
                        "    r.nombre as region \n" +
                        "FROM \n" +
                        "	proveedores p\n" +
                        "    left join comunas c on p.id_comuna = c.id\n" +
                        "    left join provincias pr on c.id_provincia = pr.id\n" +
                        "    left join regiones r on pr.id_region = r.id";
        
        String where = "";
        
        if (!"".equals(rut)) {
            where = " where p.rut like '%" + rut + "%'";
        }
        
        if (!"".equals(dv)) {
            if (!"".equals(where)) {
                where += " and p.dv = " + dv;
            } else {
                where = " where p.dv = " + dv;
            }
        }
        
        if (!"".equals(razon_social)) {
            if (!"".equals(where)) {
                where += " and p.razon_social like '%" + razon_social + "%'";
            } else {
                where = " where p.razon_social like '%" + razon_social + "%'";
            }
        }
        
        if (id_region != 0) {
            if (!"".equals(where)) {
                where += " and r.id = " + id_region;
            } else {
                where = " where r.id = " + id_region;
            }
        }
        
        if (id_provincia != 0) {
            if (!"".equals(where)) {
                where += " and pr.id = " + id_provincia;
            } else {
                where = " where pr.id = " + id_provincia;
            }
        }
        
        if (id_comuna != 0) {
            if (!"".equals(where)) {
                where += " and p.id_comuna = " + id_comuna;
            } else {
                where = " where p.id_comuna = " + id_comuna;
            }
        }
        
        if (!"".equals(calle)) {
            if (!"".equals(where)) {
                where += " and p.calle like '%" + calle + "%'";
            } else {
                where = " where p.calle like '%" + calle + "%'";
            }
        }
        
        if (!"".equals(numero)) {
            if (!"".equals(where)) {
                where += " and p.numero like '%" + numero + "%'";
            } else {
                where = " where p.numero like '%" + numero + "%'";
            }
        }
        
        if (!"".equals(resto_direccion)) {
            if (!"".equals(where)) {
                where += " and p.resto_direccion like '%" + resto_direccion + "%'";
            } else {
                where = " where p.resto_direccion like '%" + resto_direccion + "%'";
            }
        }
        
        if (!"".equals(email)) {
            if (!"".equals(where)) {
                where += " and p.email like '%" + email + "%'";
            } else {
                where = " where p.email like '%" + email + "%'";
            }
        }
        
        if (!"".equals(fono_1)) {
            if (!"".equals(where)) {
                where += " and p.fono_1 like '%" + fono_1 + "%'";
            } else {
                where = " where p.fono_1 like '%" + fono_1 + "%'";
            }
        }
        
        if (!"".equals(fono_2)) {
            if (!"".equals(where)) {
                where += " and p.fono_2 like '%" + fono_2 + "%'";
            } else {
                where = " where p.fono_2 like '%" + fono_2 + "%'";
            }
        }
        
        consulta += where;
        
        modelo = new DefaultTableModel();
        Statement st;
  
        modelo.addColumn("Rut");
        modelo.addColumn("Razón Social");
        modelo.addColumn("Comuna");
        modelo.addColumn("Calle");
        modelo.addColumn("Número");
        modelo.addColumn("Resto Dirección");
        modelo.addColumn("Correo Electrónico");
        modelo.addColumn("Fono 1");
        modelo.addColumn("Fono 2");
        modelo.addColumn("Estado");
        modelo.addColumn("rut_sdv");
        modelo.addColumn("dv");
        modelo.addColumn("id_comuna");
        modelo.addColumn("id_provincia");
        modelo.addColumn("id_region");
        
        
        grid_proveedores.setModel(modelo);
        
        grid_proveedores.getColumnModel().getColumn(3).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(3).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(4).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(4).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(5).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(5).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(10).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(10).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(10).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(11).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(11).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(12).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(12).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(12).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(12).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(13).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(13).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(13).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(13).setMinWidth(0);
        
        grid_proveedores.getColumnModel().getColumn(14).setMaxWidth(0);
        grid_proveedores.getColumnModel().getColumn(14).setMinWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(14).setMaxWidth(0);
        grid_proveedores.getTableHeader().getColumnModel().getColumn(14).setMinWidth(0);
        
        String[] dato = new String[15];
        
        try {
            st = cn.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            
            while (resultado.next()) {
                dato[0] = resultado.getString("rut");
                dato[1] = resultado.getString("razon_social");
                dato[2] = resultado.getString("comuna");
                dato[3] = resultado.getString("calle");
                dato[4] = resultado.getString("numero");
                dato[5] = resultado.getString("resto_direccion");
                dato[6] = resultado.getString("email");
                dato[7] = resultado.getString("fono_1");
                dato[8] = resultado.getString("fono_2");
                dato[9] = resultado.getString("estado");
                dato[10] = resultado.getString("rut_sdv");
                dato[11] = resultado.getString("dv");
                dato[12] = resultado.getString("comuna");
                dato[13] = resultado.getString("provincia");
                dato[14] = resultado.getString("region");
                
                modelo.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query");
        }
    }

    private void validar_formulario() {
        String rut = txt_rut.getText();
        String dv = txt_dv.getText();
        String razon_social = txt_razon_social.getText();
        String calle = txt_calle.getText();
        String numero = txt_numero.getText();
        String resto_direccion = txt_resto_direccion.getText();
        String fono_1 = txt_fono_1.getText();
        String fono_2 = txt_fono_2.getText();
        String email = txt_email.getText();
        
        boolean rut_validate = false;
        boolean dv_validate = false;
        boolean razon_social_validate = false;
        boolean calle_validate = false;
        boolean numero_validate = false;
        boolean resto_direccion_validate = false;
        boolean fono_1_validate = false;
        boolean fono_2_validate = false;
        boolean email_validate = false;
        
        String mensaje = "";
        
        if (!"".equals(rut)) {
            if (Pattern.matches("[0-9]+", rut)) {
                rut_validate = true;
            } else {
                mensaje = "El RUT, tiene caracteres no permitidos";
            }
        } else {
            mensaje = "El RUT, es obligatorio";
        }
            
        if (!"".equals(dv)) {
            if (Pattern.matches("[0-9kK]{1}", dv)) {
                dv_validate = true;
            } else {
                if (!"".equals(mensaje)) { mensaje += "\n"; }
                mensaje += "El dígito verificador del rut, tiene caracteres no permitidos";
            }
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "El dígito verificador del rut, es obligatorio";
        }
        
        if (!"".equals(razon_social)) {
            if (Pattern.matches("[a-zA-Z_0-9áéíóúÁÉÍÓÚñÑ., ]+", razon_social)) {
                razon_social_validate = true;
            } else {
                if (!"".equals(mensaje)) { mensaje += "\n"; }
                mensaje += "La razón social, tiene caracteres no permitidos";
            }
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "La razón social, es obligatoria";
        }
            
        if (Pattern.matches("[a-zA-Z_0-9áéíóúÁÉÍÓÚñÑ., ]+", calle) || "".equals(calle)) {
            calle_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "La calle, tiene caracteres no permitidos";
        }
        
        if (Pattern.matches("[0-9]+", numero) || "".equals(numero)) {
            numero_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "El número, tiene caracteres no permitidos";
        }
        
        if (Pattern.matches("[a-zA-Z_0-9áéíóúÁÉÍÓÚñÑ., ]+", resto_direccion) || "".equals(resto_direccion)) {
            resto_direccion_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Resto dirección, tiene caracteres no permitidos";
        }

        if (Pattern.matches("[0-9]+", fono_1) || "".equals(fono_1)) {
            fono_1_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Fono 1, tiene caracteres no permitidos";
        }
        
        if (Pattern.matches("[0-9]+", fono_2) || "".equals(fono_2)) {
            fono_2_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Fono 2, tiene caracteres no permitidos";
        }
        
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches() || "".equals(email)) {
            email_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Correo electrónico, formato de e-mail incorrecto";
        }
        
        if (rut_validate && dv_validate && razon_social_validate && calle_validate && numero_validate && resto_direccion_validate && fono_1_validate && fono_2_validate && email_validate) {
            switch (opcion) {
                case "nuevo":
                    guardar_proveedor(rut, dv, razon_social, calle, numero, resto_direccion, email, fono_1, fono_2);
                    break;
                case "modificar":
                    modificar_proveedor(rut, dv, razon_social, calle, numero, resto_direccion, email, fono_1, fono_2);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    private void guardar_proveedor(String rut, String dv, String razon_social, String calle, String numero, String resto_direccion, String email, String fono_1, String fono_2) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        comunas cm = (comunas) cmb_comunas.getSelectedItem();
        int id_comuna = cm.getId();
        
        String[] parts = usuario.split(" - ");
        String id_usuario = parts[0]; // 123
        
        String insert = "insert into proveedores (rut, dv, razon_social, id_comuna, calle, numero, resto_direccion, email, fono_1, fono_2, estado, id_usuario) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        int estado = 1;
        
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setInt(1, Integer.parseInt(rut));
            st.setString(2, dv);
            st.setString(3, razon_social);
            if (id_comuna != 0) { st.setInt(4, id_comuna); } else { st.setString(4, null); }
            st.setString(5, calle);
            if (!"".equals(numero)) { st.setInt(6, Integer.parseInt(numero)); } else { st.setString(6, null); }
            st.setString(7, resto_direccion);
            st.setString(8, email);
            if (!"".equals(fono_1)) { st.setInt(9, Integer.parseInt(fono_1)); } else { st.setString(9, null); }
            if (!"".equals(fono_1)) { st.setInt(10, Integer.parseInt(fono_2)); } else { st.setString(10, null); }
            st.setInt(11, estado);
            st.setInt(12, Integer.parseInt(id_usuario));

            st.execute();
            cn.close();
            
            actualizar_grid_proveedores();
            limpiar_form_proveedores();
            des_habilitar_proveedores(true, false);
            btn_modificar.setEnabled(false);
            btn_desactivar.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }

    private void modificar_proveedor(String rut, String dv, String razon_social, String calle, String numero, String resto_direccion, String email, String fono_1, String fono_2) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String update = "update proveedores set razon_social = ?, id_comuna = ?, calle = ?, numero = ?, resto_direccion = ?, email = ?, fono_1 = ?, fono_2 = ?, id_usuario = ? where rut = ?";
        
        comunas cm = (comunas) cmb_comunas.getSelectedItem();
        int id_comuna = cm.getId();
        
        String[] parts = usuario.split(" - ");
        String id_usuario = parts[0]; // 123
        
        try {
            PreparedStatement st = cn.prepareStatement(update);
            st.setString(1, razon_social);
            if (id_comuna != 0) { st.setInt(2, id_comuna); } else { st.setString(2, null); }
            st.setString(3, calle);
            if (!"".equals(numero)) { st.setInt(4, Integer.parseInt(numero)); } else { st.setString(4, null); }
            st.setString(5, resto_direccion);
            st.setString(6, email);
            if (!"".equals(fono_1)) { st.setInt(7, Integer.parseInt(fono_1)); } else { st.setString(7, null); }
            if (!"".equals(fono_2)) { st.setInt(8, Integer.parseInt(fono_2)); } else { st.setString(8, null); }
            st.setInt(9, Integer.parseInt(id_usuario));
            st.setInt(10, Integer.parseInt(rut));

            st.execute();
            cn.close();
            
            des_habilitar_proveedores(true, true);
            btn_modificar.setEnabled(false);
            btn_desactivar.setEnabled(false);
            btn_aceptar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            limpiar_form_proveedores();
            actualizar_grid_proveedores();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    } 
  
    private void desactivar_proveedor() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String update = "update proveedores set estado = ?, id_usuario = ? where rut = ?";
        
        int estado_ = 0;
        
        String[] parts = usuario.split(" - ");
        String id_usuario = parts[0]; // 123
        
        if ("Desactivado".equals(estado)) {
            estado_ = 1;
        } 
        
        int rut = Integer.parseInt(txt_rut.getText());
        
        try {
            PreparedStatement st = cn.prepareStatement(update);
            st.setInt(1, estado_);
            st.setInt(2, Integer.parseInt(id_usuario));
            st.setInt(3, rut);

            st.execute();
            cn.close();
            
            des_habilitar_proveedores(true, true);
            btn_modificar.setEnabled(false);
            btn_desactivar.setEnabled(false);
            btn_aceptar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            limpiar_form_proveedores();
            actualizar_grid_proveedores();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
    
    private void seleccionar_proveedor() {
        int seleccion_fila = grid_proveedores.getSelectedRow();
        
        String numero = String.valueOf(modelo.getValueAt(seleccion_fila, 4));
        String fono_1 = String.valueOf(modelo.getValueAt(seleccion_fila, 7));
        String fono_2 = String.valueOf(modelo.getValueAt(seleccion_fila, 8));
        
        String region = String.valueOf(modelo.getValueAt(seleccion_fila, 14));
        String provincia = String.valueOf(modelo.getValueAt(seleccion_fila, 13));
        String comuna =  String.valueOf(modelo.getValueAt(seleccion_fila, 12));
        
        estado = String.valueOf(modelo.getValueAt(seleccion_fila, 9));
        
        txt_rut.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 10)));
        txt_dv.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 11)));
        txt_razon_social.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 1)));
        
        for (int i = 0; i < cmb_regiones.getModel().getSize(); i++) {
            Object region_ = cmb_regiones.getModel().getElementAt(i);
            if(region_.toString().equals(region)){
                cmb_regiones.setSelectedItem(region_);
                break;
            }
        }
        
        for (int i = 0; i < cmb_provincias.getModel().getSize(); i++) {
            Object provincia_ = cmb_provincias.getModel().getElementAt(i);
            if(provincia_.toString().equals(provincia)){
                cmb_provincias.setSelectedItem(provincia_);
                break;
            }
        }
        
        for (int i = 0; i < cmb_comunas.getModel().getSize(); i++) {
            Object comuna_ = cmb_comunas.getModel().getElementAt(i);
            if(comuna_.toString().equals(comuna)){
                cmb_comunas.setSelectedItem(comuna_);
                break;
            }
        }
        
        txt_calle.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 3)));
        if (!"null".equals(numero)) { txt_numero.setText(numero); } else { txt_numero.setText(""); }
        txt_resto_direccion.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 5)));
        txt_email.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 6)));
        if (!"null".equals(fono_1)) { txt_fono_1.setText(fono_1); } else { txt_fono_1.setText(""); }
        if (!"null".equals(fono_2)) { txt_fono_2.setText(fono_2); } else { txt_fono_2.setText(""); }
        
        if ("Activo".equals(estado)) {
            btn_desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png")));
        } else {
            btn_desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/activar.png")));
        }
        
        des_habilitar_proveedores(true, false);
        btn_nuevo.setEnabled(false);
        btn_buscar.setEnabled(false);
        btn_cancelar.setEnabled(true);
    }
    
    private void valida_caracteres(int numerocarateres, JTextField objeto, java.awt.event.KeyEvent evt) {
        if (objeto.getText().length() >= numerocarateres) {
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "Solo " + numerocarateres + " caracteres permitidos");
        }
    }
}
