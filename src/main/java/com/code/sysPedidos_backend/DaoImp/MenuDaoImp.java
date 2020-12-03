package com.code.sysPedidos_backend.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.code.sysPedidos_backend.Dao.MenuDao;
import com.code.sysPedidos_backend.Entity.Menu;



@Repository
public class MenuDaoImp implements MenuDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Menu menu) {
		String SQL ="insert into Menu(Plato,Precio,Estado,idEmpresa) values(?,?,1,?)";
		return jdbcTemplate.update(SQL, new Object [] {menu.getPlato(),menu.getPrecio(),menu.getIdempresa()});
	}

	@Override
	public int update(Menu menu) {
		String SQL= "update Menu set Plato = ?,Precio = ?,Estado = ? where idMenu = ? ";
		return jdbcTemplate.update(SQL,menu.getPlato(),menu.getPrecio(),menu.getEstado(),menu.getIdMenu());
	}
	
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM Menu where (idmenu = ?)";
		return jdbcTemplate.update(SQL, new Object[] {id} );
	}

	@Override
	public List<Menu> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from menu", BeanPropertyRowMapper.newInstance(Menu.class));
		
	}

	@Override
	public Menu read(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * from Menu where idMenu = ? ;";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, BeanPropertyRowMapper.newInstance(Menu.class));
	}
	

	
}

	
	