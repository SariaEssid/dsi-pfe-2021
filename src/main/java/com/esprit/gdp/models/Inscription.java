package com.esprit.gdp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the ESP_MODULE_PANIER_CLASSE_SAISO database table.
 * 
 */

@Entity
@Table(name = "ESP_INSCRIPTION_SYN1")
public class Inscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InscriptionPK id;
	
	@Column(name="TYPE_INSC")
	private String typeInsc;

//	@ManyToOne
//	@JoinColumn(name="ID_ET", referencedColumnName = "ID_ET", updatable=false, insertable=false, nullable=false)
//	private Student studentConvention;
	
	
	@ManyToOne
	@JoinColumn(name="ID_ET", referencedColumnName = "ID_ET", updatable=false, insertable=false, nullable=false)
	private Student studentInscription;
	
	
	@ManyToOne
	@JoinColumn(name="ENCARANT_PEDA", referencedColumnName = "ID_ENS", updatable=false, insertable=false, nullable=false)
	private Teacher encadrantPedagogique;
	
//	@ManyToOne
//	@JoinColumn(name="CODE_CL", referencedColumnName = "CODE_CL", updatable=false, insertable=false, nullable=false)
//    public Classe classe;
	
	@Column(name="CODE_CL")
	private String codeCl;

	
	public Inscription() {
	}


	public InscriptionPK getId() {
		return id;
	}

	public void setId(InscriptionPK id) {
		this.id = id;
	}

	

}

