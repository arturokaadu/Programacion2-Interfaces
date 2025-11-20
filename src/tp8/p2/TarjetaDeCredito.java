/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2;

/**
 *
 * @author artur
 */
public class TarjetaDeCredito  implements Pago{
//    private String numeroTarjeta;
//
//    public TarjetaDeCredito(String numeroTarjeta) {
//        this.numeroTarjeta = numeroTarjeta;
//    }
//    
//    @Override
//    public double aplicarDescuento(double porcentaje) {
//      System.out.println("Aplicando descuento del " + porcentaje + "% al pago con tarjeta " + this.numeroTarjeta);
//        // Aquí iría la lógica para calcular el monto final.
//        // Por ahora, devolvemos 0 como placeholder.
//        return 0.0; // Debería devolver el monto CON el descuento aplicado.
//    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("El total es: " + monto);
        System.out.println("El pago se realizo con éxito!");
    }


}
