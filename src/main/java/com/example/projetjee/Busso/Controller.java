package com.example.projetjee.Busso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private TypeMouvementRepository typeMouvementRepositoryRepository;
    @GetMapping(path = "TypeMouvement")
    public List<TypeMouvement> getTypeMouvement(){
        return typeMouvementRepositoryRepository.findAll();
    }
    @GetMapping(path = "TypeMouvement")
    public Optional<TypeMouvement> getTypeMouvement(@PathVariable Long codeTypeMvt ){

        Optional<TypeMouvement> TypeMouvement = typeMouvementRepositoryRepository.findById(codeTypeMvt);

        if(!TypeMouvement.isPresent())  throw new EntityNotFoundException("Le TypeMouvement correspondant au codeTypeMvt : " + codeTypeMvt + " n'existe pas");
        return TypeMouvement;
    }
    @PostMapping(path="TypeMouvement")
    public  TypeMouvement insertEtud(TypeMouvement typMvt)
    {
        return typeMouvementRepositoryRepository.save(typMvt);
    }
}