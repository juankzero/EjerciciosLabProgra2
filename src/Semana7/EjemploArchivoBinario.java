/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;
import java.io.File;
import java.io.RandomAccessFile;
/**
 *
 * @author Docente
 */
public class EjemploArchivoBinario {
    private static File file = new File("empleados.bin");
    private static RandomAccessFile binaryFile;
    
    public static void main(String args[])
    {
        
        /*addEmployee(100, "Ramiro Eustaquio", 25000);
        addEmployee(101, "Allan Brito", 12000);
        addEmployee(102, "Juan Orlando", 50);*/
        
        readEmployee(102);
        
    }
    
    public static void addEmployee(int code, String name, 
            double salary)
    {
        try
        {
            binaryFile = new RandomAccessFile(file, "rw");
            
            binaryFile.seek(binaryFile.length());
            
            binaryFile.writeInt(code);
            binaryFile.writeUTF(name);
            binaryFile.writeDouble(salary);
            
            binaryFile.close();
            
            System.out.println("¡Registro Almacenado!");
            
        }catch(Exception e)
        {
            System.out.println("Error al intentar crear/abrir archivo");
        }
    }
    
    public static void readEmployee(int code)
    {
        
        try
        {
            binaryFile = new RandomAccessFile(file, "r");
            
            binaryFile.seek(0);
            
            while(binaryFile.getFilePointer() < binaryFile.length())
            {
                int _code = binaryFile.readInt();
                String _name = binaryFile.readUTF();
                double _salary = binaryFile.readDouble();
                
                if(code == _code)
                {
                    System.out.printf("¡Registro Encontrado!%nRegistro: { code: %d, name: %s, salary: %f }", _code, _name, _salary);
                    binaryFile.close();
                    return;
                }
                
            }
            
            System.out.println("¡No se encontro el codigo de empleado!");
            
        }catch(Exception e)
        {
            System.out.println("Error al intentar crear/abrir archivo");
        }
        
    }
    
}
