/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import model.DatoLibro;
import model.DatosAlumno;

/**
 *
 * @author Usuario 1
 */
public class Biblioteca {

    /*Ejemplo 1: Gestión de Biblioteca

Enunciado: Crea un programa para gestionar los libros de una biblioteca. El programa será utilizado por los bibliotecarios y debe permitir:

Datos del libro:
    
Título, Autor, ISBN, Estado (Prestado o Disponible).
    
Datos del usuario:
    
Nombre, Apellido, ID usuario, Libros prestados (máximo 3).
    
Características principales:
    
Crea clases para representar los elementos identificables. IT´S ALMOST DONE 
    
Incluye constructores para inicializar las clases. IT´S ALMOST DONE
    
Añade getters y setters para al menos una clase. IT´S ALMOST DONE
    
Implementa un menú interactivo con las siguientes opciones:
    
Registrar un nuevo libro.
Registrar un usuario.
Prestar un libro (actualiza el estado del libro y registra el usuario que lo prestó).
Mostrar los datos de un libro por ISBN.
Salir del programa.
    
     */
    
    
     private DatoLibro[] inventoryBook;
      private DatosAlumno[] inventoryAlumno;
     
     
    public static void main(String[] args) {

        //MENU INTERACTIVO //
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        do {

            System.out.println(" << THE MENU IS >> ");
            System.out.println(" << 1 -> REGISTER A NEW BOOK >> ");
            System.out.println(" << 2 -> REGISTER A NEW USER >> ");
            System.out.println(" << 3 -> LEND A BOOK >> ");
            System.out.println(" << 4 -> SHOW ALL THE DATA ABOUT A BOOK FOR ISBN >> ");
            System.out.println(" << 5 -> EXIT THE PROGRAM >> ");
            
            switch (menu) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    registerUser();
                    break;
                case 3:
                    lendBook();
                    break;
                case 4:
                    showDataBook();
                    break;
                case 5:
                    System.out.println(" GOOD BYE ");
                    break;
                
                    
                    
            }

        } while (menu != 5);
        
        

    }
    
    public static void registerBook(){
    
        System.out.println(" PLEASE ENTER THE BOOK THAT YOU WANT TO REGISTRER");
        Scanner sc = new Scanner (System.in);
        System.out.println(" Introduce the title of the book");
        String Title = sc.nextLine();
        System.out.println(" Introduce the autor of the book");
        String Autor = sc.nextLine();
        System.out.println(" Introduce the ISBN of the book");
        int Isbn = sc.nextInt();
        
        
        
       DatoLibro book1 = new DatoLibro(Title,Autor,Isbn);
        
       
        
       
        
    
    };
    
    public static void registerUser(){
    
    };
    
    public static void lendBook(){
    
    };
    
    public static void showDataBook(){
    
    };
    
    
    
    

}
