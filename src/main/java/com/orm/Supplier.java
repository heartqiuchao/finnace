package com.orm;
// default package
// Generated 2015-5-21 22:24:34 by Hibernate Tools 3.2.2.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Supplier generated by hbm2java
 */
@Entity
@Table(name = "SUPPLIER", schema = "FINANCE")
public class Supplier implements java.io.Serializable {

	private Integer id;
	private String supcode;
	private String supname;
	private String location;
	private String more;
	private Set<Medinfo> medinfos = new HashSet<Medinfo>(0);
	
	public Supplier() {
	}

	public Supplier(Integer id) {
		this.id = id;
	}

	public Supplier(Integer id, String supcode, String supname,
			String location, String more) {
		this.id = id;
		this.supcode = supcode;
		this.supname = supname;
		this.location = location;
		this.more = more;
	}

	@Id
	@SequenceGenerator(name="sequenceSupplier",sequenceName="SEQ")
	@GeneratedValue(generator="sequenceSupplier",strategy=GenerationType.SEQUENCE)
	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "SUPCODE", length = 30)
	public String getSupcode() {
		return this.supcode;
	}

	public void setSupcode(String supcode) {
		this.supcode = supcode;
	}

	@Column(name = "SUPNAME", length = 100)
	public String getSupname() {
		return this.supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	@Column(name = "LOCATION", length = 100)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "MORE", length = 100)
	public String getMore() {
		return this.more;
	}

	public void setMore(String more) {
		this.more = more;
	}

	@OneToMany(targetEntity=Medinfo.class,cascade = CascadeType.REMOVE, fetch = FetchType.EAGER, mappedBy = "supplier")
	public Set<Medinfo> getMedinfos() {
		return medinfos;
	}

	public void setMedinfos(Set<Medinfo> medinfos) {
		this.medinfos = medinfos;
	}
}
