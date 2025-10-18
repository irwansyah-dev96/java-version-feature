package io.irwansyahdev96.migration.v17.record.repo;

import java.util.List;
import java.util.Optional;

import io.irwansyahdev96.migration.v17.record.LoadData;
import io.irwansyahdev96.migration.v17.record.model.Employee;

public class EmployeeRepo {

    private List<Employee> employees = LoadData.employees;
    
    public List<Employee> getAll(){
        LoadData.init();

        return employees;
    }

    public Optional<Employee> getById(String id){
        LoadData.init();

        return employees.stream()
                    .filter(emp -> emp.getId().equals(id))
                    .findFirst();
    }

    public Employee save(Employee employee){
        LoadData.init();

        LoadData.employees.add(employee);

        return employee;
    }

    public Employee update(Employee employee){
        LoadData.init();
        LoadData.employees.removeIf(emp -> emp.getId().equals(employee.getId()));
        LoadData.employees.add(employee);

        return employee;
    }

    public void deleteById(String id){
        LoadData.init();
        LoadData.employees.removeIf(emp -> emp.getId().equals(id));
    }
}
