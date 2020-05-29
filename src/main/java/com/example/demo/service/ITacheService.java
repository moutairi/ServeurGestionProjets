package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Tache;

public interface ITacheService {
	 
	
	
	void addTache(Tache tache);
	public Tache getTache(long id) throws Exception;
	void updateTache(Tache tache);
	public boolean deleteTache(Tache tache);
	List<Tache> getTaches();
	public List<Tache> getEntityListByEmployee(long id) throws Exception ; 
}
