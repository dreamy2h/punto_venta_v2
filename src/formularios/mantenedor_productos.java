package formularios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.conexionMySQL;
import modelos.categorias;
import modelos.unidad_medida;

public class mantenedor_productos extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    String opcion;
    public mantenedor_productos() {
        initComponents();
        llenar_cmb_categorias();
        llenar_cmb_unidad_medida();
        actualizar_grid_productos();
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
        btn_historial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_identificador = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chk_estado = new javax.swing.JCheckBox();
        cmb_categoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_productos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cmb_unidad_medida = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenedor de Productos");

        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

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

        btn_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hitorial_producto.png"))); // NOI18N
        btn_historial.setEnabled(false);
        jPanel1.add(btn_historial);

        jLabel2.setText("Identificador");

        txt_identificador.setEnabled(false);

        txt_codigo.setEnabled(false);

        jLabel3.setText("Código Barras");

        jLabel1.setText("Nombre");

        txt_nombre.setEnabled(false);

        jLabel4.setText("Precio");

        txt_precio.setEnabled(false);

        txt_stock.setEnabled(false);

        jLabel5.setText("Stock");

        chk_estado.setText("Activado");
        chk_estado.setEnabled(false);

        cmb_categoria.setEnabled(false);

        jLabel7.setText("Categoría");

        grid_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_productos);

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        txt_descripcion.setEnabled(false);
        jScrollPane2.setViewportView(txt_descripcion);

        jLabel8.setText("Descripción");

        cmb_unidad_medida.setEnabled(false);

        jLabel9.setText("Unidad de Medida");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(txt_precio)
                                        .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chk_estado)
                                    .addComponent(cmb_categoria, 0, 190, Short.MAX_VALUE)
                                    .addComponent(cmb_unidad_medida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chk_estado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        des_habilitar_productos(false, true);
        limpiar_form_productos();
        opcion = "nuevo";
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        validar_formulario();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void grid_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_productosMouseClicked
        seleccionar_productos();
    }//GEN-LAST:event_grid_productosMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        des_habilitar_productos(false, true);
        opcion = "modificar";
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        des_habilitar_productos(true, false);
        limpiar_form_productos();
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JButton btn_historial;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JCheckBox chk_estado;
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JComboBox<String> cmb_unidad_medida;
    private javax.swing.JTable grid_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_identificador;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
    private void guardar_producto(int codigo, String nombre, int precio, int categoria, int uni_med) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String insert = "insert into productos (codigo, nombre, precio_venta, stock, descripcion, estado, id_categoria, unidad_medida) values (?, ?, ?, ?, ?, ?, ?, ?)";
        
        String descripcion = txt_descripcion.getText();
        int stock = 0;
        int estado = 0;
        if (chk_estado.isSelected()) {
            estado = 1;
        }
        
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setInt(1, codigo);
            st.setString(2, nombre);
            st.setInt(3, precio);
            st.setInt(4, stock);
            st.setString(5, descripcion);
            st.setInt(6, estado);
            st.setInt(7, categoria);
            st.setInt(8, uni_med);

            st.execute();
            cn.close();
            
            actualizar_grid_productos();
            limpiar_form_productos();
            des_habilitar_productos(true, false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
    
    private void des_habilitar_productos(boolean a, boolean b) {
        btn_nuevo.setEnabled(a);
        btn_modificar.setEnabled(a);
        btn_desactivar.setEnabled(a);
        
        btn_aceptar.setEnabled(b);
        btn_cancelar.setEnabled(b);
        
        txt_codigo.setEnabled(b);
        txt_nombre.setEnabled(b);
        txt_precio.setEnabled(b);
        cmb_categoria.setEnabled(b);
        cmb_unidad_medida.setEnabled(b);
        txt_descripcion.setEnabled(b);
        chk_estado.setEnabled(b);
    }
    
    private void actualizar_grid_productos() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String consulta = "SELECT \n" +
"	p.id, p.codigo, p.nombre, p.precio_venta, p.stock, IFNULL(ELT(FIELD(p.estado, 0, 1),'Desactivado','Activado'), 'Sin Estado') as estado, c.nombre as categoria, um.glosa as unidad_medida, p.descripcion, p.id_categoria, p.unidad_medida as id_unidad_medida\n" +
"FROM \n" +
"	productos p\n" +
"    inner join categorias c on p.id_categoria = c.id\n" +
"    inner join prod_unidad_medida um on p.unidad_medida = um.id";
        modelo = new DefaultTableModel();
        Statement st;
  
        modelo.addColumn("Id");
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoria");
        modelo.addColumn("Unidad Medida");
        modelo.addColumn("Estado");
        modelo.addColumn("Descripcion");
        modelo.addColumn("id_categoria");
        modelo.addColumn("id_unidad_medida");
        
        grid_productos.setModel(modelo);
        
        grid_productos.getColumnModel().getColumn(8).setMaxWidth(0);
        grid_productos.getColumnModel().getColumn(8).setMinWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(8).setMaxWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(8).setMinWidth(0);
        
        grid_productos.getColumnModel().getColumn(9).setMaxWidth(0);
        grid_productos.getColumnModel().getColumn(9).setMinWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(9).setMinWidth(0);
        
        grid_productos.getColumnModel().getColumn(10).setMaxWidth(0);
        grid_productos.getColumnModel().getColumn(10).setMinWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(10).setMaxWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(10).setMinWidth(0);
        
        String[] dato = new String[11];
        
        try {
            st = cn.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            
            while (resultado.next()) {
                dato[0] = resultado.getString(1);
                dato[1] = resultado.getString(2);
                dato[2] = resultado.getString(3);
                dato[3] = resultado.getString(4);
                dato[4] = resultado.getString(5);
                dato[5] = resultado.getString(7);
                dato[6] = resultado.getString(8);
                dato[7] = resultado.getString(6);
                dato[8] = resultado.getString(9);
                dato[9] = resultado.getString(10);
                dato[10] = resultado.getString(11);
                
                modelo.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query");
        }
    }
    
    private void limpiar_form_productos() {
        txt_identificador.setText("");
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_precio.setText("");
        txt_stock.setText("");
        cmb_categoria.setSelectedIndex(0);;
        cmb_unidad_medida.setSelectedIndex(0);;
    }

    private void llenar_cmb_categorias() {
        categorias ct =  new categorias(WIDTH, title, title, ERROR);
        DefaultComboBoxModel modeloCategorias = new DefaultComboBoxModel(ct.mostrarCategorias());
        cmb_categoria.setModel(modeloCategorias);
    }   

    private void llenar_cmb_unidad_medida() {
        unidad_medida md =  new unidad_medida(WIDTH, title);
        DefaultComboBoxModel modeloUnidadMedida = new DefaultComboBoxModel(md.mostrarUnidadMedida());
        cmb_unidad_medida.setModel(modeloUnidadMedida);
    }
    
    private void validar_formulario() {
        int codigo = Integer.parseInt(txt_codigo.getText());
        String nombre = txt_nombre.getText();
        int precio = Integer.parseInt(txt_precio.getText());
               
        categorias cat = (categorias) cmb_categoria.getSelectedItem(); 
        int categoria = cat.getId();
        unidad_medida um = (unidad_medida) cmb_unidad_medida.getSelectedItem();
        int uni_med = um.getId();
        
        if (!"".equals(codigo) && !"".equals(nombre) && !"".equals(precio) && categoria != 0 && uni_med != 0) {
            switch (opcion) {
                case "nuevo":
                    guardar_producto(codigo, nombre, precio, categoria, uni_med);
                    break;
                case "modificar":
                    modificar_producto(codigo, nombre, precio, categoria, uni_med);
                    break;
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Falta llenar campos");
        }
    }

    private void seleccionar_productos() {
        int seleccion_fila = grid_productos.getSelectedRow();
        
        txt_identificador.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 0)));
        txt_codigo.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 1)));
        txt_nombre.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 2)));
        txt_precio.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 3)));
        txt_stock.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 4)));
        cmb_categoria.setSelectedIndex(Integer.parseInt(String.valueOf(modelo.getValueAt(seleccion_fila, 9))));
        cmb_unidad_medida.setSelectedIndex(Integer.parseInt(String.valueOf(modelo.getValueAt(seleccion_fila, 10))));
        
        if ("Activado".equals(String.valueOf(modelo.getValueAt(seleccion_fila, 7)))) {
            chk_estado.setSelected(true);
        } else {
            chk_estado.setSelected(false);
        }
        
        txt_descripcion.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 8)));
        
        btn_modificar.setEnabled(true);
        btn_desactivar.setEnabled(true);
    }

    private void modificar_producto(int codigo, String nombre, int precio, int categoria, int uni_med) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String insert = "update productos set codigo = ?, nombre = ?, precio_venta = ?, descripcion = ?, estado = ?, id_categoria = ?, unidad_medida = ? where id = ?";
        
        String descripcion = txt_descripcion.getText();
        int estado = 0;
        if (chk_estado.isSelected()) {
            estado = 1;
        }
        int id = Integer.parseInt(txt_identificador.getText());
        
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setInt(1, codigo);
            st.setString(2, nombre);
            st.setInt(3, precio);
            st.setString(4, descripcion);
            st.setInt(5, estado);
            st.setInt(6, categoria);
            st.setInt(7, uni_med);
            st.setInt(8, id);

            st.execute();
            cn.close();
            
            actualizar_grid_productos();
            limpiar_form_productos();
            des_habilitar_productos(true, false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
}
