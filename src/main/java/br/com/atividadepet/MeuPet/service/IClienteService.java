package br.com.atividadepet.MeuPet.service;

import java.util.ArrayList;

import br.com.atividadepet.MeuPet.model.Cliente;

public interface IClienteService {
		
	public ArrayList<Cliente> buscarTodos();
	public Cliente criarNovo(Cliente novo);
}
