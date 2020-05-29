package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Competence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
	private String description;
	private Collaborateur  collaborateur;
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competence(long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competence other = (Competence) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
