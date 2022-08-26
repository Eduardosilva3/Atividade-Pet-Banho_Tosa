package br.com.atividadepet.MeuPet.service;

import java.util.ArrayList;


import br.com.atividadepet.MeuPet.model.OrdemServico;

public interface IOrdemService {
	public ArrayList<OrdemServico> buscarTodos();
	public OrdemServico criarNovo(OrdemServico novo);
}
