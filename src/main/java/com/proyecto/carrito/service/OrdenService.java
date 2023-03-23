package com.proyecto.carrito.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.carrito.model.Cliente;
import com.proyecto.carrito.model.Transaccion;

public interface OrdenService {
	List<Transaccion> findAll();
	Optional<Transaccion> findById(Integer id);
	Transaccion save (Transaccion orden);
	String generarNumeroOrden();
	List<Transaccion> findByUsuario (Cliente usuario);
	
}
