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
public class ListaEnlazada {
    
    private Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }
    
    public boolean estaVacia()
    {
        return primero == null;
    }
    
    public void agregarNodo(String _nombre)
    {
        Nodo nuevo = new Nodo(_nombre, null);
        
        if(estaVacia())
            primero = nuevo;
        else
        {
            Nodo tmp = primero;
            
            while(tmp.getSiguiente() != null)
            {
                tmp = tmp.getSiguiente();
            }
            
            tmp.setSiguiente(nuevo);
        }
        
    }
    
    public void imprimir()
    {
        
        if(estaVacia())
            System.out.println("¡La Lista esta vacia!");
        else
        {
            Nodo tmp = primero;
            
            while( tmp != null )
            {
                System.out.println(tmp.getNombre() + " ");
                tmp = tmp.getSiguiente();
            }
        }
    
    }
    
    void eliminarNodo(String _nombre)
    {
        
        Nodo anterior = null;
        Nodo actual = primero;
        
        while(actual != null)
        {
            if(actual.getNombre().equals(_nombre))
            {
                if(actual == primero)
                    primero = actual.getSiguiente();
                else
                {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                
                return;
            }
            
            anterior = actual;
            actual = actual.getSiguiente();
            
            
            
        }
        
    }
    
    
    
}
