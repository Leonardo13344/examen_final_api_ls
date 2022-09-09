package com.example.demo.service;

import java.util.List;


import com.example.demo.service.to.VueloTo;

public interface IVueloService {
	
	public List<VueloTo> find(String origen, String destino, String fecha); 

}
