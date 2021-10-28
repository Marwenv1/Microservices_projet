package com.lego.microservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.lego.microservice.entities.fournisseur;
@Repository
public interface fournisseurRepository extends CrudRepository<fournisseur,Long> {

}
