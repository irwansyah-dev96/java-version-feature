package io.irwansyahdev96.migration.v17.record.repo;

import java.util.List;
import java.util.Optional;

import io.irwansyahdev96.migration.v17.record.LoadData;
import io.irwansyahdev96.migration.v17.record.model.Position;

public class PositionRepo {
    private List<Position> positions;

    private void reload(){
        LoadData.init();
        positions = LoadData.positions;
    }
    
    public List<Position> getAll(){
        reload();
        return positions;
    }

    public Optional<Position> getById(String id){
        reload();

        return positions.stream()
                    .filter(emp -> emp.getId().equals(id))
                    .findFirst();
    }

    public Position save(Position position){
        reload();

        LoadData.positions.add(position);

        return position;
    }

    public Position update(Position position){
        reload();
        LoadData.positions.removeIf(emp -> emp.getId().equals(position.getId()));
        LoadData.positions.add(position);

        return position;
    }

    public Boolean deleteById(String id){
        reload();
        return LoadData.positions.removeIf(emp -> emp.getId().equals(id));
    }
}
