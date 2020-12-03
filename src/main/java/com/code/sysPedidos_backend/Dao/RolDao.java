package com.code.sysPedidos_backend.Dao;

import java.util.List;

import com.code.sysPedidos_backend.Entity.Rol;

public interface RolDao {
	int create (Rol rol);
	int update (Rol	 rol);
	int delete (int id);	
	List<Rol> readAll();
	Rol read (int id);
	int cambiarestado (Rol rol);


}
