package formularios;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelos.TextPrompt;
import modelos.conexionMySQL;

public class frm_facturas extends javax.swing.JInternalFrame {
    public frm_facturas() {
        initComponents();
        TextPrompt placeholder = new TextPrompt("Ingrese rut, sin dv \".\"", txt_rut);
        placeholder.changeAlpha(0.75f);
        placeholder.changeStyle(Font.ITALIC);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_razon_social = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        btn_busqueda_avanzada = new javax.swing.JButton();
        txt_provincia = new javax.swing.JTextField();
        txt_region = new javax.swing.JTextField();
        txt_comuna = new javax.swing.JTextField();
        txt_rut = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_crear_proveedor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo_barras = new javax.swing.JTextField();
        txt_nombre_producto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_precio_producto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Facturas");

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("RUT");
        jLabel2.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(61, 14));
        jLabel2.setRequestFocusEnabled(false);

        jLabel3.setText("Razón Social");
        jLabel3.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(61, 14));

        txt_razon_social.setEnabled(false);
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

        jLabel10.setText("Provincia");
        jLabel10.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(61, 14));

        jLabel11.setText("Comuna");

        jLabel8.setText("-");

        txt_dv.setEnabled(false);
        txt_dv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dvKeyTyped(evt);
            }
        });

        txt_numero.setEnabled(false);
        txt_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numeroKeyTyped(evt);
            }
        });

        jLabel4.setText("Calle");

        txt_calle.setEnabled(false);
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

        txt_email.setEnabled(false);
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

        txt_fono_1.setEnabled(false);
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

        txt_fono_2.setEnabled(false);
        txt_fono_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fono_2KeyTyped(evt);
            }
        });

        jLabel13.setText("Resto Dirección");
        jLabel13.setMaximumSize(new java.awt.Dimension(61, 14));
        jLabel13.setMinimumSize(new java.awt.Dimension(61, 14));
        jLabel13.setName(""); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(61, 14));

        txt_resto_direccion.setEnabled(false);
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

        btn_busqueda_avanzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar_small.png"))); // NOI18N
        btn_busqueda_avanzada.setText("Búsqueda Avanzada");

        txt_provincia.setEnabled(false);
        txt_provincia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_provinciaFocusLost(evt);
            }
        });
        txt_provincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_provinciaKeyTyped(evt);
            }
        });

        txt_region.setEnabled(false);
        txt_region.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regionFocusLost(evt);
            }
        });
        txt_region.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regionKeyTyped(evt);
            }
        });

        txt_comuna.setEnabled(false);
        txt_comuna.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_comunaFocusLost(evt);
            }
        });
        txt_comuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_comunaKeyTyped(evt);
            }
        });

        txt_rut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_rutFocusLost(evt);
            }
        });
        txt_rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_rutKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rutKeyTyped(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar_small.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_crear_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo_small.png"))); // NOI18N
        btn_crear_proveedor.setText("Crear Proveedor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_resto_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_fono_1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fono_2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
                            .addComponent(txt_comuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_busqueda_avanzada)
                                .addGap(18, 18, 18)
                                .addComponent(btn_crear_proveedor)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_razon_social, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txt_fono_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_busqueda_avanzada)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_crear_proveedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Código de barras");

        jLabel14.setText("Nombre del producto");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_small.png"))); // NOI18N

        jLabel15.setText("Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigo_barras, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo_barras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txt_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.SystemColor.windowBorder);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        jPanel4.setBackground(java.awt.SystemColor.controlDkShadow);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial de Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_razon_socialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_razon_socialFocusLost
    }//GEN-LAST:event_txt_razon_socialFocusLost

    private void txt_razon_socialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_razon_socialKeyTyped
    }//GEN-LAST:event_txt_razon_socialKeyTyped

    private void txt_dvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dvKeyTyped
    }//GEN-LAST:event_txt_dvKeyTyped

    private void txt_numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numeroKeyTyped
    }//GEN-LAST:event_txt_numeroKeyTyped

    private void txt_calleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_calleFocusLost
    }//GEN-LAST:event_txt_calleFocusLost

    private void txt_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_calleKeyTyped
    }//GEN-LAST:event_txt_calleKeyTyped

    private void txt_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusLost
    }//GEN-LAST:event_txt_emailFocusLost

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_fono_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fono_1ActionPerformed
    }//GEN-LAST:event_txt_fono_1ActionPerformed

    private void txt_fono_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fono_1KeyTyped
    }//GEN-LAST:event_txt_fono_1KeyTyped

    private void txt_fono_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fono_2KeyTyped
    }//GEN-LAST:event_txt_fono_2KeyTyped

    private void txt_resto_direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_resto_direccionFocusLost
    }//GEN-LAST:event_txt_resto_direccionFocusLost

    private void txt_resto_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_resto_direccionKeyTyped
    }//GEN-LAST:event_txt_resto_direccionKeyTyped

    private void txt_provinciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_provinciaFocusLost
    }//GEN-LAST:event_txt_provinciaFocusLost

    private void txt_provinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_provinciaKeyTyped
    }//GEN-LAST:event_txt_provinciaKeyTyped

    private void txt_regionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regionFocusLost
    }//GEN-LAST:event_txt_regionFocusLost

    private void txt_regionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regionKeyTyped
    }//GEN-LAST:event_txt_regionKeyTyped

    private void txt_comunaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_comunaFocusLost
    }//GEN-LAST:event_txt_comunaFocusLost

    private void txt_comunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_comunaKeyTyped
    }//GEN-LAST:event_txt_comunaKeyTyped

    private void txt_rutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_rutFocusLost
        if (Pattern.matches("[0-9]+$", txt_rut.getText())) {
            buscar_proveedor();
        } else {
            if (!"".equals(txt_rut.getText())) {
                JOptionPane.showMessageDialog(null, "Solo números");
                txt_rut.setText("");
                txt_rut.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_rutFocusLost

    private void txt_rutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyTyped
        valida_caracteres(8, txt_rut, evt);
    }//GEN-LAST:event_txt_rutKeyTyped

    private void txt_rutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rutKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Pattern.matches("[0-9]+$", txt_rut.getText())) {
                buscar_proveedor();
            } else {
                if (!"".equals(txt_rut.getText())) {
                    JOptionPane.showMessageDialog(null, "Solo números");
                    txt_rut.setText("");
                    txt_rut.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_txt_rutKeyPressed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar_form_proveedor();
        txt_rut.setEnabled(true);
        txt_rut.requestFocus();
        btn_busqueda_avanzada.setEnabled(true);
        btn_crear_proveedor.setEnabled(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busqueda_avanzada;
    private javax.swing.JButton btn_crear_proveedor;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_codigo_barras;
    private javax.swing.JTextField txt_comuna;
    private javax.swing.JTextField txt_dv;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fono_1;
    private javax.swing.JTextField txt_fono_2;
    private javax.swing.JTextField txt_nombre_producto;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_precio_producto;
    private javax.swing.JTextField txt_provincia;
    private javax.swing.JTextField txt_razon_social;
    private javax.swing.JTextField txt_region;
    private javax.swing.JTextField txt_resto_direccion;
    private javax.swing.JTextField txt_rut;
    // End of variables declaration//GEN-END:variables
    
    private void buscar_proveedor() {
        conexionMySQL mysql = new conexionMySQL();
        java.sql.Connection cn = mysql.conexion();
        
        String rut = txt_rut.getText();
        
        String consulta = "SELECT \n" +
                        "    p.razon_social, \n" +
                        "    p.calle, \n" +
                        "    p.numero, \n" +
                        "    p.resto_direccion,\n" +
                        "    p.email, \n" +
                        "    p.fono_1, \n" +
                        "    p.fono_2, \n" +
                        "    p.dv,\n" +
                        "    c.nombre as comuna, \n" +
                        "    pr.nombre as provincia, \n" +
                        "    r.nombre as region \n" +
                        "FROM \n" +
                        "	proveedores p\n" +
                        "    left join comunas c on p.id_comuna = c.id\n" +
                        "    left join provincias pr on c.id_provincia = pr.id\n" +
                        "    left join regiones r on pr.id_region = r.id \n" +
                        "where p.rut = '"+ rut + "'";
        
        try {
            Statement st = cn.createStatement();
            ResultSet resultado = st.executeQuery(consulta);
            
            int cont = 0;
            
            while (resultado.next()) {
                cont++;
                txt_dv.setText(resultado.getString("dv"));
                txt_razon_social.setText(resultado.getString("razon_social"));
                txt_region.setText(resultado.getString("region"));
                txt_provincia.setText(resultado.getString("provincia"));
                txt_comuna.setText(resultado.getString("comuna"));
                txt_calle.setText(resultado.getString("calle"));
                txt_numero.setText(resultado.getString("numero"));
                txt_resto_direccion.setText(resultado.getString("resto_direccion"));
                txt_email.setText(resultado.getString("email"));
                txt_fono_1.setText(resultado.getString("fono_1"));
                txt_fono_2.setText(resultado.getString("fono_2"));
            }
           
            if (cont == 0) {
                txt_rut.setText("");
                txt_rut.requestFocus();
                JOptionPane.showMessageDialog(null, "Proveedor no existe");
            } else {
                txt_rut.setEnabled(false);
                btn_busqueda_avanzada.setEnabled(false);
                btn_crear_proveedor.setEnabled(false);
            }
            //resultado.getString("dv");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    private void valida_caracteres(int numerocarateres, JTextField objeto, java.awt.event.KeyEvent evt) {
        if (objeto.getText().length() >= numerocarateres) {
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "Solo " + numerocarateres + " caracteres permitidos");
        }
    }

    private void limpiar_form_proveedor() {
        txt_rut.setText("");
        txt_dv.setText("");
        txt_razon_social.setText("");
        txt_region.setText("");
        txt_provincia.setText("");
        txt_comuna.setText("");
        txt_calle.setText("");
        txt_numero.setText("");
        txt_resto_direccion.setText("");
        txt_email.setText("");
        txt_fono_1.setText("");
        txt_fono_2.setText("");
    }
}
