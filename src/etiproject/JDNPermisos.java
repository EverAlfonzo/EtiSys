/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etiproject;

import clases.DBConnect;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Ever
 */
public class JDNPermisos extends javax.swing.JDialog {
    
    String user;
    DBConnect con;
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    DefaultTableModel m;
    /**
     * Creates new form JDNPermisos
     */
    public JDNPermisos(java.awt.Frame parent, boolean modal, DBConnect con,String AsigPor, String AliasUsuario) {
        super(parent, modal);
        initComponents();
        this.setTitle("Nuevo Permiso");
        
        this.con = con;
        this.setIconImage(imagen);
        
        this.jLUser.setText(AliasUsuario);
        this.user = AsigPor;
        
        this.PrepComboDocs();
        this.PrepComboPerm();
        this.prepararTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBAgregarPerm = new javax.swing.JButton();
        jBGuardarCambios = new javax.swing.JButton();
        jBCanselar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jXCBPermisos = new org.jdesktop.swingx.JXComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXCBDocumento = new org.jdesktop.swingx.JXComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Permisos del Usuario:");

        jLUser.setText("Usuario");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Permiso", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Documento:");

        jLabel4.setText("Permiso:");

        jBAgregarPerm.setText("Agregar Permiso");
        jBAgregarPerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarPermActionPerformed(evt);
            }
        });

        jBGuardarCambios.setText("Guardar Cambios");
        jBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCambiosActionPerformed(evt);
            }
        });

        jBCanselar.setText("Cancelar");
        jBCanselar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCanselarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jXCBPermisos);

        jScrollPane2.setViewportView(jXCBDocumento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBGuardarCambios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCanselar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLUser))
                            .addComponent(jBAgregarPerm))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLUser))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)))
                        .addGap(14, 14, 14)))
                .addComponent(jBAgregarPerm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardarCambios)
                    .addComponent(jBCanselar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarPermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarPermActionPerformed
        
        String valores[] = new String[2];
        valores[0]= String.valueOf(jXCBPermisos.getSelectedItem());
        valores[1]= String.valueOf(jXCBDocumento.getSelectedItem());
        if(!esRepetido(valores))
            m.addRow(valores);
    }//GEN-LAST:event_jBAgregarPermActionPerformed

    private void jBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCambiosActionPerformed
        int hasta = jTable1.getRowCount();
        boolean exito=true;
        for(int i=0;i<hasta;i++){
           exito = exito &&  con.Altas("detalle_permiso", "", "("+obtenerIdPerm(String.valueOf(jTable1.getValueAt(i, 0)))+",'"+jLUser.getText()+"',"+
                    obtenerIdDoc(String.valueOf(jTable1.getValueAt(i, 1))+",'"+user+"',curdate()"));
        }
        if(exito){
            JOptionPane.showMessageDialog(rootPane, "Los permisos han sido asignados exitosamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al asignar los permisos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarCambiosActionPerformed

    private void jBCanselarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCanselarActionPerformed
        if(jTable1.getRowCount()!=0){
               int opcion = JOptionPane.showConfirmDialog(rootPane, "¿Desea guardar los cambios realizados?", "Guardar Cambios", JOptionPane.YES_NO_OPTION);
            if(opcion==JOptionPane.YES_OPTION)
                jBAgregarPermActionPerformed(evt);
        }
            this.dispose();
            
    }//GEN-LAST:event_jBCanselarActionPerformed
    /*
     * Funciones creadas.
     */
    //
   
    /**
     * Carga el Combo de Permisos con los valores presentes en la base de
     * Datos.
     */
    public void PrepComboPerm(){
        ResultSet r;
        try {
            r=null;
            r= con.Listar("Desc_permiso", "permisos", " order by Id_permiso ASC");
            while(r.next()){
                jXCBPermisos.addItem(r.getString("Desc_permiso"));
            }
            AutoCompleteDecorator.decorate(jXCBPermisos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Carga el Combo de Documentos con los valores presentes en la base de
     * Datos.
     */
    
    public void PrepComboDocs(){
        ResultSet r;
        try {
            r=null;
            r= con.Listar("Nombre_Documento", "perm_docs", " order by Id_docs ASC");
            while(r.next()){
                jXCBDocumento.addItem(r.getString("Nombre_Documento"));
            }
            AutoCompleteDecorator.decorate(jXCBDocumento);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Prepara la tabla de permisos para su posterior manejo.
     */
    void prepararTabla(){
        m = new javax.swing.table.DefaultTableModel( 
            new Object [][] {

              },
                new String [] {
                "Permiso", "Documento"
                }
            ) {
            boolean[] canEdit = new boolean [] {
                 false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
            }
            };
        jTable1.setModel(m);
    }
    
    /**
     * Toma los nuevos valores a ser agregados a la tabla y los compara con los que ya están
     * presentes, en caso de que ya estén presentes entonces retorna true, y false
     * en caso contrario.
     * @param valores
     * @return 
     */
    
    boolean esRepetido(String valores[]){
        
        String presentes[] = new String[2];
        int lim = jTable1.getRowCount();
        
        for(int i= 0; i<lim; i++){
            presentes[0]= String.valueOf(jTable1.getValueAt(i, 0));
            presentes[1]= String.valueOf(jTable1.getValueAt(i, 0));
            
            if(valores[0].equals(presentes[0])&&
               valores[1].equals(presentes[1])){
                return true;
            }
        }
        
        return false;
        
    }
    
    int obtenerIdPerm(String nombre){
        int ind=0;
        boolean enc=false;
        
        while(!enc){
            if(String.valueOf(jXCBPermisos.getItemAt(ind)).equals(nombre)){
                enc = true;
            }
            ind++;
        }
        return ind;
    }
    
    int obtenerIdDoc(String nombre){
        int ind=0;
        boolean enc=false;
        
        while(!enc){
            if(String.valueOf(jXCBPermisos.getItemAt(ind)).equals(nombre)){
                enc = true;
            }
            ind++;
        }
        return ind;
    }
    
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
            java.util.logging.Logger.getLogger(JDNPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDNPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDNPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDNPermisos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDNPermisos dialog = new JDNPermisos(new javax.swing.JFrame(), true,null,"","");
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
    private javax.swing.JButton jBAgregarPerm;
    private javax.swing.JButton jBCanselar;
    private javax.swing.JButton jBGuardarCambios;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXComboBox jXCBDocumento;
    private org.jdesktop.swingx.JXComboBox jXCBPermisos;
    // End of variables declaration//GEN-END:variables
}
