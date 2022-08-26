package br.com.atividadepet.MeuPet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atividadepet.MeuPet.dao.IClienteDao;
import br.com.atividadepet.MeuPet.model.Cliente;

@Service
public class clienteService implements IClienteService{
	
	@Autowired
	private IClienteDao dao;
	
	@Override
	public ArrayList<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>)dao.findAll();
	}

	@Override
	public Cliente criarNovo(Cliente novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

}
