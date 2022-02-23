package com.spring.rest.service;

import java.util.List;

import com.spring.rest.dto.Departamento;

public interface IDepartamentoService {

	public List<Departamento> listarDepartamentos();
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento departamentoXID(Long id);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void eliminarDepartamento(Long id);
	
}
