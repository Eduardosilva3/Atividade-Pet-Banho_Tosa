package br.com.atividadepet.MeuPet.model;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "cliente")
public class Cliente {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_cliente", nullable = false)
		private Integer id;
	
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "telefone")
		private String telefone;
		
		@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		@JsonIgnoreProperties("cliente")
		private List<Animal> listAnimal;
		
		

		public List<Animal> getListAnimal() {
			return (List<Animal>)listAnimal;
		}

		public void setListAnimal(List<Animal> listAnimal) {
			this.listAnimal = listAnimal;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
}
