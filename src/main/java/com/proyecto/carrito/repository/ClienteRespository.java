package com.proyecto.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.model.Cliente;


@Repository
public interface ClienteRespository extends JpaRepository<Cliente,Integer> {

	
	
	
}
