/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etiproject;

import clases.DBConnect;
import clases.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileView;

/**
 *
 * @author Ever
 */
public class JDUsuario extends javax.swing.JDialog {
    double zoom=1;
    private DBConnect con;
    private Usuario user;
    private boolean cambio=false;
    private boolean correo_valid= false;
    private String ruta;
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    /**
     * Creates new form JDUsuario
     */
    public JDUsuario(java.awt.Frame parent, boolean modal,DBConnect con,Usuario user) {
        super(parent, modal);
        this.ruta = "";
        initComponents();
        this.setTitle("Usuario");
        this.setIconImage(imagen);
        
        this.setTitle(user.getNombre());
        this.setLocationRelativeTo(null);
        jLNuevo.setText(user.getAlias());
        
        this.habilitaCampos(false);
        this.jBCancelar.setVisible(false);
        
        this.con = con;
        this.user = user;
        cargarCampos();
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
        jLNuevo = new javax.swing.JLabel();
        jLIcon = new javax.swing.JLabel();
        jXImageView1 = new org.jdesktop.swingx.JXImageView();
        jPanel1 = new javax.swing.JPanel();
        jTDireccion = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jPBotones = new javax.swing.JPanel();
        jlTelefono = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jBModDats = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBModPass = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(195, 196, 201));

        jLNuevo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLNuevo.setText("Usuario");

        jLIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor_32x32.png"))); // NOI18N

