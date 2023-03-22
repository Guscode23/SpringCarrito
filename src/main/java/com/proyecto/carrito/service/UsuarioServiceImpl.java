package com.proyecto.carrito.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.carrito.model.Cliente;
import com.proyecto.carrito.repository.ClienteRespository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private ClienteRespository usuarioRespository;

	@Override
	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRespository.findById(id);
	}
	
	
	
	
	

}
