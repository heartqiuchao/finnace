package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CM_BI", schema = "FINANCE")
public class CmBiInfo implements Serializable {

	@Id
	@Column(name = "CM_ID", length = 10)
	private String id;

	@Column(name = "CM_JC", length = 20)
	private String cm_jc;

	@Column(name = "CM_LR", length = 20)
	private String cm_lr;

	@Column(name = "CM_ORG_TYPE", length = 20)
	private String cm_org_type;

	@Column(name = "CM_REG_ADDR", length = 20)
	private String cm_reg_addr;

	@Column(name = "CM_OAPC", length = 20)
	private String cm_oapc;

	@Column(name = "CM_WS", length = 20)
	private String cm_ws;

	@Column(name = "CM_SOTB_NAME", length = 20)
	private String cm_sotb_name;

	@Column(name = "CM_SOTB_PHONE", length = 20)
	private String cm_sotb_phone;

	@Column(name = "CM_SOTB_EMAIL", length = 20)
	private String cm_sotb_email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCm_jc() {
		return cm_jc;
	}

	public void setCm_jc(String cm_jc) {
		this.cm_jc = cm_jc;
	}

	public String getCm_lr() {
		return cm_lr;
	}

	public void setCm_lr(String cm_lr) {
		this.cm_lr = cm_lr;
	}

	public String getCm_org_type() {
		return cm_org_type;
	}

	public void setCm_org_type(String cm_org_type) {
		this.cm_org_type = cm_org_type;
	}

	public String getCm_reg_addr() {
		return cm_reg_addr;
	}

	public void setCm_reg_addr(String cm_reg_addr) {
		this.cm_reg_addr = cm_reg_addr;
	}

	public String getCm_oapc() {
		return cm_oapc;
	}

	public void setCm_oapc(String cm_oapc) {
		this.cm_oapc = cm_oapc;
	}

	public String getCm_ws() {
		return cm_ws;
	}

	public void setCm_ws(String cm_ws) {
		this.cm_ws = cm_ws;
	}

	public String getCm_sotb_name() {
		return cm_sotb_name;
	}

	public void setCm_sotb_name(String cm_sotb_name) {
		this.cm_sotb_name = cm_sotb_name;
	}

	public String getCm_sotb_phone() {
		return cm_sotb_phone;
	}

	public void setCm_sotb_phone(String cm_sotb_phone) {
		this.cm_sotb_phone = cm_sotb_phone;
	}

	public String getCm_sotb_email() {
		return cm_sotb_email;
	}

	public void setCm_sotb_email(String cm_sotb_email) {
		this.cm_sotb_email = cm_sotb_email;
	}

}
