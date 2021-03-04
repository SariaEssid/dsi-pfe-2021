package com.esprit.gdp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SALLE_SYN1")
public class Salle implements Serializable
{

	private static final long serialVersionUID = -8899968697607843994L;

	
	
	@Id
	@Column(name="CODE_SALLE", length = 10)
	private String codeSalle;
	
	@Column(name = "LIBELLE_SALLE", length = 50)
	private String libelleSalle;
	
	@Column(name = "NUM_BLOC", length = 2)
	private String numBloc;
	
	@Column(name = "NUM_ETAGE", precision=1, scale=0)
	private BigDecimal numEtage;
	
	@Column(name = "SITE_ESPRIT", length = 2)
	private String siteEsprit;
	
	@Column(name = "ETAT", length = 1)
	private String etat;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DISPONIBILITE")
	private Date dateDisponibilite;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_SAISIE")
	private Date dateSaisie;
	
	
	@OneToMany(mappedBy = "salle")
	private List<FichePFE> fichePFEs;
	
	
}

