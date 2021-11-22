package com.trabalho.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "celular", uniqueConstraints = {@UniqueConstraint(name = "celular_uk", columnNames = "id") })
public class Celular {
	
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
	private int id;
    
    @Column(name = "modelo", length = 36)
	private String modelo;
    
    @Column(name = "sistema", length = 128)
	private String sistema;
    
    @Column(name = "cor", length = 36)
	private String cor;

	private static final String CAMPO_VAZIO = "O campo nao pode estar vazio!";

	public Celular(int id, String modelo, String sistema, String cor) throws IllegalArgumentException {
		setId(id);
		setModelo(modelo);
		setSistema(sistema);
		setCor(cor);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) throws IllegalArgumentException {
		if (modelo.isEmpty()) {
			throw new IllegalArgumentException(CAMPO_VAZIO);
		} else {
			this.modelo = modelo;
		}
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) throws IllegalArgumentException {
		if (modelo.isEmpty()) {
			throw new IllegalArgumentException(CAMPO_VAZIO);
		} else {
			this.sistema = sistema;
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) throws IllegalArgumentException {
		if (cor.isEmpty()) {
			throw new IllegalArgumentException(CAMPO_VAZIO);
		} else {
			this.cor = cor;
		}

	}
	
	public void setId(int id) {
		this.id = id;
	}
}
