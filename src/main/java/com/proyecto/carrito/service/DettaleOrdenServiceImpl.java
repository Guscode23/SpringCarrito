package com.proyecto.carrito.service;

import org.springframework.stereotype.Service;

import com.proyecto.carrito.model.DetalleOrden;
import com.proyecto.carrito.repository.IDetalleOrdenRepository;

@Service
public class DettaleOrdenServiceImpl implements IDetalleOrdenService {

	
	private IDetalleOrdenRepository detalleordenRepo;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return detalleordenRepo.save(detalleOrden);
	}

}



