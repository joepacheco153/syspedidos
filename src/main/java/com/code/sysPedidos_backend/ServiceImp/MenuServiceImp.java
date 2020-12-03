package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.MenuDao;
import com.code.sysPedidos_backend.Entity.Menu;
import com.code.sysPedidos_backend.Service.MenuService;
@Service
public class MenuServiceImp implements MenuService {
	@Autowired
	private MenuDao menuDao;
	@Override
	public List<Menu> readAll() {
		// TODO Auto-generated method stub
		return menuDao.readAll();
	}
	@Override
	public int create(Menu menu) {
		// TODO Auto-generated method stub
		return menuDao.create(menu);
	}
	@Override
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return menuDao.update(menu);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return menuDao.delete(id);
	}
	@Override
	public Menu read(int id) {
		// TODO Auto-generated method stub
		return menuDao.read(id);
	}

}
