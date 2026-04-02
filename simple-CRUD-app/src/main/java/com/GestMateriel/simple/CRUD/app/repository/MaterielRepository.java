package com.GestMateriel.simple.CRUD.app.repository;

import com.GestMateriel.simple.CRUD.app.model.MaterielModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<MaterielModel, Long> {
    // Spring génère automatiquement : findAll, findById, save, deleteById...
    // Tu peux ajouter des recherches personnalisées :
    // List<Materiel> findByType(String type);
}
