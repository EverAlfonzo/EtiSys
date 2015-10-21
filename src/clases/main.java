/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import etiproject.FrmLogin;


/**
 *
 * @author Edgar
 */
public class main {
     public static void main(String[] args) {
        new ScreenSplash().animar();

        FrmLogin a = new FrmLogin();
        a.setVisible(true);
    }
}
