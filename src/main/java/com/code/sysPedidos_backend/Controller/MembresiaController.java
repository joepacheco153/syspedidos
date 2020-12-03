package com.code.sysPedidos_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.sysPedidos_backend.Entity.Membresia;
import com.code.sysPedidos_backend.Service.MembresiaService;

@RestController
@RequestMapping("/membresia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MembresiaController {
	@Autowired
	private MembresiaService membService;
	@PostMapping("/add")
	public int create(@RequestBody Membresia memb) {
		return membService.create(memb);
	}
	@PutMapping("/update/{id}")
	public int update (@RequestBody Membresia memb, @PathVariable int id) {
		memb.setIdmembresia(id);
		return membService.update(memb);
	}
	@GetMapping("/readall")
	public List<Membresia> readList(){
		return membService.readAll();
	}
	@GetMapping("/read/{id}")
	public Membresia read(@PathVariable int id) {
		return membService.read(id);
	}
	
}
