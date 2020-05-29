package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TacheCollab {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private Tache tache;
	private Collaborateur collaborateur;

}
