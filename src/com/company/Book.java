package com.company;
import com.company.Author;

public class Book {
    String name;
    String ISBN;
    Author author;


    public Book(String name, String ISBN, Author author) {
        this.name = name;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN=" + ISBN +
                ", author=" + author +
                '}';
    }
}
