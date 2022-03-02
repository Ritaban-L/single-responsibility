package com.example;

import java.util.ArrayList;

public class BookPrinter {

    ArrayList<Book> books;

    public BookPrinter(ArrayList<Book> books){
        this.books=books;
    }

    public void printBook(){

        for(Book book:books){
            System.out.println(book);
        }
    }
}
