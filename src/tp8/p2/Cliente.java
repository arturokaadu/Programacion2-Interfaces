/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.p2;

/**
 *
 * @author artur
 */
public class Cliente implements Notificable {
    private String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void notificar(String nuevoEstado) {
    System.out.println("Notificación para " + nombre + ": " + nuevoEstado);    }
    
}
