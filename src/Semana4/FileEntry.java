/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

/**
 *
 * @author Juan Zepeda
 */

enum FileType
{
    file,
    directory,
    systemFile,
    blank
}

public class FileEntry {
    
    protected String name;
    protected FileType type;
    protected int size; //bytes

    public FileEntry() {
        name = "UNKNOW";
        type = FileType.blank;
        size = 0;
    }

    public FileEntry(String name, FileType type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(FileType type) {
        this.type = type;
    }

    public FileType getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    
    
   
    
    
}
