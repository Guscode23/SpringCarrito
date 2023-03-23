package com.proyecto.carrito.service;

import java.util.List;
import java.util.Optional;


import com.proyecto.carrito.model.Cliente;


public interface IUsuarioInterface {
	List<Cliente> findAll();
	Optional<Cliente> findById(Integer id);
	Cliente save (Cliente usuario);
	Optional<Cliente> findByEmail(String email);

}
