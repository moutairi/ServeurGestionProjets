package com.example.demo.service;

import java.util.Set;


import com.example.demo.entity.Projet;
import com.example.demo.entity.Tache;

public interface IProjetService {
	
	
	void addProjet(Projet projet);
	void updateProjet(Projet projet);
	public  boolean deleteProjet(Projet projet);
	public Set<Tache> getProjetTaches(long id ) throws Exception; 


}
