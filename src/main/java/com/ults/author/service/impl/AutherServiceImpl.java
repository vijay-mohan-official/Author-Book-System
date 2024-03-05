package com.ults.author.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ults.author.dto.AuthorDTO;
import com.ults.author.entity.Author;
import com.ults.author.repository.AuthorRepository;
import com.ults.author.service.AuthorService;

@Service
public class AutherServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository repo;
	
	@Override
	public List<AuthorDTO> getAuthors() {
		// TODO Auto-generated method stub
		List<Author> auths = repo.findAuthorsWithMoreThanThreeBooks();
		
		List<AuthorDTO> authdto = new ArrayList<>();
		for(Author auth : auths) {
			AuthorDTO temp = new AuthorDTO();
			temp.setId(auth.getId());
			temp.setName(auth.getName());
			authdto.add(temp);
		}
		return authdto;
	}

}
