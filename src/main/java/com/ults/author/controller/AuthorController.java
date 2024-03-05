package com.ults.author.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ults.author.dto.AuthorDTO;
import com.ults.author.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authService;
	
	@GetMapping("/authors")
	public ResponseEntity<?> getAuthors(){
		List<AuthorDTO> auths = authService.getAuthors();
		return ResponseEntity.ok(auths);
	}
}
