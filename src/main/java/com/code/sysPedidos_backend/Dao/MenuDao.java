package com.code.sysPedidos_backend.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Entity.Menu;



@Repository
public interface MenuDao {
	int create (Menu menu);
	int update (Menu menu);
	int delete (int id);
	Menu read (int id);
	
	List<Menu> readAll();
}
