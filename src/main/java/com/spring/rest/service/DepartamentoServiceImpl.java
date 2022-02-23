package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.IDepartamentoDao;
import com.spring.rest.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	IDepartamentoDao iDepartamentoDao;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iDepartamentoDao.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long id) {
		return iDepartamentoDao.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iDepartamentoDao.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		
		iDepartamentoDao.deleteById(id);
	}

}
