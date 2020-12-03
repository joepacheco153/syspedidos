package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.MembresiaDao;
import com.code.sysPedidos_backend.Entity.Membresia;
import com.code.sysPedidos_backend.Service.MembresiaService;
@Service
public class MembresiaServiceImp implements MembresiaService {
	@Autowired
	private MembresiaDao membDao;
	@Override
	public List<Membresia> readAll() {
		// TODO Auto-generated method stub
		return membDao.readAll();
	}

	@Override
	public Membresia read(int id) {
		// TODO Auto-generated method stub
		return membDao.read(id);
	}

	@Override
	public int create(Membresia memb) {
		// TODO Auto-generated method stub
		return membDao.create(memb);
	}

	@Override
	public int update(Membresia memb) {
		// TODO Auto-generated method stub
		return membDao.update(memb);
	}
	
}
