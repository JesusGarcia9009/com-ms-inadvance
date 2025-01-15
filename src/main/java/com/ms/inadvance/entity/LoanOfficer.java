package com.ms.inadvance.entity;
// Generated 19-03-2024 15:48:26 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * LoanOfficer generated by hbm2java
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(schema = "public", name = "loan_officer")
public class LoanOfficer extends Users implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Users users;
	private String nmls;
	private Set<LoanClient> loanClients = new HashSet<LoanClient>(0);
	private Set<Operation> operations = new HashSet<Operation>(0);

	public LoanOfficer() {
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "nmls", nullable = false, length = 50)
	public String getNmls() {
		return this.nmls;
	}

	public void setNmls(String nmls) {
		this.nmls = nmls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loanOfficer")
	public Set<LoanClient> getLoanClients() {
		return this.loanClients;
	}

	public void setLoanClients(Set<LoanClient> loanClients) {
		this.loanClients = loanClients;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "loanOfficer")
	public Set<Operation> getOperations() {
		return this.operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

}