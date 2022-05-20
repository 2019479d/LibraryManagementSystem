package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Author> authorList;
    ArrayList<Book> bookList;

    public Scanner sc;



    public static void main(String[] args) {
	// write your code here
        System.out.println("Dinil Kumarasiri");


        // create , read , update , delete

        // add a book to library
        // search book from library 1. if enter book name 2. if enter author name
        // update book attribute
        // delete books when enter its name

        Main object = new Main();
        object.addBook();
    }
    private boolean numberValidation(String number ){

        boolean x;
        try
        {
            Integer.parseInt(number);
            System.out.println(number + " is a valid integer");
            x = true;
        }
        catch (NumberFormatException e)
        {
            System.out.println(number + " is not a valid integer");
            x = false;
        }
        return x;
    }

    private void addBook(){
        Book book;
        Author author;
        sc = new Scanner(System.in);
        System.out.println("Enter book name : ");
        String bookName =  sc.nextLine();
        System.out.println("Enter ISBN : ");
        String isbn;
        do{
            isbn = sc.nextLine();
        }while(!numberValidation(isbn));
        System.out.println("Enter Author's  name : ");
        String authorName = sc.nextLine();
        author = new Author(authorName);
        book = new Book(bookName, isbn, author);
        bookList.add(book);
    }

    private void 
}
