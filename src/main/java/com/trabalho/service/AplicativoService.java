package com.trabalho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.trabalho.entity.Aplicativo;
import com.trabalho.repository.AplicativoRepository;

@Service
public class AplicativoService {
	
	private AplicativoRepository aplicativoRepository;
	
	public List<Aplicativo> findAll() {
		return aplicativoRepository.findAll();
	}
	
	public Aplicativo findById(Integer id) {
		Optional<Aplicativo> app = aplicativoRepository.findById(id);
		if(app.isPresent()) {
			return app.get();
		}		
		return null;
	}
	
	public Aplicativo save(Aplicativo app) {
		return this.aplicativoRepository.save(app);
	}
	
	public Aplicativo update(Aplicativo app) {
		return this.aplicativoRepository.save(app);
	}
	
	public Aplicativo delete(Aplicativo app) {
		this.aplicativoRepository.delete(app);
		return app;
	}
	
	/*public List<Aplicativo> listAllAppsByIdCel(Integer idCel) {
		return this.aplicativoRepository.listAllAppsByIdCel(idCel);
	}*/

}
