package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.DatoLibro;
import model.DatosAlumno;

/**
 *
 * @author Usuario 1
 */
public class Biblioteca {

    private ArrayList<DatoLibro> libro;
    private ArrayList<DatosAlumno> alumnos;

    public Biblioteca() {
        libro = new ArrayList<>();
        alumnos = new ArrayList<>();
    }

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println(" << THE MENU IS >> ");
            System.out.println(" << 1 -> REGISTER A NEW BOOK >> ");
            System.out.println(" << 2 -> REGISTER A NEW USER >> ");
            System.out.println(" << 3 -> LEND A BOOK >> ");
            System.out.println(" << 4 -> SHOW ALL THE DATA ABOUT A BOOK FOR ISBN >> ");
            System.out.println(" << 5 -> EXIT THE PROGRAM >> ");
            menu = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (menu) {
                case 1:
                    biblioteca.registerBook();
                    break;
                case 2:
                    biblioteca.registerUser();
                    break;
                case 3:
                    biblioteca.lendBook();
                    break;
                case 4:
                    biblioteca.showDataBook();
                    break;
                case 5:
                    System.out.println("GOOD BYE");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (menu != 5);
    }

    public void registerBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE BOOK THAT YOU WANT TO REGISTER");
        System.out.println("Introduce the title of the book:");
        String title = sc.nextLine();

        System.out.println("Introduce the author of the book:");
        String author = sc.nextLine();

        System.out.println("Introduce the ISBN of the book:");
        long isbn = sc.nextLong();

        DatoLibro newBook = new DatoLibro(title, author, isbn);
        libro.add(newBook);

        System.out.println("THE BOOK HAS BEEN REGISTERED SUCCESSFULLY.");
    }

    public void registerUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE USER THAT YOU WANT TO REGISTER");
        System.out.println("Introduce the name of the user:");
        String name = sc.nextLine();

        System.out.println("Introduce the surname of the user:");
        String surname = sc.nextLine();

        System.out.println("Introduce the ID of the user:");
        int idUser = sc.nextInt();

        DatosAlumno newUser = new DatosAlumno(name, surname, idUser);
        alumnos.add(newUser);

        System.out.println("THE USER HAS BEEN REGISTERED SUCCESSFULLY.");
    }

    public void lendBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE USER ID WHO WANTS TO LEND A BOOK:");
        int userId = sc.nextInt();
        sc.nextLine(); // Consume newline

        DatosAlumno user = null;
        for (DatosAlumno alumno : alumnos) {
            if (alumno.getIdUser() == userId) {
                user = alumno;
                break;
            }
        }

        if (user == null) {
            System.out.println("USER NOT FOUND.");
            return;
        }

        System.out.println("PLEASE ENTER THE ISBN OF THE BOOK TO BE LENT:");
        long isbn = sc.nextLong();

        DatoLibro bookToLend = null;
        for (DatoLibro book : libro) {
            if (book.getPoD() == isbn) {
                bookToLend = book;
                break;
            }
        }

        if (bookToLend == null) {
            System.out.println("BOOK NOT FOUND.");
            return;
        }

        System.out.println("ENTER THE POSITION (0-2) TO ASSIGN THE BOOK:");
        int position = sc.nextInt();

        if (position < 0 || position > 2) {
            System.out.println("THE POSITION IS OUT OF BOUNDS.");
        }

        System.out.println("SEARCH AND RESPONSE BRANCH.");

    }

    public void showDataBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE ISBN OF THE BOOK:");
        long isbn = sc.nextLong();

        for (DatoLibro book : libro) {
            if (book.getPoD() == isbn) {
                System.out.println("Book Details:");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAutor());
                System.out.println("ISBN: " + book.getPoD());
                return;
            }
        }

        System.out.println("BOOK NOT FOUND.");
    }
}
