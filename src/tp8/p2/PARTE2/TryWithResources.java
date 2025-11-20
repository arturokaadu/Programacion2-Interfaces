/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2.PARTE2;

/**
 *
 * @author artur
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        // Definimos el archivo a leer. 
        // NOTA: Creá un archivo llamado "archivo_prueba.txt" en la carpeta de tu proyecto 
        // o poné la ruta completa de uno que exista en tu PC (como hizo el profe).
        File archivo = new File("archivo_prueba.txt");

        // USAMOS TRY-WITH-RESOURCES
        // Al declarar el recurso dentro del paréntesis del try, Java lo cierra automáticamente.
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            // Leemos la primera línea del archivo
            String primeraLinea = br.readLine();
            System.out.println("Lectura exitosa: " + primeraLinea);

        } catch (IOException ex) {
            // Capturamos IOException
            System.out.println("Error de E/S: " + ex.getMessage());
        }
    }
}
