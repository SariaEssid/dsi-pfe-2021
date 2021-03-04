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
@Table(name = "ESP_OPTION_SYN1")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODE_OPTION", length = 10)
	private String codeOption;

	@Column(name = "LIB_OPTION")
	private String libOption;

	@Column(name = "ANNEE_DEB")
	private String anneeDeb;
	
	@Column(name = "DATE_CREATION")
	private String dateCreation;
	
	@Column(name = "DATE_MAJ")
	private String dateMaj;



}
