package com.GestMateriel.simple.CRUD.app.service;

import com.GestMateriel.simple.CRUD.app.model.MaterielModel;
import com.GestMateriel.simple.CRUD.app.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterielService {

    @Autowired
    private MaterielRepository repository;

    // 📋 Lire tous les matériels
    public List<MaterielModel> getAll() {
        return repository.findAll();
    }

    // 🔍 Lire un matériel par ID
    public Optional<MaterielModel> getById(Long id) {
        return repository.findById(id);
    }

    // ➕ Créer un matériel
    public MaterielModel create(MaterielModel materiel) {
        return repository.save(materiel);
    }

    // ✏️ Modifier un matériel
    public MaterielModel update(Long id, MaterielModel updated) {
        return repository.findById(id).map(m -> {
            m.setNom(updated.getNom());
            m.setType(updated.getType());
            m.setNumeroSerie(updated.getNumeroSerie());
            m.setEtat(updated.getEtat());
            m.setLocalisation(updated.getLocalisation());
            return repository.save(m);
        }).orElseThrow(() -> new RuntimeException("Matériel introuvable : " + id));
    }

    // 🗑️ Supprimer un matériel
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
