package io.irwansyahdev96.migration.v17.record.service;

import java.util.List;
import java.util.Map;

import io.irwansyahdev96.migration.v17.record.dto.ResponseAPI;
import io.irwansyahdev96.migration.v17.record.dto.ResponseChangeAPI;
import io.irwansyahdev96.migration.v17.record.dto.ResponseListAPI;
import io.irwansyahdev96.migration.v17.record.model.Position;
import io.irwansyahdev96.migration.v17.record.repo.PositionRepo;

public class PositionService {

    private PositionRepo positionRepo = new PositionRepo();
    
    public ResponseListAPI getAll(){
        List<?> all = positionRepo.getAll();
        return new ResponseListAPI(all, Long.valueOf(all.size()));
    }

    public ResponseAPI<Position> getById(String id){
        return positionRepo.getById(id)
                    .map(position -> new ResponseAPI<>(position, true))
                    .orElse(new ResponseAPI<>(new Position(),false));
    }

    public ResponseChangeAPI save(Position position){

        Position save = positionRepo.save(position);

        return new ResponseChangeAPI(save.getId(), "Position berhasil disimpan", null);
    }

    public ResponseChangeAPI update(Position position){
        Position save = positionRepo.update(position);

        return new ResponseChangeAPI(save.getId(), "Position berhasil diperbarui", null);
    }

    public ResponseChangeAPI deleteById(String id){
        Boolean deleteById = positionRepo.deleteById(id);

        if(deleteById)
            return new ResponseChangeAPI(id, "Position berhasil dihapus", null);
        else
            return new ResponseChangeAPI(id, "Position gagal dihapus", Map.of("id", "Position dengan id "+id+" tidak ditemukan") );
    }
}
