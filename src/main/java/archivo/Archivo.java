/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import archivo.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelo.Alcancia;


public class Archivo {

    private static final String RUTA_ARCHIVO = "datos.dat";

    public static void escribir(Alcancia alcancia) {

        try {
            try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(Archivo.RUTA_ARCHIVO))) {
                file.writeObject(alcancia);
                file.close();

                System.out.println("Archivo escrito exitosamente!!!");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Alcancia leer(Alcancia alcancia) {
        try {
            try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(Archivo.RUTA_ARCHIVO))) {

                alcancia = (Alcancia) file.readObject();
                file.close();
                System.out.println("Archivo recuperado exitosamente!!!");

            }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex);
        }

        return alcancia;
    }

}
