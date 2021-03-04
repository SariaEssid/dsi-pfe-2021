package com.esprit.gdp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Saria Essid
 *
 */

@Entity
@Table(name="ESP_USER_SCE_STAGE")
public class ResponsableServiceStage implements Serializable
{

	private static final long serialVersionUID = -5696578599241267153L;
	
	
	
	@Id
	@Column(name = "ID_USER_SCE", length = 10)
	private String idUserSce;
	
	@Column(name = "NOM_USER_SCE", length = 100)
	private String nomUserSce;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_AFFECTATION")
	private Date dateAffectation;

	@Column(name = "LOGIN", length = 20)
	private String login;
	
	@Column(name = "MDP", length = 20)
	private String mdp;
	
	@OneToMany(mappedBy = "responsableServiceStage")
	private List<Convention> conventions;
	
	public ResponsableServiceStage() {}

	
	
	/************************************************ Getters & Setters *************************************************/

	
	
}
