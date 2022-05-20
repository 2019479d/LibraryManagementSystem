package com.company;

public class Author {

    String AName;

    Book [] Books;


    public Author(String AName){
        this.AName = AName;
    }
    public Author(String aName, Book[] books) {
        this.AName = aName;
        Books = books;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String aName) {
        this.AName = aName;
    }

    public Book[] getBooks() {
        return Books;
    }

    public void setBooks(Book[] books) {
        Books = books;
    }


}
