package br.com.atividadepet.MeuPet.service;

import java.util.ArrayList;

import br.com.atividadepet.MeuPet.model.Animal;



public interface IAnimalService {
	
	public ArrayList<Animal> buscarTodos();
	public Animal criarNovo(Animal novo);
}
