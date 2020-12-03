package com.code.sysPedidos_backend.Service;

import java.util.List;

import com.code.sysPedidos_backend.Entity.Membresia;

public interface MembresiaService {
	List<Membresia> readAll();
	Membresia read(int id);
	int create (Membresia memb);
	int update (Membresia memb);
}
