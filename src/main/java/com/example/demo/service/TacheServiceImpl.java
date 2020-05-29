package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Tache;


@Service
public class TacheServiceImpl implements ITacheService{

	@Override
	public Tache getTache(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Tache> getEntityListByEmployee(long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	private List<Tache> taches;
	
	public TacheServiceImpl() {
		taches = new ArrayList<Tache>();
		taches.add(new Tache());
		
	}
	@Override
	public List<Tache> getTaches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTache(Tache tache) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTache(Tache tache) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean deleteTache(Tache tache) {
		// TODO Auto-generated method stub
		return false;
	}



	
	
}
