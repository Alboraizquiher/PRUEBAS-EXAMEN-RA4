/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 Datos del libro:
    
Título, Autor, ISBN, Estado (Prestado o Disponible).
    
 */
public class DatoLibro {
    
    private String Title;
    private String Autor;
    private long PoD;

    public DatoLibro(String Title, String Autor, long PoD) {
        this.Title = Title;
        this.Autor = Autor;
        this.PoD = PoD;
    }

  

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public long getPoD() {
        return PoD;
    }

    public void setPoD(long PoD) {
        this.PoD = PoD;
    }

   

    
  

    
    
    
}
