package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.correccion.modelo.Propietario;
import com.uce.edu.demo.correccion.modelo.Vehiculo;
import com.uce.edu.demo.correccion.service.IMatriculaGestorService;
import com.uce.edu.demo.correccion.service.IPropietarioService;
import com.uce.edu.demo.correccion.service.IVehiculoService;

@SpringBootApplication
public class CorreccionPruebaU1KaApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IMatriculaGestorService matriculaGestorService;

	public static void main(String[] args) {
		SpringApplication.run(CorreccionPruebaU1KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Kia");
		v1.setPlaca("BBC3524");
		v1.setPrecio(new BigDecimal(3000));
		v1.setTipo("L");

		this.vehiculoService.insertar(v1);

		// 2
		v1.setPrecio(new BigDecimal(60000));
		v1.setMarca("Hyundai");
		this.vehiculoService.actualizar(v1);

		// 3
		Propietario p1 = new Propietario();
		p1.setNombre("Pedro");
		p1.setApellido("Pablo");
		p1.setCedula("1845614564164");
		p1.setFechaNacimiento(LocalDateTime.of(1998, 3, 5, 0, 0));
		this.propietarioService.crear(p1);

		// 4
		this.matriculaGestorService.generar("1845614564164", "BBC3524");

	}

}
