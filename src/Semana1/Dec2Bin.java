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
        
        int cociente = numeroDecimal;
        int residuo  = 0;
 
        String numeroBinario = "";
        
        do{
            residuo = cociente % 2;
            cociente = cociente / 2;

            numeroBinario = residuo + numeroBinario;
            
        }while(cociente >= 1);
        
        System.out.printf("El numero %d su valor en binario es %s%n", numeroDecimal, numeroBinario);
       
        
    
    }
    
}
