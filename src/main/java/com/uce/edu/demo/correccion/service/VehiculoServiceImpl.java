package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.modelo.Vehiculo;
import com.uce.edu.demo.correccion.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public void insertar(Vehiculo v) {
		this.vehiculoRepository.insertar(v);

	}

	@Override
	public Vehiculo buscar(String placa) {

		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizar(Vehiculo v) {
		this.vehiculoRepository.actualizar(v);

	}

	@Override
	public void eliminar(String placa) {
		this.vehiculoRepository.eliminar(placa);

	}

}
