package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Collaborateur;
import com.example.demo.entity.Tache;





public interface ICollaborateurService {
	
    List<Tache> getCollaborateur();
	
	void addCollaborateur(Collaborateur collaborateur);
	void updateTache(Collaborateur collaborateur);
	void deleteTache(Collaborateur collaborateur);



}
