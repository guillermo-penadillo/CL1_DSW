package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductosService;
import org.cibertec.edu.pe.interfaces.IProductos;
import org.cibertec.edu.pe.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductosService{
	@Autowired
	private IProductos data;

	@Override
	public List<Productos> Listar() {
		return (List<Productos>)data.findAll();
	}

	@Override
	public Optional<Productos> Buscar(String Id) {
		return data.findById(Id);
	}
}
