package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.modelo.Propietario;

public interface IPropietrarioRepository {
	
	public Propietario consultar(String cedula);
	
	public void crear(Propietario p);
	
	public void eliminar(String cedula);
	

}
