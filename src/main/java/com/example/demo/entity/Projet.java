package com.example.demo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.demo.entity.Tache;


@Entity
public class Projet {
	
	private long id;
	private String intitule; 
	private Date dateDebut;
	private Date dateFin;
	private int volumeHoraire;
	
	
	@OneToMany (mappedBy="projet",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Tache> tache = new HashSet<Tache>();
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Collaborateur> collaborateur  ; 
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	} 
	public Projet(long id, String intitule, Date dateDebut, Date dateFin, int volumeHoraire) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.volumeHoraire = volumeHoraire;
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
		Projet other = (Projet) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
