package br.com.atividadepet.MeuPet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atividadepet.MeuPet.dao.IOrdemDao;
import br.com.atividadepet.MeuPet.model.OrdemServico;

@Service
public class OrdemService implements IOrdemService {

	@Autowired
	private IOrdemDao dao;
	
	@Override
	public ArrayList<OrdemServico> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<OrdemServico>)dao.findAll();
	}

	@Override
	public OrdemServico criarNovo(OrdemServico novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

}
