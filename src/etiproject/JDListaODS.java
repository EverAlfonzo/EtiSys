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
public class JDListaODS extends javax.swing.JDialog {
    DBConnect con;
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    Usuario user;
    ResultSet rs;
    ResultSet rs1;
    DefaultTableModel m;
    private String cliente;
    /**
     * Creates new form JDListaODS
     */
    public JDListaODS(java.awt.Frame parent, boolean modal,  DBConnect con, Usuario user) {
        super(parent, modal);
        initComponents();
        this.setTitle("Lista de Orden de Servicio");
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
        jbtAtras = new javax.swing.JButton();
        jbtAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableODS = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jxtfBuscar = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("Ver ODS");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));

        jbtAtras.setText("Atrás");
        jbtAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtrasActionPerformed(evt);
            }
        });

        jbtAgregar.setText("Nueva ODS");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        jTableODS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Estado", "Cliente", "Rubro", "Fecha", "Encargado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableODS.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTableODS);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(122, 122, 122));
        jLabel3.setText("Buscar:");

        jxtfBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jxtfBuscarCaretUpdate(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 122, 122));
        jLabel2.setText("ODS");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jxtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtAtras)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jxtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtAtrasActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        new JDNODS(null, true, con, user).setVisible(true);
        jxtfBuscarCaretUpdate(null);
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jxtfBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jxtfBuscarCaretUpdate
        
        
        jTableODS.clearSelection();
        String titulos[]={"Código", "Estado", "Cliente", "Rubro", "Fecha", "Encargado"};
        m = (new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código", "Estado", "Cliente", "Rubro", "Fecha", "Encargado"})
             {
                 boolean[] canEdit = new boolean [] {false, false, false, false, false, false,false};

                 public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }});

        jTableODS.setModel(m); 
        m= (DefaultTableModel) jTableODS.getModel();
        jTableODS.setModel(m); 
        
        
        rs=null;

        rs=con.Listar("*", "ods", " where (Id_Orden like \"%"+ jxtfBuscar.getText()+"%\") OR (Estado_Orden like \"%"+ jxtfBuscar.getText()+"%\") "
                + "OR (Id_Cliente like \"%"+ jxtfBuscar.getText()+"%\") OR (Rubro_Orden like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Fecha_Orden like \"%"+ jxtfBuscar.getText()+"%\") OR (Cabeza_Orden like \"%"+ jxtfBuscar.getText()+"%\")");
        
        String fila[] = new String[6];
        
        try {
            while(rs.next()){
                fila[0]=rs.getString("Id_Orden");
                fila[1]=rs.getString("Estado_Orden");
                rs1=con.Listar("Nombre_Cliente", "cliente", "where Id_Cliente='"+rs.getString(4)+"'");
                while(rs1.next()){
                    this.cliente=rs1.getString("Nombre_Cliente");
                }
                fila[2]=cliente;
                fila[3]=rs.getString("Rubro_Orden");
                fila[4]=rs.getString("Fecha_Orden");
                fila[5]=rs.getString("Cabeza_Orden");
                
                
                
                 m.addRow(fila);
            }
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
                                          

        
    }//GEN-LAST:event_jxtfBuscarCaretUpdate

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
            java.util.logging.Logger.getLogger(JDListaODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDListaODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDListaODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDListaODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDListaODS dialog = new JDListaODS(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableODS;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtAtras;
    private org.jdesktop.swingx.JXTextField jxtfBuscar;
    // End of variables declaration//GEN-END:variables

    private void preparartabla() {
         rs=null;
         rs=con.Listar("*", "ods", "");
            m =(DefaultTableModel) jTableODS.getModel();
            jTableODS.setModel(m);
            String fila[] = new String[6];
            try {
            while(rs.next()){
                fila[0]=rs.getString(1);
                fila[1]=rs.getString(7);
                rs1=con.Listar("Nombre_Cliente", "cliente", "where Id_Cliente='"+rs.getString(4)+"'");
                while(rs1.next()){
                    this.cliente=rs1.getString("Nombre_Cliente");
                }
                fila[2]=cliente;
                fila[3]=rs.getString(8);
                fila[4]=rs.getString(9);
                fila[5]=rs.getString(13);
                m.addRow(fila);
            }

        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}