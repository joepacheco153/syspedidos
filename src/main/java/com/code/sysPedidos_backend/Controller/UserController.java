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

import com.code.sysPedidos_backend.Entity.User;
import com.code.sysPedidos_backend.Service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/readall")
	public List<User> readList(){
		return userService.readAll();
	}
	@GetMapping("/read/{id}")
	public User read (@PathVariable int id) {
		return userService.read(id);
	}
	@PostMapping("/add/{id}")
	public int create(@RequestBody User us, @PathVariable int id) {
		// TODO Auto-generated method stub
		return userService.create(us, id);
	}

	@PutMapping("/update/{id}")
	public int update(@RequestBody User us,@PathVariable int id) {
		// TODO Auto-generated method stub
		us.setIdusuario(id);
		return userService.update(us);
	}

	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		return userService.delete(id);
	}
	@PutMapping("/updateestado/{id}")
	public int cambiarestado (@RequestBody User us, @PathVariable int id) {
		us.setIdusuario(id);
		return userService.cambiarestado(us);
	}
}
