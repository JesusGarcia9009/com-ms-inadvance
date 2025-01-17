package com.ms.inadvance.entity;
// Generated 19-03-2024 15:48:26 by Hibernate Tools 4.3.6.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LetterConfig generated by hbm2java
 */
@Entity
@Table(schema = "public", name = "letter_config")
public class LetterConfig implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LetterFixData letterFixdata;
	private Operation operation;
	private Boolean active;
	private Boolean deleted;
	private double hoa;
	private double insurance;
	private double interest;
	private Double loanAmount;
	private int loanTerm;
	private String loanType;
	private String location;
	private double ltv;
	private double maxPay;
	private Double mi;
	private int price;
	private double taxes;
	private String uniqueKey;
	private String updateUser;
	private Date updateDate;

	public LetterConfig() {
	}

	public LetterConfig(long id, double hoa, double insurance, double interest, int loanTerm, String loanType,
			String location, double ltv, double maxPay, int price, double taxes) {
		this.id = id;
		this.hoa = hoa;
		this.insurance = insurance;
		this.interest = interest;
		this.loanTerm = loanTerm;
		this.loanType = loanType;
		this.location = location;
		this.ltv = ltv;
		this.maxPay = maxPay;
		this.price = price;
		this.taxes = taxes;
	}

	public LetterConfig(long id, LetterFixData letterFixdata, Operation operation, Boolean active, Boolean deleted,
			double hoa, double insurance, double interest, Double loanAmount, int loanTerm, String loanType,
			String location, double ltv, double maxPay, Double mi, int price, double taxes, String uniqueKey) {
		this.id = id;
		this.letterFixdata = letterFixdata;
		this.operation = operation;
		this.active = active;
		this.deleted = deleted;
		this.hoa = hoa;
		this.insurance = insurance;
		this.interest = interest;
		this.loanAmount = loanAmount;
		this.loanTerm = loanTerm;
		this.loanType = loanType;
		this.location = location;
		this.ltv = ltv;
		this.maxPay = maxPay;
		this.mi = mi;
		this.price = price;
		this.taxes = taxes;
		this.uniqueKey = uniqueKey;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "letter_fix_data_id")
	public LetterFixData getLetterFixdata() {
		return this.letterFixdata;
	}

	public void setLetterFixdata(LetterFixData letterFixdata) {
		this.letterFixdata = letterFixdata;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "operation_id")
	public Operation getOperation() {
		return this.operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	@Column(name = "active")
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "deleted")
	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Column(name = "hoa", nullable = false, precision = 17, scale = 17)
	public double getHoa() {
		return this.hoa;
	}

	public void setHoa(double hoa) {
		this.hoa = hoa;
	}

	@Column(name = "insurance", nullable = false, precision = 17, scale = 17)
	public double getInsurance() {
		return this.insurance;
	}

	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}

	@Column(name = "interest", nullable = false, precision = 17, scale = 17)
	public double getInterest() {
		return this.interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Column(name = "loan_amount", precision = 17, scale = 17)
	public Double getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Column(name = "loan_term", nullable = false)
	public int getLoanTerm() {
		return this.loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	@Column(name = "loan_type", nullable = false, length = 500)
	public String getLoanType() {
		return this.loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	@Column(name = "location", nullable = false, length = 500)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "ltv", nullable = false, precision = 17, scale = 17)
	public double getLtv() {
		return this.ltv;
	}

	public void setLtv(double ltv) {
		this.ltv = ltv;
	}

	@Column(name = "max_pay", nullable = false, precision = 17, scale = 17)
	public double getMaxPay() {
		return this.maxPay;
	}

	public void setMaxPay(double maxPay) {
		this.maxPay = maxPay;
	}

	@Column(name = "mi", precision = 17, scale = 17)
	public Double getMi() {
		return this.mi;
	}

	public void setMi(Double mi) {
		this.mi = mi;
	}

	@Column(name = "price", nullable = false)
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Column(name = "taxes", nullable = false, precision = 17, scale = 17)
	public double getTaxes() {
		return this.taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	@Column(name = "unique_key", length = 250)
	public String getUniqueKey() {
		return this.uniqueKey;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	@Column(name = "update_user", nullable = false, length = 50)
	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date", nullable = false, length = 29)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
