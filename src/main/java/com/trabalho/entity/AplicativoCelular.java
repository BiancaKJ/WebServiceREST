package com.trabalho.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "aplicativo_celular", uniqueConstraints = { @UniqueConstraint(name = "aplicativo_celular_uk", columnNames = { "aplicativo_id", "celular_id" }) })
public class AplicativoCelular {
	
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aplicativo_id", nullable = false)
    private Aplicativo aplicativo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "celular_id", nullable = false)
    private Celular celular;
    
    public AplicativoCelular(Aplicativo aplicativo, Celular celular) {
    	setAplicativo(aplicativo);
    	setCelular(celular);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aplicativo getAplicativo() {
		return aplicativo;
	}

	public void setAplicativo(Aplicativo aplicativo) {
		this.aplicativo = aplicativo;
	}

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}

}
