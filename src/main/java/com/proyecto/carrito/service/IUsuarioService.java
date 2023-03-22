package com.proyecto.carrito.service;

import java.util.Optional;

import com.proyecto.carrito.model.Cliente;

public interface IUsuarioService {
     Optional<Cliente> findById(Integer id);
	
	
}
