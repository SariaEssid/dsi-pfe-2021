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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Saria Essid
 *
 */
@Entity
@Table(name="ESP_SESSION")
public class Session implements Serializable
{
	
	private static final long serialVersionUID = -3852971303065475417L;

	
	
	@TableGenerator(name = "Idt_Session", table = "IDS_GEN_NEXT_VALUE", pkColumnName = "SEQUENCE_NAME", valueColumnName = "NEXT_VAL", pkColumnValue = "TBL_SESSION", initialValue = 0, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Idt_Session")
	@Column(name="ID_SESSION", length = 2)
	private Integer idSession;
	
	@Column(name="LIBELLE_SESSION", length = 100)
	private String libelleSession;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_DEBUT")
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FIN")
	private Date dateFin;
	
	@OneToMany(mappedBy = "session")
	private List<FichePFE> fichePfes;
	
	
	
}
