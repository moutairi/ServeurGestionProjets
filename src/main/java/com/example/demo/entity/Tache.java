package com.example.demo.entity;

import java.awt.List;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.entity.Projet;
import com.example.demo.entity.TacheCollab;
@Entity
public class Tache implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String intitule;
	private Date date_debut;
	private Date date_fin;
	private String competence_requises;
	
	
	@OneToMany(fetch=FetchType.LAZY , mappedBy="TacheCollab")
	@JsonIgnore
	private Set<TacheCollab> collaborateur = new HashSet<TacheCollab>(); 
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JsonIgnore
	private Projet projet;
	
	
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tache(long id, String intitule, Date date_debut, Date date_fin, String competence_requises) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.competence_requises = competence_requises;
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
		Tache other = (Tache) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
