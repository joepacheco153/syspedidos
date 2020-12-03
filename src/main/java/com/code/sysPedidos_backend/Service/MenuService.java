package com.code.sysPedidos_backend.Service;

import java.util.List;

import com.code.sysPedidos_backend.Entity.Menu;

public interface MenuService {
	List<Menu> readAll();
	int create (Menu menu);
	int update (Menu menu);
	int delete (int id);
	Menu read (int id);
}
