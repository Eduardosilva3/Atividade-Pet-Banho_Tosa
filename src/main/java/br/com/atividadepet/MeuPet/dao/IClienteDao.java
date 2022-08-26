package br.com.atividadepet.MeuPet.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.atividadepet.MeuPet.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer>{

}
