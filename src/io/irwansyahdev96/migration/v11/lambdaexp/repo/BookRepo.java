package io.irwansyahdev96.migration.v11.lambdaexp.repo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import io.irwansyahdev96.migration.v11.lambdaexp.LoadBooks;
import io.irwansyahdev96.migration.v11.lambdaexp.dto.BookDto;
import io.irwansyahdev96.migration.v11.lambdaexp.model.Book;

public class BookRepo {
    List<Book> books = LoadBooks.create();

    public List<BookDto> getAll(){
        return books.stream().map((book) -> new BookDto(book.getTitle(), book.getAuthor().concat("-").concat(book.getPublisher()))).toList();
    }

    public List<BookDto> getAllSort(Boolean asc){
        return getAll().stream()
            .sorted(asc? Comparator.comparing(BookDto::getTitle):Comparator.comparing(BookDto::getTitle).reversed())
            .toList();
    }

    public List<BookDto> getAll(String search){
        return books.stream()
            .filter(book -> book.getTitle().contains(search) || book.getAuthor().contains(search) || book.getPublisher().contains(search))
            .map((book) -> new BookDto(book.getTitle(), book.getAuthor().concat("-").concat(book.getPublisher()))).toList();
    }

    public List<BookDto> getAllSort(String search, Boolean asc){
        return getAll(search).stream()
            .sorted(asc? 
                (book1,book2) -> book1.getTitle().compareTo(book2.getTitle()):
                (book1,book2) -> book2.getTitle().compareTo(book1.getTitle())
            ).toList();
    }

    public List<BookDto> getAllSortDesc(String search){
        return getAll(search).stream()
            .sorted(Comparator.comparing(BookDto::getTitle).reversed())
            .toList();
    }

    // get all by isActive
    public List<BookDto> getAllByIsActive(){
        return books.stream()
                    .filter(book-> book.getIsActive())
                    .map(book -> new BookDto(book.getTitle(), book.getAuthor().concat("-").concat(book.getPublisher()))).toList();
    }

    public List<BookDto> getAllByIsActive(String search){
        return books.stream()
                    .filter(book-> book.getIsActive())
                    .filter(book -> book.getTitle().contains(search) || book.getAuthor().contains(search) || book.getPublisher().contains(search))
                    .map(book -> new BookDto(book.getTitle(), book.getAuthor().concat("-").concat(book.getPublisher()))).toList();
    }

    public Optional<BookDto> findById(Integer id){
        return books.stream()
                    .filter(book -> book.getId().equals(id))
                    .map(book -> new BookDto(book.getTitle(), book.getAuthor().concat("-").concat(book.getPublisher())))
                    .findFirst();
    }

}
