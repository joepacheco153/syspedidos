package com.code.sysPedidos_backend.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.UserDao;
import com.code.sysPedidos_backend.Entity.User;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public int create(User us,int id) {
		String SQL ="insert into user (nomuser, passuser, estado, idpersona)values(?,?,1,?);";
		return jdbc.update(SQL, new Object[] {us.getNomuser(), us.getPassuser(), id});
	}

	@Override
	public int update(User us) {
		// TODO Auto-generated method stub
		String SQL ="update user set nomuser = ?, passuser =?, estado = ? where idusuario = ?";
		return jdbc.update(SQL, us.getNomuser(), us.getPassuser(), us.getEstado(),us.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL=" delete from user where (idusuario=?)";
		return jdbc.update(SQL, new Object[] {id});
	}

	@Override
	public int cambiarestado(User us) {
		// TODO Auto-generated method stub
		String SQL= "update user set estado = ? where idusuario =?;";
		return jdbc.update(SQL, us.getEstado(),us.getIdusuario());
	}

	@Override
	public List<User> readAll() {
		// TODO Auto-generated method stub
		return jdbc.query("Select * from user", BeanPropertyRowMapper.newInstance(User.class));
	}

	@Override
	public User read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from user where idusuario = ?;";
		return jdbc.queryForObject(SQL, new Object[] {id}, BeanPropertyRowMapper.newInstance(User.class));
	}
	
}
