/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class frmautores extends javax.swing.JFrame {

    private autorBeans autor;
    /**
     * Creates new form frmejemplar
     */
    public frmautores() {
        initComponents();
        try {
            autor = new autorBeans();
            cargarDatosComboBox();
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidautor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnenviar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtautor = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        itemautor = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 238, 243));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("autorBeans");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 27, 132, 53));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("idAutor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 119, 69, 30));

        txtidautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidautorActionPerformed(evt);
            }
        });
        getContentPane().add(txtidautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 120, 81, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("nombres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 167, 69, 30));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 170, 280, 28));

        btnenviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnenviar.setForeground(new java.awt.Color(0, 51, 255));
        btnenviar.setText("enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 240, 85, 33));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("actualizar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 240, 109, 33));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 240, 85, 33));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 240, 85, 33));

        jtautor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtautor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtautor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idAutor", "nombres"
            }
        ));
        jScrollPane1.setViewportView(jtautor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 347, 480, 94));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 255));
        jButton5.setText("regresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        itemautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemautorActionPerformed(evt);
            }
        });
        getContentPane().add(itemautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jPanel1.setBackground(new java.awt.Color(236, 209, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidautorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidautorActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.Actualizar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        this.nuevo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ingresofrm in =new ingresofrm();
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnenviarActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.Eliminar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void itemautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemautorActionPerformed
        // TODO add your handling code here:
        int idAutor = Integer.parseInt(itemautor.getSelectedItem().toString());
        mostrarDatosautorBeans(idAutor);
    }//GEN-LAST:event_itemautorActionPerformed

    private void nuevo() {
        try {
            autorBeans ab = new autorBeans();
            txtidautor.setText("" + ab.Incremento_autor());
            txtnombre.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }

    private void cargarDatosComboBox() {
        try {
            ResultSet rs = autor.obtenerautor();
            itemautor.removeAllItems();
            while (rs.next()) {
                int idAutor = rs.getInt("idAutor");
                itemautor.addItem(String.valueOf(idAutor));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos del ComboBox: " + e.toString());
        }
    }

    private void mostrarDatosautorBeans(int idAutor) {
        try {
            ResultSet rs = autor.obtenerautor(idAutor);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("nombres");
            

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("idAutor"),
                    rs.getString("nombres"),
                         
                };
                modelo.addRow(fila);
            }

            jtautor.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos del autor: " + e.toString());
        }
    }
    
    private void enviar() {
        try {
            autorBeans ab = new autorBeans();
            ab.setIdAutor(Integer.parseInt(txtidautor.getText()));
            ab.setNombres(txtnombre.getText());
            
            ab.Insertar_autor();
            this.mostrar(jtautor, "select * from autor");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            autorBeans ab = new autorBeans(); 
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = ab.consultaTabla(sql);
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
        int fila=jtautor.getSelectedRow();
        txtidautor.setText(jtautor.getModel().getValueAt(fila, 0).toString());
        txtnombre.setText(jtautor.getModel().getValueAt(fila, 1).toString());
        
        
    }
    private void Actualizar(){
        try{
            autorBeans ab = new autorBeans();
            ab.setIdAutor(Integer.parseInt(txtidautor.getText()));
            ab.setNombres(txtnombre.getText());
            ab.Actualizar_autor();
            this.mostrar(jtautor, "select * from autor");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de transicion ROliBack.." + e.toString());
        }
    }
    private void Eliminar(){
        try {
            autorBeans ab = new autorBeans();
            ab.setIdAutor(Integer.parseInt(txtidautor.getText()));
            ab.Eliminar_autor();
            this.mostrar(jtautor, "select * from autor");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transicion ROliBack.." + e.toString());
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnenviar;
    private javax.swing.JComboBox<String> itemautor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtautor;
    private javax.swing.JTextField txtidautor;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
