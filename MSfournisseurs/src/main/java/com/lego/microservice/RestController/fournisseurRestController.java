package com.lego.microservice.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lego.microservice.entities.fournisseur;
import com.lego.microservice.services.IlegoService;

@RestController
public class fournisseurRestController {

@RestController
public class CoffeeController {
	@Autowired
	IlegoService fs;
	
	//http://localhost:8080/SpringMVC/servlet/allfournisseur
	//@CrossOrigin(origins ="*")
	@GetMapping("/allfournisseur")
	@ResponseBody
	public List<fournisseur> getfournisseurs(){
		List<fournisseur> l=fs.retrieveAllfournisseur();
				return l;
	}
	
	@PostMapping("/addfournisseur")
	@ResponseBody
	public fournisseur addfournisseur(@RequestBody fournisseur a) {
		return fs.addfournisseur(a);
	}
	
	@PostMapping("/deletefournisseur")
	@ResponseBody
	public void deleteAchat(@RequestBody fournisseur a) {
		fs.addfournisseur(a);
	}
	
	@GetMapping("/getfournisseur/{id}")
	@ResponseBody
	public Optional<fournisseur> getfournisseur(@PathVariable(value = "id")int id){
		Optional<fournisseur> a=fs.retrievefournisseur((long) id);
		return a;
	}
	
	@PostMapping("/updatefournisseur")
	@ResponseBody
	public fournisseur updateAchat(@RequestBody fournisseur a) {
		return fs.updatefournisseur(a);
	}
	
}}
