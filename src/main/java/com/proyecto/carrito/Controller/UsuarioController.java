package com.proyecto.carrito.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.carrito.model.Cliente;
import com.proyecto.carrito.service.IUsuarioService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/Cliente")

public class UsuarioController {

	private final Logger logger=LoggerFactory.getLogger(UsuarioController.class);
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/registro")
	public String create() {
		return "Cliente/registro";
	}
	
	@PostMapping("/save")
	public String save(Cliente usuario) {
		
		logger.info("Usuario registro:{}",usuario);
		usuario.setTipo("USER");
		usuarioService.save(usuario);
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public String login() {
	    return "Cliente/login";
	}
	
	@PostMapping("/acceder")
	public String acceder(Cliente usuario) {
		 logger.info("Accesos:{}",usuario);
		 
		
		return "redirect:/";
		
	}
	
	@GetMapping("/compras")
	public String obtenerCompra(Model model,HttpSession session) {
		model.addAttribute("sesion",session.getAttribute("idusuario"));
		return "Cliente/compras";
	}
	
	
	}

