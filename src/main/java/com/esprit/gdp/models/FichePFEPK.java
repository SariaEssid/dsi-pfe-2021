package com.esprit.gdp.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * @author Saria Essid
 *
 */

@Embeddable
public class FichePFEPK implements Serializable
{

	private static final long serialVersionUID = 816212041324278199L;

	
	
	@Column(name = "ID_ET", length = 10)
	private String idEt;
	
	@Column(name = "DATE_DEPOT_FICHE")
	private Timestamp dateDepotFiche;
	
	
	public FichePFEPK(){}
	
	public FichePFEPK(String idEt, Timestamp dateDepotFiche)
	{
		this.idEt = idEt;
		this.dateDepotFiche = dateDepotFiche;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDepotFiche == null) ? 0 : dateDepotFiche.hashCode());
		result = prime * result + ((idEt == null) ? 0 : idEt.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichePFEPK other = (FichePFEPK) obj;
		if (dateDepotFiche == null) {
			if (other.dateDepotFiche != null)
				return false;
		} else if (!dateDepotFiche.equals(other.dateDepotFiche))
			return false;
		if (idEt == null) {
			if (other.idEt != null)
				return false;
		} else if (!idEt.equals(other.idEt))
			return false;
		return true;
	}

	
	/**************************************************** Getters & Setters **************************************************/

	
	public String getIdEt() {
		return idEt;
	}

	public void setIdEt(String idEt) {
		this.idEt = idEt;
	}

	public Timestamp getDateDepotFiche() {
		return dateDepotFiche;
	}

	public void setDateDepotFiche(Timestamp dateDepotFiche) {
		this.dateDepotFiche = dateDepotFiche;
	}

}
