package org.skypro.testindDataBase.controller;

import org.skypro.testindDataBase.model.Position;
import org.skypro.testindDataBase.service.PositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class PositionController {
    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping
    public ResponseEntity<Position> createPosition(@RequestBody Position position ) {
        return ResponseEntity.ok(positionService.createPosition(position));
    }

    @GetMapping
    public ResponseEntity<Position> getPosition(@RequestParam Long id) {
        return ResponseEntity.ok(positionService.findPosition(id));
    }

    @GetMapping("/getall")
    public ResponseEntity<Collection<Position>> getAll() {
        return ResponseEntity.ok(positionService.getAll());
    }
}
