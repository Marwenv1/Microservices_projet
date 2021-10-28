package com.lego.microservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.lego.microservice.entities.fournisseur;
import com.lego.microservice.repositories.fournisseurRepository;

public class legoService implements IlegoService{
@Autowired
fournisseurRepository fr;
@Override
	public List<fournisseur> retrieveAllfournisseur() {
		List <fournisseur> al =(List<fournisseur>)fr.findAll();
	return al;}
		/*

		@Override
		public fournisseur addfournisseur(fournisseur a) {
			return (fournisseur) fr.save(a);
		}

		@Override
		public void deleteCoffee(Coffee a) {
			ar.deleteById(a.getId());
			
		}

		@Override
		public Coffee updateCoffee(Coffee a) {
			Coffee al = (Coffee) ar.save(a);
			return al;
		}

		@Override
		public Optional<Coffee> retrieveCoffee(int id) {
			Optional<Coffee> a=ar.findById(id);
			return a;
		}
		return null;
	}
*/
	@Override
	public fournisseur addfournisseur(fournisseur a) {
		// TODO Auto-generated method stub
		return (fournisseur) fr.save(a);
	}

	@Override
	public void deletefournisseur(fournisseur a) {
		//fr.deleteAll();
		
	}

	@Override
	public fournisseur updatefournisseur(fournisseur a) {
		// TODO Auto-generated method stub
		fournisseur al = (fournisseur) fr.save(a);
		return al;
	}

	@Override
	public Optional<fournisseur> retrievefournisseur(Long id) {
		// TODO Auto-generated method stub
		Optional<fournisseur> a=fr.findById(id);
		return a;	}

	

}
