package com.example.demo.service.imply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.register;
import com.example.demo.repository.registerrepository;
import com.example.demo.service.registerservice;

@Service
public class registerserviceimply implements registerservice {
	@Autowired
	private registerrepository repo;
	@Override
	public List<register> getallusers() {
		return repo.findAll();
	}

	@Override
	public void save(register r) {
		repo.save(r);

	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public register getbyid(long id) {
		return repo.findById(id).orElse(null);
	}

}
