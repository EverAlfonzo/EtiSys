/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etiproject;

import clases.DBConnect;
import clases.Usuario;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ever
 */
public class JDListInsumo extends javax.swing.JDialog {
    DBConnect con;
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    DefaultTableModel m;
    Usuario user;
    private String prov;
    private String cat;
    /**
     * Creates new form JDListInsumo
     */
    public JDListInsumo(java.awt.Frame parent, boolean modal, DBConnect con, Usuario user) {
        super(parent, modal);
        initComponents();
        this.setTitle("Lista de Insumos");
        this.con=con;
        this.user=user;
        this.setIconImage(imagen);
        preparartabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInsumos = new javax.swing.JTable();
        jbtAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jxtfBuscar = new org.jdesktop.swingx.JXTextField();
        jbtAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jMenuItem1.setText("Ver Insumo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));

        jTableInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Categoría", "Nombre", "Cantidad", "Proveedor", "Condición de Pago", "Precio Unitario", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInsumos.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTableInsumos);

        jbtAtras.setText("Atrás");
        jbtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtrasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 122, 122));
        jLabel2.setText("Buscar:");

        jcbCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TODOS", "Insumos para Oficina", "Insumos CCTV", "Insumos PCI", "Insumos para Refrigeración", "Insumos para Electricidad", "Insumos para Limpieza", "Insumos IT", "Insumos Informática" }));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(122, 122, 122));
        jLabel1.setText("Categoría:");

        jxtfBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jxtfBuscarCaretUpdate(evt);
            }
        });

        jbtAgregar.setText("Agregar Insumo");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(122, 122, 122));
        jLabel4.setText("INSUMOS");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jxtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtAtras)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jxtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAtras)
                    .addComponent(jbtAgregar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jxtfBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jxtfBuscarCaretUpdate
        
        int iOrderBy=0;
        //Limpia selección de la tabla
        jTableInsumos.clearSelection();
        String titulos[]={"Código", "Categoría", "Nombre", "Cantidad", "Proveedor", "Condición de Pago", "Precio Unitario", "Subtotal"};
        m = (new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código", "Categoría", "Nombre", "Cantidad", "Proveedor", "Condición de Pago", "Precio Unitario", "Subtotal"})
             {
                 boolean[] canEdit = new boolean [] {false, false, false, false, false, false,false};

                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }});
        
        jTableInsumos.setModel(m); 
        m= (DefaultTableModel) jTableInsumos.getModel();
        jTableInsumos.setModel(m); 
        iOrderBy = jcbCategoria.getSelectedIndex();
       
        //TODOS,Insumos para Oficina,Insumos CCTV,Insumos PCI,Insumos para Refrigeración,Insumos para Electricidad,Insumos para Limpieza,Insumos IT,Insumos Informática
        rs=null;
      
        if(iOrderBy==0)
            rs=con.Listar("*", "insumos", " where (Id_insumo like \"%"+ jxtfBuscar.getText()+"%\") OR (Id_proveedor like \"%"+ jxtfBuscar.getText()+"%\") "
                + "OR (Id_categoria_Insumo like \"%"+ jxtfBuscar.getText()+"%\") OR (Nombre_insumo like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Cant_insumo like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Cond_Pago like \"%"+ jxtfBuscar.getText()+"%\")OR (Prec_insumo like \"%"+ jxtfBuscar.getText()+"%\")");
        else
            rs=con.Listar("*", "insumos", " where (Id_categoria_Insumo="+ iOrderBy +") && (Id_Insumo like \"%"+ jxtfBuscar.getText()+"%\") "
                    + "OR (Id_categoria_Insumo="+ iOrderBy +") && (Id_proveedor like \"%"+ jxtfBuscar.getText()+"%\") "
                    + "OR (Id_categoria_Insumo="+ iOrderBy +") && (Id_categoria_Insumo like \"%"+ jxtfBuscar.getText()+"%\") "
                    + "OR (Id_categoria_Insumo="+ iOrderBy +") && (Nombre_insumo like \"%"+ jxtfBuscar.getText()+"%\")"
                    + "OR (Id_categoria_Insumo="+ iOrderBy +") && (Cant_insumo like \"%"+ jxtfBuscar.getText()+"%\")"
                    + "OR (Id_categoria_Insumo="+ iOrderBy +") && (Cond_Pago like \"%"+ jxtfBuscar.getText()+"%\")"
                    + "OR (Id_categoria_Insumo="+ iOrderBy +") && (Prec_insumo like \"%"+ jxtfBuscar.getText()+"%\")");
        
        
        String fila[] = new String[8];
        try {
            while(rs.next()){
                fila[0]=rs.getString("Id_Insumo");
                rs2=con.Listar("Nombre_Categoria", "Categoria_insumo", "where Id_Categoria_insumo='"+rs.getString(3)+"'");
                while(rs2.next()){
                    this.cat=rs2.getString("Nombre_Categoria");
                }
                fila[1]=cat;
                fila[2]=rs.getString("Nombre_insumo");
                fila[3]=rs.getString("Cant_insumo");
                rs1=con.Listar("Nom_proveedor", "proveedor", "where Id_proveedor='"+rs.getString(2)+"'");
                while(rs1.next()){
                    this.prov=rs1.getString("Nom_proveedor");
                }
                fila[4]=prov;
                fila[5]=rs.getString("Cond_Pago");
                fila[6]=rs.getString("Prec_insumo");
                int cant=Integer.parseInt(fila[3]);
                int precio=Integer.parseInt(fila[6]);
                int subtotal=cant*precio;
                String sub=Integer.toString(subtotal);
                fila[7]=sub;
                
                
                
                 m.addRow(fila);
            }
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                                  

        
    }//GEN-LAST:event_jxtfBuscarCaretUpdate

    private void jbtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtAtrasActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        new JDNInsumo(null, true, con).setVisible(true);
        jxtfBuscarCaretUpdate(null);
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new JDInsumo(null, true, con, jTableInsumos.getValueAt(jTableInsumos.getSelectedRow(), 0).toString()).setVisible(true);
        jxtfBuscarCaretUpdate(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDListInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDListInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDListInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDListInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDListInsumo dialog = new JDListInsumo(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInsumos;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtAtras;
    private javax.swing.JComboBox jcbCategoria;
    private org.jdesktop.swingx.JXTextField jxtfBuscar;
    // End of variables declaration//GEN-END:variables

    private void preparartabla() {
            rs=null;
            rs=con.Listar("*", "insumos", "");
            m =(DefaultTableModel) jTableInsumos.getModel();
            jTableInsumos.setModel(m);
            String fila[] = new String[8];
            try {
            while(rs.next()){
                fila[0]=rs.getString(1);
                rs2=con.Listar("Nombre_Categoria", "Categoria_insumo", "where Id_Categoria_insumo='"+rs.getString(3)+"'");
                while(rs2.next()){
                    this.cat=rs2.getString("Nombre_Categoria");
                }
                fila[1]=cat;
                fila[2]=rs.getString(4);
                fila[3]=rs.getString(6);
                rs1=con.Listar("Nom_proveedor", "proveedor", "where Id_proveedor='"+rs.getString(2)+"'");
                while(rs1.next()){
                    this.prov=rs1.getString("Nom_proveedor");
                }
                fila[4]=prov;
                fila[5]=rs.getString(7);
                fila[6]=rs.getString(8);
                int cant=Integer.parseInt(fila[3]);
                int precio=Integer.parseInt(fila[6]);
                int subtotal=cant*precio;
                String sub=Integer.toString(subtotal);
                fila[7]=sub;
                m.addRow(fila);
            }

        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

}

