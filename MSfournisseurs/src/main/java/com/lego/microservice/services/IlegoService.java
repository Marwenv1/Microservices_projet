package com.lego.microservice.services;
import java.util.List;
import java.util.Optional;

import com.lego.microservice.entities.fournisseur;
public interface IlegoService {
	List<fournisseur> retrieveAllfournisseur();
	fournisseur addfournisseur(fournisseur a);
	void deletefournisseur(fournisseur a);
	fournisseur updatefournisseur(fournisseur a);
	Optional<fournisseur> retrievefournisseur(Long id);

}
