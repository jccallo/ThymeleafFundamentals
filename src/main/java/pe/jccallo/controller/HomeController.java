package pe.jccallo.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		// bienvenida
		model.addAttribute("mensaje", "Bienvenido a Fundamentos de Thymeleaf");
		model.addAttribute("fecha", new Date());
		
		// usuario
		String nombreUsuario = "Armando";
		int edad = 30;
		double salario = 930.0;
		boolean esCasado = false;
		
		model.addAttribute("nombre", nombreUsuario);
		model.addAttribute("edad", edad);
		model.addAttribute("sueldo", salario);
		model.addAttribute("esCasado", esCasado);
		
		// listado
		List<String> frutas = new LinkedList<String>();
		frutas.add("Platano");
		frutas.add("Uva");
		frutas.add("Mango");
		
		model.addAttribute("frutas", frutas);
		
		return "home";
		
	}
}


 