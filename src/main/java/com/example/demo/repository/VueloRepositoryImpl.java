package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.model.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Vuelo> find(String origenD, String destinoD, String fechaD) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.em.createQuery(
				"SELECT v FROM Vuelo v WHERE v.origen =: origenD AND v.destino =: destinoD AND v.fechaVuelo =: fechaD",
				Vuelo.class);
		myQuery.setParameter("origenD", origenD);
		myQuery.setParameter("destinoD", destinoD);
		myQuery.setParameter("fechaD", fechaD);
		return myQuery.getResultList();
	}
	
	

}
