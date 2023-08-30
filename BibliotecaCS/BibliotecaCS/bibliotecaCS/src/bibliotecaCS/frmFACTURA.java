
package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jonat
 */
public class frmFACTURA extends javax.swing.JFrame {
private facturaBeans factura;
    
    public frmFACTURA() throws Exception {
        initComponents();
        factura = new facturaBeans();
        cargarDatosComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfactura = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtidprestamo = new javax.swing.JTextField();
        idPrestamo = new javax.swing.JLabel();
        Fechaprest = new javax.swing.JLabel();
        Fechadevo1 = new javax.swing.JLabel();
        txtfechadevo = new javax.swing.JTextField();
        txtfechaprest = new javax.swing.JTextField();
        precio = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        itemusuario = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        txtp2 = new javax.swing.JTextField();
        txtp3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        txtp1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        txtnfactura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("Factura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 246, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idFactura", "idUsuario ", "IVA", "total"
            }
        ));
        jScrollPane1.setViewportView(jtfactura);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 350, 90));

        jPanel3.setBackground(new java.awt.Color(213, 230, 244));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Detalles de prestamo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel6)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 30));

        jPanel4.setBackground(new java.awt.Color(213, 230, 244));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Informacion del Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel5)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 30));

        jPanel5.setBackground(new java.awt.Color(194, 219, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);
        jPanel5.add(txtidprestamo);
        txtidprestamo.setBounds(100, 10, 60, 20);

        idPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        idPrestamo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idPrestamo.setText("ID");
        jPanel5.add(idPrestamo);
        idPrestamo.setBounds(40, 10, 40, 14);

        Fechaprest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Fechaprest.setText("fechaprest");
        jPanel5.add(Fechaprest);
        Fechaprest.setBounds(180, 10, 61, 10);

        Fechadevo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Fechadevo1.setText("fechadevo");
        jPanel5.add(Fechadevo1);
        Fechadevo1.setBounds(370, 10, 59, 14);

        txtfechadevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechadevoActionPerformed(evt);
            }
        });
        jPanel5.add(txtfechadevo);
        txtfechadevo.setBounds(440, 10, 100, 20);

        txtfechaprest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaprestActionPerformed(evt);
            }
        });
        jPanel5.add(txtfechaprest);
        txtfechaprest.setBounds(250, 10, 110, 20);

        precio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        precio.setText("precio");
        jPanel5.add(precio);
        precio.setBounds(30, 60, 35, 14);

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel5.add(txtprecio);
        txtprecio.setBounds(100, 50, 80, 20);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 560, 80));

        jPanel6.setBackground(new java.awt.Color(194, 219, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Telefono");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(10, 52, 49, 14);
        jPanel6.add(txttelefono);
        txttelefono.setBounds(77, 49, 100, 20);
        jPanel6.add(txtdireccion);
        txtdireccion.setBounds(290, 49, 260, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Direccion");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(228, 52, 52, 14);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel6.add(txtnombre);
        txtnombre.setBounds(190, 10, 280, 20);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nombre del usuario");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(10, 14, 109, 14);

        itemusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemusuarioActionPerformed(evt);
            }
        });
        jPanel6.add(itemusuario);
        itemusuario.setBounds(130, 10, 40, 20);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 560, 80));

        jPanel7.setBackground(new java.awt.Color(194, 219, 240));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtp2ActionPerformed(evt);
            }
        });

        jLabel11.setText("$");

        total.setText("Total");

        jLabel12.setText("$");

        jLabel13.setText("$");

        Precio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Precio.setText("Precio");

        IVA.setText("IVA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total)
                    .addComponent(IVA))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtp1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtp2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(txtp3)))
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Precio)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(IVA)
                    .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(txtp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 230, 140));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("FACTURA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regresar.setText("regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));
        jPanel1.add(txtnfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 20, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechadevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechadevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechadevoActionPerformed

    private void txtfechaprestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaprestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaprestActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtp2ActionPerformed

    private void itemusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemusuarioActionPerformed
        // TODO add your handling code here:
        try {
        String facturaSeleccionada = itemusuario.getSelectedItem().toString();
        ResultSet rs = factura.consultaTabla("SELECT u.nombre, u.telefono, u.direccion, p.idPrestamo, p.fechaprest, p.fechadevo, p.precio FROM factura f JOIN usuario u ON f.idUsuario = u.idUsuario JOIN prestamo p ON u.idUsuario = p.idUsuario WHERE u.idUsuario = '"+ facturaSeleccionada +"'");

        if (rs.next()) {
            txtnombre.setText(rs.getString("nombre"));
            txttelefono.setText(rs.getString("telefono"));
            txtdireccion.setText(rs.getString("direccion"));
            txtidprestamo.setText(rs.getString("idPrestamo"));
            txtfechaprest.setText(rs.getString("fechaprest"));
            txtfechadevo.setText(rs.getString("fechadevo"));
            txtprecio.setText(rs.getString("precio"));
            txtp1.setText(rs.getString("precio"));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.toString());
    
}
        
    }//GEN-LAST:event_itemusuarioActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        ingresofrm in =new ingresofrm();
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.guardar();
    }//GEN-LAST:event_jButton1ActionPerformed
private void nuevo() {
        try {
            facturaBeans ab = new facturaBeans();
            txtnfactura.setText("" + ab.Incremento_factura());
            txtnombre.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }
private void guardar() {
        try {
            facturaBeans ff = new facturaBeans();
            usuarioBeans ub = new usuarioBeans();
            ff.setIdFactura(Integer.parseInt(txtnombre.getText()));
            ub.setTelefono(Integer.parseInt(txttelefono.getText()));
            ub.setDireccion(txtdireccion.getText());

            ff.Insertar_factura();
            this.mostrar(jtfactura, "select * from usuario");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }
private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            usuarioBeans ub = new usuarioBeans(); 
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = ub.consultaTabla(sql);
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();
            int cantcolumnas = rsMd.getColumnCount();
            for (int i = 1; i <= cantcolumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] columna = new Object[cantcolumnas];
                for (int i = 0; i < cantcolumnas; i++) {
                    columna[i] = rs.getObject(i + 1);
                }
                modelo.addRow(columna);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }

    private void cargarDatosComboBox() {
        try {
            ResultSet rs = factura.consultaTabla("select * from usuario");
            
            while (rs.next()) {
            itemusuario.addItem(rs.getString("idUsuario"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos del ComboBox: " + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fechadevo1;
    private javax.swing.JLabel Fechaprest;
    private javax.swing.JLabel IVA;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel idPrestamo;
    private javax.swing.JComboBox<String> itemusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtfactura;
    private javax.swing.JLabel precio;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfechadevo;
    private javax.swing.JTextField txtfechaprest;
    private javax.swing.JTextField txtidprestamo;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtnfactura;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtp1;
    private javax.swing.JTextField txtp2;
    private javax.swing.JTextField txtp3;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
