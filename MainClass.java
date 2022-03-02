package com.example;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args){

        Book[] books=new Book[6];
        books[0]= new Book("Love In The Time Of Cholera","Gabriel Garica Marquez");
        books[1]= new Book("A Thousand Splendid Suns","Khaleed Hosseini");
        books[2]= new Book("Murder Of Roger Ackroyd","Agatha Christie");
        books[3]= new Book("One Night In The Call Centre","Chetan Bhagat");
        books[4]= new Book("God Of Small Things","Arundhati Roy");
        books[5]=new Book("Two States","Chetan Bhagat");

        FindBook findBook=new FindBook(books);
        ArrayList<Book> booksReturned = findBook.findByAuthor("Chetan");

        BookPrinter bookPrinter = new BookPrinter(booksReturned);
        bookPrinter.printBook();


    }
}
