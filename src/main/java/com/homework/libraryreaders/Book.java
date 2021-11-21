package com.homework.libraryreaders;

public class Book {
    private String bookName;
    private String author;

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    String getBookName(){
        return bookName;
    }

}
