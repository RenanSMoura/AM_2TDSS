package br.com.fiap.nac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_NAC_CARRO")
@SequenceGenerator(name = "seqCarro", sequenceName = "SEQ_NAC_CARRO", allocationSize = 1)
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCarro")
	@Column(name = "ID")
	private long id;

	@Column(name = "MARCA")
	private String marca;
	@Column(name = "MODELO")
	private String modelo;
	@Column(name = "ANO")
	private int ano;

	@Column(name = "COMBUSTIVEL")
	@Enumerated(EnumType.STRING)
	private Combustivel combustivel;
	@Column(name = "KMPROXIMATROCAOLEO")
	private double kmProximaTrocaOleo;
	@Column(name = "KMCARRO")
	private double kmCarro;
	@Column(name = "PLACA")
	private String placa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public double getKmCarro() {
		return kmCarro;
	}

	public void setKmCarro(double kmCarro) {
		this.kmCarro = kmCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getKmProximaTrocaOleo() {
		return kmProximaTrocaOleo;
	}

	public void setKmProximaTrocaOleo(double kmProximaTrocaOleo) {
		this.kmProximaTrocaOleo = kmProximaTrocaOleo;
	}
	
	@Override
	public String toString() {
		return "km carro: " + this.getKmProximaTrocaOleo();
	}


	
}
