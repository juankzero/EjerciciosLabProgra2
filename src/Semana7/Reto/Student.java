/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7.Reto;
import java.io.File;
import java.io.RandomAccessFile;
/**
 *
 * @author Juan Zepeda
 */
public class Student {
    
    private File fileStudent;
    private RandomAccessFile binaryStudent;
    
    /*
    Inicializa el atributo File
    */
    Student()
    {}
    
    /*
    Almacena el alumno con sus datos:
    NumeroCuenta (int), Nombre (String) y su indice académico (float)
    */
    public void addStudent(int account, String name)
    {}
    
    /* 
    Retorna el nombre del alumno basado en su numero de cuenta
    */
    public String getNameStudent(int account)
    {
        return null;
    }
    
    /*
    Retorna el indice académico de un alumno 
    a partir de su numero de cuenta
    */
    public float getGradePoint(int account)
    {
        return 0;
    }
    
    /*
    Imprime todos los alumnos con su codigo, nombre e
    Indice academico
    */
    public void printAllStudents()
    {}
    
    /*
    Actualiza el indice academico (grade) del estudiante basado
    en su codigo
    */
    public boolean  updateGradePointStudent(int code, float grade)
    {
        return false;
    }
}
