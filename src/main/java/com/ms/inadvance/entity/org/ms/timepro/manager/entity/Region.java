package org.ms.timepro.manager.entity;
// Generated 14-09-2024 21:12:12 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Region generated by hbm2java
 */
@Entity
@Table(name = "region")
public class Region implements java.io.Serializable {

	private int regId;
	private Pais pais;
	private String regDescripcion;
	private Set comunas = new HashSet(0);

	public Region() {
	}

	public Region(int regId, Pais pais, String regDescripcion) {
		this.regId = regId;
		this.pais = pais;
		this.regDescripcion = regDescripcion;
	}

	public Region(int regId, Pais pais, String regDescripcion, Set comunas) {
		this.regId = regId;
		this.pais = pais;
		this.regDescripcion = regDescripcion;
		this.comunas = comunas;
	}

	@Id

	@Column(name = "reg_id", unique = true, nullable = false)
	public int getRegId() {
		return this.regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pais", nullable = false)
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Column(name = "reg_descripcion", nullable = false, length = 100)
	public String getRegDescripcion() {
		return this.regDescripcion;
	}

	public void setRegDescripcion(String regDescripcion) {
		this.regDescripcion = regDescripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
	public Set getComunas() {
		return this.comunas;
	}

	public void setComunas(Set comunas) {
		this.comunas = comunas;
	}

}
