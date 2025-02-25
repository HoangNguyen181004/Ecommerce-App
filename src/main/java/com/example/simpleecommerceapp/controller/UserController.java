package com.example.simpleecommerceapp.controller;

import com.example.simpleecommerceapp.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.simpleecommerceapp.entity.User;
import com.example.simpleecommerceapp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/update/user/{id}")
	public String updateUser(@PathVariable("id") Long id, Model model)
	{
		model.addAttribute("user", userService.getUserById(id));

		return "UpdateUser";
	}

	@PostMapping("/add/user")
	public String addUser(User user) {
		userService.createUser(user);

		return "LoginPage";
	}

	@PostMapping("/update/user")
	public String updateUser(User user) {
		userService.createUser(user);

		return "redirect:/admin/home";
	}

	@GetMapping("/delete/user/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);

		return "redirect:/admin/home";
	}

	@GetMapping("/user/signup")
	public String showSignUpPage(Model model) {
		model.addAttribute("userDTO", new UserDTO());
		return "SignUpPage";
	}

	@PostMapping("user/signup")
	public String registerUser(@ModelAttribute("userDTO") UserDTO userDTO, Model model) {
		String result = userService.registerUser(userDTO);
		if (result.equals("User registered successfully!")) {
			return "redirect:/login";
		} else {
			model.addAttribute("error", result);
			return "SignUpPage";
		}
	}

}