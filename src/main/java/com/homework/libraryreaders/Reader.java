package com.homework.libraryreaders;

import java.util.ArrayList;

public class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private int dateOfBirth;
    private int phoneNumber;

    Reader(String fullName, int libraryCardNumber, String faculty, int dateOfBirth, int phoneNumbe){
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    void takeBook(int bookCount){
        System.out.println(fullName + " take " + bookCount + " books");

    }

    void takeBook(String[] books){
        
        System.out.print(fullName + " take  books: ");
        for (int i = 0; i < books.length;i++){
            System.out.print(books[i] + ", ");
        }
        System.out.println("");
    }

    void takeBook(ArrayList<Book> books){
        System.out.print(fullName + " take books: ");
        for (Book book:books){
            System.out.print(book.getBookName() + ", ");
        }
        System.out.println("");
    }

    void returnBook(int bookCount){
        System.out.println(fullName + " take " + bookCount + " books");   
    }

    void returnBook(ArrayList<String> books){
        
        System.out.print(fullName + " take  books: ");
        for (int i = 0; i < books.size();i++){
            System.out.print(books.get(i) + ", ");
        }
        System.out.println("");
    }

    void returnBook(Book...books){
        System.out.print(fullName + " take  books: ");
        for (Book book:books){
            System.out.print(book.getBookName() + ", ");
        }
        System.out.println("");
    }
    
}
