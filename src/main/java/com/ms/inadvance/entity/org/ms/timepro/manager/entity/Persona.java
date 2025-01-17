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
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona")
public class Persona implements java.io.Serializable {

	private int perId;
	private Pais paisByIdPaisNacionalidad;
	private Pais paisByIdPaisResidencia;
	private Persona persona;
	private String perNombre;
	private String perApePaterno;
	private String perApeMaterno;
	private String perRutDni;
	private String perEmailPersonal;
	private String perEmailCorporativo;
	private String perOficinaOrigen;
	private String perNacionalidad;
	private Set metodoPagos = new HashSet(0);
	private Set personaEstructuras = new HashSet(0);
	private Set asignacions = new HashSet(0);
	private Set personas = new HashSet(0);

	public Persona() {
	}

	public Persona(int perId, String perNombre) {
		this.perId = perId;
		this.perNombre = perNombre;
	}

	public Persona(int perId, Pais paisByIdPaisNacionalidad, Pais paisByIdPaisResidencia, Persona persona,
			String perNombre, String perApePaterno, String perApeMaterno, String perRutDni, String perEmailPersonal,
			String perEmailCorporativo, String perOficinaOrigen, String perNacionalidad, Set metodoPagos,
			Set personaEstructuras, Set asignacions, Set personas) {
		this.perId = perId;
		this.paisByIdPaisNacionalidad = paisByIdPaisNacionalidad;
		this.paisByIdPaisResidencia = paisByIdPaisResidencia;
		this.persona = persona;
		this.perNombre = perNombre;
		this.perApePaterno = perApePaterno;
		this.perApeMaterno = perApeMaterno;
		this.perRutDni = perRutDni;
		this.perEmailPersonal = perEmailPersonal;
		this.perEmailCorporativo = perEmailCorporativo;
		this.perOficinaOrigen = perOficinaOrigen;
		this.perNacionalidad = perNacionalidad;
		this.metodoPagos = metodoPagos;
		this.personaEstructuras = personaEstructuras;
		this.asignacions = asignacions;
		this.personas = personas;
	}

	@Id

	@Column(name = "per_id", unique = true, nullable = false)
	public int getPerId() {
		return this.perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pais_nacionalidad")
	public Pais getPaisByIdPaisNacionalidad() {
		return this.paisByIdPaisNacionalidad;
	}

	public void setPaisByIdPaisNacionalidad(Pais paisByIdPaisNacionalidad) {
		this.paisByIdPaisNacionalidad = paisByIdPaisNacionalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pais_residencia")
	public Pais getPaisByIdPaisResidencia() {
		return this.paisByIdPaisResidencia;
	}

	public void setPaisByIdPaisResidencia(Pais paisByIdPaisResidencia) {
		this.paisByIdPaisResidencia = paisByIdPaisResidencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_supervisor")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "per_nombre", nullable = false)
	public String getPerNombre() {
		return this.perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	@Column(name = "per_ape_paterno")
	public String getPerApePaterno() {
		return this.perApePaterno;
	}

	public void setPerApePaterno(String perApePaterno) {
		this.perApePaterno = perApePaterno;
	}

	@Column(name = "per_ape_materno")
	public String getPerApeMaterno() {
		return this.perApeMaterno;
	}

	public void setPerApeMaterno(String perApeMaterno) {
		this.perApeMaterno = perApeMaterno;
	}

	@Column(name = "per_rut_dni")
	public String getPerRutDni() {
		return this.perRutDni;
	}

	public void setPerRutDni(String perRutDni) {
		this.perRutDni = perRutDni;
	}

	@Column(name = "per_email_personal")
	public String getPerEmailPersonal() {
		return this.perEmailPersonal;
	}

	public void setPerEmailPersonal(String perEmailPersonal) {
		this.perEmailPersonal = perEmailPersonal;
	}

	@Column(name = "per_email_corporativo")
	public String getPerEmailCorporativo() {
		return this.perEmailCorporativo;
	}

	public void setPerEmailCorporativo(String perEmailCorporativo) {
		this.perEmailCorporativo = perEmailCorporativo;
	}

	@Column(name = "per_oficina_origen")
	public String getPerOficinaOrigen() {
		return this.perOficinaOrigen;
	}

	public void setPerOficinaOrigen(String perOficinaOrigen) {
		this.perOficinaOrigen = perOficinaOrigen;
	}

	@Column(name = "per_nacionalidad")
	public String getPerNacionalidad() {
		return this.perNacionalidad;
	}

	public void setPerNacionalidad(String perNacionalidad) {
		this.perNacionalidad = perNacionalidad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set getMetodoPagos() {
		return this.metodoPagos;
	}

	public void setMetodoPagos(Set metodoPagos) {
		this.metodoPagos = metodoPagos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set getPersonaEstructuras() {
		return this.personaEstructuras;
	}

	public void setPersonaEstructuras(Set personaEstructuras) {
		this.personaEstructuras = personaEstructuras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set getAsignacions() {
		return this.asignacions;
	}

	public void setAsignacions(Set asignacions) {
		this.asignacions = asignacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set personas) {
		this.personas = personas;
	}

}
