package io.irwansyahdev96.migration.v11.lambdaexp.dto;

public class BookDto {
    private String title;
    private String authorPublisher;

    public BookDto() {
        
    }

    public BookDto(String title, String authorPublisher) {
        this.title = title;
        this.authorPublisher = authorPublisher;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthorPublisher() {
        return authorPublisher;
    }
    public void setAuthorPublisher(String authorPublisher) {
        this.authorPublisher = authorPublisher;
    }

    
}
