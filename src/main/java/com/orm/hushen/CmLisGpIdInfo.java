package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CM_LIS_GP_ID", schema = "FINANCE")
public class CmLisGpIdInfo implements Serializable {

	@Id
	@Column(name = "CM_ID", length = 10)
	private String id;

	@Column(name = "GP_ID", length = 20)
	private String gp_id;

	@Column(name = "GP_NAME", length = 20)
	private String gp_name;

	@Column(name = "GP_DEAL", length = 20)
	private String gp_deal;

	@Column(name = "LIS_TIME", length = 20)
	private String lis_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGp_id() {
		return gp_id;
	}

	public void setGp_id(String gp_id) {
		this.gp_id = gp_id;
	}

	public String getGp_name() {
		return gp_name;
	}

	public void setGp_name(String gp_name) {
		this.gp_name = gp_name;
	}

	public String getGp_deal() {
		return gp_deal;
	}

	public void setGp_deal(String gp_deal) {
		this.gp_deal = gp_deal;
	}

	public String getLis_time() {
		return lis_time;
	}

	public void setLis_time(String lis_time) {
		this.lis_time = lis_time;
	}

}
