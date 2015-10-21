/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author Ever
 */
public class Asistencia {
    public String fecha;
    private String entrada,salida,extra,almuerzo,Area,sucursal,nombre,nominal;
    private  Ods[] ods;

    public Asistencia() {
        this.ods = new Ods[10];
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(String almuerzo) {
        this.almuerzo = almuerzo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ods[] getOds() {
        return ods;
    }

    public void setOds(Ods[] ods) {
        this.ods = ods;
    }
    
    
    /**
     * @author Ever
     */
    public class Ods{
        private String Id,inicio,marcado;
        
        public Ods(){
            
        }
    }
}
