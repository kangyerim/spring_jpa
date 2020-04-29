package com.yerimspring.web.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yerimspring.web.util.Messenger;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired UserService userService;
	
	@PostMapping("")
	public Messenger post(@RequestBody User user) {
		userService.signIn(user);
		return Messenger.Success;
	}
	
	@GetMapping("")
	public List<User> list(){
		return userService.findAll();
	}
	
	@GetMapping("/{userid}")
	public User detail(@PathVariable String userid) {
		return userService.findOne(userid);
	}
	
	@PutMapping("/{userid}")
	public Messenger put(@RequestBody User user) {
		userService.modify(user);
		return Messenger.Success;
	}
	
	@DeleteMapping("/{userid}")
	public Messenger delete(@RequestBody User user) {
		userService.remove(user);
		return Messenger.Success;
	}
}
