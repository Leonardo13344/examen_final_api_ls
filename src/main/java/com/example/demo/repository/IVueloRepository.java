package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.model.Vuelo;

public interface IVueloRepository {

	public List<Vuelo> find(String origen, String destino, String fecha);
}
