package formularios;

public class principal extends javax.swing.JFrame {
    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_clientes = new javax.swing.JMenu();
        it_mant_clientes = new javax.swing.JMenuItem();
        mn_proveedor = new javax.swing.JMenu();
        it_mant_proveedores = new javax.swing.JMenuItem();
        mn_productos = new javax.swing.JMenu();
        it_mant_productos = new javax.swing.JMenuItem();
        it_fechas_vencimiento = new javax.swing.JMenuItem();
        it_lista_precios = new javax.swing.JMenuItem();
        mn_entradas = new javax.swing.JMenu();
        it_facturas = new javax.swing.JMenuItem();
        mn_ventas = new javax.swing.JMenu();
        mn_usuarios = new javax.swing.JMenu();
        it_mant_usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 0, 18)); // NOI18N

        mn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente.png"))); // NOI18N
        mn_clientes.setText("Clientes");

        it_mant_clientes.setText("Mantenedor de Clientes");
        it_mant_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_mant_clientesActionPerformed(evt);
            }
        });
        mn_clientes.add(it_mant_clientes);

        jMenuBar1.add(mn_clientes);

        mn_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor.png"))); // NOI18N
        mn_proveedor.setText("Proveedores");

        it_mant_proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor_submenu.png"))); // NOI18N
        it_mant_proveedores.setText("Mantenedor de Proveedores");
        it_mant_proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_mant_proveedoresActionPerformed(evt);
            }
        });
        mn_proveedor.add(it_mant_proveedores);

        jMenuBar1.add(mn_proveedor);

        mn_productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/producto.png"))); // NOI18N
        mn_productos.setText("Productos");

        it_mant_productos.setText("Mantenedor de Productos");
        it_mant_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_mant_productosActionPerformed(evt);
            }
        });
        mn_productos.add(it_mant_productos);

        it_fechas_vencimiento.setText("Fechas de vencimiento");
        it_fechas_vencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_fechas_vencimientoActionPerformed(evt);
            }
        });
        mn_productos.add(it_fechas_vencimiento);

        it_lista_precios.setText("Lista de Precios");
        mn_productos.add(it_lista_precios);

        jMenuBar1.add(mn_productos);

        mn_entradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mercaderia.png"))); // NOI18N
        mn_entradas.setText("Mercadería");

        it_facturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mercaderia_submenu.png"))); // NOI18N
        it_facturas.setText("Ingresar Facturas");
        it_facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_facturasActionPerformed(evt);
            }
        });
        mn_entradas.add(it_facturas);

        jMenuBar1.add(mn_entradas);

        mn_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas.png"))); // NOI18N
        mn_ventas.setText("Ventas");
        jMenuBar1.add(mn_ventas);

        mn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        mn_usuarios.setText("Usuarios");
        mn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_usuariosActionPerformed(evt);
            }
        });

        it_mant_usuarios.setText("Mantenedor de Usuarios");
        it_mant_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                it_mant_usuariosActionPerformed(evt);
            }
        });
        mn_usuarios.add(it_mant_usuarios);

        jMenuBar1.add(mn_usuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    private void it_mant_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_mant_clientesActionPerformed
        frm_mantenedor_clientes clientes = new frm_mantenedor_clientes();
        escritorio.add(clientes);
        clientes.setVisible(true);
    }//GEN-LAST:event_it_mant_clientesActionPerformed

    private void it_mant_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_mant_usuariosActionPerformed
        frm_mantenedor_usuarios usuarios = new frm_mantenedor_usuarios();
        escritorio.add(usuarios);
        usuarios.setVisible(true);
    }//GEN-LAST:event_it_mant_usuariosActionPerformed

    private void mn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_usuariosActionPerformed
        
    }//GEN-LAST:event_mn_usuariosActionPerformed

    private void it_mant_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_mant_productosActionPerformed
        mantenedor_productos productos = new mantenedor_productos();
        escritorio.add(productos);
        productos.setVisible(true);
    }//GEN-LAST:event_it_mant_productosActionPerformed

    private void it_fechas_vencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_fechas_vencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_it_fechas_vencimientoActionPerformed

    private void it_mant_proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_mant_proveedoresActionPerformed
        frm_mantenedor_proveedores proveedores = new frm_mantenedor_proveedores();
        escritorio.add(proveedores);
        proveedores.setVisible(true);
    }//GEN-LAST:event_it_mant_proveedoresActionPerformed

    private void it_facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_it_facturasActionPerformed
        frm_facturas facturas = new frm_facturas();
        escritorio.add(facturas);
        facturas.setVisible(true);
    }//GEN-LAST:event_it_facturasActionPerformed
       
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                principal main = new principal();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem it_facturas;
    private javax.swing.JMenuItem it_fechas_vencimiento;
    private javax.swing.JMenuItem it_lista_precios;
    private javax.swing.JMenuItem it_mant_clientes;
    private javax.swing.JMenuItem it_mant_productos;
    private javax.swing.JMenuItem it_mant_proveedores;
    private javax.swing.JMenuItem it_mant_usuarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mn_clientes;
    private javax.swing.JMenu mn_entradas;
    private javax.swing.JMenu mn_productos;
    private javax.swing.JMenu mn_proveedor;
    private javax.swing.JMenu mn_usuarios;
    private javax.swing.JMenu mn_ventas;
    // End of variables declaration//GEN-END:variables

    
}
