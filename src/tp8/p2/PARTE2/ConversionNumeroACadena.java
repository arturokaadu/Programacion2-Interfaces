/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2.PARTE2;

/**
 *
 * @author artur
 */
import java.util.Scanner;
public class ConversionNumeroACadena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto para convertir a entero:");
        String texto = scan.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número convertido es: " + numero);
        } catch (NumberFormatException ex) {
            System.out.println("Error: El texto ingresado no es un número entero válido.");
        }
    }
}
