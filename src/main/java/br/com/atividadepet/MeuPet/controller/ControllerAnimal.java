package br.com.atividadepet.MeuPet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.atividadepet.MeuPet.model.Animal;

import br.com.atividadepet.MeuPet.service.IAnimalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(value = "animal")
public class ControllerAnimal {
	@Autowired
	private IAnimalService service;
	
	@ApiOperation(value = "Buscar Todos os animais")
	@GetMapping("/animal")
	public ArrayList<Animal> buscarTodos(){
		return service.buscarTodos();
	}
	
	@ApiOperation(value = "Cadastrar animal")
	@PostMapping("/animal")
	public ResponseEntity<Animal> cadastrarCliente(@RequestBody Animal novo){
		Animal res = service.criarNovo(novo);
		if(res !=null) {
			return ResponseEntity.ok(res);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@ApiOperation(value = "Deletar animal")
	@DeleteMapping("/animal/{id}")
	public ResponseEntity<Animal> deletaAnimal(@PathVariable Integer id) {
		service.deletarAnimal(id);
		return ResponseEntity.ok(null);
	}
}
	

