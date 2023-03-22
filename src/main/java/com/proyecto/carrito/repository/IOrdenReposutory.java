package com.proyecto.carrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.carrito.model.Transaccion;



@Repository
public interface IOrdenReposutory extends JpaRepository<Transaccion,Integer> {

	
	
}
