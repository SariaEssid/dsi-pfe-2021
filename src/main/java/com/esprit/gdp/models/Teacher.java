package com.esprit.gdp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


/**
 * @author Saria Essid
 *
 */

@Entity
@Table(name="ESP_ENSEIGNANT_SYN1")
public class Teacher implements Serializable
{

	private static final long serialVersionUID = -5696578599241267153L;
	
	
	
	@Id
	@Column(name = "ID_ENS", length = 10)
	private String idEns;
	
	@Column(name = "PWD_JWT_ENSEIGNANT", length = 100)
	private String pwdJWTEnseignant;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_MODIFY_JWT_PWD")
	private Date dateModifyJwtPwd;
	
	@Column(name = "CHEF_DEPT")
	private String chefDept;

	private BigDecimal chefcomite;

	private BigDecimal cin;
	
	@Column(name="CODE_MAT")
	private String codeMat;

	@Column(name = "CNSS_ENS")
	private String cnssEns;

	@Column(name = "CODE_GRADE_ACTUEL")
	private String codeGradeActuel;

	@Column(name = "CODE_GRADE_ENTREE")
	private String codeGradeEntree;

	//@Temporal(TemporalType.DATE)
	
	@Column(name = "DATE_REC")
	private Date dateRec;


	private String etat;

	@Column(name = "ETAT_CIVIL_ENS")
	private String etatCivilEns;

	@Column(name = "FK_CMT")
	private BigDecimal fkCmt;

	@Column(name = "LIB_GRADE_ACTUELLE")
	private String libGradeActuelle;

	@Column(name = "LIB_GRADE_ENTREE")
	private String libGradeEntree;

	@Column(name = "MAIL_ENS")
	private String mailEns;

	private String niveau;

	@Column(name = "NOM_ENS")
	private String nomEns;

	private String observation;

	private String organisme;

	@Column(name = "PRENOM_ENS")
	private String prenomEns;

	@Column(name = "PWD_INIT")
	private String pwdInit;

	@Column(name = "SEXE_ENS")
	private String sexeEns;

	private String tel1;

	private String tel2;

	@Column(name = "TYPE_ENS")
	private String typeEns;

	@Column(name = "TYPE_UP")
	private String typeUp;

	@Column(name = "UP")
	private String up;
	
	@Column(name = "PWD_ENS")
	private String pwdEns;
	
	
	@OneToMany(mappedBy = "presidentJuryEns")
	private List<FichePFE> fichePfes;
	
	@OneToMany(mappedBy = "encadrantPedagogique")
	private List<Inscription> inscriptions;
	
	
	
	// @ManyToMany(fetch = FetchType.EAGER)
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "ESP_RESPONSABLE_STAGE", 
	           joinColumns = { @JoinColumn(name = "ESP_ID_ENS", referencedColumnName="ID_ENS") }, 
	           inverseJoinColumns = { @JoinColumn(name = "ESP_ID_OPTION", referencedColumnName="CODE_OPTION") })
	private List<Option> options;
	
	public Teacher() {}

	
	
	/************************************************ Getters & Setters *************************************************/

	
	
	
	public String getIdEns() {
		return idEns;
	}
	
	public void setIdEns(String idEns) {
		this.idEns = idEns;
	}

	public String getPwdJWTEnseignant() {
		return pwdJWTEnseignant;
	}

	public void setPwdJWTEnseignant(String pwdJWTEnseignant) {
		this.pwdJWTEnseignant = pwdJWTEnseignant;
	}

	public Date getDateModifyJwtPwd() {
		return dateModifyJwtPwd;
	}

	public void setDateModifyJwtPwd(Date dateModifyJwtPwd) {
		this.dateModifyJwtPwd = dateModifyJwtPwd;
	}

	public String getChefDept() {
		return chefDept;
	}

	public void setChefDept(String chefDept) {
		this.chefDept = chefDept;
	}

	public BigDecimal getChefcomite() {
		return chefcomite;
	}

	public void setChefcomite(BigDecimal chefcomite) {
		this.chefcomite = chefcomite;
	}

	public BigDecimal getCin() {
		return cin;
	}

	public void setCin(BigDecimal cin) {
		this.cin = cin;
	}

	public String getCnssEns() {
		return cnssEns;
	}

	public void setCnssEns(String cnssEns) {
		this.cnssEns = cnssEns;
	}

	public String getCodeGradeActuel() {
		return codeGradeActuel;
	}

	public void setCodeGradeActuel(String codeGradeActuel) {
		this.codeGradeActuel = codeGradeActuel;
	}

	public String getCodeGradeEntree() {
		return codeGradeEntree;
	}

	public void setCodeGradeEntree(String codeGradeEntree) {
		this.codeGradeEntree = codeGradeEntree;
	}

	public Date getDateRec() {
		return dateRec;
	}

	public void setDateRec(Date dateRec) {
		this.dateRec = dateRec;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getEtatCivilEns() {
		return etatCivilEns;
	}

	public void setEtatCivilEns(String etatCivilEns) {
		this.etatCivilEns = etatCivilEns;
	}

	public BigDecimal getFkCmt() {
		return fkCmt;
	}

	public void setFkCmt(BigDecimal fkCmt) {
		this.fkCmt = fkCmt;
	}

	public String getLibGradeActuelle() {
		return libGradeActuelle;
	}

	public void setLibGradeActuelle(String libGradeActuelle) {
		this.libGradeActuelle = libGradeActuelle;
	}

	public String getLibGradeEntree() {
		return libGradeEntree;
	}

	public void setLibGradeEntree(String libGradeEntree) {
		this.libGradeEntree = libGradeEntree;
	}

	public String getMailEns() {
		return mailEns;
	}

	public void setMailEns(String mailEns) {
		this.mailEns = mailEns;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getNomEns() {
		return nomEns;
	}

	public void setNomEns(String nomEns) {
		this.nomEns = nomEns;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public String getPrenomEns() {
		return prenomEns;
	}

	public void setPrenomEns(String prenomEns) {
		this.prenomEns = prenomEns;
	}

	public String getPwdInit() {
		return pwdInit;
	}

	public void setPwdInit(String pwdInit) {
		this.pwdInit = pwdInit;
	}

	public String getSexeEns() {
		return sexeEns;
	}

	public void setSexeEns(String sexeEns) {
		this.sexeEns = sexeEns;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	public String getTypeEns() {
		return typeEns;
	}

	public void setTypeEns(String typeEns) {
		this.typeEns = typeEns;
	}

	public String getTypeUp() {
		return typeUp;
	}

	public void setTypeUp(String typeUp) {
		this.typeUp = typeUp;
	}

	public String getUp() {
		return up;
	}

	public void setUp(String up) {
		this.up = up;
	}

	public String getCodeMat() {
		return codeMat;
	}

	public void setCodeMat(String codeMat) {
		this.codeMat = codeMat;
	}

	public String getPwdEns() {
		return pwdEns;
	}

	public void setPwdEns(String pwdEns) {
		this.pwdEns = pwdEns;
	}
	
}
