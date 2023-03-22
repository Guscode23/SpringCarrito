package com.proyecto.carrito.service;

import java.util.List;
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

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente save(Cliente usuario) {
		// TODO Auto-generated method stub
		return usuarioRespository.save(usuario);
	}

	@Override
	public Optional<Cliente> findByEmail(String email) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	
	
	
	

}
