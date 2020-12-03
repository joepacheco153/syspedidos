package com.code.sysPedidos_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Entity.Menu;
import com.code.sysPedidos_backend.Service.MenuService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/menues")
	public List<Menu> readList(){
		return menuService.readAll();
	}
	@GetMapping("/menues/{id}")
	public Menu read(@PathVariable int id) {
		return menuService.read(id);
	}
	@PostMapping("/menu")
	public int create (@RequestBody Menu menu) {
		System.out.println(menu);
		return menuService.create(menu);
	}
	@DeleteMapping("/menudelete/{id}")
	public int delete (@PathVariable int id) {
		return menuService.delete(id);
	}
	@PutMapping("/menu/{id}")
	public int update (@RequestBody Menu menu, @PathVariable int id) {
		menu.setIdMenu(id);
		return menuService.update(menu);
	}
	
}
