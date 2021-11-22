package com.trabalho.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "aplicativo", uniqueConstraints = {@UniqueConstraint(name = "aplicativo_uk", columnNames = "id") })
public class Aplicativo {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
	private int id;
    
    @Column(name = "nome", length = 36)
	private String nome;
    
    @Column(name = "categoria", length = 128)
	private String categoria;
    
    @Column(name = "classificacao")
	private float classificacao;
    
    @Column(name = "versao", length = 36)
	private String versao;

	private static final String CAMPO_VAZIO = "O campo nao pode estar vazio!";

	public Aplicativo(int id, String nome, String categoria, float classificacao, String versao) throws IllegalArgumentException {
		setId(id);
		setNome(nome);
		setCategoria(categoria);
		setClassificacao(classificacao);
		setVersao(versao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) throws IllegalArgumentException {
		if (categoria.isEmpty()) {
			throw new IllegalArgumentException(CAMPO_VAZIO);
		} else if (categoria.matches(".*\\d.*")) {
			throw new IllegalArgumentException("O campo nao pode conter numeros!");
		} else {
			this.categoria = categoria;
		}
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(float classificacao) throws IllegalArgumentException {
		if (classificacao == 0) {
			throw new IllegalArgumentException(CAMPO_VAZIO);
		} else {
			this.classificacao = classificacao;
		}
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) throws IllegalArgumentException {
		if (categoria.isEmpty()) {
			throw new IllegalArgumentException(CAMPO_VAZIO);
		} else if (categoria.matches(".*\\d.*")) {
			throw new IllegalArgumentException("O campo nao pode conter numeros!");
		} else {
			this.versao = versao;
		}
	}

	public void setId(int id) {
		this.id = id;
	}
}