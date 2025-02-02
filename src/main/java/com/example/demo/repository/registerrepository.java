package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.register;

@Repository
public interface registerrepository extends JpaRepository<register, Long>{

}
