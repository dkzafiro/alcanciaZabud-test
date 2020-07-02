/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import archivo.Archivo;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Alcancia;


/**
 * @dkzafiro
 */
public class main {

    public static Alcancia app = new Alcancia();

    public static void main(String[] args) {
        Alcancia d = new Alcancia();

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("com.sun.java.swing.plaf.gtk.GTKLookAndFeel".equals(info.getClassName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

                    }
                    break;
                }
            }
        }

        app = Archivo.leer(app);

        Vista ventana = new Vista();
        IniciarJframe(ventana, null);
    }

    public static void IniciarJframe(JFrame obj, String Nombre) {//Metodo estatico para evitar colocarle a las vistas las mismas propiedades
        obj.setVisible(true);
        obj.setTitle(Nombre);
        obj.setResizable(false);
        obj.setLocationRelativeTo(null);

    }
}
