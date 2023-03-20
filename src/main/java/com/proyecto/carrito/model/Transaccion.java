package com.proyecto.carrito.model;

import java.util.Date;

public class Transaccion {
     private Integer id;
     private String numero;
     private Date fechaCreacion;
     private Date fechaRecibida;
     private String Mediopago;
     
     private double total;
     
     
     //Constructor//
     
     public Transaccion() {
    	 
    	 
     }

     //Getters and Setters//
     
     public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Date getFechaRecibida() {
		return fechaRecibida;
	}


	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}
    
	public String getMediopago() {
		return Mediopago;
	}


	public void setMediopago(String mediopago) {
		Mediopago = mediopago;
	}


	
	
	//Metodo para mostrar por consola//
     
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
				+ fechaRecibida + ", Mediopago=" + Mediopago + ", total=" + total + "]";
	}
    	
     
     
     
     
     
	
	
	
}
