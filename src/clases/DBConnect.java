/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.PreparedStatement;
import java.io.FileInputStream;
import java.io.Serializable;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class DBConnect implements Serializable{
    private String bd="etisoft";
    private String host="localhost";
    private String puerto="3306";
    String user="";
    String pass="";
    private Connection conectar = null;
    public DBConnect(){
      
    }
    
    public DBConnect(String user, String pass, String Db, String puerto,String host){
        this.user = user;
        this.pass = pass;
        this.puerto= puerto;
        this.host = host;
        this.bd = Db;
    }

    public String getPass() {
        return pass;
    }

    public String getUser() {
        return user;
    }
    
    
    public boolean conectado(){
           
            
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conectar = DriverManager.getConnection("jdbc:mysql://"+this.host+":"+this.puerto+"/"+this.bd,user,pass);
            
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error Al Conectar",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
    }
    /**
     * Retorna el resulset con el resultado de la consultaA
     * @param campos
     * @param tabla
     * @param condicion
     * @return 
     */
    public ResultSet Listar(String campos,String tabla,String condicion){
        ResultSet rs=null;
        try {
            Statement s= conectar.createStatement();
            System.out.println("select "+campos+" from "+tabla+" "+ condicion);
            rs = s.executeQuery("select "+campos+" from "+tabla+" "+ condicion);
        }catch (SQLException ex){
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Error2", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }

    public ResultSet consulta ( String sql){
        ResultSet rs = null;
        try {
            Statement s= conectar.createStatement();
            System.out.println(sql);
            rs = s.executeQuery(sql);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Error2", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
        
    }
    
    
    public void desconectar(){
        try {
            conectar.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Usted no ha iniciado sesion", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public boolean Altas(String tabla,String campos,String valores){
        Statement stmt;
        boolean resultado=false;
        try {
            stmt = conectar.createStatement();
            System.out.println("INSERT INTO "+tabla+" "+campos+" values "+valores+";");
            stmt.executeUpdate("INSERT INTO "+tabla+" "+campos+" values "+valores+";");
            resultado=true;
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            resultado = false;
        }
        return resultado;
    }
    /*Esta función es la función altas que está preparada para recibir y dar alta
     * de imágenes a la base de datos. Ahora mismo esto sólo es una copia de mis
     * funciones del proyecto de EasySoft
     */
    
    public boolean Altas(String [] campos, FileInputStream foto){
        PreparedStatement ps;
        boolean resultado=false;
        for(int i=0; i<campos.length; i++){
            System.out.println(campos[i]+" ");
        }
        
        try {
            ps = (PreparedStatement) conectar.prepareStatement("INSERT INTO producto VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, campos[0]);
            ps.setString(2, campos[1]);
            ps.setString(3, campos[2]);
            ps.setString(4, campos[3]);
            ps.setString(5, campos[4]);
            ps.setString(6, campos[5]);
            ps.setString(7, campos[6]);
            ps.setString(8, campos[7]);
            ps.setString(9, campos[8]);
            ps.setString(10, campos[9]);
            ps.setString(11, campos[10]);
            ps.setString(12, campos[11]);
            ps.setString(14, campos[12]);
            if(foto!=null){
                ps.setBinaryStream(13, foto);
             
            }
            ps.executeUpdate();
            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            resultado = false;
        }
        
        
        return resultado;
    }
    /*Lo que considero bastante incómodo con hacer altas de imágenes es que 
     * no encuentro otra manera para hacer una función por tabla que necesita
     * alta de imágenes, es decir, no encontré la manera de hacer una sola función
     * más general, que sólo necesite conocer la tabla para poder hacer la alta correspondiente.
     * Lo mismo pasa para las actualizaciones, y es aún más tedioso.
     */
    
    public boolean Altas(String tabla,String [] campos, FileInputStream foto){
        PreparedStatement ps;
        boolean resultado=false;
        for(int i=0; i<campos.length; i++){
            System.out.println(campos[i]+" ");
        }
        
        try {
            ps = (PreparedStatement) conectar.prepareStatement("INSERT INTO "+tabla+" VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, campos[0]);
            ps.setString(2, campos[1]);
            ps.setString(3, campos[2]);
            ps.setString(4, campos[3]);
            ps.setString(5, campos[4]);
            ps.setString(6, campos[5]);
           
            if(foto!=null){
                ps.setBinaryStream(7, foto);
             
            }
            ps.executeUpdate();
            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            resultado = false;
        }
        
        
        return resultado;
    }
    

    public boolean Bajas(String tabla,String condicion){
        boolean result=false;
        Statement s;
        try{
            s = conectar.createStatement();
            s.executeUpdate("Delete From "+tabla+" "+condicion);
            result=true;
        }catch(Exception e){
            result=false;
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

     public boolean actualizarRegistro(String tabla, String valores, String condicion){
        int resultado;
        try{
            Statement stmt = conectar.createStatement();
            System.out.println("update " + tabla + " set " + valores 
                    + " " + condicion);
            resultado = stmt.executeUpdate("update " + tabla + " set " + valores 
                    + " " + condicion);
            
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", 
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
     /*
      * 
      */
    public boolean actualizarRegistro(String alias, FileInputStream foto){
        PreparedStatement ps;
        boolean resultado=false;
        
        
        try {
            ps = (PreparedStatement) conectar.prepareStatement("UPDATE usuario set imagen_usuario = ? where Id_usuario= ?");
            if(foto!=null){
                ps.setBinaryStream(1, foto);
             
            }
            ps.setString(2, alias);

            ps.executeUpdate();
            resultado = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            resultado = false;
        }
        
        
        return resultado;
    }
      public Connection getConnection(){
           return conectar;
    }

}