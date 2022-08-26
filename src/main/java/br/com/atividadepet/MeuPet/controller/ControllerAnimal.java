package br.com.atividadepet.MeuPet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.atividadepet.MeuPet.model.Animal;

import br.com.atividadepet.MeuPet.service.IAnimalService;

@RestController
public class ControllerAnimal {
	@Autowired
	private IAnimalService service;
	
	@GetMapping("/animal")
	public ArrayList<Animal> buscarTodos(){
		return service.buscarTodos();
	}
	
	@PostMapping("/animal")
	public ResponseEntity<Animal> cadastrarCliente(@RequestBody Animal novo){
		Animal res = service.criarNovo(novo);
		if(res !=null) {
			return ResponseEntity.ok(res);
		}
		
		return ResponseEntity.notFound().build();
	}
}
	

