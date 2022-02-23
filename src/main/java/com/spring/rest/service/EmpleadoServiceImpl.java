package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IEmpleadoDao;
import com.spring.rest.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	IEmpleadoDao iEmpleadoDao;
	
	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String dni) {
		return iEmpleadoDao.findById(dni).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadoDao.deleteById(dni);
		
	}

}
