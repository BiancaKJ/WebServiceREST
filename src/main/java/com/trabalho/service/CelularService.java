package com.trabalho.service;

import java.util.List;
import java.util.Optional;

import com.trabalho.entity.Celular;
import com.trabalho.repository.CelularRepository;

public class CelularService {
	
	private CelularRepository celularRepository;
	
	public List<Celular> findAll() {
		return celularRepository.findAll();
	}
	
	public Celular findById(Integer id) {
		Optional<Celular> cel = celularRepository.findById(id);
		if(cel.isPresent()) {
			return cel.get();
		}		
		return null;
	}
	
	public Celular save(Celular cel) {
		return this.celularRepository.save(cel);
	}
	
	public Celular update(Celular cel) {
		return this.celularRepository.save(cel);
	}
	
	public Celular delete(Celular cel) {
		this.celularRepository.delete(cel);
		return cel;
	}
	
	/*public List<Celular> listAllCelsByIdApp(Integer idApp) {
		return this.celularRepository.listAllCelsByIdApp(idApp);
	}*/

}
