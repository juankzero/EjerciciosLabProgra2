/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author Docente
 */
public class Nodo {
    
    private String nombre;
    private Nodo siguiente;

    public Nodo() 
    {
        nombre = "";
        siguiente = null;
    }
    
    public Nodo(String _nombre, Nodo _sig)
    {
        this.nombre = _nombre;
        this.siguiente = _sig;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
    
    
    
    
}
