package com.example;

public class Book {

    String bookName;
    String author;

    public Book(String bookName,String author){
        this.bookName=bookName;
        this.author=author;
    }
    @Override
    public String toString() {
        return bookName + " by "+author;
    }
}
