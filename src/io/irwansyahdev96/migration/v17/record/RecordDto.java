package io.irwansyahdev96.migration.v17.record;

import io.irwansyahdev96.migration.v17.record.dto.ResponseListAPI;
import io.irwansyahdev96.migration.v17.record.model.Position;
import io.irwansyahdev96.migration.v17.record.service.PositionService;

public class RecordDto {

    public static void showRecord(){
        PositionService positionService = new PositionService();

        System.out.println("Show data position");
        ResponseListAPI all = positionService.getAll();
        all.data().stream()
            .forEach(d ->{
                Position p = (Position) d;
                System.out.println("Id: "+p.getId());
                System.out.println("Name: "+p.getName());
                System.out.println("Description: "+p.getDescription());

                System.out.println();
            });

        positionService.save(new Position("AE", "Alternative Eksekutif", "This is eksekutif"));

        System.out.println("Show data position after add: ");
        all.data().stream()
            .forEach(d ->{
                Position p = (Position) d;
                System.out.println("Id: "+p.getId());
                System.out.println("Name: "+p.getName());
                System.out.println("Description: "+p.getDescription());

                System.out.println();
            });
    }
}
