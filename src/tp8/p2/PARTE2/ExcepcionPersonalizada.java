/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2.PARTE2;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ExcepcionPersonalizada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una edad:");
        
        try {
            int edad = Integer.parseInt(scan.nextLine());
            if (edad <= 0 || edad >= 120) {
                throw new EdadInvalidaE("Ingreso una edad invalida");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaE e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número.");
        }
    }
}
