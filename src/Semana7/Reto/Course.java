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
public class Course {
    private File fileCourse;
    private RandomAccessFile binaryCourse;
    
    /*
    Inicializa el atributo File
    */
    public Course() 
    {}
    
    /*
    Almacena un curso con sus datos
    Codigo (int), nombre (String) y sus Unidades Valorativas (float)
    */
    public void addCourse(int code, String name, int rating)
    {}
    
    /*
    Retorna el nombre de la clase segun su codigo
    */
    public String getNameCourse(int code)
    {
        return null;
    }
    
    /*
    Retorna el numero de unidades valorativas segun 
    codigo de clase
    */
    public float getRatingCourse(int code)
    {
        return 0;
    }
    
    /*
    Imprime todos los cursos con su codigo, 
    nombre y UVs
    */
    public void printAllCourses()
    {}
    
    
}
