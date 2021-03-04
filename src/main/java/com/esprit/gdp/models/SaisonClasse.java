package com.esprit.gdp.models;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CLASE database table.
 * 
 */

@Entity
@Table(name = "ESP_SAISON_CLASSE_SYN1")
public class SaisonClasse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODE_CL", length = 10)
	private String codeCl;

	@Column(name = "POLE", length = 1)
	private String pole;

	@Column(name = "ANNEE_SCOLAIRE", length = 4)
	private String anneeScolaire;

	
	@OneToMany(mappedBy = "saisonClasse")
    public List<Inscription> inscriptions;

}

