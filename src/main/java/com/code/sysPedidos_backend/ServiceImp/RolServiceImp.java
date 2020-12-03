package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.RolDao;
import com.code.sysPedidos_backend.Entity.Rol;
import com.code.sysPedidos_backend.Service.RolService;

@Service
public class RolServiceImp implements RolService {
	@Autowired
	private RolDao rolDao;

	@Override
	public int create(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.create(rol);
	}

	@Override
	public int update(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.update(rol);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rolDao.delete(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public int cambiarestado(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.cambiarestado(rol);
	}
}
