package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.MembresiaDao;
import com.code.sysPedidos_backend.Entity.Empresa;
import com.code.sysPedidos_backend.Entity.Membresia;

@Repository
public class MembresiaDaoImp implements MembresiaDao{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Membresia> readAll() {
		// TODO Auto-generated method stub
		return jdbc.query("Select * from membresia", BeanPropertyRowMapper.newInstance(Membresia.class));
	}

	@Override
	public Membresia read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from membresia where idempresa=?;";
		return jdbc.queryForObject(SQL, new Object[] {id}, BeanPropertyRowMapper.newInstance(Membresia.class));
	}

	@Override
	public int create(Membresia memb) {
		// TODO Auto-generated method stub
		String SQL = "insert into membresia (fecha_inicio, fecha_fin, idempresa) VALUES (?,?,?);";
		return jdbc.update(SQL, new Object[] {memb.getFecha_inicio(),memb.getFecha_fin(),memb.getIdempresa()});
	}

	@Override
	public int update(Membresia memb) {
		// TODO Auto-generated method stub
		String SQL = "update membresia set fecha_inicio = ?, fecha_fin = ?, idempresa = ? where idmembresia;";
		return jdbc.update(SQL, memb.getFecha_inicio(), memb.getFecha_fin(), memb.getIdempresa(), memb.getIdmembresia());
	}

	
	

}
