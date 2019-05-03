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
@Table(name="amz_proxy_isp")
@NamedQuery(name="AmzProxyIsp.findAll", query="SELECT a FROM AmzProxyIsp a")
public class AmzProxyIsp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="PROXY_TYPE")
	private Integer proxyType;
	
	@Column(name="GET_URL")
	private String getUrl;


	public AmzProxyIsp() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getProxyType() {
		return proxyType;
	}


	public void setProxyType(Integer proxyType) {
		this.proxyType = proxyType;
	}


	public String getGetUrl() {
		return getUrl;
	}


	public void setGetUrl(String getUrl) {
		this.getUrl = getUrl;
	}

}