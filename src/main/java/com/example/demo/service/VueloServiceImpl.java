package com.example.demo.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVueloRepository;
import com.example.demo.repository.model.Vuelo;
import com.example.demo.service.to.VueloTo;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloRepository vueloRepository;
	
	@Override
	public List<VueloTo> find(String origen, String destino, String fecha) {
		// TODO Auto-generated method stub
		List<Vuelo> aux = this.vueloRepository.find(origen, destino, fecha);
		List<Vuelo> aux2 = aux.stream().filter(p -> p.getEstado().equals("D")).collect(Collectors.toList());
		List<VueloTo> aux3 = new ArrayList<>();
		for (Vuelo vuelo : aux2) {
			aux3.add(convertirVueloTo(vuelo));
		}
		return aux3;
	}
	
	private VueloTo convertirVueloTo(Vuelo vuelo) {
		VueloTo aux = new VueloTo();
		aux.setNumero(vuelo.getNumero());
		aux.setOrigen(vuelo.getOrigen());
		aux.setDestino(vuelo.getDestino());
		aux.setCategoria(vuelo.getCategoria());
		aux.setNombre(vuelo.getNombre());
		aux.setValorAsiento(vuelo.getValorAsiento());
		return aux;
		
	}

}
