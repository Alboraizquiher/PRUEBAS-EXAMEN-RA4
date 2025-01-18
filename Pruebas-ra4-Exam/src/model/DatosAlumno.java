/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
Datos del usuario:
    
Nombre, Apellido, ID usuario, Libros prestados (máximo 3).
 */
public class DatosAlumno {
    
    private String Name;
    private String Surname;
    private Integer IdUser;
    private Integer NumberBooks;

    public DatosAlumno(String Name, String Surname, Integer IdUser, Integer NumberBooks) {
        this.Name = Name;
        this.Surname = Surname;
        this.IdUser = IdUser;
        this.NumberBooks = NumberBooks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public Integer getIdUser() {
        return IdUser;
    }

    public void setIdUser(Integer IdUser) {
        this.IdUser = IdUser;
    }

    public Integer getNumberBooks() {
        return NumberBooks;
    }

    public void setNumberBooks(Integer NumberBooks) {
        this.NumberBooks = NumberBooks;
    }
    
    
    
    
    
}
