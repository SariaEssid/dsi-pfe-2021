package com.esprit.gdp.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Saria Essid
 *
 */

@Entity
@Table(name = "ESP_CONVENTION")
public class Convention implements Serializable {

	private static final long serialVersionUID = 2047893257560587603L;

	@EmbeddedId
	private ConventionPK conventionPK;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEB")
	private Date dateDebut;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN")
	private Date dateFin;

	@Column(name = "MAIL", length = 50)
	private String mail;

	@Column(name = "Address", length = 50)
	private String address;

	@Column(name = "TELEPHONE", length = 25)
	private String telephone;
	
	@Column(name = "RESPONSABLE", length = 25)
	private String responsable;

	@Column(name = "TRAITER")
	private String traiter;
	
	
	@ManyToOne
	@JoinColumn(name="ID_ENTREPRISE", referencedColumnName = "ID_ENTREPRISE", updatable=false, insertable=false, nullable=false)
    public EntrepriseAccueil entrepriseAccueilConvention;
	
	@OneToMany(mappedBy = "conventionAvenant", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Avenant> avenants;
	
//	@ManyToOne
//	@JoinColumn(name="ID_ET", referencedColumnName = "ID_ET", updatable=false, insertable=false, nullable=false)
//	private Student studentConvention;
	
	@ManyToOne
	@JoinColumn(name="ID_USER_SCE", referencedColumnName = "ID_USER_SCE", updatable=false, insertable=false, nullable=false)
	private ResponsableServiceStage responsableServiceStage;
	
	
	
	public Convention() {}
	
	public Convention(ConventionPK conventionPK, String mail, Date dateDebut, Date dateFin, String nomSociete,
			String address, String telephone, String responsable, String traiter) {
		super();
		this.conventionPK = conventionPK;
		this.mail = mail;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		//this.nomSociete = nomSociete;
		this.address = address;
		this.telephone = telephone;
		this.responsable = responsable;
		this.traiter = traiter;
	}


	/**************************************************** Getters & Setters **************************************************/

	
	public ConventionPK getConventionPK() {
		return conventionPK;
	}

	public void setConventionPK(ConventionPK conventionPK) {
		this.conventionPK = conventionPK;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getTraiter() {
		return traiter;
	}

	public void setTraiter(String traiter) {
		this.traiter = traiter;
	}

	public EntrepriseAccueil getEntrepriseAccueilConvention() {
		return entrepriseAccueilConvention;
	}

	public void setEntrepriseAccueilConvention(EntrepriseAccueil entrepriseAccueilConvention) {
		this.entrepriseAccueilConvention = entrepriseAccueilConvention;
	}

	public List<Avenant> getAvenants() {
		return avenants;
	}

	public void setAvenants(List<Avenant> avenants) {
		this.avenants = avenants;
	}

	public ResponsableServiceStage getResponsableServiceStage() {
		return responsableServiceStage;
	}

	public void setResponsableServiceStage(ResponsableServiceStage responsableServiceStage) {
		this.responsableServiceStage = responsableServiceStage;
	}

}
