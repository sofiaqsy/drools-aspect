package com.example.drools.business;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.drools.entity.Producto;
import com.example.drools.repository.ProductoRepository;

@Service
public class ProductoBusiness {

	private final KieContainer kieContainer;

	@Autowired
	private ProductoRepository productoRepository;

	@Autowired
	public ProductoBusiness(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Producto getProductoDiscount(Producto producto) {
		// get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(producto);
		kieSession.fireAllRules();
		kieSession.dispose();
		return producto;
	}

	public List<Producto> getAllProductos() {
		return (List<Producto>) productoRepository.findAll();
	}

	public Producto save(Producto producto) {
		
		return productoRepository.save(getProductoDiscount(producto));
	}

}
