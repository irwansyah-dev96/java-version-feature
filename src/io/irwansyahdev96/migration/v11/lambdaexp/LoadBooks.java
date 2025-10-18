package io.irwansyahdev96.migration.v11.lambdaexp;

import java.util.List;

import io.irwansyahdev96.migration.v11.lambdaexp.model.Book;

public class LoadBooks {
    
    @SuppressWarnings("unchecked")
    public static List<Book> create(){
        return (List<Book>) new Book().init(
            new Book(1,"Clean Code", "Martin","programmer", true),
            new Book(2,"Filosofi Teras", "Henry","psikologi", false),
            new Book(3,"Berbicara itu ada seninya", "Mark", "programmer", true),
            new Book(4,"Clean Code 2", "Martin", "programmer", true),
            new Book(5,"Clean Code 3", "Martin", "programmer", false),
            new Book(6,"Seni bertuhan", "Habib Jafar","psikologi", true));
    }

}
