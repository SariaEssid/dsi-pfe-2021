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
public class EvaluationStagePK implements Serializable {

	private static final long serialVersionUID = 816212041324278199L;

	
	private FichePFEPK fichePFEPK;

	@Column(name="CODE_EVALUATION", length = 2)
	private Date codeEvaluation;

	
	public EvaluationStagePK() {}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeEvaluation == null) ? 0 : codeEvaluation.hashCode());
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
		EvaluationStagePK other = (EvaluationStagePK) obj;
		if (codeEvaluation == null) {
			if (other.codeEvaluation != null)
				return false;
		} else if (!codeEvaluation.equals(other.codeEvaluation))
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

	public Date getCodeEvaluation() {
		return codeEvaluation;
	}

	public void setCodeEvaluation(Date codeEvaluation) {
		this.codeEvaluation = codeEvaluation;
	}

}
