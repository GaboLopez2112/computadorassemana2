package com.uisrael.Computadoras.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.uisrael.Computadoras.repository.Usuario_Repositorio;
@Controller
public class ComputadoraController {
	@Autowired
	private Usuario_Repositorio cursoRepository;
	
	@GetMapping
	public String home() {
		return "redirect:/computadora";
	}
}
