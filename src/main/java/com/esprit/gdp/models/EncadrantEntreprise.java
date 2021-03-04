package com.esprit.gdp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name = "ENCADRANT_ENTREPRISE")
public class EncadrantEntreprise implements Serializable
{

	private static final long serialVersionUID = 7839226972740647617L;
	
	@TableGenerator(name = "Idt_encadrantEntreprise", table = "IDS_GEN_NEXT_VALUE", pkColumnName = "SEQUENCE_NAME", valueColumnName = "NEXT_VAL", pkColumnValue = "TBL_ENCADRANT_ENTREPRISE", initialValue = 0, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Idt_encadrantEntreprise")
	@Column(name = "ID_ENCADRANT", length = 5)
	private String idEncadrant;
	
	@Column(name = "PWD_ENCADRANT", length = 50)
	private String pwdEncadrant;
	
	@Column(name = "PWD_JWT_ENCADRANT", length = 100)
	private String pwdJWTEncadrant;
	
	@Column(name = "DATE_MODIFY_JWT_PWD")
	private Date dateModifyJwtPwd;
	
	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;
	
	@Column(name = "LAST_NAME", length = 50)
	private String lastName;
	
	@Column(name = "NUM_TELEPHONE", length = 20)
	private String numTelephone;
	
	@Column(name = "EMAIL", length = 50)
	private String email;
	
	@Column(name = "ADDRESS", length = 50)
	private String address;
	
	@Column(name = "FONCTION", length = 50)
	private String fonction;
	
	@ManyToOne
	@JoinColumn(name="ID_ENTREPRISE")
	private EntrepriseAccueil entrepriseAccueilEncadrantEntreprise;
	
	
	public EncadrantEntreprise(){}
	
	
	public EncadrantEntreprise(String pwdJWTEncadrant, Date dateModifyJwtPwd)
	{
		this.pwdJWTEncadrant = pwdJWTEncadrant;
		this.dateModifyJwtPwd = dateModifyJwtPwd;
	}
	

	public EncadrantEntreprise(String idEncadrant, String firstName, String lastName, String numTelephone, String email) {
		this.idEncadrant = idEncadrant;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numTelephone = numTelephone;
		this.email = email;
	}


	/************************************************ Getters & Setters *************************************************/


	
}
