package com.esprit.gdp.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Saria Essid
 *
 */

@Embeddable
public class TraitementFichePK implements Serializable
{

	private static final long serialVersionUID = 816212041324278199L;

	
	private FichePFEPK fichePFEPK;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_TRT_FICHE")
	private Date dateTrtFiche;

	
	public TraitementFichePK() {}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTrtFiche == null) ? 0 : dateTrtFiche.hashCode());
		result = prime * result + ((fichePFEPK == null) ? 0 : fichePFEPK.hashCode());
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
		TraitementFichePK other = (TraitementFichePK) obj;
		if (dateTrtFiche == null) {
			if (other.dateTrtFiche != null)
				return false;
		} else if (!dateTrtFiche.equals(other.dateTrtFiche))
			return false;
		if (fichePFEPK == null) {
			if (other.fichePFEPK != null)
				return false;
		} else if (!fichePFEPK.equals(other.fichePFEPK))
			return false;
		return true;
	}


	/**************************************************** Getters & Setters **************************************************/

	
	public FichePFEPK getFichePFEPK() {
		return fichePFEPK;
	}

	public void setFichePFEPK(FichePFEPK fichePFEPK) {
		this.fichePFEPK = fichePFEPK;
	}

	public Date getDateTrtFiche() {
		return dateTrtFiche;
	}
	
	public void setDateTrtFiche(Date dateTrtFiche) {
		this.dateTrtFiche = dateTrtFiche;
	}

}
