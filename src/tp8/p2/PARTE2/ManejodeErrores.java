/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2.PARTE2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author artur
 */
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje); // se llama al constructor de exception
    }
}
public class ManejodeErrores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. División segura [cite: 31] ---
        try {
            System.out.println(" 1 ");
            System.out.print("Ingresa el dividendo: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingresa el divisor: ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                // 1. Manejar ArithmeticException si el divisor es cero [cite: 32]
                throw new ArithmeticException("No podés dividir por cero");
            }
            System.out.println("Resultado: " + (num1 / num2));
            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado en la división.");
            scanner.next(); // Limpiar buffer
        }

        // --- 2---
        try {
            System.out.println("--- 2 ---");
            System.out.print("Ingresa un número (texto): ");
            String texto = scanner.next();
            
            int numero = Integer.parseInt(texto);
            System.out.println("¡Convertido! Es el número: " + numero);
            
        } catch (NumberFormatException e) {
            // 2. Manejar NumberFormatException si no es válido [cite: 34]
            System.out.println("Error: '" + e.getMessage() + "' no se puede convertir a número.");
        }

        System.out.println("");

        // --- 3] ---
        // ( "test.txt" para el ejemplo)
        System.out.println("--- 3  y 5: Lectura de Archivo ---");
        
        // 5. try-with-resources. El BufferedReader se cierra solo ]
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println("Contenido de 'test.txt':");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            // 3.FileNotFoundException 
            System.out.println("Error: El archivo 'test.txt' no se encontró. ¡Creálo!");
        } catch (IOException e) {
            // 5. Manejar IOException
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        System.out.println("\n----------------------------------\n");

        // --- 4. Excepción personalizada¿
        try {
            System.out.println("--- Ejercicio 4: Excepción Personalizada ---");
            System.out.print("Ingresa una edad: ");
            int edad = scanner.nextInt();
            
            // 4. Lanzarla si la edad es menor a 0 o mayor a 120 [cite: 38]
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("¡Esa edad no es válida");
            }
            System.out.println("Edad ingresada: " + edad + " (Válida)");
            
        } catch (EdadInvalidaException e) {
            // 4. Capturarla y mostrar mensaje
            System.out.println("Error de Negocio: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ingresaste un dato inválido.");
            scanner.next(); // Limpia el buffer
        }
        
        scanner.close();
        System.out.println("\n Fin ");
    }
}

