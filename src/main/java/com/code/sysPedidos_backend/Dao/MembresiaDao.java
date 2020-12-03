package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Entity.Membresia;

@Repository
public interface MembresiaDao {

	
	int create (Membresia memb);
	int update (Membresia memb);
	List<Membresia> readAll();
	Membresia read(int id);
}
