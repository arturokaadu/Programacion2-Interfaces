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
    private ArrayList<Producto> productos;
    private Cliente cliente;
    private String estado;

//    public void asignarCliente(Cliente cliente) {
//        this.cliente = cliente;
//        notificarCliente("Cliente asignado al pedido.");
//    }
    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;    //
        this.cliente = cliente;  //
        this.productos = new ArrayList<>(); // Esto soluciona el error de inicialización
    }
    public void agregarProducto(Producto p) {
        this.productos.add(p);
        // this.estado = "Producto agregado"; // El estado CAMBIA
        // cambiarEstadoYNotificar("Producto agregado: " + p.getNombre());
    }
//    private void cambiarEstadoYNotificar(String nuevoEstadoDescripcion) {
//        this.estado = nuevoEstadoDescripcion;
//        // Calls notificarCliente WITH the message
//        notificarCliente("Actualización del pedido: " + this.estado);
//    }
    
// Este método es necesario porque el Main del PDF lo llama explícitament
    public void notificarEstado(String nuevoEstado) {
        this.estado = nuevoEstado; // Actualizamos el atributo
        // Llamamos al método  Cliente (que implementa Notificable)
        if (cliente != null) {
            cliente.notificar("Tu pedido cambió de estado a: " + nuevoEstado); 
        }
    }
    
    @Override
    public double calcularTotal() {
        double totalPedido = 0.0; // iniciamos el pedido en 0
        
        for (Producto producto : productos) { // recorremos los productos y cada uno se sumará al total
            totalPedido += producto.getPrecio();
        }
        return totalPedido;
    }

//    public List<Producto> getProductos() {
//            return productos;
//        }
//
//        // Getter para estado
//        public String getEstado() {
//            return estado;
//        }

}
