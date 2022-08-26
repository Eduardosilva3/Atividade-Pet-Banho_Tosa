package br.com.atividadepet.MeuPet.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.atividadepet.MeuPet.model.OrdemServico;

public interface IOrdemDao extends CrudRepository<OrdemServico, Integer>{

}
