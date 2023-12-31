package com.spring.boot.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long Id;
	
	@Column
	String username;
	@Column
	String firstname;
	@Column
	String lastname;
	@Column
	String email;
	@Column
	int age;
	@Column
	String address;
	@Column
	String phonenumber;
	
	
	


}
