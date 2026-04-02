package com.GestMateriel.simple.CRUD.app.controller;

import com.GestMateriel.simple.CRUD.app.model.MaterielModel;
import com.GestMateriel.simple.CRUD.app.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiels")
public class MaterielController {

    @Autowired
    private MaterielService service;

    // GET /api/materiels → liste tout
    @GetMapping
    public List<MaterielModel> getAll() {
        return service.getAll();
    }

    // GET /api/materiels/1 → récupère le matériel #1
    @GetMapping("/{id}")
    public ResponseEntity<MaterielModel> getById(@PathVariable Long id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST /api/materiels → crée un matériel
    @PostMapping
    public MaterielModel create(@RequestBody MaterielModel materiel) {
        return service.create(materiel);
    }

    // PUT /api/materiels/1 → modifie le matériel #1
    @PutMapping("/{id}")
    public MaterielModel update(@PathVariable Long id, @RequestBody MaterielModel materiel) {
        return service.update(id, materiel);
    }

    // DELETE /api/materiels/1 → supprime le matériel #1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
