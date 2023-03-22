package com.proyecto.carrito.service;

import java.util.List;

import com.proyecto.carrito.model.Transaccion;

public interface IOrdenService {
      
	List<Transaccion>findAll();
	Transaccion save(Transaccion orden);
}
