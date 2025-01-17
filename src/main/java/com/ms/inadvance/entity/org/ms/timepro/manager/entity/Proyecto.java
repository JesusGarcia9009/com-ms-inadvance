package org.ms.timepro.manager.entity;
// Generated 14-09-2024 21:12:12 by Hibernate Tools 4.3.6.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Proyecto generated by hbm2java
 */
@Entity
@Table(name = "proyecto")
public class Proyecto implements java.io.Serializable {

	private int pryId;
	private CentroCosto centroCosto;
	private Cliente cliente;
	private Compania compania;
	private Pricing pricing;
	private String pryNombre;
	private Date pryFechaInicio;
	private Date pryFechaFin;
	private Set asignacions = new HashSet(0);

	public Proyecto() {
	}

	public Proyecto(int pryId, CentroCosto centroCosto, Cliente cliente, Compania compania, Pricing pricing,
			String pryNombre) {
		this.pryId = pryId;
		this.centroCosto = centroCosto;
		this.cliente = cliente;
		this.compania = compania;
		this.pricing = pricing;
		this.pryNombre = pryNombre;
	}

	public Proyecto(int pryId, CentroCosto centroCosto, Cliente cliente, Compania compania, Pricing pricing,
			String pryNombre, Date pryFechaInicio, Date pryFechaFin, Set asignacions) {
		this.pryId = pryId;
		this.centroCosto = centroCosto;
		this.cliente = cliente;
		this.compania = compania;
		this.pricing = pricing;
		this.pryNombre = pryNombre;
		this.pryFechaInicio = pryFechaInicio;
		this.pryFechaFin = pryFechaFin;
		this.asignacions = asignacions;
	}

	@Id

	@Column(name = "pry_id", unique = true, nullable = false)
	public int getPryId() {
		return this.pryId;
	}

	public void setPryId(int pryId) {
		this.pryId = pryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_centro_costo", nullable = false)
	public CentroCosto getCentroCosto() {
		return this.centroCosto;
	}

	public void setCentroCosto(CentroCosto centroCosto) {
		this.centroCosto = centroCosto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_compania", nullable = false)
	public Compania getCompania() {
		return this.compania;
	}

	public void setCompania(Compania compania) {
		this.compania = compania;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pricing", nullable = false)
	public Pricing getPricing() {
		return this.pricing;
	}

	public void setPricing(Pricing pricing) {
		this.pricing = pricing;
	}

	@Column(name = "pry_nombre", nullable = false)
	public String getPryNombre() {
		return this.pryNombre;
	}

	public void setPryNombre(String pryNombre) {
		this.pryNombre = pryNombre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pry_fecha_inicio", length = 13)
	public Date getPryFechaInicio() {
		return this.pryFechaInicio;
	}

	public void setPryFechaInicio(Date pryFechaInicio) {
		this.pryFechaInicio = pryFechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pry_fecha_fin", length = 13)
	public Date getPryFechaFin() {
		return this.pryFechaFin;
	}

	public void setPryFechaFin(Date pryFechaFin) {
		this.pryFechaFin = pryFechaFin;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proyecto")
	public Set getAsignacions() {
		return this.asignacions;
	}

	public void setAsignacions(Set asignacions) {
		this.asignacions = asignacions;
	}

}
