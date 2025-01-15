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
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente")
public class Cliente implements java.io.Serializable {

	private int cliId;
	private Pais pais;
	private String cliNombre;
	private String cliRazonSocial;
	private String cliRut;
	private Set proyectos = new HashSet(0);

	public Cliente() {
	}

	public Cliente(int cliId, Pais pais) {
		this.cliId = cliId;
		this.pais = pais;
	}

	public Cliente(int cliId, Pais pais, String cliNombre, String cliRazonSocial, String cliRut, Set proyectos) {
		this.cliId = cliId;
		this.pais = pais;
		this.cliNombre = cliNombre;
		this.cliRazonSocial = cliRazonSocial;
		this.cliRut = cliRut;
		this.proyectos = proyectos;
	}

	@Id

	@Column(name = "cli_id", unique = true, nullable = false)
	public int getCliId() {
		return this.cliId;
	}

	public void setCliId(int cliId) {
		this.cliId = cliId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pais", nullable = false)
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Column(name = "cli_nombre")
	public String getCliNombre() {
		return this.cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	@Column(name = "cli_razon_social")
	public String getCliRazonSocial() {
		return this.cliRazonSocial;
	}

	public void setCliRazonSocial(String cliRazonSocial) {
		this.cliRazonSocial = cliRazonSocial;
	}

	@Column(name = "cli_rut")
	public String getCliRut() {
		return this.cliRut;
	}

	public void setCliRut(String cliRut) {
		this.cliRut = cliRut;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(Set proyectos) {
		this.proyectos = proyectos;
	}

}
