package org.cibertec.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.cibertec.edu.pe.interfaceService.IProductosService;
import org.cibertec.edu.pe.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductosController {
	
	@Autowired
	private IProductosService servicio;
	
	//Listar
	@GetMapping("/listar")
	public String Listado(Model m) {
		List<Productos> lista = servicio.Listar();
		m.addAttribute("productos", lista);
		return "listar";
	}
	
	@PostMapping("/agregarAlCarrito/{id}")
	public String agregarAlCarrito(@PathVariable("Id") String id, HttpSession session) {
	    Optional<Productos> productoOptional = servicio.Buscar(id);

	    if (productoOptional.isPresent()) {
	        Productos producto = productoOptional.get();

	        List<Productos> carrito = (List<Productos>) session.getAttribute("carrito");
	        if (carrito == null) {
	            carrito = new ArrayList<>();
	        }

	        carrito.add(producto);

	        session.setAttribute("carrito", carrito);
	    }
	    return "redirect:/listar";
	}

}
