package com.proyecto.carrito.Controller;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.carrito.model.Cliente;
import com.proyecto.carrito.model.Producto;
import com.proyecto.carrito.service.ProductoService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/Productos")
public class ProductoController {
     
	private final org.slf4j.Logger LOGGER=LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("")
	public String show(Model model) {
		 model.addAttribute("Productos", productoService.findAll());
		return "Productos/show";
	}
	
	@GetMapping("/create")
	public String create() {
		return "Productos/create";
	}
	
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("Este es el objeto producto{}",producto);
		Cliente cli=new Cliente(1,"","","","","","");
		producto.setCliente(cli);
		
		productoService.save(producto);
		return "redirect:/Productos";
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable String id,Model model) {
		Integer idProducto = Integer.parseInt(id);
		Producto producto=new Producto();
		java.util.Optional<Producto> optionalProducto=productoService.get(idProducto);
		producto=optionalProducto.get();
		
		LOGGER.info("Producto Buscado:{}",producto);
		model.addAttribute("producto",producto);
		return "Productos/edit";
	}
	
	@PostMapping("/update")
	public String update(Producto producto) {
		productoService.update(producto);
		return "redirect:/Productos";
	}
	
}


