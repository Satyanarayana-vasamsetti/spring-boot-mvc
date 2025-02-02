package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private String username;
	@Email
	private String email;
	@Size(min=4,max=15)
	private String password;
	private long phonenumber;
	

}
