/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2.PARTE2;

/**
 *
 * @author artur
 */
import java.io.*;
import java.util.Scanner;

public class LecturaArchivo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 
        System.out.println("--> Por favor, ingresa el nombre del archivo a leer (.txt):");
        String ruta = teclado.nextLine();

        // Usamos try-with-resources (se cierra solo)
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {

            // Mostrar la ruta completa para estar seguros
            File archivo = new File(ruta);
            System.out.println("Buscando en: " + archivo.getAbsolutePath());

            String primeraLinea = lector.readLine();

            //Validar si el archivo está vacío
            if (primeraLinea != null) {
                System.out.println("Lectura exitosa: " + primeraLinea);
            } else {
                System.out.println("El archivo existe, pero está vacío.");
            }

        } catch (FileNotFoundException e) {
            // Mensaje personalizado
            System.out.println("Error: No se encontró el archivo '" + ruta + "'.");
            System.out.println("Verificá el nombre o la ubicación.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error inesperado al leer: " + e.getMessage());
        }
    }
}
