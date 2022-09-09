package com.example.demo.repository.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="compra_pasajes")
public class CompraPasaje implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "copa_id")
	private Integer id;
	
	@Column(name = "copa_numero")
	private Integer numero;
	
	@Column(name = "copa_fecha_compra")
	private LocalDate fechaCompra;
	
	@Column(name = "copa_numero_tarjeta")
	private Integer numeroTarjeta;
	
	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer asientosComprados;
	
	@Column(name = "copa_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "copa_vuel_id")
	private Vuelo vuelo;
	
	@ManyToOne
	@JoinColumn(name = "copa_clie_id")
	private Cliente cliente;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Integer getAsientosComprados() {
		return asientosComprados;
	}

	public void setAsientosComprados(Integer asientosComprados) {
		this.asientosComprados = asientosComprados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

}
