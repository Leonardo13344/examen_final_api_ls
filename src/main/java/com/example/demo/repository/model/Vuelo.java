package com.example.demo.repository.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vuelos")
public class Vuelo implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "vuel_id")
	private Integer id;

	@Column(name = "vuel_numero")
	private Integer numero;
	
	@Column(name = "vuel_fecha_vuelo")
	private String fechaVuelo;
	
	@Column(name = "vuel_origen")
	private String origen;
	
	@Column(name = "vuel_destino")
	private String destino;
	
	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosD;
	
	@Column(name = "vuel_valor_asiento")
	private String valorAsiento;
	
	@Column(name = "vuel_estado")
	private String estado;
	
	@Column(name = "vuel_categoria")
	private String categoria;
	
	@Column(name = "vuel_nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "vuel_avio_id")
	private Avion avion;
	
	@OneToMany(mappedBy = "vuelo")
	private List<CompraPasaje> compraPasajes;

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

	public String getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosD() {
		return asientosD;
	}

	public void setAsientosD(Integer asientosD) {
		this.asientosD = asientosD;
	}

	public String getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(String valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
	
	
	
	
}
