/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etiproject;

import paneles.jPListProveedor;
import paneles.jPListCliente;
import clases.DBConnect;
import clases.Usuario;
import clases.mipanel;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import paneles.jPListMateriales;
import paneles.jPListaContratos;

/**
 *
 * @author Gabriel
 */
public class Principal2 extends javax.swing.JFrame {
    DBConnect con;
    Usuario user;
    Image imagen = getToolkit().getImage(getClass().getResource("/Imagenes/Iconito.png"));
    boolean contratos = false;
    boolean clientes = false;
    boolean proveedores = false;
    boolean materiales = false;
    
    /**
     * Creates new form Principal
     */
    public Principal2(DBConnect con, Usuario user) {
        initComponents();
        this.con = con;
        this.setIconImage(imagen);
        this.user = user; /* siempre se necesita saber que usuario es el que está logueado
                            por eso se usa la clase usuario, para tener mejor control de que usuario
                            es el que se logueó*/
        this.setTitle("Bienvenido "+ user.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPBotones = new javax.swing.JPanel();
        jbFacturas = new javax.swing.JButton();
        jbPDM = new javax.swing.JButton();
        jbODS = new javax.swing.JButton();
        jbODC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbContratos = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jbProveedor = new javax.swing.JButton();
        jbStock = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmSesion = new javax.swing.JMenu();
        jmiPerfil = new javax.swing.JMenuItem();
        jmiCerrar = new javax.swing.JMenuItem();
        jmInsumos = new javax.swing.JMenu();
        jmiAgregar = new javax.swing.JMenuItem();
        jmiListar = new javax.swing.JMenuItem();
        jMMDO = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMAsistencia = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMEstadística = new javax.swing.JMenu();
        jMConfig = new javax.swing.JMenu();
        jmiCrear = new javax.swing.JMenuItem();
        jMAyuda = new javax.swing.JMenu();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo deptos2.0.jpg"))); // NOI18N

        jBCerrar.setText("jButton1");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(195, 196, 201));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBotones.setBackground(new java.awt.Color(195, 196, 201));
        jPBotones.setLayout(new java.awt.GridLayout(1, 4, 40, 10));

        jbFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-facturas.jpg"))); // NOI18N
        jbFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbFacturasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbFacturasMouseReleased(evt);
            }
        });
        jbFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFacturasActionPerformed(evt);
            }
        });
        jPBotones.add(jbFacturas);

        jbPDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-pdm.jpg"))); // NOI18N
        jbPDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbPDMMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbPDMMouseReleased(evt);
            }
        });
        jbPDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPDMActionPerformed(evt);
            }
        });
        jPBotones.add(jbPDM);

        jbODS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-ods.jpg"))); // NOI18N
        jbODS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbODSMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbODSMouseReleased(evt);
            }
        });
        jbODS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbODSActionPerformed(evt);
            }
        });
        jPBotones.add(jbODS);

        jbODC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-odc.jpg"))); // NOI18N
        jbODC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbODCMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbODCMouseReleased(evt);
            }
        });
        jbODC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbODCActionPerformed(evt);
            }
        });
        jPBotones.add(jbODC);

        jPanel1.add(jPBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 18, 600, 49));

        jPanel2.setBackground(new java.awt.Color(195, 196, 201));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(4, 0, 0, 50));

        jbContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-contratos.jpg"))); // NOI18N
        jbContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbContratosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbContratosMouseReleased(evt);
            }
        });
        jbContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContratosActionPerformed(evt);
            }
        });
        jPanel2.add(jbContratos);

        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-clientes.jpg"))); // NOI18N
        jbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbClientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbClientesMouseReleased(evt);
            }
        });
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });
        jPanel2.add(jbClientes);

        jbProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-proveedores.jpg"))); // NOI18N
        jbProveedor.setOpaque(false);
        jbProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbProveedorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbProveedorMouseReleased(evt);
            }
        });
        jbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jbProveedor);

        jbStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-materiales.jpg"))); // NOI18N
        jbStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbStockMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbStockMouseReleased(evt);
            }
        });
        jbStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStockActionPerformed(evt);
            }
        });
        jPanel2.add(jbStock);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 330));

        jTabbedPane1.setBackground(new java.awt.Color(195, 196, 201));
        jTabbedPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTabbedPane1KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea", "Asignado Por", "Detalle", "Fecha de Tarea", "Plazo de Tarea", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTabbedPane1.addTab("Principal-Tareas Abiertas", jScrollPane2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 78, 1000, 642));

        jmSesion.setText("Sesión");

        jmiPerfil.setText("Perfil De Usuario");
        jmiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPerfilActionPerformed(evt);
            }
        });
        jmSesion.add(jmiPerfil);

        jmiCerrar.setText("Cerrar Sesión");
        jmiCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarActionPerformed(evt);
            }
        });
        jmSesion.add(jmiCerrar);

        jMenuBar1.add(jmSesion);

        jmInsumos.setText("Insumos");

        jmiAgregar.setText("Agregar Insumos");
        jmiAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarActionPerformed(evt);
            }
        });
        jmInsumos.add(jmiAgregar);

        jmiListar.setText("Listar Insumos");
        jmiListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarActionPerformed(evt);
            }
        });
        jmInsumos.add(jmiListar);

        jMenuBar1.add(jmInsumos);

        jMMDO.setText("Mano de Obra");

        jMenuItem2.setText("Agregar Mano de Obra");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMMDO.add(jMenuItem2);

        jMenuItem3.setText("Listar Mano de Obra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMMDO.add(jMenuItem3);

        jMenuBar1.add(jMMDO);

        jMAsistencia.setText("Asistencia");

        jMenuItem4.setText("Registrar Asistencias");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMAsistencia.add(jMenuItem4);

        jMenuItem6.setText("Visualizar Asistencias");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMAsistencia.add(jMenuItem6);

        jMenuBar1.add(jMAsistencia);

        jMEstadística.setText("Estadísticas");
        jMenuBar1.add(jMEstadística);

        jMConfig.setText("Configuración");

        jmiCrear.setText("Crear Usuario");
        jmiCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearActionPerformed(evt);
            }
        });
        jMConfig.add(jmiCrear);

        jMenuBar1.add(jMConfig);

        jMAyuda.setText("Ayuda");
        jMenuBar1.add(jMAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbClientesMousePressed
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-clientes1.jpg")));
        
    }//GEN-LAST:event_jbClientesMousePressed

    private void jbClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbClientesMouseReleased
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-clientes.jpg")));
        //new JDListCliente(this, true, con, user).setVisible(true);
        
    }//GEN-LAST:event_jbClientesMouseReleased

    private void jbContratosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbContratosMousePressed
        jbContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-contratos1.jpg")));
    }//GEN-LAST:event_jbContratosMousePressed

    private void jbContratosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbContratosMouseReleased
        jbContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-contratos.jpg")));
      //  new JDListContrato(this, true, con).setVisible(true);
    }//GEN-LAST:event_jbContratosMouseReleased

    private void jbFacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFacturasMousePressed
        jbFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-facturas1.jpg")));
    }//GEN-LAST:event_jbFacturasMousePressed

    private void jbFacturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFacturasMouseReleased
        jbFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-facturas.jpg")));
        
    }//GEN-LAST:event_jbFacturasMouseReleased

    private void jbStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbStockMousePressed
        jbStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-materiales1.jpg")));
    }//GEN-LAST:event_jbStockMousePressed

    private void jbStockMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbStockMouseReleased
        jbStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-materiales.jpg")));
        //new JDListMateriales(con,this, true).setVisible(true);
    }//GEN-LAST:event_jbStockMouseReleased

    private void jbProveedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProveedorMousePressed
        jbProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-proveedores1.jpg")));
    }//GEN-LAST:event_jbProveedorMousePressed

    private void jbProveedorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProveedorMouseReleased
        jbProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-proveedores.jpg")));
        //new JDListProveedor(this, true, con).setVisible(true);
    }//GEN-LAST:event_jbProveedorMouseReleased

    private void jbPDMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPDMMousePressed
        jbPDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-pdm1.jpg")));
    }//GEN-LAST:event_jbPDMMousePressed

    private void jbPDMMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPDMMouseReleased
        jbPDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-pdm.jpg")));
    }//GEN-LAST:event_jbPDMMouseReleased

    private void jbODSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbODSMousePressed
        jbODS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-ods1.jpg")));
    }//GEN-LAST:event_jbODSMousePressed

    private void jbODSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbODSMouseReleased
        jbODS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-ods.jpg")));
    }//GEN-LAST:event_jbODSMouseReleased

    private void jbODCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbODCMousePressed
        jbODC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-odc1.jpg")));
    }//GEN-LAST:event_jbODCMousePressed

    private void jbODCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbODCMouseReleased
        jbODC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-odc.jpg")));
        new JDListODC(this, true, con).setVisible(true);
    }//GEN-LAST:event_jbODCMouseReleased
 
    private void jmiAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarActionPerformed
        new JDNInsumo(this, true, con).setVisible(true);
    }//GEN-LAST:event_jmiAgregarActionPerformed

    private void jmiListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarActionPerformed
        new JDListInsumo(this, true, con, user).setVisible(true);
    }//GEN-LAST:event_jmiListarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new JDNMDO(this, true, con).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new JDListMDO(this, true, con).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new jDNAsistencia1(this, true, con, user).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new VerAsistencia(con,user).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jmiCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearActionPerformed
        /*
         * Se debe controlar que el usuario tenga los permisos para poder crear un
         * nuevo usuario.
         * Recordando..
         * Permisos
         * 1-visualizar todo
         * 2-visualizar asignado
         * 3-modificar todo
         * 4-modificar asignado
         * 5-crear nuevo
         * 6-transform
         * 
         * Documentos
         * 1- usuario
         * 2- ODS
         * 3- ODC
         * 4- PDM
         * 5- factura
         * 6- asistencia
         */
        ResultSet rs = con.Listar("count(Id_usuario)", "detalle_permiso", "where Id_permiso=5 and Id_docs=1 and Id_usuario='"+user.getAlias()+"'");
        try {
            rs.next();
            if(rs.getInt(1)>0){
                new JDNUsuario(this, true, con, user).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiCrearActionPerformed

    private void jmiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPerfilActionPerformed
        new JDUsuario(this, true, con, user).setVisible(true);
    }//GEN-LAST:event_jmiPerfilActionPerformed

    private void jmiCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarActionPerformed
        user.conectar(false);
        
    }//GEN-LAST:event_jmiCerrarActionPerformed

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        if(!clientes){
              //jTabbedPane1.add("Contratos", crearPanel(new Object[][]{}, new String[]{"titulo1","titulo1","titulo1"}));
            
            jTabbedPane1.add("Clientes",new jPListCliente(con,user));
            int index = jTabbedPane1.indexOfTab("Clientes");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            javax.swing.JLabel lblTitle = new javax.swing.JLabel("Clientes");
            javax.swing.JButton btnClose = new javax.swing.JButton("x");
            
            java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            jTabbedPane1.setTabComponentAt(index, pnlTab);
            
            btnClose.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   jTabbedPane1.remove(jTabbedPane1.indexOfTab("Clientes"));
                   clientes=false;
                }
            });
            
            
            
            
            
            jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Clientes"));
            
            clientes=true;
        }
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContratosActionPerformed
        if(!contratos){
              //jTabbedPane1.add("Contratos", crearPanel(new Object[][]{}, new String[]{"titulo1","titulo1","titulo1"}));
            
            jTabbedPane1.add("Contratos",new jPListaContratos(con));
            int index = jTabbedPane1.indexOfTab("Contratos");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            javax.swing.JLabel lblTitle = new javax.swing.JLabel("Contratos");
            javax.swing.JButton btnClose = new javax.swing.JButton("x");
            
            java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            jTabbedPane1.setTabComponentAt(index, pnlTab);
            
            btnClose.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   jTabbedPane1.remove(jTabbedPane1.indexOfTab("Contratos"));
                   contratos=false;
                }
            });
            
            
            
            
            
            jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Contratos"));
            
            contratos=true;
        }
    }//GEN-LAST:event_jbContratosActionPerformed

    private void jbFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFacturasActionPerformed
        new JDListFactura(this, true, con, user).setVisible(true);
    }//GEN-LAST:event_jbFacturasActionPerformed

    private void jbPDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPDMActionPerformed
        new JDListPDM(this, true, con, user).setVisible(true);
    }//GEN-LAST:event_jbPDMActionPerformed

    private void jbODSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbODSActionPerformed
        new JDListaODS(this, true, con, user).setVisible(true);
    }//GEN-LAST:event_jbODSActionPerformed

    private void jbODCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbODCActionPerformed
        new JDListODC(this, true, con).setVisible(true);
    }//GEN-LAST:event_jbODCActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        jTabbedPane1.remove(jTabbedPane1.getSelectedComponent());
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jbStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStockActionPerformed
        if(!materiales){
              //jTabbedPane1.add("Contratos", crearPanel(new Object[][]{}, new String[]{"titulo1","titulo1","titulo1"}));
            
            jTabbedPane1.add("Materiales",new jPListMateriales(con));
            int index = jTabbedPane1.indexOfTab("Materiales");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            javax.swing.JLabel lblTitle = new javax.swing.JLabel("Materiales");
            javax.swing.JButton btnClose = new javax.swing.JButton("x");
            
            java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            jTabbedPane1.setTabComponentAt(index, pnlTab);
            
            btnClose.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   jTabbedPane1.remove(jTabbedPane1.indexOfTab("Materiales"));
                   materiales=false;
                }
            });
            
            
            
            
            
            jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Materiales"));
            
            materiales=true;
        }
    }//GEN-LAST:event_jbStockActionPerformed

    private void jTabbedPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane1KeyReleased
        if(evt.equals(KeyEvent.VK_CONTROL) || evt.equals(KeyEvent.VK_W))
            jTabbedPane1.remove(jTabbedPane1.getSelectedIndex());
    }//GEN-LAST:event_jTabbedPane1KeyReleased

    private void jbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProveedorActionPerformed
                if(!proveedores){
              //jTabbedPane1.add("Contratos", crearPanel(new Object[][]{}, new String[]{"titulo1","titulo1","titulo1"}));
            
            jTabbedPane1.add("Proveedores",new jPListProveedor(con));
            int index = jTabbedPane1.indexOfTab("Proveedores");
            JPanel pnlTab = new JPanel(new GridBagLayout());
            pnlTab.setOpaque(false);
            javax.swing.JLabel lblTitle = new javax.swing.JLabel("Proveedores");
            javax.swing.JButton btnClose = new javax.swing.JButton("x");
            
            java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;

            pnlTab.add(lblTitle, gbc);

            gbc.gridx++;
            gbc.weightx = 0;
            pnlTab.add(btnClose, gbc);

            jTabbedPane1.setTabComponentAt(index, pnlTab);
            
            btnClose.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   jTabbedPane1.remove(jTabbedPane1.indexOfTab("Proveedores"));
                   proveedores=false;
                }
            });
            
            
            
            
            
            jTabbedPane1.setSelectedIndex(jTabbedPane1.indexOfTab("Proveedores"));
            
            proveedores=true;
        }
    }//GEN-LAST:event_jbProveedorActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         int w=jPanel1.getWidth();
        int h=jPanel1.getHeight();
        mipanel pp = new mipanel(w,h);
        jPanel1.add(pp);
        jPanel1.repaint();
    }//GEN-LAST:event_formWindowActivated

    private JScrollPane CrearTabla(Object[][] datos,String[] title){
        JTable contr = new JTable(new javax.swing.table.DefaultTableModel(datos,title));
        JScrollPane contrS = new JScrollPane(contr);
        contrS.add(jBCerrar);
        return contrS;
    }
    private JPanel crearPanel(Object[][] datos,String[] title){
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable newTable = new javax.swing.JTable();
        javax.swing.JButton newButton = new javax.swing.JButton();
        javax.swing.JPanel newPanel = new javax.swing.JPanel();
        
        newTable.setModel(new javax.swing.table.DefaultTableModel(datos,title));
        jScrollPane1.setViewportView(newTable);

        newButton.setText("Cerrar Pestaña");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                jTabbedPane1.remove(jTabbedPane1.getSelectedIndex());
                contratos=false;
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,jTabbedPane1.getWidth(), javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(newButton)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, jTabbedPane1.getHeight()-80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newButton))
        );
        return newPanel;
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
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal2(null,null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMAsistencia;
    private javax.swing.JMenu jMAyuda;
    private javax.swing.JMenu jMConfig;
    private javax.swing.JMenu jMEstadística;
    private javax.swing.JMenu jMMDO;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbContratos;
    private javax.swing.JButton jbFacturas;
    private javax.swing.JButton jbODC;
    private javax.swing.JButton jbODS;
    private javax.swing.JButton jbPDM;
    private javax.swing.JButton jbProveedor;
    private javax.swing.JButton jbStock;
    private javax.swing.JMenu jmInsumos;
    private javax.swing.JMenu jmSesion;
    private javax.swing.JMenuItem jmiAgregar;
    private javax.swing.JMenuItem jmiCerrar;
    private javax.swing.JMenuItem jmiCrear;
    private javax.swing.JMenuItem jmiListar;
    private javax.swing.JMenuItem jmiPerfil;
    // End of variables declaration//GEN-END:variables
}