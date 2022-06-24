package com.uce.edu.demo.correccion.service;

import com.uce.edu.demo.correccion.modelo.Vehiculo;

public interface IVehiculoService {
	
    public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void actualizar(Vehiculo v);

	public void eliminar(String placa);


}
