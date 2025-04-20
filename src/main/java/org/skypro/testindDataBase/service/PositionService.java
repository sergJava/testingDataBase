package org.skypro.testindDataBase.service;

import org.skypro.testindDataBase.model.Position;
import org.springframework.stereotype.Service;
import repository.PositionRepository;

import java.util.Collection;

@Service
public class PositionService {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public Position createPosition(Position position) {
        return positionRepository.save(position);
    }

    public Position findPosition(Long id) {
        return positionRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        positionRepository.deleteById(id);
    }

    public Collection<Position> getAll(){
        return positionRepository.findAll();
    }
}
