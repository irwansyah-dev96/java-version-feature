package io.irwansyahdev96.migration.v11.lambdaexp;

import io.irwansyahdev96.migration.v11.lambdaexp.dto.BookDto;
import io.irwansyahdev96.migration.v11.lambdaexp.dto.ResponseAPI;
import io.irwansyahdev96.migration.v11.lambdaexp.dto.ResponseListAPI;
import io.irwansyahdev96.migration.v11.lambdaexp.service.BookService;

public class LambdaExpression {

    
    
    public static void showLambdaExpression(){
        BookService bookService = new BookService();

        System.out.println("Get All");
        ResponseListAPI all = bookService.getAll("");

        all.getData()
            .forEach(data -> {
                BookDto b = (BookDto) data;

                System.out.println(b.getTitle().concat(" - ").concat(b.getAuthorPublisher()));
            });

        System.out.println("\nJumlah data ".concat(String.valueOf(all.getCount())));
        
        System.out.println();
        System.out.println();
        System.out.println("Get All By Is Active");
        ResponseListAPI allByIsActive = bookService.getAllByIsActive("");

        allByIsActive
            .getData()
            .forEach(data -> {
                BookDto b = (BookDto) data;

                System.out.println(b.getTitle().concat(" - ").concat(b.getAuthorPublisher()));
            });

        System.out.println("\nJumlah data ".concat(String.valueOf(allByIsActive.getCount())));
        
        System.out.println("\nImplementation Method Reference");
        
        

        all.getData()
            .stream()
            .map(data -> (BookDto) data).map(BookDto::getTitle).forEach(System.out::println);
        System.out.println();
        
        System.out.println("\nAuthor");
        all.getData()
            .stream()
            .map(data -> (BookDto) data).map(bookDto -> bookDto.getAuthorPublisher().split("-")[0])
            .distinct()
            .forEach(System.out::println);

        System.out.println();
        System.out.println("\nFind by Id");

        ResponseAPI<?> dataById = bookService.findById(2);

        if(dataById.getIsAvailable()){
            BookDto data = (BookDto)dataById.getData();
            System.out.println(data.getTitle()+" - "+data.getAuthorPublisher());
        }
        else
            System.out.println("Data not found");
        

        
    }
    

}
