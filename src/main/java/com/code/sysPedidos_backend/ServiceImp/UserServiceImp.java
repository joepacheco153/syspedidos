package com.code.sysPedidos_backend.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.User;
import com.code.sysPedidos_backend.Service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public int create(User us, int id) {
		// TODO Auto-generated method stub
		return userDao.create(us, id);
	}

	@Override
	public int update(User us) {
		// TODO Auto-generated method stub
		return userDao.update(us);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}
 
	@Override
	public int cambiarestado(User us) {
		// TODO Auto-generated method stub
		return userDao.cambiarestado(us);
	}

	@Override
	public List<User> readAll() {
		// TODO Auto-generated method stub
		return userDao.readAll();
	}

	@Override
	public User read(int id) {
		// TODO Auto-generated method stub
		return userDao.read(id);
	}
	
}
