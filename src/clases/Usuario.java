/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.Blob;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Ever
 */
public class Usuario {
    private String Alias;
    private String Correo;
    private String Nombre;
    private String Teléfono;
    private String Pass;
    BufferedImage Imagen; 
    private double zoom_imagen;

    // Se crea un enum para el estado de usuario
    enum conectado{CONECTADO,DESCONECTADO}
   conectado estado;

    /*
     * Se define el constructor de la clase
     */
    public double getZoom_imagen() {
        return zoom_imagen;
    }

    public conectado getEstado() {
        return estado;
    }
   
    public Usuario(ResultSet usuario) {
        try {
            usuario.next();
            this.Alias = usuario.getString("Id_usuario");
            this.Correo = usuario.getString("correo_usuario");
            this.Nombre = usuario.getString("Nombre_Usuario");
            this.Teléfono = usuario.getString("Tel_Usuario");
            this.Pass = usuario.getString("password");
            this.zoom_imagen = usuario.getDouble("zoom_imagen_usuario");
            if(usuario.getBlob("imagen_usuario")!=null){
                Blob blob = (Blob) usuario.getBlob("imagen_usuario");
                byte [] data = blob.getBytes(1,(int) blob.length());
                BufferedImage img = null;
                img = ImageIO.read(new ByteArrayInputStream(data));
                this.Imagen = img;
            }
                    
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /*
     * Se definen Getters para los Datos del usuario
     */
    
    public String getPass() {
        return Pass;
    }
    
    
    public String getAlias() {
        return Alias;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public BufferedImage getImagen() {
        return Imagen;
    }
    
    /*
     * Cambia el estado de conexión del usuario a conectado.
     */
    public void conectar(boolean valor){
        if(valor)
            estado = conectado.CONECTADO;
        else
            estado = conectado.DESCONECTADO;
    }
}
