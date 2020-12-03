package com.code.sysPedidos_backend.Service;

import java.util.List;

import com.code.sysPedidos_backend.Entity.Persona;

public interface PersonaService {
	int create (Persona per);
	int update (Persona	 per);
	int delete (int id);
	Persona read (int id);
	List<Persona> readAll();
}
