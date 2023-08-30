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
public class frmlibro extends javax.swing.JFrame {

    private libroBeans libro;
    
    public frmlibro() {
        initComponents();
         try {
            libro= new libroBeans();
            cargarDatosComboBox();
        } catch (Exception e) {
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        libroBeans = new javax.swing.JLabel();
        idLibro = new javax.swing.JLabel();
        txtidlibro = new javax.swing.JTextField();
        ISBN = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        idAutor = new javax.swing.JLabel();
        txtidautor = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        editorial = new javax.swing.JLabel();
        txteditorial = new javax.swing.JTextField();
        paginas = new javax.swing.JLabel();
        txtpaginas = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        itemlibro = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtlibro = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        libroBeans.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        libroBeans.setForeground(new java.awt.Color(0, 51, 255));
        libroBeans.setText("libroBeans");
        getContentPane().add(libroBeans, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 0, 125, 31));

        idLibro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLibro.setText("idLibro");
        getContentPane().add(idLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 78, -1, -1));
        getContentPane().add(txtidlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 76, 41, -1));

        ISBN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ISBN.setText("ISBN");
        getContentPane().add(ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 117, -1, -1));
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 114, 57, -1));

        idAutor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idAutor.setText("idAutor");
        getContentPane().add(idAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 154, -1, -1));
        getContentPane().add(txtidautor, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 152, 58, -1));

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titulo.setText("Titulo");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 78, -1, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 75, 119, -1));

        editorial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editorial.setText("editorial");
        getContentPane().add(editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 117, -1, -1));
        getContentPane().add(txteditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 114, 119, -1));

        paginas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        paginas.setText("paginas");
        getContentPane().add(paginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 155, -1, -1));
        getContentPane().add(txtpaginas, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 152, 49, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 51, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 41, -1, -1));

        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 51, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 78, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 51, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 119, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 51, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 159, -1, -1));

        itemlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemlibroActionPerformed(evt);
            }
        });
        getContentPane().add(itemlibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jtlibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtlibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Titulo", "ISBN", "editorial", "paginas", "idAutor"
            }
        ));
        jtlibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtlibroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtlibro);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 296, 400, 90));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 363, -1, -1));

        jPanel1.setBackground(new java.awt.Color(187, 216, 209));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jtlibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtlibroMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_jtlibroMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ingresofrm in =new ingresofrm();
        this.setVisible(false);
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.Actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void itemlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemlibroActionPerformed
        // TODO add your handling code here:
        int idLibro = Integer.parseInt(itemlibro.getSelectedItem().toString());
        mostrarDatoslibroBeans(idLibro);
    }//GEN-LAST:event_itemlibroActionPerformed

    private void nuevo() {
        try {
            libroBeans lb = new libroBeans();
            txtidlibro.setText("" + lb.Incremento_libro());
            txtTitulo.setText("");
            txtISBN.setText("");
            txteditorial.setText("");
            txtpaginas.setText("");
            txtidautor.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error..." + e.toString());
        }
    }
    private void cargarDatosComboBox() {
        try {
            ResultSet rs = libro.obtenerlibro();
            itemlibro.removeAllItems();
            while (rs.next()) {
                int idLibro = rs.getInt("idLibro");
                itemlibro.addItem(String.valueOf(idLibro));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos del ComboBox: " + e.toString());
        }
    }

    private void mostrarDatoslibroBeans(int idLibro) {
        try {
            ResultSet rs = libro.obtenerlibro(idLibro);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("titulo");
            modelo.addColumn("ISBN");
            modelo.addColumn("editorial");
            modelo.addColumn("paginas");
            modelo.addColumn("idAutor");

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("idLibro"),
                    rs.getString("titulo"),
                    rs.getString("ISBN"),    
                    rs.getString("editorial"),
                    rs.getString("paginas"),
                    rs.getString("idAutor"),
                };
                modelo.addRow(fila);
            }

            jtlibro.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos del libro: " + e.toString());
        }
    }

    private void enviar() {
        try {
            libroBeans lb = new libroBeans();
            lb.setIdLibro(Integer.parseInt(txtidlibro.getText()));
            lb.setTitulo(txtTitulo.getText());
            lb.setISBN(Integer.parseInt(txtISBN.getText()));
            lb.setEditorial(txteditorial.getText());
            lb.setPaginas(Integer.parseInt(txtpaginas.getText()));
            lb.setIdAutor(Integer.parseInt(txtidautor.getText()));
            lb.Insertar_libro();
            this.mostrar(jtlibro, "select * from libro");
            JOptionPane.showMessageDialog(null, "La informacion ha sido guardado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transaccion RollBack..." + e.toString());
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            libroBeans lb = new libroBeans();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = lb.consultaTabla(sql);
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
        int fila=jtlibro.getSelectedRow();
        txtidlibro.setText(jtlibro.getModel().getValueAt(fila, 0).toString());
        txtTitulo.setText(jtlibro.getModel().getValueAt(fila, 1).toString());
        txtISBN.setText(jtlibro.getModel().getValueAt(fila, 2).toString());
        txteditorial.setText(jtlibro.getModel().getValueAt(fila, 3).toString());
        txtpaginas.setText(jtlibro.getModel().getValueAt(fila, 4).toString());
        txtidautor.setText(jtlibro.getModel().getValueAt(fila, 5).toString());
        
    }
    
    private void Actualizar(){
        try{
            libroBeans lb = new libroBeans();
            lb.setIdLibro(Integer.parseInt(txtidlibro.getText()));
            lb.setTitulo(txtTitulo.getText());
            lb.setISBN(Integer.parseInt(txtISBN.getText()));
            lb.setEditorial(txteditorial.getText());
            lb.setPaginas(Integer.parseInt(txtpaginas.getText()));
            lb.setIdAutor(Integer.parseInt(txtidautor.getText()));
            lb.Actualizar_libro();
            this.mostrar(jtlibro, "select * from libro");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de transicion ROliBack.." + e.toString());
        }
    }
    private void Eliminar(){
        try {
            libroBeans lb = new libroBeans();
            lb.setIdLibro(Integer.parseInt(txtidlibro.getText()));
            lb.Eliminar_libro();
            this.mostrar(jtlibro, "select * from libro");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de transicion ROliBack.." + e.toString());
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ISBN;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel editorial;
    private javax.swing.JLabel idAutor;
    private javax.swing.JLabel idLibro;
    private javax.swing.JComboBox<String> itemlibro;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtlibro;
    private javax.swing.JLabel libroBeans;
    private javax.swing.JLabel paginas;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txteditorial;
    private javax.swing.JTextField txtidautor;
    private javax.swing.JTextField txtidlibro;
    private javax.swing.JTextField txtpaginas;
    // End of variables declaration//GEN-END:variables
}
