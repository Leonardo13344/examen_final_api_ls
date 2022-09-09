package com.example.demo.service.to;

import java.io.Serializable;



import org.springframework.hateoas.RepresentationModel;

public class VueloTo extends RepresentationModel<VueloTo> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numero;

	private String categoria;

	private String nombre;

	private String origen;

	private String destino;
	
	private String valorAsiento;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(String valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
	
	

}
