/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import clases.DBConnect;
import etiproject.JDNMaterial;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ever
 */
public class jPListMateriales extends javax.swing.JPanel {
    DBConnect con;
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    DefaultTableModel m;
    public int suma=0;
    private String prov;
    private String ub;
    
    /**
     * Creates new form jPListMateriales
     */
    public jPListMateriales(DBConnect con) {
        initComponents();
        this.con=con;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMateriales = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbSuma = new javax.swing.JLabel();
        jxtfBuscar = new org.jdesktop.swingx.JXTextField();

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));

        jTableMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Herramienta", "Cantidad", "Cantidad Actual", "Ubicación", "Categoría", "Marca", "Medida", "Proveedor", "Precio Unitario", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableMateriales);

        jButton3.setText("Nuevo Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(122, 122, 122));
        jLabel3.setText("Buscar:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Costo Total de Materiales:");

        jlbSuma.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jlbSuma.setText("0");
        jlbSuma.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jxtfBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jxtfBuscarCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jxtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jxtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void preparartabla() {
         rs=null;
         rs=con.Listar("*", "stock", "");
            m =(DefaultTableModel) jTableMateriales.getModel();
            jTableMateriales.setModel(m);
            String fila[] = new String[11];
            try {
            while(rs.next()){
                fila[0]=rs.getString(1);
                fila[1]=rs.getString(2);
                fila[2]=rs.getString(5);
                fila[3]=rs.getString(6);
                rs1=con.Listar("Nombre_Ubicacion", "ubicacion", "where Id_Ubicacion='"+rs.getString(8)+"'");
                while(rs1.next()){
                    this.ub=rs1.getString("Nombre_Ubicacion");
                }
                fila[4]=ub;
                fila[5]=rs.getString(9);
                fila[6]=rs.getString(7);
                fila[7]=rs.getString(3);
                rs2=con.Listar("Nom_proveedor", "proveedor", "where Id_proveedor='"+rs.getString(4)+"'");
                while(rs2.next()){
                    this.prov=rs2.getString("Nom_proveedor");
                }
                fila[8]=prov;
                fila[9]=rs.getString(10);
                int cant=Integer.parseInt(fila[2]);
                int precio=Integer.parseInt(fila[9]);
                int subtotal=cant*precio;
                String sub=Integer.toString(subtotal);
                fila[10]=sub;
                
                suma=suma+subtotal;
                m.addRow(fila);
            }
            jlbSuma.setText(Integer.toString(suma));
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new JDNMaterial(null, true, con).setVisible(true);
        jxtfBuscarCaretUpdate(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jxtfBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jxtfBuscarCaretUpdate

        jTableMateriales.clearSelection();
        String titulos[]={"Código","Herramienta","Cantidad", "Cantidad Actual", "Ubicación", "Categoría", "Marca", "Medida", "Proveedor", "Precio Unitario", "Precio Total"};
        m = (new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Código","Herramienta","Cantidad", "Cantidad Actual", "Ubicación", "Categoría", "Marca", "Medida", "Proveedor", "Precio Unitario", "Precio Total"})
        {
            boolean[] canEdit = new boolean [] {false, false, false, false, false, false,false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }});

            jTableMateriales.setModel(m);
            m= (DefaultTableModel) jTableMateriales.getModel();
            jTableMateriales.setModel(m);

            rs=null;

            rs=con.Listar("*", "stock", " where (Id_Stock like \"%"+ jxtfBuscar.getText()+"%\") OR (Nom_Stock like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Cant_Stock like \"%"+ jxtfBuscar.getText()+"%\") OR (Cant_Actual like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Id_Ubicacion like \"%"+ jxtfBuscar.getText()+"%\") OR (Categoria_Stock like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Marca_Stock like \"%"+ jxtfBuscar.getText()+"%\") OR (Detalle_Stock like \"%"+ jxtfBuscar.getText()+"%\")"
                + "OR (Id_proveedor like \"%"+ jxtfBuscar.getText()+"%\") OR (Precio_comp_Stock like \"%"+ jxtfBuscar.getText()+"%\")");

            String fila[] = new String[11];

            try {
                while(rs.next()){
                    fila[0]=rs.getString("Id_Stock");
                    fila[1]=rs.getString("Nom_Stock");
                    fila[2]=rs.getString("Cant_Stock");
                    fila[3]=rs.getString("Cant_Actual");
                    rs1=con.Listar("Nombre_Ubicacion", "ubicacion", "where Id_Ubicacion='"+rs.getString(8)+"'");
                    while(rs1.next()){
                        this.ub=rs1.getString("Nombre_Ubicacion");
                    }
                    fila[4]=ub;
                    fila[5]=rs.getString("Categoria_Stock");
                    fila[6]=rs.getString("Marca_Stock");
                    fila[7]=rs.getString("Detalle_Stock");
                    rs2=con.Listar("Nom_proveedor", "proveedor", "where Id_proveedor='"+rs.getString(4)+"'");
                    while(rs2.next()){
                        this.prov=rs2.getString("Nom_proveedor");
                    }
                    fila[8]=prov;
                    fila[9]=rs.getString("Precio_comp_Stock");
                    int cant=Integer.parseInt(fila[2]);
                    int precio=Integer.parseInt(fila[9]);
                    int subtotal=cant*precio;
                    String sub=Integer.toString(subtotal);
                    fila[10]=sub;
                    suma=suma+subtotal;

                    m.addRow(fila);
                }
                jlbSuma.setText(Integer.toString(suma));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_jxtfBuscarCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMateriales;
    private javax.swing.JLabel jlbSuma;
    private org.jdesktop.swingx.JXTextField jxtfBuscar;
    // End of variables declaration//GEN-END:variables
}