        jXImageView1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jXImageView1MouseWheelMoved(evt);
            }
        });
        jXImageView1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXImageView1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jXImageView1Layout = new javax.swing.GroupLayout(jXImageView1);
        jXImageView1.setLayout(jXImageView1Layout);
        jXImageView1Layout.setHorizontalGroup(
            jXImageView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        jXImageView1Layout.setVerticalGroup(
            jXImageView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Usuario"));

        jTDireccion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTDireccionCaretUpdate(evt);
            }
        });
        jTDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTDireccionFocusLost(evt);
            }
        });

        jlDireccion.setText("Correo Electrónico:");

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jPBotones.setBackground(new java.awt.Color(195, 196, 201));
        jPBotones.setLayout(new java.awt.GridLayout(1, 0, 50, 0));

        jlTelefono.setText("Teléfono:");

        jLNombre.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(jlTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNombre)
                            .addComponent(jtTelefono)
                            .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBModDats.setText("Modificar Datos");
        jBModDats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModDatsActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar Cambios");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBModPass.setText("Modificar Contraseña");
        jBModPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModPassActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXImageView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)))
                .addGap(18, 18, 18)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addComponent(jLIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLNuevo))
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addComponent(jBModDats)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBModPass))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFondoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jXImageView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFondoLayout.createSequentialGroup()
                        .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFondoLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLNuevo))
                            .addComponent(jLIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBModDats)
                            .addComponent(jBCancelar)
                            .addComponent(jBModPass))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBGuardar))
                .addGap(0, 11, Short.MAX_VALUE))
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

    public void habilitaCampos(boolean habilitado){
        jtTelefono.setEnabled(habilitado);
        jTNombre.setEnabled(habilitado);
        jTDireccion.setEnabled(habilitado);
    }
    
    private void cargarCampos(){
        jtTelefono.setText(user.getTeléfono());
        jTNombre.setText(user.getNombre());
        jTDireccion.setText(user.getCorreo());
        jXImageView1.setImage(user.getImagen());
        zoom = user.getZoom_imagen();
        jXImageView1.setScale(zoom);
    }
    
    private void jXImageView1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jXImageView1MouseWheelMoved
        if(evt.getPreciseWheelRotation()>0){
            zoom-=0.1;
            jXImageView1.setScale(zoom);
        }else{
            zoom+=0.1;
            jXImageView1.setScale(zoom);
        }
    }//GEN-LAST:event_jXImageView1MouseWheelMoved

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTDireccionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTDireccionCaretUpdate
        if(jTDireccion.getText().indexOf('@')!=-1){
            jTDireccion.setBackground(new java.awt.Color(102, 255, 102));
            correo_valid = true;
        }else{
            jTDireccion.setBackground(new java.awt.Color(255, 51, 51));
            correo_valid = false;
        }
    }//GEN-LAST:event_jTDireccionCaretUpdate

    private void jTDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDireccionFocusGained
        jTDireccionCaretUpdate(null);
    }//GEN-LAST:event_jTDireccionFocusGained

    private void jTDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDireccionFocusLost
        jTDireccion.setBackground(Color.white);
    }//GEN-LAST:event_jTDireccionFocusLost

    private void jBModPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModPassActionPerformed
        JDInputPassword Pedido;
        
        ResultSet rs= null;
        
        
        Pedido = new JDInputPassword(null, true, "Introduzca su contraseña actual.", "Contraseña Actual");
        Pedido.setVisible(true);
        String actual = Pedido.GetPass();
        
        rs = con.consulta("Select SHA1('"+actual+"')");
        try {
            rs.next();
            
            if(rs.getString(1).equals(user.getPass())){
                Pedido = new JDInputPassword(null, true, "Introduzca la nueva contraseña.", "Nueva Contraseña");
                Pedido.setVisible(true);
                String nuevo= Pedido.GetPass();

                Pedido = new JDInputPassword(null, true, "Confirme la contraseña.", "Confirmar Contraseña");
                Pedido.setVisible(true);
                String confirm = Pedido.GetPass();
                
                if(nuevo.equals(confirm)){
                    if(con.actualizarRegistro("usuario", "password = SHA1('"+nuevo+"')", "where Id_usuario='"+user.getAlias()+"'")){
                        JOptionPane.showMessageDialog(rootPane, "La contraseña se ha modificado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error en el momento de actualizar la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Las contraseña no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(rootPane, "Contraseña Incorrecta. Vuelva a intentar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jBModPassActionPerformed

    private void jBModDatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModDatsActionPerformed
        habilitaCampos(true);
        jBModDats.setVisible(false);
        jBCancelar.setVisible(true);
    }//GEN-LAST:event_jBModDatsActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        habilitaCampos(false);
        cargarCampos();
        jBCancelar.setVisible(false);
        jBModDats.setVisible(true);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if(!jBModDats.isVisible()){
            if(con.actualizarRegistro("Usuario","Nombre_Usuario= '"+jTNombre.getText()+"',"
                    + "Tel_usuario = '"+jtTelefono.getText()+"',correo_usuario = '"+jTDireccion.getText()+"'", "where Id_usuario = '"+user.getAlias()+"'")){
              if(!ruta.equals("")){
                   FileInputStream foto=null;
                   try {
                         foto = new FileInputStream(ruta);
                         con.actualizarRegistro(user.getAlias(), foto);
                         
                   }catch (FileNotFoundException ex) {
                         JOptionPane.showMessageDialog(rootPane,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);                      }
                   }
              JOptionPane.showMessageDialog(rootPane, "Modificaciones Guardadas Exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al guardar las modificaciones.", "Error", JOptionPane.ERROR_MESSAGE);
            }    
            
        }else if(zoom!=1){
            if(con.actualizarRegistro("Usuario","zoom_imagen_usuario= "+zoom, "where Id_usuario = '"+user.getAlias()+"'")){
              if(!ruta.equals("")){
                   FileInputStream foto=null;
                   try {
                         foto = new FileInputStream(ruta);
                         con.actualizarRegistro(user.getAlias(), foto);
                         
                   }catch (FileNotFoundException ex) {
                         JOptionPane.showMessageDialog(rootPane,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);                      }
                   }
                JOptionPane.showMessageDialog(rootPane, "Modificaciones Guardadas Exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al guardar las modificaciones.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
            
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jXImageView1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXImageView1MouseClicked
        if(evt.getClickCount()==2){
            File archive = obtenerArchivo();
            
            if (archive.exists() && archive != null)
                ruta = archive.getPath();
            
            if(ruta!=""){
                Image imagen = getToolkit().getImage(ruta);
                System.out.println();
                File file = new File(ruta);
                try {
                    jXImageView1.setImage(file);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jXImageView1MouseClicked

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDUsuario dialog = new JDUsuario(new javax.swing.JFrame(), true,null,null);
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
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModDats;
    private javax.swing.JButton jBModPass;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLIcon;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNuevo;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private org.jdesktop.swingx.JXImageView jXImageView1;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    public File obtenerArchivo(){
       int resultado = 0;
       JFileChooser elegir = new JFileChooser();
       
       FileView fv = new FileView() {};
       
       elegir.setFileView(fv);
       
       elegir.setFileSelectionMode(JFileChooser.FILES_ONLY);
       resultado = elegir.showOpenDialog(this);
       if(resultado == JFileChooser.CANCEL_OPTION){
           return null;
       }
       File archivo = elegir.getSelectedFile();
       if(archivo == null){
           JOptionPane.showMessageDialog(null, "Error al cargar archivo",
                        "Error", JOptionPane.ERROR_MESSAGE);
       }
       return archivo;
   }
}
