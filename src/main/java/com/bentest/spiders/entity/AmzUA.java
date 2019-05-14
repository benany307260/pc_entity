package com.bentest.spiders.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the amz_cmdtask database table.
 * 
 */
@Entity
@Table(name="amz_ua")
@NamedQuery(name="AmzUA.findAll", query="SELECT a FROM AmzUA a")
public class AmzUA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="UA")
	private String ua;
	
	@Column(name="BROWSER_TYPE")
	private String browserType;
	
	@Column(name="BROWSER_VERSION")
	private String browserVersion;
	
	@Column(name="BROWSER_NAME")
	private String browserName;


	public AmzUA() {
	}

	public String getBrowserType() {
		return browserType;
	}


	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}


	public String getBrowserVersion() {
		return browserVersion;
	}


	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}


	public String getBrowserName() {
		return browserName;
	}


	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUa() {
		return ua;
	}


	public void setUa(String ua) {
		this.ua = ua;
	}

}