package com.proyecto.carrito.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.carrito.model.Transaccion;
import com.proyecto.carrito.repository.IOrdenReposutory;

@Service
public class OrdenServiceImpl implements IOrdenService {
   
	@Autowired
	private IOrdenReposutory ordenRepository;

	@Override
	public Transaccion save(Transaccion orden) {
		// TODO Auto-generated method stub
		return ordenRepository.save(orden);
	}

	@Override
	public List<Transaccion> findAll() {
		// TODO Auto-generated method stub
		return ordenRepository.findAll();
	}
	
	public String generarNumeroOrden() {
		int numero=0;
		String numeroConcatenado="";
		
		List<Transaccion>ordenes=findAll();
		
		List<Integer> numeros= new ArrayList<Integer>();
	    
		ordenes.stream().forEach(p->numeros.add(Integer.parseInt( p.getNumero())));
		
		if(ordenes.isEmpty()) {
			numero=1;
		}
		else {
			numero=numeros.stream().max(Integer::compare).get();
			numero++;
		}
		
		if(numero<10) {
			numeroConcatenado="000000000" +String.valueOf(numero);
		}else if(numero<100) {
			numeroConcatenado="00000000" +String.valueOf(numero);
		}else if(numero<10000) {
			numeroConcatenado="000000" +String.valueOf(numero);
		}
		
		return numeroConcatenado;
	}
	
}
