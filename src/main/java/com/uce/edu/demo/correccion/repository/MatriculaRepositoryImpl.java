package com.uce.edu.demo.correccion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void crer(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se crea la matricula: " + m);
	}

}
