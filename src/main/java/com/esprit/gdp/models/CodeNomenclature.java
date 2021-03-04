package com.esprit.gdp.models;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CLASE database table.
 * 
 */

@Entity
@Table(name = "CODE_NOMENCLATURE_SYN1")
public class CodeNomenclature implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CodeNomenclatureId cni;
	
	@Column(name = "LIB_NOME", length = 100)
	private String libNome;
	
	@ManyToOne
	@JoinColumn(name="CODE_STR", updatable=false, insertable=false, nullable=false)
	private StrNome strNome;

//	@Column(name="CODE_NOME", updatable=false, insertable=false, nullable=false)
//	private String codeNome;

}
