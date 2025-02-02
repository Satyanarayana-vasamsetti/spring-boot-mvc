package com.example.demo.service.imply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.user;
import com.example.demo.repository.userrepository;
import com.example.demo.service.userservice;

@Service
public class userserviceimply implements userservice {
	@Autowired
	private userrepository repo;
	@Override
	public List<user> getallusers() {
		return repo.findAll();
		
	}

	@Override
	public void saveuser(user u) {
		repo.save(u);
	}

	@Override
	public void deleteuser(long id) {
		repo.deleteById(id);
	}

	@Override
	public user getbyid(long id) {
		return repo.findById(id).orElse(null);
	}

}
