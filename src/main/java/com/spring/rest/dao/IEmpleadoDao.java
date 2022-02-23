package com.spring.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.dto.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, Long>{

}
