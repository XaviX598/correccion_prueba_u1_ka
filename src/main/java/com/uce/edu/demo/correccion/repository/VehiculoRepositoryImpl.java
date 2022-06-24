package com.uce.edu.demo.correccion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado un vehiculo " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		System.out.println("Se ha buscado un vehiculo " + placa);
		Vehiculo v2 = new Vehiculo();
		v2.setMarca("Kia");
		v2.setPlaca(placa);
		v2.setPrecio(new BigDecimal(30));
		v2.setTipo("Liviano");
		return v2;
	}

	@Override
	public void actualizar(Vehiculo v) {
		System.out.println("Se ha actualizado un vehiculo " + v);

	}

	@Override
	public void eliminar(String placa) {
		System.out.println("Se ha eliminado un vehiculo " + placa);

	}

}
