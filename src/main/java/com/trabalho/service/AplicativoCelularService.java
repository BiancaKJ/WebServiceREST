package com.trabalho.service;

import org.springframework.stereotype.Service;

import com.trabalho.entity.Aplicativo;
import com.trabalho.entity.AplicativoCelular;
import com.trabalho.entity.Celular;
import com.trabalho.repository.AplicativoCelularRepository;

@Service
public class AplicativoCelularService {
	
	private AplicativoCelularRepository aplicativoCelularRepository;
	
	public void adicionaAplicativoCelular(Aplicativo aplicativo, Celular celular) {
		this.aplicativoCelularRepository.save(new AplicativoCelular(aplicativo, celular));
	}

}
