package com.example.projetjee.Busso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeMouvementRepository extends JpaRepository<TypeMouvement, Long> {

}
