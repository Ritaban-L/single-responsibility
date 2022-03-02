package com.example;

import java.util.ArrayList;

public class FindBook {

    private final Book[] books;

    public FindBook(Book[] books){
        this.books=books;
    }

    public ArrayList<Book> findByAuthor(String authName){
        ArrayList<Book> containsAuthor=new ArrayList<Book>();
        for(int i=0;i<books.length;i++){
            if(books[i].author.contains(authName)){
                containsAuthor.add(books[i]);
            }
        }
        return containsAuthor;
    }

    public ArrayList<Book> findByBookName(String bookName){
        ArrayList<Book> containsBookName=new ArrayList<Book>();
        for(int i=0;i<books.length;i++){
            if(books[i].author.contains(bookName)){
                containsBookName.add(books[i]);
            }
        }
        return containsBookName;
    }
}
