package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.Empleado;
import com.spring.rest.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id") String dni) {
		Empleado empleadoXID = new Empleado();
		
		empleadoXID = empleadoServiceImpl.empleadoXID(dni);
		
		System.out.println("Empleado XID: " + empleadoXID);
		
		return empleadoXID;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")String dni, @RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		
		empleado_seleccionado = empleadoServiceImpl.empleadoXID(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: " + empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id") String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}
	
}
