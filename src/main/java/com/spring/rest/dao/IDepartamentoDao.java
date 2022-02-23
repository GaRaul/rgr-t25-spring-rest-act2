package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Departamento;

public interface IDepartamentoDao extends JpaRepository<Departamento, Long>{
	
}
