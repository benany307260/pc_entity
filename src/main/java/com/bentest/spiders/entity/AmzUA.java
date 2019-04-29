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


	public AmzUA() {
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