package com.proyecto.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

	
	
}
