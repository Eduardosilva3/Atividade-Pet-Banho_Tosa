package br.com.atividadepet.MeuPet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.atividadepet.MeuPet.model.Cliente;
import br.com.atividadepet.MeuPet.service.IClienteService;

@RestController
public class ControllerCliente {
	
	@Autowired
	private IClienteService service;
	
	@GetMapping("/cliente")
	public ArrayList<Cliente> buscarTodos(){
		return service.buscarTodos();
	}
	
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente novo){
		Cliente res = service.criarNovo(novo);
		if(res !=null) {
			return ResponseEntity.ok(res);
		}
		
		return ResponseEntity.notFound().build();
	}
}
