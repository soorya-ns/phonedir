package com.phonedirectory.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class PhoneBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8012816469706889062L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid", nullable = false)
	private int pid;
	
	@Basic(optional = false)
	@Column(name = "number", nullable = false, unique = true)
	private String number;
	
	@Basic(optional = true)
	@Column(name = "owner_name", nullable = true)
	private String ownerName;
	
	@Basic(optional = true)
	@Column(name = "owner_address", nullable = true)
	private String ownerAddress;
	
	@Basic(optional = true)
	@Column(name = "service_provider", nullable = true)
	private String serviceProvider;
	
	@Basic(optional = true)
	@Column(name = "state_code", nullable = true)
	private String stateCode;
	
	@Basic(optional = true)
	@Column(name = "country_code", nullable = true)
	private String countryCode;
	
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	

}
