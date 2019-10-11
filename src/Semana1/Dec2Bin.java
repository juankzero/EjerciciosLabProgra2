/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Scanner;
/**
 *
 * @author Docente
 */
public class Dec2Bin {
    
    public static void main(String args[])
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("*** C O N V I E R T E  D E C  A  B I N ***");
        
        System.out.print("Ingrese un numero positivo: ");
        int numeroDecimal = leer.nextInt();
        
        int cociente = 0;
        int residuo  = 0;
        
        cociente = numeroDecimal / 2;
        residuo = numeroDecimal % 2;
        
        String numeroBinario = "";
        
        while(cociente != 1)
        {
            numeroBinario = residuo + numeroBinario;
            
            residuo = cociente % 2;
            cociente = cociente / 2;
            
        }
        
        numeroBinario = "1" + residuo + numeroBinario;
        
        System.out.printf("El numero %d su valor en binario es %s%n", numeroDecimal, numeroBinario);
       
        
    
    }
    
}
