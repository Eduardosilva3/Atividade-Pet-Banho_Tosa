package br.com.atividadepet.MeuPet.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.atividadepet.MeuPet.model.Animal;

public interface IAnimalDao extends CrudRepository<Animal, Integer>{

}
