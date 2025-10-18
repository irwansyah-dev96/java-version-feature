package io.irwansyahdev96.migration.v17.record;

import java.util.ArrayList;
import java.util.List;
import io.irwansyahdev96.migration.v17.record.model.Employee;
import io.irwansyahdev96.migration.v17.record.model.Position;

public class LoadData {
    
    public static List<Position> positions;
    public static List<Employee> employees;

    public static void init(){
        if(positions == null){
            positions = new ArrayList<>();
            positions.addAll(List.of(
                new Position("ADM", "Admin", "This is admin"),
                new Position("SA", "Super Admin", "This is super admin"),
                new Position("E", "Engineer", "This is engineer"))
            );
        }

        if(employees == null){
            employees = new ArrayList<>();
            employees.addAll(List.of(
                new Employee("irwansyah.dev96", "Irwansyah", "SA")
            ));
        }
    }

}
