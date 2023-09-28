package org.cibertec.edu.pe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.cibertec.edu.pe.model.Productos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @GetMapping
    public String mostrarCarrito(HttpSession session, Model model) {
        List<Productos> carrito = (List<Productos>) session.getAttribute("carrito");
        model.addAttribute("carrito", carrito);
        return "carrito";
    }
}

