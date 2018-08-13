package com.example.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.drools.business.ProductoBusiness;
import com.example.drools.entity.Producto;

@RestController

public class ProductoController {

	@Autowired
	private ProductoBusiness productoBusiness;

	@GetMapping("/producto")
	public Iterable<Producto> getAll() {
		return productoBusiness.getAllProductos();
	}

	@PostMapping("/producto")
	public Producto save(@RequestBody Producto producto) {			
		Producto miProducto = productoBusiness.save(producto);
		return miProducto;
	}

}
