package com.orm.hushen.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class LisCmAssLiaInfoKey implements Serializable {
	@Column(name = "GP_ID", length = 20)
	private String id;

	@Column(name = "YEAR", length = 20)
	private String year;

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LisCmAssLiaInfoKey) {
			LisCmAssLiaInfoKey key = (LisCmAssLiaInfoKey) obj;
			if (this.id.equals(key.getId()) && this.year.equals(key.getYear())) {
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
