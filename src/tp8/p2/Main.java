/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.p2;

/**
 *
 * @author artur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear clientes 
        Cliente c1 = new Cliente("Lucia Gomez");
        Cliente c2 = new Cliente("Carlos Ruiz");

        // 2. Crear pedidos
        Pedido pedido1 = new Pedido("Pendiente", c1);
        Pedido pedido2 = new Pedido("Pendiente", c2);

        // 3. Crear productos 
        Producto p1 = new Producto("Notebook Gamer", 1200000);
        Producto p2 = new Producto("Monitor 144Hz", 350000);
        Producto p3 = new Producto("Mouse Inalámbrico", 45000);

        // --- CASO 1: Compra con PayPal (Tiene descuento) ---
        System.out.println("--- PROCESANDO PEDIDO DE LUCIA ---");
        // Lucia compra la Notebook y el Mouse
        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p3);
        
        // Notificamos que arrancó el proceso
        pedido1.notificarEstado("EN_PROCESO");
        
        // Calculamos total y pagamos
        double total1 = pedido1.calcularTotal();
        PayPal pagoPayPal = new PayPal();
        pagoPayPal.procesarPago(total1); // Acá se aplica el 15% off automático
        
        // Finalizamos
        pedido1.notificarEstado("PAGADO");

        System.out.println("\n--------------------------------\n");

        // --- CASO 2: Compra con Tarjeta (Sin descuento extra) ---
        System.out.println("--- PROCESANDO PEDIDO DE CARLOS ---");
        // Carlos compra solo el Monitor
        pedido2.agregarProducto(p2);
        
        // Notificamos
        pedido2.notificarEstado("EN_PROCESO");
        
        // Calculamos total y pagamos
        double total2 = pedido2.calcularTotal();
        TarjetaDeCredito pagoTarjeta = new TarjetaDeCredito();
        pagoTarjeta.procesarPago(total2);
        
        // Finalizamos
        pedido2.notificarEstado("PAGADO");
    
    }
    
}
