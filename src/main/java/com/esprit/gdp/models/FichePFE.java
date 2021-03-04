package com.esprit.gdp.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="ESP_FICHE_PFE")
public class FichePFE implements Serializable
{
	
	private static final long serialVersionUID = -8252893373212587615L;


	@EmbeddedId
	private FichePFEPK idFichePFE;
	
	
	@Column(name = "TITRE_PROJET", length = 100)
	private String titreProjet;
	
	@Column(name = "DESCRIPTION_PROJET", length = 500)
	private String descriptionProjet;
	
	@Column(name = "ANNEE_DEB", length = 4)
	private String anneeDeb;
	
	
	// Session
	@ManyToOne
	@JoinColumn(name="ID_SESSION")
	private Session session;
	
	
	@ManyToOne
	@JoinColumn(name="BINOME_PFE")
	private Student binome;
	
	@Column(name = "PATH_BILAN_1", length = 200)
	private String pathBilan1;
	
	@Column(name = "PATH_BILAN_2", length = 200)
	private String pathBilan2;
	
	@Column(name = "PATH_BILAN_3", length = 200)
	private String pathBilan3;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_BILAN_1")
	private Date dateDepotBilan1;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_BILAN_2")
	private Date dateDepotBilan2;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_BILAN_3")
	private Date dateDepotBilan3;
	
	@Column(name = "PATH_JOURNAL_STG", length = 100)
	private String pathJournalStg;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_JOURNAL_STG")
	private Date dateDepotJournalStg;
	
	@Column(name = "PATH_RAPPORT_VERSION_1", length = 100)
	private String pathRapportVersion1;
	
	@Column(name = "PATH_RAPPORT_VERSION_2", length = 100)
	private String pathRapportVersion2;
	
	@Column(name = "PATH_PLAGIAT", length = 100)
	private String pathPlagiat;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_RAPPORT_VERSION_1")
	private Date dateDepotRapportVersion1;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_RAPPORT_VERSION_2")
	private Date dateDepotRapportVersion2;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT_PLAGIAT")
	private Date dateDepotPlagiat;
	
	@Column(name = "CONFIDENTIEL", length = 1)
	private Boolean confidentiel;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_SOUTENANCE")
	private Date dateSoutenance;

	@ManyToOne
	@JoinColumn(name="SALLE_SOUTENANCE")
	private Salle salle;
	
	@Column(name = "H_DEBUT_SOUTENANCE", precision=4, scale=0)
	private BigDecimal heureDebut;
	
	@Column(name = "H_FIN_SOUTENANCE", precision=4, scale=0)
	private BigDecimal heureFin;
	
	@Column(name = "PRESIDENT_JURY", length = 50)
	private String presidentJury;
	
	@ManyToOne
	@JoinColumn(name="ID_ENS_PRESIDENT")
	private Teacher presidentJuryEns;
	
	
	
	/* @OneToMany(fetch = FetchType.LAZY)
	@JoinColumns({ 
	      @JoinColumn(name = "B_SIREN", referencedColumnName = "A_SIREN"),
	      @JoinColumn(name = "B_NDA", referencedColumnName = "A_NDA") 
	    })*/
	@OneToMany(mappedBy = "fichePFEProblematic")
	private List<Problematique> problematics;
	
	
	@OneToMany(mappedBy = "fichePFEFunctionnality")
	private List<Fonctionnalite> functionnalities;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(	name = "ESP_FICHEPFE_TECHNOLOGIE", 
			joinColumns = {@JoinColumn(table = "ESP_FICHE_PFE", name = "ID_ET"),
						   @JoinColumn(table = "ESP_FICHE_PFE", name = "DATE_DEPOT_FICHE")
			},
				inverseJoinColumns = @JoinColumn(name = "ID_TECHNOLOGIE"))
	private List<Technologie> technologies;
	
	@OneToMany(mappedBy = "fichePFETraitementFichePFE")
	private List<TraitementFichePFE> traitementFichePFE;
	
	
	@OneToOne(mappedBy = "fichePFEVisiteStagiaire")
	private VisiteStagiaire visiteStagiaire;
	
	
	@OneToOne(mappedBy = "fichePFEEvaluationStage")
	private EvaluationStage evaluationStage;
	
	
	
	public FichePFE() {}

	
	/***********************************************************************************************************/
	
	

}
