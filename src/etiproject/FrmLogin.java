/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etiproject;

import clases.Archivo;
import clases.DBConnect;
import clases.JOptionPaneConTimeOut;
import clases.Usuario;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Gabriel
 */
public class FrmLogin extends javax.swing.JFrame {
    DBConnect con; // se declara la variable de la clase DBConnect
    Usuario user; // se declara la variable user de la clase Usuario
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    Archivo config;
    /**
     * Creates new form Usuarios
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        String sep= System.getProperty("file.separator");
        String home = System.getProperty("user.home");
        config = new Archivo(home+sep+"ConfigEtiSoft.dat");
        if(config.existe()){
            try {
                con = config.cargar();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            String user,pass,host,database,puerto;
            user = JOptionPane.showInputDialog(null, "Introduzca Nombre de Usuario de Base De Datos:", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            JDInputPassword a = new JDInputPassword(null, true);
            a.setVisible(true);
            pass = a.GetPass();
            database = JOptionPane.showInputDialog(rootPane, "Introduzca el nombre de la Base de Datos: ", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            host = JOptionPane.showInputDialog(rootPane, "Introduzca la ubicación del servidor de la base de datos: ", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            puerto = JOptionPane.showInputDialog(rootPane, "Introduzca el puerto del servidor de la base de datos: ", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            con = new DBConnect(user, pass, database,puerto, host);
            try {
                config.guardar(con);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        if(!con.conectado()){
            String user,pass,host,database,puerto;
            user = JOptionPane.showInputDialog(null, "Introduzca Nombre de Usuario de Base De Datos:", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            JDInputPassword a = new JDInputPassword(null, true);
            a.setVisible(true);
            pass = a.GetPass();
            database = JOptionPane.showInputDialog(rootPane, "Introduzca el nombre de la Base de Datos: ", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            host = JOptionPane.showInputDialog(rootPane, "Introduzca la ubicación del servidor de la base de datos: ", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            puerto = JOptionPane.showInputDialog(rootPane, "Introduzca el puerto del servidor de la base de datos: ", "Identificación", JOptionPane.INFORMATION_MESSAGE);
            con = new DBConnect(user, pass, database,puerto, host);
            try {
                config.guardar(con);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            this.setIconImage(imagen);
            this.setTitle("Login");
            ResultSet rs = con.Listar("COUNT(Id_usuario)", "usuario", "");
            try {
                rs.next();
                if(rs.getInt(1)<=1){
                    JOptionPane.showMessageDialog(rootPane, "Bienvenido a EtiSoft, para empezar cree un Usuario", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    // Se muestra el formulario de creación de Nuevo Usuario del Sistema
                    this.setVisible(false);
                    ResultSet userAdmin = con.Listar("*", "usuario", "where Id_Usuario='Admin'");
                    user = new Usuario(userAdmin);
                    /*
                     * Se llama a la ventana para crear un nuevo usuario,
                     * como se necesita la existencia de usuario que haya asignado
                     * privilegios al nuevo usuario, se crea en base de datos un 
                     * usuario con el alias "Admin", los datos del mismo se almacenan
                     * en la clase usuario los cuales se pasan como argumento a la ventana
                     */
                    new JDNUsuario(this, true, con,user).setVisible(true);
                }

                this.setVisible(true);
                rs = null;

                rs = con.Listar("COUNT(Id_usuario)", "usuario", "");

                rs.next();
                if(rs.getInt(1)<=1){
                    jLAviso.setText("No se ha encontrado ningún usuario en la base de datos.");
                    jBAceptar.setEnabled(false);
                }

            } catch (SQLException ex) {
                Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    boolean autenticado(){
        ResultSet rs = null;
        ResultSet rs2 = con.consulta("Select SHA1('"+jPContraseña.getText()+"')");
        rs = con.Listar("password", "usuario", "where Id_usuario='"+jTUsuario.getText()+"'");
        String passDB;
        String passAct;
        try {
            if(rs.next()){
                rs2.next();
                passAct = rs2.getString(1);
                passDB = rs.getString("password");
                if(passAct.equals(passDB)){
                    rs = null;
                    rs = con.Listar("Id_permiso", "Detalle_Permiso","where Id_usuario='"+jTUsuario.getText()+"'" );
                    if(rs.next()){
                         user = new Usuario(con.Listar("*", "usuario", "where Id_usuario='"+jTUsuario.getText()+"'"));
                         return true;
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "No se han encontrado los permisos de este usuario.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Contraseña Incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }   
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "El Usuario no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al enviar la consulta a la base de datos.","Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
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
        jLabel2 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jPContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLFondo = new javax.swing.JLabel();
        jLAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        jPContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPContraseñaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        jBAceptar.setText("Iniciar Sesión");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.jpg"))); // NOI18N

        jLAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLAvisoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFondo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBCancelar)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(64, 64, 64)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAceptar)
                    .addComponent(jBCancelar))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPContraseñaKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jBAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_jPContraseñaKeyReleased

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        user = null;
        if(autenticado()){
            
            JOptionPaneConTimeOut a = new JOptionPaneConTimeOut();
            a.visualizaDialogo(this, "Ingresando al sistema", "Espere",1000);
            Principal2 p = new Principal2(con,user); // se pasa la conexión a la clase que fué llamada, la conexión, solo se cierra cuando
                                                // se cierra el Frame Principal
            p.setExtendedState(Principal.MAXIMIZED_BOTH);
            p.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jLAvisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLAvisoMouseClicked
        
        if(evt.getClickCount()==2){
             ResultSet rs = con.Listar("COUNT(Id_usuario)", "usuario", "");
             user = null;
        try {
            
            /*
             * Se determina si es que ya existe o no un usuario registrado en el sistema,
             * si es que ya existe algún usuario registrado en el sistema,
             * no ocurre nada si el usuario da doble clic sobre la etiqueta en caso contrario,
             * se le pide que cree un Usuario para poder Comenzar a usar el sistema.
             */
            rs.next();
            if(rs.getInt(1)<=1){
                JOptionPane.showMessageDialog(rootPane, "Bienvenido a EtiSoft, para empezar cree un Usuario", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                // Se muestra el formulario de creación de Nuevo Usuario del Sistema
                this.setVisible(false);
                ResultSet userAdmin = con.Listar("*", "usuario", "where Id_Usuario='Admin'");
                user = new Usuario(userAdmin);
                new JDNUsuario(this, true, con,user).setVisible(true);
            }
            this.setVisible(true);
            rs = null;
            
            rs = con.Listar("COUNT(Id_usuario)", "usuario", "");
            
            rs.next();
            if(rs.getInt(1)<=1){
                jLAviso.setText("No se ha encontrado ningún usuario en la base de datos.");
                jBAceptar.setEnabled(false);
            }else{
                jLAviso.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jLAvisoMouseClicked

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLAviso;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPContraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
