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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Entity.Rol;
import com.code.sysPedidos_backend.Service.RolService;

@RestController
@RequestMapping("/rol")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RolController {
	@Autowired
	private RolService rolService;
	
	@PostMapping ("/add")
	public int create(@RequestBody Rol rol) {
		return rolService.create(rol);
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Rol rol, @PathVariable int id) {
		rol.setIdrol(id);
		return rolService.update(rol);
	}
	@DeleteMapping("/delete/{id}")
	public int delete (@PathVariable int id) {
		return rolService.delete(id);
	}
	@GetMapping("/readall")
	public List<Rol> readList(){
		return rolService.readAll();
	}
	@GetMapping("/read/{id}")
	public Rol read(@PathVariable int id) {
		return rolService.read(id);
	}
	@PutMapping("/updateestado/{id}")
	public int cambiarestado (@RequestBody Rol rol,@PathVariable int id) {
		rol.setIdrol(id);
		return rolService.cambiarestado(rol);
	}
}

