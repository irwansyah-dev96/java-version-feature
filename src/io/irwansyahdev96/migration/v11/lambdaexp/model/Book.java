package io.irwansyahdev96.migration.v11.lambdaexp.model;


import java.util.ArrayList;
import java.util.List;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private Boolean isActive;

    public Book() {
        
    }

    public Book(Integer id,String title, String author, String publisher, Boolean isActive) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<?> init(Book...book){

        List<Book> books = new ArrayList<>();

        for (Book b : book) {
            books.add(b);
        }

        return books;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    
}
