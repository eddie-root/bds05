package com.devsuperior.movieflix.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.services.UserService;

@RestController
@RequestMapping(value = "/users/profile")
public class UserController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<UserDTO> getProfile(){
		UserDTO dto = service.findUser();
		return ResponseEntity.ok().body(dto);
				
	}
}
