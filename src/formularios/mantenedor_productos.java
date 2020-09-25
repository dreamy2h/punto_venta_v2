package formularios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelos.conexionMySQL;
import modelos.categorias;
import modelos.unidad_medida;

public class mantenedor_productos extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    String opcion;
    String estado = "";
    String usuario;
    
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
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_desactivar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_identificador = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmb_categoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cmb_unidad_medida = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_productos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenedor de Productos");

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

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setLabelFor(txt_identificador);
        jLabel2.setText("Identificador");

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });

        jLabel3.setLabelFor(txt_codigo);
        jLabel3.setText("Código Barras");

        jLabel1.setLabelFor(txt_nombre);
        jLabel1.setText("Nombre");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        jLabel5.setLabelFor(txt_stock);
        jLabel5.setText("Stock");

        jLabel7.setLabelFor(cmb_categoria);
        jLabel7.setText("Categoría");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txt_descripcion);

        jLabel8.setLabelFor(txt_descripcion);
        jLabel8.setText("Descripción");

        jLabel9.setLabelFor(cmb_unidad_medida);
        jLabel9.setText("Unidad de Medida");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(txt_nombre))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmb_unidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        grid_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grid_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid_productos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        des_habilitar_productos(false, true);
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea limpiar el formulario?", "¿Limpiar formulario?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            limpiar_form_productos();
        }
        opcion = "nuevo";
        txt_identificador.setText("");
        txt_identificador.setEnabled(false);
        txt_stock.setEnabled(false);
        txt_codigo.requestFocus();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        validar_formulario();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void grid_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grid_productosMouseClicked
        seleccionar_productos();
    }//GEN-LAST:event_grid_productosMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        des_habilitar_productos(false, true);
        txt_identificador.setEnabled(false);
        txt_stock.setEnabled(false);
        opcion = "modificar";
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        des_habilitar_productos(true, true);
        btn_modificar.setEnabled(false);
        btn_desactivar.setEnabled(false);
        btn_aceptar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        limpiar_form_productos();
        actualizar_grid_productos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        actualizar_grid_productos();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desactivarActionPerformed
        String estado_ = "activar";
        if ("Activo".equals(estado)) {
            estado_ = "desactivar";
        }
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea " + estado_ + " el producto " + txt_nombre.getText() + "?", "¿Desactivar Producto?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == 0) {
            desactivar_producto();
        }
    }//GEN-LAST:event_btn_desactivarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        valida_caracteres(100, txt_nombre, evt);
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
        valida_caracteres(50, txt_codigo, evt);
    }//GEN-LAST:event_txt_codigoKeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        valida_caracteres_textarea(255, txt_descripcion, evt);
    }//GEN-LAST:event_txt_descripcionKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cmb_categoria;
    private javax.swing.JComboBox<String> cmb_unidad_medida;
    private javax.swing.JTable grid_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_identificador;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
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
    
    private void des_habilitar_productos(boolean a, boolean b) {
        btn_nuevo.setEnabled(a);
        btn_buscar.setEnabled(a);
        btn_modificar.setEnabled(a);
        btn_desactivar.setEnabled(a);
        
        btn_aceptar.setEnabled(b);
        btn_cancelar.setEnabled(b);
        
        txt_identificador.setEnabled(b);
        txt_codigo.setEnabled(b);
        txt_nombre.setEnabled(b);
        txt_stock.setEnabled(b);
        cmb_categoria.setEnabled(b);
        cmb_unidad_medida.setEnabled(b);
        txt_descripcion.setEnabled(b);
    }
    
    private void limpiar_form_productos() {
        txt_identificador.setText("");
        txt_codigo.setText("");
        txt_nombre.setText("");
        txt_stock.setText("");
        cmb_categoria.setSelectedIndex(0);
        cmb_unidad_medida.setSelectedIndex(0);
        txt_descripcion.setText("");
    }
    
    private void actualizar_grid_productos() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String id = txt_identificador.getText();
        String codigo_barra = txt_codigo.getText();
        String nombre = txt_nombre.getText();
        String stock = txt_stock.getText();
        
        categorias ct = (categorias) cmb_categoria.getSelectedItem();
        int id_categoria = ct.getId();
        unidad_medida um = (unidad_medida) cmb_unidad_medida.getSelectedItem();
        int id_unidad = um.getId();
        
        String descripcion = txt_descripcion.getText();
        
        String consulta = "SELECT \n" +
                        "    p.id,\n" +
                        "    p.codigo,\n" +
                        "    p.nombre,\n" +
                        "    p.stock,\n" +
                        "    c.nombre as categoria,\n" +
                        "    um.glosa as unidad_medida,\n" +
                        "    p.descripcion,\n" +
                        "    case when p.estado = 0 then 'Desactivado' else 'Activo' end as estado\n" +
                        "FROM \n" +
                        "    productos p\n" +
                        "    inner join categorias c on p.id_categoria = c.id\n" +
                        "    inner join prod_unidad_medida um on p.unidad_medida = um.id";
        
        String where = "";
        
        if (!"".equals(id)) {
            where = " where p.id like '%" + id + "%'";
        }
        
        if (!"".equals(codigo_barra)) {
            if (!"".equals(where)) {
                where += " and p.codigo like '%" + codigo_barra + "%'";
            } else {
                where = " where p.codigo like '%" + codigo_barra + "%'";
            }
        }
        
        if (!"".equals(nombre)) {
            if (!"".equals(where)) {
                where += " and p.nombre like '%" + nombre + "%'";
            } else {
                where = " where p.nombre like '%" + nombre + "%'";
            }
        }
        
        if (!"".equals(stock)) {
            if (!"".equals(where)) {
                where += " and p.stock like '%" + stock + "%'";
            } else {
                where = " where p.stock like '%" + stock + "%'";
            }
        }
        
        if (id_categoria != 0) {
            if (!"".equals(where)) {
                where += " and p.id_categoria = " + id_categoria;
            } else {
                where = " where p.id_categoria = " + id_categoria;
            }
        }
        
        if (id_unidad != 0) {
            if (!"".equals(where)) {
                where += " and p.unidad_medida = " + id_unidad;
            } else {
                where = " where p.unidad_medida = " + id_unidad;
            }
        }
        
        if (!"".equals(descripcion)) {
            if (!"".equals(where)) {
                where += " and p.descripcion like '%" + descripcion + "%'";
            } else {
                where = " where p.descripcion like '%" + descripcion + "%'";
            }
        }
        
        consulta += where;
        
        modelo = new DefaultTableModel();
        Statement st;
  
        modelo.addColumn("Id");
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoria");
        modelo.addColumn("Unidad Medida");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Estado");
        
        grid_productos.setModel(modelo);
        
        grid_productos.getColumnModel().getColumn(0).setMaxWidth(0);
        grid_productos.getColumnModel().getColumn(0).setMinWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        grid_productos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
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
                dato[5] = resultado.getString(6);
                dato[6] = resultado.getString(7);
                dato[7] = resultado.getString(8);
                
                modelo.addRow(dato);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query");
        }
    }
    
    private void validar_formulario() {
        String codigo = txt_codigo.getText();
        String nombre = txt_nombre.getText();
        String descripcion = txt_descripcion.getText();
               
        categorias cat = (categorias) cmb_categoria.getSelectedItem(); 
        int id_categoria = cat.getId();
        unidad_medida um = (unidad_medida) cmb_unidad_medida.getSelectedItem();
        int id_unidad = um.getId();
        
        boolean codigo_validate = false;
        boolean nombre_validate = false;
        boolean descripcion_validate = false;
        boolean id_categoria_validate = false;
        boolean id_unidad_validate = false;
        
        String mensaje = "";
        
        if (!"".equals(codigo)) {
            if (Pattern.matches("[0-9]+", codigo)) {
                codigo_validate = true;
            } else {
                mensaje = "Código, debe ingresar solo números";
            }
        } else {
            mensaje = "El código, es obligatorio";
        }
        
        if (!"".equals(nombre)) {
            if (Pattern.matches("[a-zA-Z_0-9áéíóúÁÉÍÓÚñÑ., ]+", nombre)) {
                nombre_validate = true;
            } else {
                if (!"".equals(mensaje)) { mensaje += "\n"; }
                mensaje += "Nombre, tiene caracteres no permitidos";
            }
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "El nombre, es obligatorio";
        }
        
        if (Pattern.matches("[a-zA-Z_0-9áéíóúÁÉÍÓÚñÑ., ]+", descripcion) || "".equals(descripcion)) {
            descripcion_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Descripción, tiene caracteres no permitidos";
        }
        
        if (id_categoria != 0) {
            id_categoria_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Categoría, debe selecionar una categoría";
        }
        
        if (id_unidad != 0) {
            id_unidad_validate = true;
        } else {
            if (!"".equals(mensaje)) { mensaje += "\n"; }
            mensaje += "Unidad de Medida, debe selecionar una unidad de medida";
        }
        
        if (codigo_validate && nombre_validate && descripcion_validate && id_categoria_validate && id_unidad_validate) {
            switch (opcion) {
                case "nuevo":
                    guardar_producto(codigo, nombre, descripcion, id_categoria, id_unidad);
                    break;
                case "modificar":
                    modificar_producto(codigo, nombre, descripcion, id_categoria, id_unidad);
                    break;
            }
            
        } else {
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
    private void guardar_producto(String codigo, String nombre, String descripcion, int id_categoria, int id_unidad) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String insert = "insert into productos (codigo, nombre, descripcion, estado, id_categoria, unidad_medida, id_usuario) values (?, ?, ?, ?, ?, ?, ?)";
        
        int estado = 0;
        
        String[] parts = usuario.split(" - ");
        String id_usuario = parts[0];
       
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setInt(1, Integer.parseInt(codigo));
            st.setString(2, nombre);
            st.setString(3, descripcion);
            st.setInt(4, estado);
            st.setInt(5, id_categoria);
            st.setInt(6, id_unidad);
            st.setInt(7, Integer.parseInt(id_usuario));

            st.execute();
            cn.close();
            
            actualizar_grid_productos();
            limpiar_form_productos();
            des_habilitar_productos(true, false);
            btn_modificar.setEnabled(false);
            btn_desactivar.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
    
    private void modificar_producto(String codigo, String nombre, String descripcion, int id_categoria, int id_unidad) {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String insert = "update productos set codigo = ?, nombre = ?, descripcion = ?, estado = ?, id_categoria = ?, unidad_medida = ? where id = ?";
        
        int estado = 0;
        int id = Integer.parseInt(txt_identificador.getText());
        
        try {
            PreparedStatement st = cn.prepareStatement(insert);
            st.setInt(1, Integer.parseInt(codigo));
            st.setString(2, nombre);
            st.setString(3, descripcion);
            st.setInt(4, estado);
            st.setInt(5, id_categoria);
            st.setInt(6, id_unidad);
            st.setInt(7, id);

            st.execute();
            cn.close();
            
            des_habilitar_productos(true, true);
            btn_modificar.setEnabled(false);
            btn_desactivar.setEnabled(false);
            btn_aceptar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            limpiar_form_productos();
            actualizar_grid_productos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }
    
    private void desactivar_producto() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String update = "update productos set estado = ? where id = ?";
        
        int estado_ = 0;
        
        if ("Desactivado".equals(estado)) {
            estado_ = 1;
        } 
        
        int id = Integer.parseInt(txt_identificador.getText());
        
        try {
            PreparedStatement st = cn.prepareStatement(update);
            st.setInt(1, estado_);
            st.setInt(2, id);

            st.execute();
            cn.close();
            
            des_habilitar_productos(true, true);
            btn_modificar.setEnabled(false);
            btn_desactivar.setEnabled(false);
            btn_aceptar.setEnabled(false);
            btn_cancelar.setEnabled(false);
            limpiar_form_productos();
            actualizar_grid_productos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la query" + e);
        }
    }

    private void seleccionar_productos() {
        int seleccion_fila = grid_productos.getSelectedRow();
        
        txt_identificador.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 0)));
        txt_codigo.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 1)));
        txt_nombre.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 2)));
        txt_stock.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 3)));
        
        String categoria = String.valueOf(modelo.getValueAt(seleccion_fila, 4));
        String unidad_medida = String.valueOf(modelo.getValueAt(seleccion_fila, 5));
        
        for (int i = 0; i < cmb_categoria.getModel().getSize(); i++) {
            Object categoria_ = cmb_categoria.getModel().getElementAt(i);
            if(categoria_.toString().equals(categoria)){
                cmb_categoria.setSelectedItem(categoria_);
                break;
            }
        }
        
        for (int i = 0; i < cmb_unidad_medida.getModel().getSize(); i++) {
            Object unidad_medida_ = cmb_unidad_medida.getModel().getElementAt(i);
            if(unidad_medida_.toString().equals(unidad_medida)){
                cmb_unidad_medida.setSelectedItem(unidad_medida_);
                break;
            }
        }
        
        txt_descripcion.setText(String.valueOf(modelo.getValueAt(seleccion_fila, 6)));
        estado = String.valueOf(modelo.getValueAt(seleccion_fila, 7));
        
        if ("Activo".equals(estado)) {
            btn_desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png")));
        } else {
            btn_desactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/activar.png")));
        }
        
        des_habilitar_productos(true, false);
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
    
    private void valida_caracteres_textarea(int numerocarateres, JTextArea objeto, java.awt.event.KeyEvent evt) {
        if (objeto.getText().length() >= numerocarateres) {
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "Solo " + numerocarateres + " caracteres permitidos");
        }
    }
}
