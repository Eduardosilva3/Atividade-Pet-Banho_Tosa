package br.com.atividadepet.MeuPet.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class OrdemServico {
		
		@ManyToOne
		@JoinColumn(name = "id_cliente")
		private Cliente cliente;
		
		@Column(name = "valor")
		private Double valor;
		
		@Column(name = "hora_entrada")
		private String horaEntrada;
		
		@Column(name = "hora_saida")
		private String horaSaida;
		
}
