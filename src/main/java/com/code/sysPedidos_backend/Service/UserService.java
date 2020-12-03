package com.code.sysPedidos_backend.Service;

import java.util.List;

import com.code.sysPedidos_backend.Entity.User;

public interface UserService {
	int create (User us,int id);
	int update (User us);
	int delete (int id);
	int cambiarestado (User us);
	List<User> readAll();
	User read (int id);
	
}
