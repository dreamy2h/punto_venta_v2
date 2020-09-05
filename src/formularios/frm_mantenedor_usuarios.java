package formularios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.conexionMySQL;

public class frm_mantenedor_usuarios extends javax.swing.JInternalFrame {
    public frm_mantenedor_usuarios() {
        initComponents();
        actualizar_grid_usuarios();
    }
    
    int opcion = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mant_usu_btn_nuevo = new javax.swing.JButton();
        mant_usu_txt_nombre = new javax.swing.JTextField();
        mant_usu_txt_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        man_usu_btn_modificar = new javax.swing.JButton();
        mant_usu_btn_desactivar = new javax.swing.JButton();
        mant_usu_btn_aceptar = new javax.swing.JButton();
        mant_usu_btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mant_usu_grid_usuarios = new javax.swing.JTable();
        mant_usu_chk_estado = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenedor de usuarios");

        mant_usu_btn_nuevo.setIcon(new javax.swing.ImageIcon("E:\\proyectos netbeans\\punto_venta_v2\\src\\iconos\\nuevo.png")); // NOI18N
        mant_usu_btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mant_usu_btn_nuevoActionPerformed(evt);
            }
        });

        mant_usu_txt_nombre.setEnabled(false);

        mant_usu_txt_usuario.setEnabled(false);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Usuario:");

        man_usu_btn_modificar.setIcon(new javax.swing.ImageIcon("E:\\proyectos netbeans\\punto_venta_v2\\src\\iconos\\modificar.png")); // NOI18N
        man_usu_btn_modificar.setEnabled(false);
        man_usu_btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                man_usu_btn_modificarActionPerformed(evt);
            }
        });

        mant_usu_btn_desactivar.setIcon(new javax.swing.ImageIcon("E:\\proyectos netbeans\\punto_venta_v2\\src\\iconos\\eliminar.png")); // NOI18N
        mant_usu_btn_desactivar.setEnabled(false);

        mant_usu_btn_aceptar.setIcon(new javax.swing.ImageIcon("E:\\proyectos netbeans\\punto_venta_v2\\src\\iconos\\aceptar.png")); // NOI18N
        mant_usu_btn_aceptar.setEnabled(false);
        mant_usu_btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mant_usu_btn_aceptarActionPerformed(evt);
            }
        });

        mant_usu_btn_cancelar.setIcon(new javax.swing.ImageIcon("E:\\proyectos netbeans\\punto_venta_v2\\src\\iconos\\cancelar.png")); // NOI18N
        mant_usu_btn_cancelar.setEnabled(false);
        mant_usu_btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mant_usu_btn_cancelarActionPerformed(evt);
            }
        });

        mant_usu_grid_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Usuario", "Estado"
            }
        ));
        mant_usu_grid_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mant_usu_grid_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mant_usu_grid_usuarios);

        mant_usu_chk_estado.setText("Estado (Activado(a))");
        mant_usu_chk_estado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mant_usu_btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mant_usu_btn_desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mant_usu_btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mant_usu_btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(man_usu_btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mant_usu_txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mant_usu_txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mant_usu_chk_estado)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(mant_usu_btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mant_usu_txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mant_usu_txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(man_usu_btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mant_usu_btn_desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(mant_usu_btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mant_usu_btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mant_usu_chk_estado)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mant_usu_btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mant_usu_btn_nuevoActionPerformed
        des_habilitar_usu(false, true);
        limpiar_usu();
        mant_usu_txt_nombre.requestFocus();
        opcion = 1;
    }//GEN-LAST:event_mant_usu_btn_nuevoActionPerformed

    private void mant_usu_btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mant_usu_btn_aceptarActionPerformed
        String nombre = mant_usu_txt_nombre.getText();
        String usuario = mant_usu_txt_usuario.getText();

        if (!"".equals(nombre) && !"".equals(usuario)) {
            switch (opcion) {
                case 1:
                    guardar_usuario();
                    break;
                case 2:
                    modificar_usuario();
                    break;
            }
            opcion = 0;
        }
    }//GEN-LAST:event_mant_usu_btn_aceptarActionPerformed

    private void mant_usu_btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mant_usu_btn_cancelarActionPerformed
        des_habilitar_usu(true, false);
        mant_usu_btn_desactivar.setEnabled(false);
        man_usu_btn_modificar.setEnabled(false);
        limpiar_usu();
    }//GEN-LAST:event_mant_usu_btn_cancelarActionPerformed

    private void mant_usu_grid_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mant_usu_grid_usuariosMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)mant_usu_grid_usuarios.getModel();
        int id_fila_seleccionada = mant_usu_grid_usuarios.getSelectedRow();

        mant_usu_txt_nombre.setText(modelo.getValueAt(id_fila_seleccionada, 1).toString());
        mant_usu_txt_usuario.setText(modelo.getValueAt(id_fila_seleccionada, 2).toString());
        
        if ("Activado".equals(modelo.getValueAt(id_fila_seleccionada, 3).toString())) {
            mant_usu_chk_estado.setSelected(true);
        } else {
            mant_usu_chk_estado.setSelected(false);
        }
        
        des_habilitar_usu(true, false);
    }//GEN-LAST:event_mant_usu_grid_usuariosMouseClicked

    private void man_usu_btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_man_usu_btn_modificarActionPerformed
        des_habilitar_usu(false, true);
        opcion = 2;
    }//GEN-LAST:event_man_usu_btn_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton man_usu_btn_modificar;
    private javax.swing.JButton mant_usu_btn_aceptar;
    private javax.swing.JButton mant_usu_btn_cancelar;
    private javax.swing.JButton mant_usu_btn_desactivar;
    private javax.swing.JButton mant_usu_btn_nuevo;
    private javax.swing.JCheckBox mant_usu_chk_estado;
    private javax.swing.JTable mant_usu_grid_usuarios;
    private javax.swing.JTextField mant_usu_txt_nombre;
    private javax.swing.JTextField mant_usu_txt_usuario;
    // End of variables declaration//GEN-END:variables
    private void guardar_usuario() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String insert = "insert into usuarios (nombre, usuario, clave, estado) values (?, ?, ?, ?)";
        
        String nombre = mant_usu_txt_nombre.getText();
        String usuario = mant_usu_txt_usuario.getText();
        String clave = "123";
        int estado = 0;
        
        if (mant_usu_chk_estado.isSelected()) {
            estado = 1;
        }
        
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setString(1, nombre);
            st.setString(2, usuario);
            st.setString(3, clave);
            st.setInt(4, estado);

            st.execute();
            cn.close();
            
            actualizar_grid_usuarios();
            limpiar_usu();
            des_habilitar_usu(true, false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
    
    private void des_habilitar_usu(boolean a, boolean b) {
        mant_usu_btn_nuevo.setEnabled(a);
        man_usu_btn_modificar.setEnabled(a);
        mant_usu_btn_desactivar.setEnabled(a);
        
        mant_usu_btn_aceptar.setEnabled(b);
        mant_usu_btn_cancelar.setEnabled(b);
        
        mant_usu_txt_nombre.setEnabled(b);
        mant_usu_txt_usuario.setEnabled(b);
        mant_usu_chk_estado.setEnabled(b);
    }
    
    private void actualizar_grid_usuarios() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String consulta = "select id, nombre, usuario, IFNULL(ELT(FIELD(estado, 1, 0, 2),'Activado','Desactivado', 'Pendiente'), 'Sin Estado') as estado from usuarios";
        Statement st;
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("usuario");
        modelo.addColumn("estado");
        
        mant_usu_grid_usuarios.setModel(modelo);
        
        String[] dato = new String[4];
        
        try {
            st = cn.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            
            while (resultado.next()) {
                dato[0] = resultado.getString(1);
                dato[1] = resultado.getString(2);
                dato[2] = resultado.getString(3);
                dato[3] = resultado.getString(4);
                
                modelo.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query");
        }
    }
    
    private void limpiar_usu() {
        mant_usu_txt_nombre.setText("");
        mant_usu_txt_usuario.setText("");
        mant_usu_chk_estado.setSelected(false);
    }

    private void modificar_usuario() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String update = "update usuarios set nombre = ?, usuario = ?, clave = ?, estado = ? where id = ?";
        
        String nombre = mant_usu_txt_nombre.getText();
        String usuario = mant_usu_txt_usuario.getText();
        String clave = "123";
        
        DefaultTableModel modelo = (DefaultTableModel)mant_usu_grid_usuarios.getModel();
        int id_fila_seleccionada = mant_usu_grid_usuarios.getSelectedRow();
        int id = Integer.parseInt(modelo.getValueAt(id_fila_seleccionada, 0).toString());
        
        int estado = 0;
        
        if (mant_usu_chk_estado.isSelected()) {
            estado = 1;
        }
        
        try {
            PreparedStatement st = cn.prepareStatement(update);
            st.setString(1, nombre);
            st.setString(2, usuario);
            st.setString(3, clave);
            st.setInt(4, estado);
            st.setInt(5, id);

            st.execute();
            cn.close();
            
            actualizar_grid_usuarios();
            des_habilitar_usu(true, false);
            mant_usu_btn_desactivar.setEnabled(false);
            man_usu_btn_modificar.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
}
