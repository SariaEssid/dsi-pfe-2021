package com.esprit.gdp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ESP_PROBLEMATIQUE")
public class Problematique implements Serializable
{

	private static final long serialVersionUID = 2084058395594060331L;

	
	@EmbeddedId
	private ProblematiquePK problematicPK;
	
	@Column(name = "NAME", length = 3000)
	private String name;
	

	@ManyToOne
	@JoinColumns({
	     @JoinColumn(name="ID_ET", referencedColumnName="ID_ET", insertable=false, updatable=false),
	     @JoinColumn(name="DATE_DEPOT_FICHE", referencedColumnName="DATE_DEPOT_FICHE", insertable=false, updatable=false)
	})
	private FichePFE fichePFEProblematic;
	
	
	public Problematique() {}

	public Problematique(String name, FichePFE fichePFEProblematic) {
		this.name = name;
		this.fichePFEProblematic = fichePFEProblematic;
	}
	
	public Problematique(ProblematiquePK problematicPK, String name, FichePFE fichePFEProblematic) {
		super();
		this.problematicPK = problematicPK;
		this.name = name;
		this.fichePFEProblematic = fichePFEProblematic;
	}

}
