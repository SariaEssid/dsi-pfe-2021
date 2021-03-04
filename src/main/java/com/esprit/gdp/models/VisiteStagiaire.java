package com.esprit.gdp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ESP_VISITE_STAGIAIRE")
public class VisiteStagiaire implements Serializable
{

	private static final long serialVersionUID = -6224837124174565451L;
	
	@EmbeddedId
	private VisiteStagiairePK visiteStagiairePK;
	
	@Column(name = "TYPE_VISITE", length = 1)
	private String typeVisite;
	
	@Column(name = "LIEU_VISITE", length = 100)
	private String lieuVisite;
	
	@Column(name = "HEURE_DEBUT", precision=4, scale=0)
	private BigDecimal heureDebut;
	
	@Column(name = "HEURE_FIN", precision=4, scale=0)
	private BigDecimal heureFin;
	
	@Column(name = "OBSERVATION", length = 1000)
	private String observation;

	
	@OneToOne
    @JoinColumns({ 
    	@JoinColumn(name = "ID_ET", referencedColumnName = "ID_ET", insertable = false, updatable = false),
        @JoinColumn(name = "DATE_DEPOT_FICHE", referencedColumnName = "DATE_DEPOT_FICHE", insertable = false, updatable = false)
    })
	private FichePFE fichePFEVisiteStagiaire;
	
	
}
