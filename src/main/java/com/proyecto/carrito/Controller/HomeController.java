package com.proyecto.carrito.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.carrito.model.DetalleOrden;
import com.proyecto.carrito.model.Producto;
import com.proyecto.carrito.model.Transaccion;
import com.proyecto.carrito.service.ProductoService;

@Controller
@RequestMapping("/")
public class HomeController {
 
	private final Logger log=LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	private ProductoService productoService;
	
	
	List<DetalleOrden> detalles=new ArrayList<DetalleOrden>();
	
	//Datos de la Transaccion/
	Transaccion transac= new Transaccion();
	
	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("productos",productoService.findAll());
		
		return "Cliente/homeCliente";
	}
	
	
	@GetMapping("productohome/{id}")
	public String productoHome(@PathVariable Integer id,Model model) {
		
		log.info("Id producto enviado como parametro {}",id);
		Producto producto=new Producto();
		Optional<Producto> productoOptional=productoService.get(id);
		producto=productoOptional.get();
		model.addAttribute("producto",producto);
		return "Cliente/productohome";
	}
	
	@PostMapping("/cart")
	public String addCart(@RequestParam Integer id, @RequestParam Integer cantidad) {
		DetalleOrden detalleorden=new DetalleOrden();
		Producto producto=new Producto();
		double sumaTotal=0;
		
		Optional<Producto> optionalProducto= productoService.get(id);
		log.info("Producto añadido:{}",optionalProducto.get());
		log.info("Cantidad:{}",cantidad);
		
		return "Cliente/carrito";
		
		
	}
	
	
}
