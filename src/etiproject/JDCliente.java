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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ever
 */
public class JDCliente extends javax.swing.JDialog {
    DBConnect con;
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    Usuario user;
    private final String Id;
    ResultSet rs;
    /**
     * Creates new form JDCliente
     */
    public JDCliente(java.awt.Frame parent, boolean modal, DBConnect con, Usuario user, String Id) {
        super(parent, modal);
        initComponents();
        this.setTitle("Visualización del Cliente");
        jbtGuardar.setVisible(false);
        this.setLocationRelativeTo(null);
        this.con = con;
        this.user = user;
        this.Id=Id;
        this.setIconImage(imagen);
        Visualizar(Id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jBAtrás = new javax.swing.JButton();
        jBVFactura = new javax.swing.JButton();
        jBVContrato = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlbRUC = new javax.swing.JLabel();
        jtfRUC = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlbNivel = new javax.swing.JLabel();
        jtfNivel = new javax.swing.JTextField();
        jlbDireccion = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jlbTelefono = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jlbCelular = new javax.swing.JLabel();
        jtfCelular = new javax.swing.JTextField();
        jlbEmail = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jlbDescuento = new javax.swing.JLabel();
        jtfDescuento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfRazon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtModificar = new javax.swing.JButton();
        jbtGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(195, 196, 201));

        jBAtrás.setText("Atrás");
        jBAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrásActionPerformed(evt);
            }
        });

        jBVFactura.setText("Facturas");
        jBVFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVFacturaActionPerformed(evt);
            }
        });

        jBVContrato.setText("Contratos");
        jBVContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVContratoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(195, 196, 201));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jlbRUC.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbRUC.setText("R.U.C. / C.I.:");

        jtfRUC.setEnabled(false);

        jlbNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbNombre.setText("Nombre:");

        jtfNombre.setEnabled(false);

        jlbNivel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbNivel.setText("Nivel:");

        jtfNivel.setEnabled(false);

        jlbDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbDireccion.setText("Dirección:");

        jtfDireccion.setEnabled(false);

        jlbTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbTelefono.setText("Teléfono:");

        jtfTelefono.setEnabled(false);

        jlbCelular.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbCelular.setText("Celular:");

        jtfCelular.setEnabled(false);

        jlbEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbEmail.setText("E-mail:");

        jtfEmail.setEnabled(false);

        jlbDescuento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlbDescuento.setText("Descuento:");

        jtfDescuento.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Razón Social:");

        jtfRazon.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlbNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                            .addComponent(jlbDireccion))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbRUC))
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbRUC)
                    .addComponent(jtfRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNombre))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNivel))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDireccion))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbTelefono))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCelular))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEmail))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDescuento))
                .addGap(21, 21, 21))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("CLIENTE");

        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtGuardar.setText("Guardar Cambios");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBVContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBVFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAtrás)
                .addContainerGap())
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPFondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVFactura)
                    .addComponent(jBAtrás)
                    .addComponent(jBVContrato)
                    .addComponent(jbtModificar)
                    .addComponent(jbtGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrásActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBAtrásActionPerformed

    private void jBVFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVFacturaActionPerformed
        new JDListFactura(null, true, con, user).setVisible(true);
    }//GEN-LAST:event_jBVFacturaActionPerformed

    private void jBVContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVContratoActionPerformed
        new JDListContrato(null, true, con).setVisible(true);
    }//GEN-LAST:event_jBVContratoActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        
        jtfNombre.setEnabled(true);
        jtfRazon.setEnabled(true);
        jtfNivel.setEnabled(true);
        jtfDireccion.setEnabled(true);
        jtfTelefono.setEnabled(true);
        jtfCelular.setEnabled(true);
        jtfEmail.setEnabled(true);
        jtfDescuento.setEnabled(true);
        
        jBVFactura.setVisible(false);
        jBVContrato.setVisible(false);
        jbtGuardar.setVisible(true);
        jbtModificar.setEnabled(false);
        jBAtrás.setText("Cancelar");
        
        
    }//GEN-LAST:event_jbtModificarActionPerformed

    
    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
        

        String codigo=jtfRUC.getText();
        if (con.actualizarRegistro("cliente", "Id_Cliente='"+jtfRUC.getText()+"',Razon_Social='"+jtfRazon.getText()+"',Nombre_Cliente='"+jtfNombre.getText()+"',Nivel_Cliente='"+jtfNivel.getText()+"',Dir_Cliente='"
                +jtfDireccion.getText()+"',Telef_Cliente='"+jtfTelefono.getText()+"',Cel_Cliente='"+jtfCelular.getText()+"',Email_Cliente='"+jtfEmail.getText()+"',Descuento_Cliente='"
                +jtfDescuento.getText()+"'", "where Id_Cliente='"+codigo+"'")){
            JOptionPane.showMessageDialog(rootPane, "Se han guardado los cambios", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se han podido guardar los cambios", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtGuardarActionPerformed

     private void Visualizar(String Id) {
        try {
            rs=con.Listar("*", "cliente", "where (Id_Cliente="+Id+")");
            
            while(rs.next()){
                String codigo=rs.getString(1);
                String nombre=rs.getString(2);
                String razon=rs.getString(3);
                String nivel=rs.getString(4);
                String dir=rs.getString(5);
                String tel=rs.getString(6);
                String cel=rs.getString(7);
                String email=rs.getString(8);
                String descuento=rs.getString(9);
            
            
            jtfRUC.setText(codigo);
            jtfNombre.setText(nombre);
            jtfRazon.setText(razon);
            jtfNivel.setText(nivel);
            jtfDireccion.setText(dir);
            jtfTelefono.setText(tel);
            jtfCelular.setText(cel);
            jtfEmail.setText(email);
            jtfDescuento.setText(descuento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(JDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCliente dialog = new JDCliente(new javax.swing.JFrame(), true, null, null, "");
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
    private javax.swing.JButton jBAtrás;
    private javax.swing.JButton jBVContrato;
    private javax.swing.JButton jBVFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlbCelular;
    private javax.swing.JLabel jlbDescuento;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbNivel;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbRUC;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfDescuento;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNivel;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRUC;
    private javax.swing.JTextField jtfRazon;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables
}