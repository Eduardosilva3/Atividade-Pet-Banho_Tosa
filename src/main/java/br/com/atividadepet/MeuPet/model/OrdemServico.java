package br.com.atividadepet.MeuPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id_ordem")
		private Integer idOrdem;
	
		@ManyToOne
		@JoinColumn(name = "id_cliente")
		private Cliente cliente;
		
		@Column(name = "valor")
		private Double valor;
		
		@Column(name = "hora_entrada")
		private String horaEntrada;
		
		@Column(name = "hora_saida")
		private String horaSaida;

		public Integer getIdOrdem() {
			return idOrdem;
		}

		public void setIdOrdem(Integer idOrdem) {
			this.idOrdem = idOrdem;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public String getHoraEntrada() {
			return horaEntrada;
		}

		public void setHoraEntrada(String horaEntrada) {
			this.horaEntrada = horaEntrada;
		}

		public String getHoraSaida() {
			return horaSaida;
		}

		public void setHoraSaida(String horaSaida) {
			this.horaSaida = horaSaida;
		}
		
		
}
