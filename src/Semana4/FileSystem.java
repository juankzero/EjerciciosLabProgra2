/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;
import java.util.ArrayList;

/**
 *
 * @author Juan Zepeda
 */
public class FileSystem {
    
    public static void main(String args[])
    {
        ArrayList<Directory> items = new ArrayList<Directory>();
        
        items.add(new Directory("Windows", FileType.directory, 0));
        items.add(new Directory("Users", FileType.directory, 0));
        
        items.get(0).addDirectory("System32", 0);
        ((Directory)(items.get(0).getListFiles().get(0))).addDirectory("config", 0);
        
        
        items.add(new Directory("holaMundo", FileType.directory, 0));
    }
    
}
