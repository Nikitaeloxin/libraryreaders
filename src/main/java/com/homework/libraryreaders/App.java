package com.homework.libraryreaders;

import java.util.ArrayList;

/**
 * Library readers!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Reader> readers = new ArrayList<Reader>();
        String[] stringBooks = {"book1","book2"};
         

        books.add(new Book("War and Peace", "Tolstoy"));
        books.add(new Book("Idiot", "Dosyoevsky"));

        readers.add(new Reader("Ivanov Ivan Ivanovich", 
            1111, "Math", 14091995, 123456789));
        readers.add(new Reader("Petrov Petr Petrovich", 
            1112, "Languages", 28091995, 987654321));

        readers.get(0).takeBook(2);
        System.out.println("----------------------");
        readers.get(0).takeBook(books);
        System.out.println("----------------------");
        readers.get(1).takeBook(stringBooks);

    }
    
}
