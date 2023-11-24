package com.tns.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/* Created by APARNA RAYAPROLU
 *21-11-23
 */

@Entity
@Table(name="admin")

public class Admin {
	@Id
	long id;
	String name;
	String password;

	public Admin(long id, String name, String password) {
		this.id=id;
		this.name=name;
		this.password=password;
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}