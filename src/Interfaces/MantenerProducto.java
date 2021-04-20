/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import dao.DAOFactory;
import dao.component.BDRelacionalProductoDAO;
import dao.design.IProductoDAO;
import dao.to.ProductoTO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orlando
 */
public class MantenerProducto extends javax.swing.JFrame {

    /**
     * Creates new form MantenerProducto
     */
    //DAOFactory relFactoria=DAOFactory.getDAOFactoria(DAOFactory.Relacional);
    //IProductoDAO proDAO=relFactoria.getProductoDAO();
    List<ProductoTO> listaPro;
    public MantenerProducto() {
        initComponents();
        MostrarTodosProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        btnAniadir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonVolverLogin = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 130, -1, -1));
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 201, 100, 24));

        btnAniadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnAniadir.setText("Añadir");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 97, 93, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Descripcioin:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 126, -1, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cantidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 163, 77, 29));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 128, 100, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("PRODUCTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 68, -1, 23));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 164, 100, 31));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carrito.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 56, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Codigo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 126, 54, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 163, -1, 29));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 230, -1, 120));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Costo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 201, 54, 24));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 201, 93, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 129, 100, 31));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 166, 93, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 165, 100, 29));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Carrito.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MINI MARKET \"CAMARENA\"");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 11, -1, 41));

        jButtonVolverLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casa.png"))); // NOI18N
        jButtonVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 356, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        // TODO add your handling code here:
       try {
            ProductoTO producto = new ProductoTO();
            producto.setCodigo(this.txtCodigo.getText());           
            producto.setNombre(this.txtNombre.getText());
            producto.setDescripción(this.txtDescripcion.getText());
            producto.setCantidad(Integer.parseInt(this.txtCantidad.getText()));
            producto.setCosto(Double.parseDouble(this.txtCosto.getText()));
            
            BDRelacionalProductoDAO dao=new BDRelacionalProductoDAO();
            dao.insertarProducto(producto);
            //proDAO.insertarProducto(producto);
            MostrarTodosProductos();
            //JOptionPane.showMessageDialog(this, "Rellene todos los datos");
            JOptionPane.showMessageDialog(null, "Producto Añadido");
            //JOptionPane.showMessageDialog(null, "PRODUCTO NO AÑADIDO", "Debe rellenar todos los datos", JOptionPane.WARNING_MESSAGE);
       } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Rellene todos los datos");
        }       
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String codigo=JOptionPane.showInputDialog("Ingrese el ID del producto que desea eliminar");
        BDRelacionalProductoDAO dao= new BDRelacionalProductoDAO();
        int n=Buscar(codigo);
        
        if(n==1){
            int r=JOptionPane.showConfirmDialog(this, "Esra seguro de eliminar el produto?","Responder",0);
            if(r==0){
                dao.eliminarProducto(codigo);
                //proDAO.eliminarProducto(codigo);
                MostrarTodosProductos();
            }
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
         try {
            ProductoTO producto2 = new ProductoTO();
            producto2.setCodigo(this.txtCodigo.getText());          
            producto2.setNombre(this.txtNombre.getText());
            producto2.setDescripción(this.txtDescripcion.getText());
            producto2.setCantidad(Integer.parseInt(this.txtCantidad.getText()));
            producto2.setCosto(Double.parseDouble(this.txtCosto.getText()));

            BDRelacionalProductoDAO dao = new BDRelacionalProductoDAO();
            dao.actualizarProducto(producto2);
            //proDAO.actualizarProducto(producto2);
            MostrarTodosProductos();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Rellene todos los datos");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String codigo=JOptionPane.showInputDialog("Ingres el ID del Producto que desea buscar0");
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButtonVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverLoginActionPerformed
        // TODO add your handling code here:
        Login l=new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverLoginActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion=jTable1.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(jTable1.getValueAt(seleccion, 0)));
        txtNombre.setText(String.valueOf(jTable1.getValueAt(seleccion, 1)));
        txtDescripcion.setText(String.valueOf(jTable1.getValueAt(seleccion, 2)));
        txtCosto.setText(String.valueOf(jTable1.getValueAt(seleccion, 3)));
        txtCantidad.setText(String.valueOf(jTable1.getValueAt(seleccion, 4)));
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButtonVolverLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void MostrarTodosProductos() {
        BDRelacionalProductoDAO dao=new BDRelacionalProductoDAO();
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("NOMBRE");
        model.addColumn("DESCRIPCION");
        model.addColumn("COSTO S/.");
        model.addColumn("CANTIDAD");
        
        jTable1.setModel(model);
        listaPro=dao.listarProducto();
        //listaPro=proDAO.listarProducto();
        for (int i = 0; i < listaPro.size(); i++) {
            Object[] row = {listaPro.get(i).getCodigo(),
                listaPro.get(i).getNombre(), listaPro.get(i).getDescripción(),
                listaPro.get(i).getCosto(), listaPro.get(i).getCantidad()};
            model.addRow(row);
        }
    }

    private int Buscar(String codigo) {
        BDRelacionalProductoDAO dao= new BDRelacionalProductoDAO();
        listaPro=dao.listarProductosCodigo();
        //listaPro=proDAO.listarProductosCodigo();
        for(int i=0;i<listaPro.size();i++){
            if(listaPro.get(i).getCodigo().equals(codigo)){
                return 1;
            }
        }
        return -1;
    }
}
