package br.com.atividadepet.MeuPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "animal")
public class Animal {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_animal")
		private Integer id_animal;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "idade")
		private Integer idade;
		
		@Column(name ="peso")
		private Double peso;
		
		@ManyToOne
		@JoinColumn(name = "id_cliente")
		@JsonIgnoreProperties("listAnimal")
		private Cliente cliente;
		
		
		public Integer getId_animal() {
			return id_animal;
		}

		public void setId_animal(Integer id_animal) {
			this.id_animal = id_animal;
		}

		public void setPeso(Double peso) {
			this.peso = peso;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getIdade() {
			return idade;
		}

		public void setIdade(Integer idade) {
			this.idade = idade;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		
		
}
