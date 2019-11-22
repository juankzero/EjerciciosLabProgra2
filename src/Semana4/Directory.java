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
public class Directory extends FileEntry{
    
    private ArrayList<FileEntry> listFiles;

    public Directory(String name, FileType type, int size) {
        super(name, type, size);
        this.listFiles = new ArrayList<FileEntry>();
    }

    public ArrayList<FileEntry> getListFiles() {
        return listFiles;
    }

    public void addDirectory(String _name, int _size)
    {
        listFiles.add(new Directory(_name, FileType.directory, _size));
    }
    
    public void addFile(String _name, String _ext, int _size)
    {
        listFiles.add(new File(_ext, _name, FileType.file, _size));
    }
    
    
    
    
}
