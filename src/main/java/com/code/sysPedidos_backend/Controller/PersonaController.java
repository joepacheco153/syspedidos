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

import com.code.sysPedidos_backend.Entity.Persona;
import com.code.sysPedidos_backend.Service.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PersonaController {
	@Autowired
	private PersonaService perService;
	@PostMapping("/add")
	public int create(@RequestBody Persona per) {
		return perService.create(per);
	}
	@PutMapping("/update/{id}")
	public int update (@RequestBody Persona per, @PathVariable int id) {
		per.setIdpersona(id);
		return perService.update(per);
	}
	@DeleteMapping("/delete/{id}")
	public int delete (@PathVariable int id) {
		return perService.delete(id);
		
	}
	@GetMapping("/read/{id}")
	public Persona read (@PathVariable int id) {
		return perService.read(id);
	}
	@GetMapping("/readall")
	public List<Persona> readList(){
		return perService.readAll();
	}
	

}
