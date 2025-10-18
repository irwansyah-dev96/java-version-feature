package io.irwansyahdev96.migration.v11.lambdaexp.service;

import io.irwansyahdev96.migration.v11.lambdaexp.dto.BookDto;
import io.irwansyahdev96.migration.v11.lambdaexp.dto.ResponseAPI;

import java.util.List;

import io.irwansyahdev96.migration.v11.lambdaexp.dto.ResponseListAPI;
import io.irwansyahdev96.migration.v11.lambdaexp.repo.BookRepo;

public class BookService {
    
    private BookRepo bookRepo = new BookRepo();

    public ResponseListAPI getAll(String search){
        // List<BookDto> all = (search.isEmpty())?bookRepo.getAll():bookRepo.getAll(search);

        List<BookDto> all = (search.isEmpty())?bookRepo.getAllSort(true):bookRepo.getAllSort(search, true);

        return new ResponseListAPI(all, Long.valueOf(all.size()));
    }

    public ResponseListAPI getAllByIsActive(String search){
        List<BookDto> all = (search.isEmpty())?bookRepo.getAllByIsActive():bookRepo.getAllByIsActive(search);

        return new ResponseListAPI(all, Long.valueOf(all.size()));
    }

    public ResponseAPI<BookDto> findById(Integer id){
        return bookRepo.findById(id)
                    .map(bookDto -> new ResponseAPI<BookDto>(bookDto, true))
                    .orElse(new ResponseAPI<BookDto>(new BookDto(),false));
    }
}
