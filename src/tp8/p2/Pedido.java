/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artur
 */
public class Pedido implements Pagable {
    private List<Producto> productos;;
    private Notificable cliente;
    private String estado;

    public void asignarCliente(Notificable cliente) {
        this.cliente = cliente;
        notificarCliente("Cliente asignado al pedido.");
    }
    public Pedido(ArrayList<Producto> productos, Notificable cliente) {
        this.productos =new ArrayList<>();
      
        this.estado = "Creado";
       
    }
    
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        this.estado = "Producto agregado"; // El estado CAMBIA
        cambiarEstadoYNotificar("Producto agregado: " + p.getNombre());
    }
    private void cambiarEstadoYNotificar(String nuevoEstadoDescripcion) {
        this.estado = nuevoEstadoDescripcion;
        // Calls notificarCliente WITH the message
        notificarCliente("Actualización del pedido: " + this.estado);
    }
    
    private void notificarCliente(String mensaje) {
        if (cliente != null) {
            cliente.notificar(mensaje); // Uses the received message
        }
    }
    
    
    @Override
    public double calcularTotal() {
        double totalPedido = 0.0; // iniciamos el pedido en 0
        
        for (Producto producto : productos) { // recorremos los productos y cada uno se sumará al total
            totalPedido += producto.calcularTotal();
        }
        return totalPedido;
    }

    public List<Producto> getProductos() {
            return productos;
        }

        // Getter para estado
        public String getEstado() {
            return estado;
        }

}
