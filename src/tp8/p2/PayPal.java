/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2;

/**
 *
 * @author artur
 */
public class PayPal implements PagoConDescuento {
    
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.15); // Descuento del 15%
    }

    @Override
    public void procesarPago(double monto) {
        double total = aplicarDescuento(monto);
        System.out.println("El total con descuento es: " + total);
        System.out.println("El pago se realizo correctamente");
    }
//    public PayPal() {
//        // Constructor vacío (o podría recibir email si quisiéramos)
//    }
//
//    // Método de Pago (obligatorio)
//    @Override
//    public void procesarPago(double monto) {
//        System.out.println("Procesando pago de $" + monto + " con PayPal.");
//    }
//
//    // Método de PagoConDescuento (ahora obligatorio)
//    @Override
//    public double aplicarDescuento(double porcentaje) {
//        System.out.println("Aplicando descuento del " + porcentaje + "% al pago con PayPal.");
//        // Lógica real calcularía y devolvería el monto final.
//        return 0.0; // Placeholder
//    }
}