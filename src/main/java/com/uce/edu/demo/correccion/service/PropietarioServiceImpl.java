package com.uce.edu.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.correccion.modelo.Propietario;
import com.uce.edu.demo.correccion.repository.IPropietrarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietrarioRepository propietrarioRepository;

	
	@Override
	public void crear(Propietario p) {
		this.propietrarioRepository.crear(p);
		
	}

	@Override
	public void eliminar(String cedula) {
		this.eliminar(cedula);
		
	}

}
