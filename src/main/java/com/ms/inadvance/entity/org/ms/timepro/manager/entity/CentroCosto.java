package org.ms.timepro.manager.entity;
// Generated 14-09-2024 21:12:12 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CentroCosto generated by hbm2java
 */
@Entity
@Table(name = "centro_costo")
public class CentroCosto implements java.io.Serializable {

	private int ccoId;
	private String ccoCode;
	private String ccoNombre;
	private String ccoDescripcion;
	private Set proyectos = new HashSet(0);

	public CentroCosto() {
	}

	public CentroCosto(int ccoId, String ccoCode, String ccoNombre) {
		this.ccoId = ccoId;
		this.ccoCode = ccoCode;
		this.ccoNombre = ccoNombre;
	}

	public CentroCosto(int ccoId, String ccoCode, String ccoNombre, String ccoDescripcion, Set proyectos) {
		this.ccoId = ccoId;
		this.ccoCode = ccoCode;
		this.ccoNombre = ccoNombre;
		this.ccoDescripcion = ccoDescripcion;
		this.proyectos = proyectos;
	}

	@Id

	@Column(name = "cco_id", unique = true, nullable = false)
	public int getCcoId() {
		return this.ccoId;
	}

	public void setCcoId(int ccoId) {
		this.ccoId = ccoId;
	}

	@Column(name = "cco_code", nullable = false)
	public String getCcoCode() {
		return this.ccoCode;
	}

	public void setCcoCode(String ccoCode) {
		this.ccoCode = ccoCode;
	}

	@Column(name = "cco_nombre", nullable = false)
	public String getCcoNombre() {
		return this.ccoNombre;
	}

	public void setCcoNombre(String ccoNombre) {
		this.ccoNombre = ccoNombre;
	}

	@Column(name = "cco_descripcion")
	public String getCcoDescripcion() {
		return this.ccoDescripcion;
	}

	public void setCcoDescripcion(String ccoDescripcion) {
		this.ccoDescripcion = ccoDescripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "centroCosto")
	public Set getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(Set proyectos) {
		this.proyectos = proyectos;
	}

}
