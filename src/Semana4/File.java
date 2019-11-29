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
public class File extends FileEntry{
    
    private String extension;

    public File(String extension, String name, FileType type, int size) {
        super(name, type, size);
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void setType(FileType type) {
        super.setType(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FileType getType() {
        return FileType.file; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
