package com.project.controller;


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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.entity.User;
import com.project.services.UserService;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(User user){	
		return userService.getAllUsers();	
	}
	
	@PostMapping("/forget")
	public List<User> forgetPassword(@RequestBody User user){
		return userService.forgetPassword(user.getMailid(), user.getSecurityQues(), user.getSecurityAns());
	}
	
	@PostMapping("/findbyphone")
	public List<User> findByPhone(@RequestBody User user) {
		return userService.findByPhone(user.getContactno());
	}
	
	@PostMapping("/findbyemail")
	public List<User> findByEmail(@RequestBody User user) {
		return userService.findByEmail(user.getMailid());
	}
	
	
	@PostMapping("/login")
	public List<User> getUserByEmailAndPassword(@RequestBody User user){
		return userService.getUserByEmailAndPassword(user.getMailid(),user.getPassword());
	}
	
	
	@PostMapping("/register")
	public User insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	@PutMapping("/updatepassword")
		public User updatePassword(@RequestBody User user) {
			return userService.updatePassword(user);
		}

	@DeleteMapping("deleteuser/{uemail}")
	public String deleteUser(@PathVariable String uemail) {
		userService.deleteUser(uemail);
		return "Deleted";
	}
	
}
