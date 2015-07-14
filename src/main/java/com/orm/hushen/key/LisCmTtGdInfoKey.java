package com.orm.hushen.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class LisCmTtGdInfoKey implements Serializable {

	@Column(name = "GP_ID", length = 20)
	private String id;

	@Column(name = "YEAR", length = 20)
	private String year;

	@Column(name = "GD_NAME", length = 20)
	private String gd_name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGd_name() {
		return gd_name;
	}

	public void setGd_name(String gd_name) {
		this.gd_name = gd_name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LisCmTtGdInfoKey) {
			LisCmTtGdInfoKey key = (LisCmTtGdInfoKey) obj;
			if (this.id.equals(key.getId())
					&& this.gd_name.equals(key.getGd_name())
					&& this.year.equals(key.getYear())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id.hashCode();
	}

}
