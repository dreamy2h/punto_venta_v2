package formularios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.conexionMySQL;

public class frm_mantenedor_clientes extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    String opcion;
    
    public frm_mantenedor_clientes() {
        initComponents();
        actualizar_grid_clientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_desactivar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_rut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_fono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_clientes = new javax.swing.JTable();
        txt_dv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo);

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

        jLabel1.setText("Rut:");

        txt_rut.setEnabled(false);

        jLabel2.setText("Nombre: ");

        txt_nombre.setEnabled(false);

        jLabel3.setText("Dirección:");

        txt_direccion.setEnabled(false);

        jLabel4.setText("Fono:");

        txt_fono.setEnabled(false);

        jLabel5.setText("Correo Electrónico:");

        txt_email.setEnabled(false);

        grid_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        grid_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_clientes);

        txt_dv.setEnabled(false);

        jLabel6.setText("-");

        jLabel7.setText("Identificador:");

        txt_id.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txt_email))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(63, 63, 63)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fono, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(txt_rut, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 724, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_fono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        des_habilitar_clientes(false, true);
        limpiar_form_clientes();
        opcion = "nuevo";
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        des_habilitar_clientes(false, true);
        opcion = "modificar";
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        validar_formulario();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        des_habilitar_clientes(true, false);
        limpiar_form_clientes();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void grid_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_clientesMouseClicked
        seleccionar_clientes();
    }//GEN-LAST:event_grid_clientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JTable grid_clientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fono;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
    private void des_habilitar_clientes(boolean a, boolean b) {
        btn_nuevo.setEnabled(a);
        btn_modificar.setEnabled(a);
        btn_desactivar.setEnabled(a);
        
        btn_aceptar.setEnabled(b);
        btn_cancelar.setEnabled(b);
        
        txt_rut.setEnabled(b);
        txt_dv.setEnabled(b);
        txt_nombre.setEnabled(b);
        txt_direccion.setEnabled(b);
        txt_fono.setEnabled(b);
        txt_email.setEnabled(b);
    }

    private void limpiar_form_clientes() {
        txt_rut.setText("");
        txt_dv.setText("");
        txt_nombre.setText("");
        txt_direccion.setText("");
        txt_fono.setText("");
        txt_email.setText("");
    }
    
    private void actualizar_grid_clientes() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String consulta = "select id, concat(rut, '-', dv) as rut_completo, nombre, direccion, fono, email, case when estado = 1 then 'Activo' else 'Desactivado' end as estado, rut, dv FROM punto_venta.clientes";
        modelo = new DefaultTableModel();
        Statement st;
  
        modelo.addColumn("Id");
        modelo.addColumn("Rut");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Fono");
        modelo.addColumn("Correo Electrónico");
        modelo.addColumn("Estado");
        modelo.addColumn("rut");
        modelo.addColumn("dv");
        
        grid_clientes.setModel(modelo);
        
        grid_clientes.getColumnModel().getColumn(0).setMaxWidth(0);
        grid_clientes.getColumnModel().getColumn(0).setMinWidth(0);
        grid_clientes.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        grid_clientes.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
        grid_clientes.getColumnModel().getColumn(7).setMaxWidth(0);
        grid_clientes.getColumnModel().getColumn(7).setMinWidth(0);
        grid_clientes.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        grid_clientes.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);
        
        grid_clientes.getColumnModel().getColumn(8).setMaxWidth(0);
        grid_clientes.getColumnModel().getColumn(8).setMinWidth(0);
        grid_clientes.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        grid_clientes.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
        
        String[] dato = new String[9];
        
        try {
            st = cn.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            
            while (resultado.next()) {
                dato[0] = resultado.getString(1);
                dato[1] = resultado.getString(2);
                dato[2] = resultado.getString(3);
                dato[3] = resultado.getString(4);
                dato[4] = resultado.getString(5);
                dato[5] = resultado.getString(6);
                dato[6] = resultado.getString(7);
                dato[7] = resultado.getString(8);
                dato[8] = resultado.getString(9);
                
                modelo.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query");
        }
    }

    private void validar_formulario() {
        int rut = Integer.parseInt(txt_rut.getText());
        String dv = txt_dv.getText();
        String nombre = txt_nombre.getText();
        String direccion = txt_direccion.getText();
        int fono = Integer.parseInt(txt_fono.getText());
        String email = txt_email.getText();
        
        if (!"".equals(rut) && !"".equals(dv) && !"".equals(nombre) && !"".equals(direccion) && !"".equals(fono) && !"".equals(email)) {
            switch (opcion) {
                case "nuevo":
                    guardar_cliente(rut, dv, nombre, direccion, fono, email);
                    break;
                case "modificar":
                    modificar_cliente(rut, dv, nombre, direccion, fono, email);
                    break;
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Falta llenar campos");
        }
    }

    private void guardar_cliente(int rut, String dv, String nombre, String direccion, int fono, String email) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String insert = "insert into clientes (rut, dv, nombre, direccion, fono, email, estado) values (?, ?, ?, ?, ?, ?, ?)";
        
        int estado = 1;
        
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setInt(1, rut);
            st.setString(2, dv);
            st.setString(3, nombre);
            st.setString(4, direccion);
            st.setInt(5, fono);
            st.setString(6, email);
            st.setInt(7, estado);

            st.execute();
            cn.close();
            
            actualizar_grid_clientes();
            limpiar_form_clientes();
            des_habilitar_clientes(true, false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }

    private void modificar_cliente(int rut, String dv, String nombre, String direccion, int fono, String email) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String update = "update clientes set nombre = ?, direccion = ?, fono = ?, email = ? where id = ?";
        
        int id = Integer.parseInt(txt_id.getText());
        
        try {
            PreparedStatement st = cn.prepareStatement(update);
            st.setString(1, nombre);
            st.setString(2, direccion);
            st.setInt(3, fono);
            st.setString(4, email);
            st.setInt(5, id);

            st.execute();
            cn.close();
            
            actualizar_grid_clientes();
            limpiar_form_clientes();
            des_habilitar_clientes(true, false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    } 
    
    private void seleccionar_clientes() {
        int seleccion_fila = grid_clientes.getSelectedRow();
        
        txt_id.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 0)));
        txt_rut.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 7)));
        txt_dv.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 8)));
        txt_nombre.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 2)));
        txt_direccion.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 3)));
        txt_fono.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 4)));
        txt_email.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 5)));
                        
        btn_modificar.setEnabled(true);
        btn_desactivar.setEnabled(true);
    }
}
