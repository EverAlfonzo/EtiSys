/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Melissa
 */
public class ObtenerFecha {
    
    private String dia, mes, annio;
    private String fecha ;
    
    public ObtenerFecha() {
  
	   Calendar c = new GregorianCalendar(); 
	   
	   dia = Integer.toString(c.get(Calendar.DATE));
	   mes = Integer.toString(c.get(Calendar.MONTH));
	   annio = Integer.toString(c.get(Calendar.YEAR));
	   
	   fecha= dia + "/" + mes +"/" + annio;
           
    }
    
    public String getFecha(){
        return fecha;
    }
    
}
