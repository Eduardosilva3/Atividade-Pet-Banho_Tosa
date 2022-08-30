package br.com.atividadepet.MeuPet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atividadepet.MeuPet.dao.IAnimalDao;
import br.com.atividadepet.MeuPet.model.Animal;

@Service
public class AnimalService implements IAnimalService{
	
	@Autowired
	private IAnimalDao dao;
	
	@Override
	public ArrayList<Animal> buscarTodos() {
		
		return (ArrayList<Animal>)dao.findAll();
	}

	@Override
	public Animal criarNovo(Animal novo) {
		return dao.save(novo);
	}

	@Override
	public void deletarAnimal(Integer id) {
		dao.deleteById(id);
		
	}

}
