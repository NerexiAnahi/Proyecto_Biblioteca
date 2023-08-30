
package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class frmprestamo extends javax.swing.JFrame {
private prestamoBeans prestamo;
    /**
     * Creates new form frmprestamo
     */
    public frmprestamo() {
        initComponents();
        try {
            prestamo= new prestamoBeans();
            cargarDatosComboBox();
        } catch (Exception e) {
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        precio = new javax.swing.JLabel();
        idPrestamo = new javax.swing.JLabel();
        idEjemplar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idUsuario = new javax.swing.JLabel();
        Fechaprest = new javax.swing.JLabel();
        txtfechadevo = new javax.swing.JTextField();
        txtidprestamo = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txtidejemplar = new javax.swing.JTextField();
        txtfechaprest = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprestamo = new javax.swing.JTable();
        itemprestamo = new javax.swing.JComboBox<>();
        Fechadevo1 = new javax.swing.JLabel();
        txtidusuario = new javax.swing.JTextField();

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        precio.setText("precio");
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        idPrestamo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idPrestamo.setText("idPrestamo");
        jPanel1.add(idPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        idEjemplar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idEjemplar.setText("idEjemplar");
        jPanel1.add(idEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("prestamoBeans");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        idUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idUsuario.setText("idUsuario");
        jPanel1.add(idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        Fechaprest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Fechaprest.setText("fechaprest");
        jPanel1.add(Fechaprest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtfechadevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechadevoActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechadevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, -1));

        txtidprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidprestamoActionPerformed(evt);
            }
        });
        jPanel1.add(txtidprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, -1));

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 120, -1));

        txtidejemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidejemplarActionPerformed(evt);
            }
        });
        jPanel1.add(txtidejemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, -1));

        txtfechaprest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaprestActionPerformed(evt);
            }
        });
        jPanel1.add(txtfechaprest, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 180, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 255));
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jtprestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idPrestamo", "idUsuario", "idEjemplar", "fechaprest", "fechadevo"
            }
        ));
        jtprestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtprestamoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtprestamo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 470, 90));

        itemprestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemprestamoMouseClicked(evt);
            }
        });
        itemprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemprestamoActionPerformed(evt);
            }
        });
        jPanel1.add(itemprestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        Fechadevo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Fechadevo1.setText("fechadevo");
        jPanel1.add(Fechadevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtidusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtidusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechadevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechadevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechadevoActionPerformed

    private void txtidprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidprestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidprestamoActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtidejemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidejemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidejemplarActionPerformed

    private void txtfechaprestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaprestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaprestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ingresofrm in =new ingresofrm();
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.Actualizar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.Eliminar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtprestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtprestamoMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtprestamoMouseClicked

    private void itemprestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemprestamoMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_itemprestamoMouseClicked

    private void txtidusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidusuarioActionPerformed

    private void itemprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemprestamoActionPerformed
        // TODO add your handling code here:
        int idPrestamo = Integer.parseInt(itemprestamo.getSelectedItem().toString());
        mostrarDatosprestamoBeans(idPrestamo);  
    }//GEN-LAST:event_itemprestamoActionPerformed

    private void nuevo() {
        try {
            prestamoBeans pb = new prestamoBeans();
            txtidprestamo.setText("" + pb.Incremento_prestamo());
            txtidusuario.setText("");
            txtidejemplar.setText("");
            txtfechaprest.setText("");
            txtfechadevo.setText(""); 
            txtprecio.setText(""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }
private void cargarDatosComboBox() {
        try {
            ResultSet rs = prestamo.obtenerprestamo();
            itemprestamo.removeAllItems();
            while (rs.next()) {
                int idPrestamo= rs.getInt("idPrestamo");
                itemprestamo.addItem(String.valueOf(idPrestamo));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos del ComboBox: " + e.toString());
        }
    }

    private void mostrarDatosprestamoBeans(int idPrestamo) {
        try {
            ResultSet rs = prestamo.obtenerprestamo(idPrestamo);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("idUsuario");
            modelo.addColumn("idEjemplar");
             modelo.addColumn("fechaprest");
            modelo.addColumn("fechadevo");
             modelo.addColumn("precio");

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("idPrestamo"),
                    rs.getString("idUsuario"),
                    rs.getString("idEjemplar"), 
                    rs.getInt("fechaprest"),
                    rs.getString("fechadevo"),
                    rs.getString("precio"),   
                };
                modelo.addRow(fila);
            }

            jtprestamo.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos del prestamo: " + e.toString());
        }
    }
    private void enviar() {
        try {
            prestamoBeans pb = new prestamoBeans();
            pb.setIdPrestamo(Integer.parseInt(txtidprestamo.getText()));
            pb.setIdUsuario(Integer.parseInt (txtidusuario.getText()));
            pb.setIdEjemplar(Integer.parseInt(txtidejemplar.getText()));
            pb.setFechaprest(txtfechaprest.getText());
            pb.setFechadevo(txtfechadevo.getText());
            pb.setPrecio(Double.parseDouble(txtprecio.getText()));
            pb.Insertar_prestamo();
            this.mostrar(jtprestamo, "select * from prestamo");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            prestamoBeans pb = new prestamoBeans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = pb.consultaTabla(sql);
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

    private void MouseClick() {
        int fila=jtprestamo.getSelectedRow();
        txtidprestamo.setText(jtprestamo.getModel().getValueAt(fila, 0).toString());
        txtidusuario.setText(jtprestamo.getModel().getValueAt(fila, 1).toString());
        txtidejemplar.setText(jtprestamo.getModel().getValueAt(fila, 2).toString());
        txtfechaprest.setText(jtprestamo.getModel().getValueAt(fila, 3).toString());
        txtfechadevo.setText(jtprestamo.getModel().getValueAt(fila, 4).toString());
        txtprecio.setText(jtprestamo.getModel().getValueAt(fila, 5).toString());
        
    }
    
    private void Actualizar(){
        try{
            prestamoBeans pb = new prestamoBeans();
            pb.setIdPrestamo(Integer.parseInt(txtidprestamo.getText())); 
            pb.setIdUsuario(Integer.parseInt(txtidusuario.getText()));
            pb.setIdEjemplar(Integer.parseInt(txtidejemplar.getText()));
            pb.setFechaprest(txtfechaprest.getText());
            pb.setFechadevo(txtfechadevo.getText());
            pb.setPrecio(Double.parseDouble(txtprecio.getText()));
            pb.Actualizar_prestamo();
            this.mostrar(jtprestamo, "select * from prestamo");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de transicion ROliBack.." + e.toString());
        }
    }
    private void Eliminar(){
        try {
            prestamoBeans pb = new prestamoBeans();
            pb.setIdPrestamo(Integer.parseInt(txtidprestamo.getText()));
            pb.Eliminar_prestamo();
            this.mostrar(jtprestamo, "select * from prestamo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transicion ROliBack.." + e.toString());
        }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fechadevo1;
    private javax.swing.JLabel Fechaprest;
    private javax.swing.JLabel idEjemplar;
    private javax.swing.JLabel idPrestamo;
    private javax.swing.JLabel idUsuario;
    private javax.swing.JComboBox<String> itemprestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtprestamo;
    private javax.swing.JLabel precio;
    private javax.swing.JTextField txtfechadevo;
    private javax.swing.JTextField txtfechaprest;
    private javax.swing.JTextField txtidejemplar;
    private javax.swing.JTextField txtidprestamo;
    private javax.swing.JTextField txtidusuario;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
