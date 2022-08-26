package br.com.atividadepet.MeuPet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.atividadepet.MeuPet.model.OrdemServico;
import br.com.atividadepet.MeuPet.service.IOrdemService;

@RestController
public class ControllerOrdemServico {

		@Autowired
		private IOrdemService service;
		
		@GetMapping("/ordem")
		public ArrayList <OrdemServico> buscarTodos(){
			return service.buscarTodos();
		}
		
		@PostMapping("/ordem")
		public ResponseEntity<OrdemServico> cadastrarCliente(@RequestBody OrdemServico novo){
			OrdemServico res = service.criarNovo(novo);
			if(res !=null) {
				return ResponseEntity.ok(res);
			}
			
			return ResponseEntity.notFound().build();
		}
		
}
