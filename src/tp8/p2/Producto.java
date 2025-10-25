/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2;

/**
 *
 * @author artur
 */
public class Producto implements Pagable{
    private String nombre;
    private double precio;

    @Override
    public double calcularTotal() {
        return this.precio;
    }
    
    
}
