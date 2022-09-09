package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IVueloService;
import com.example.demo.service.to.VueloTo;

@RestController
@RequestMapping("/vuelos")
@CrossOrigin("http://localhost:8080/")
public class VueloRestFulController {

	@Autowired
	private IVueloService vueloService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VueloTo> find(@RequestParam(value="or") String origen, @RequestParam(value="des") String destino, @RequestParam(value="date") String fecha) {
		return this.vueloService.find(origen, destino, fecha);
	}
}
