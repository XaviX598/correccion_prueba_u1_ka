package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.modelo.Vehiculo;

public interface IVehiculoRepository {
	
   public void insertar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void actualizar(Vehiculo v);

	public void eliminar(String placa);


}
