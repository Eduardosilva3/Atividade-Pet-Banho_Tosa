package br.com.atividadepet.MeuPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "idade")
		private Integer idade;
		
		@Column(name ="peso")
		private double peso;
		
		@ManyToOne
		@JoinColumn(name = "id_cliente")
		private Cliente cliente;

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
