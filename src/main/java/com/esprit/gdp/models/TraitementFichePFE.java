package com.esprit.gdp.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
* @author Saria Essid
*
*/

@Entity
@Table(name="ESP_TRAITEMENT_FICHE_PFE")
public class TraitementFichePFE implements Serializable
{
	
	private static final long serialVersionUID = -588102315498103785L;

	
	@EmbeddedId
	private TraitementFichePK traitementFichePK;
	
	@Column(name = "TYPE_TRT_FICHE", length = 2)
	private String typeTrtFiche;
	
	@Column(name = "DESCRIPTION", length = 500)
	private String description;
	
	@Column(name = "ETAT_TRT", length = 2)
	private String etatTrt;
	
	
	@ManyToOne
	@JoinColumns({
	     @JoinColumn(name="ID_ET", referencedColumnName="ID_ET", insertable=false, updatable=false),
	     @JoinColumn(name="DATE_DEPOT_FICHE", referencedColumnName="DATE_DEPOT_FICHE", insertable=false, updatable=false)
	})
	private FichePFE fichePFETraitementFichePFE;
	
	public TraitementFichePFE() {}

	
	
}
