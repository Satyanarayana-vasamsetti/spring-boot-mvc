package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.register;

@Service
public interface registerservice {

	List<register> getallusers();
	void save(register r);
	void delete(long id);
	register getbyid(long id);
}
