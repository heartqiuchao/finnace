package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orm.hushen.key.LisCmTtGdInfoKey;

@SuppressWarnings("serial")
@Entity
@Table(name = "LIS_CM_TT_GD_INFO", schema = "FINANCE")
public class LisCmTtGdInfo implements Serializable {

	@Id
	LisCmTtGdInfoKey LisCmTtGdInfoKey;

	@Column(name = "CB_TYPE", length = 20)
	private String cb_type;

	@Column(name = "GD_GS", length = 20)
	private String gd_gs;

	@Column(name = "GD_GSR", length = 20)
	private String gd_gsr;

	public LisCmTtGdInfoKey getLisCmTtGdInfoKey() {
		return LisCmTtGdInfoKey;
	}

	public void setLisCmTtGdInfoKey(LisCmTtGdInfoKey lisCmTtGdInfoKey) {
		LisCmTtGdInfoKey = lisCmTtGdInfoKey;
	}

	public String getCb_TYPE() {
		return cb_type;
	}

	public void setCb_TYPE(String cb_TYPE) {
		this.cb_type = cb_TYPE;
	}

	public String getGd_GS() {
		return gd_gs;
	}

	public void setGd_GS(String gd_GS) {
		this.gd_gs = gd_GS;
	}

	public String getGd_GSR() {
		return gd_gsr;
	}

	public void setGd_GSR(String gd_GSR) {
		this.gd_gsr = gd_GSR;
	}

}
