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
public class PruebaLista {
    
  
    public static void main(String args[])
    {
        
        ListaEnlazada nueva = new ListaEnlazada();
        
        nueva.agregarNodo("Julio");
        nueva.agregarNodo("Panchis");
        nueva.agregarNodo("Teodoro");
        nueva.agregarNodo("Simon");
        
        nueva.imprimir();
        
        nueva.eliminarNodo("Panchis");
        System.out.println("\n");
        
        nueva.imprimir();
        
    
    }
    
}
