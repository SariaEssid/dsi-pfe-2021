package com.esprit.gdp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

/**
 * @author Saria Essid
 *
 */

@Entity
@Table(name="ESP_EVALUATION_STAGE")
public class EvaluationStage implements Serializable {

	private static final long serialVersionUID = 816212041324278199L;

	@EmbeddedId
	private EvaluationStagePK evaluationStagePK;

	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_EVALUATION")
	private Date dateEvaluation;
	
	@Digits(integer=3, fraction=2)
	@Column(name = "NOTE_EVALUATION")
	private BigDecimal noteEvaluation;
	
	@Digits(integer=3, fraction=2)
	@Column(name = "TAUX_EVALUATION")
	private BigDecimal tauxEvaluation;
	
	
	@OneToOne
	@JoinColumns({ 
	    	@JoinColumn(name = "ID_ET", referencedColumnName = "ID_ET", insertable = false, updatable = false),
	        @JoinColumn(name = "DATE_DEPOT_FICHE", referencedColumnName = "DATE_DEPOT_FICHE", insertable = false, updatable = false)
	    })
	private FichePFE fichePFEEvaluationStage;
	
	
	public EvaluationStage() {}

	

}
