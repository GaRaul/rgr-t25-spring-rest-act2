package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado empleadoXID(Long id);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);
	
}
