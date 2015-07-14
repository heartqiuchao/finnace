package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orm.hushen.key.LisCmGbOrgInfoKey;

@SuppressWarnings("serial")
@Entity
@Table(name = "LIS_CM_GB_ORG", schema = "FINANCE")
public class LisCmGbOrgInfo implements Serializable{
	
	@Id
	private LisCmGbOrgInfoKey LisCmGbOrgInfoKey;
	
	@Column(name = "CB_TYPE", length=20)
	private String cb_type;
	
	@Column(name = "CO_LIM_FG_GS", length=20)
	private String co_lim_fg_gs;
	
	@Column(name = "CLPO_LIM_FG_GS", length=20)
	private String clpo_lim_fg_gs;
	
	@Column(name = "ELSE_LIM_DOM_FG_GS", length=20)
	private String else_lim_dom_fg_gs;
	
	@Column(name = "DOM_LPO_LIM_FG_GS", length=20)
	private String dom_lpo_lim_fg_gs;
	
	@Column(name = "DOM_NPO_LIM_FG_GS", length=20)
	private String dom_npo_lim_fg_gs;
	
	@Column(name = "LIM_FI_FG_GS", length=20)
	private String lim_fi_fg_gs;
	
	@Column(name = "OVER_LPO_LIM_FG_GS", length=20)
	private String over_lpo_lim_fg_gs;
	
	@Column(name = "OVER_NPO_LIM_FG_GS", length=20)
	private String over_npo_lim_fg_gs;
	
	@Column(name = "ELSE_LIM_FG_GS", length=20)
	private String else_lim_fg_gs;
	
	@Column(name = "LIM_FG_GS", length=20)
	private String lim_fg_gs;
	
	@Column(name = "UNLIM_RMB_GG_GS", length=20)
	private String unlim_rmb_gg_gs;
	
	@Column(name = "UNLIM_DOM_LIS_FI_GS", length=20)
	private String unlim_dom_lis_fi_gs;
	
	@Column(name = "UNLIM_OVER_LIS_FI_GS", length=20)
	private String unlim_over_lis_fi_gs;
	
	@Column(name = "ELSE_UNLIN_LIS_FG_GS", length=20)
	private String else_unlin_lis_fg_gs;
	
	@Column(name = "UNLIM_FG_TOTAL", length=20)
	private String unlim_fg_total;
	
	@Column(name = "GF_TOTAL", length=20)
	private String gf_total;
	
	@Column(name = "CO_LIM_FG_RTOTAL", length=20)
	private String co_lim_fg_rtotal;
	
	@Column(name = "CLPO_LIM_FG_RTOTAL", length=20)
	private String clpo_lim_fg_rtotal;
	
	@Column(name = "ELSE_LIM_DOM_FG_RTOTAL", length=20)
	private String else_lim_dom_fg_rtotal;
	
	@Column(name = "DOM_LPO_LIM_FG_RTOTAL", length=20)
	private String dom_lpo_lim_fg_rtotal;
	
	@Column(name = "DOM_NPO_LIM_FG_RTOTAL", length=20)
	private String dom_npo_lim_fg_rtotal;
	
	@Column(name = "LIM_FI_FG_RTOTAL", length=20)
	private String lim_fi_fg_rtotal;
	
	@Column(name = "OVER_LPO_LIM_FG_RTOTAL", length=20)
	private String over_lpo_lim_fg_rtotal;
	
	@Column(name = "OVER_NPO_LIM_FG_RTOTAL", length=20)
	private String over_npo_lim_fg_rtotal;
	
	@Column(name = "ELSE_LIM_FG_RTOTAL", length=20)
	private String else_lim_fg_rtotal;
	
	@Column(name = "LIM_FG_RTOTAL", length=20)
	private String lim_fg_rtotal;
	
	@Column(name = "UNLIM_RMB_GG_RTOTAL", length=20)
	private String unlim_rmb_gg_rtotal;
	
	@Column(name = "UNLIM_DOM_LIS_FI_RTOTAL", length=20)
	private String unlim_dom_lis_fi_rtotal;
	
	@Column(name = "UNLIM_OVER_LIS_FI_RTOTAL", length=20)
	private String unlim_over_lis_fi_rtotal;
	
	@Column(name = "ELSE_UNLIM_LIS_FG_RTOTAL", length=20)
	private String else_unlim_lis_fg_rtotal;
	
	@Column(name = "UNLIM_FG_RTOTAL", length=20)
	private String unlim_fg_rtotal;
	
	@Column(name = "GF_TOTAL_RTOTAL", length=20)
	private String gf_total_rtotal;

	
	public LisCmGbOrgInfoKey getLisCmGbOrgInfoKey() {
		return LisCmGbOrgInfoKey;
	}

	public void setLisCmGbOrgInfoKey(LisCmGbOrgInfoKey lisCmGbOrgInfoKey) {
		LisCmGbOrgInfoKey = lisCmGbOrgInfoKey;
	}

	public String getCb_type() {
		return cb_type;
	}

	public void setCb_type(String cb_type) {
		this.cb_type = cb_type;
	}

	public String getCo_lim_fg_gs() {
		return co_lim_fg_gs;
	}

	public void setCo_lim_fg_gs(String co_lim_fg_gs) {
		this.co_lim_fg_gs = co_lim_fg_gs;
	}

	public String getClpo_lim_fg_gs() {
		return clpo_lim_fg_gs;
	}

	public void setClpo_lim_fg_gs(String clpo_lim_fg_gs) {
		this.clpo_lim_fg_gs = clpo_lim_fg_gs;
	}

	public String getElse_lim_dom_fg_gs() {
		return else_lim_dom_fg_gs;
	}

	public void setElse_lim_dom_fg_gs(String else_lim_dom_fg_gs) {
		this.else_lim_dom_fg_gs = else_lim_dom_fg_gs;
	}

	public String getDom_lpo_lim_fg_gs() {
		return dom_lpo_lim_fg_gs;
	}

	public void setDom_lpo_lim_fg_gs(String dom_lpo_lim_fg_gs) {
		this.dom_lpo_lim_fg_gs = dom_lpo_lim_fg_gs;
	}

	public String getDom_npo_lim_fg_gs() {
		return dom_npo_lim_fg_gs;
	}

	public void setDom_npo_lim_fg_gs(String dom_npo_lim_fg_gs) {
		this.dom_npo_lim_fg_gs = dom_npo_lim_fg_gs;
	}

	public String getLim_fi_fg_gs() {
		return lim_fi_fg_gs;
	}

	public void setLim_fi_fg_gs(String lim_fi_fg_gs) {
		this.lim_fi_fg_gs = lim_fi_fg_gs;
	}

	public String getOver_lpo_lim_fg_gs() {
		return over_lpo_lim_fg_gs;
	}

	public void setOver_lpo_lim_fg_gs(String over_lpo_lim_fg_gs) {
		this.over_lpo_lim_fg_gs = over_lpo_lim_fg_gs;
	}

	public String getOver_npo_lim_fg_gs() {
		return over_npo_lim_fg_gs;
	}

	public void setOver_npo_lim_fg_gs(String over_npo_lim_fg_gs) {
		this.over_npo_lim_fg_gs = over_npo_lim_fg_gs;
	}

	public String getElse_lim_fg_gs() {
		return else_lim_fg_gs;
	}

	public void setElse_lim_fg_gs(String else_lim_fg_gs) {
		this.else_lim_fg_gs = else_lim_fg_gs;
	}

	public String getLim_fg_gs() {
		return lim_fg_gs;
	}

	public void setLim_fg_gs(String lim_fg_gs) {
		this.lim_fg_gs = lim_fg_gs;
	}

	public String getUnlim_rmb_gg_gs() {
		return unlim_rmb_gg_gs;
	}

	public void setUnlim_rmb_gg_gs(String unlim_rmb_gg_gs) {
		this.unlim_rmb_gg_gs = unlim_rmb_gg_gs;
	}

	public String getUnlim_dom_lis_fi_gs() {
		return unlim_dom_lis_fi_gs;
	}

	public void setUnlim_dom_lis_fi_gs(String unlim_dom_lis_fi_gs) {
		this.unlim_dom_lis_fi_gs = unlim_dom_lis_fi_gs;
	}

	public String getUnlim_over_lis_fi_gs() {
		return unlim_over_lis_fi_gs;
	}

	public void setUnlim_over_lis_fi_gs(String unlim_over_lis_fi_gs) {
		this.unlim_over_lis_fi_gs = unlim_over_lis_fi_gs;
	}

	public String getElse_unlin_lis_fg_gs() {
		return else_unlin_lis_fg_gs;
	}

	public void setElse_unlin_lis_fg_gs(String else_unlin_lis_fg_gs) {
		this.else_unlin_lis_fg_gs = else_unlin_lis_fg_gs;
	}

	public String getUnlim_fg_total() {
		return unlim_fg_total;
	}

	public void setUnlim_fg_total(String unlim_fg_total) {
		this.unlim_fg_total = unlim_fg_total;
	}

	public String getGf_total() {
		return gf_total;
	}

	public void setGf_total(String gf_total) {
		this.gf_total = gf_total;
	}

	public String getCo_lim_fg_rtotal() {
		return co_lim_fg_rtotal;
	}

	public void setCo_lim_fg_rtotal(String co_lim_fg_rtotal) {
		this.co_lim_fg_rtotal = co_lim_fg_rtotal;
	}

	public String getClpo_lim_fg_rtotal() {
		return clpo_lim_fg_rtotal;
	}

	public void setClpo_lim_fg_rtotal(String clpo_lim_fg_rtotal) {
		this.clpo_lim_fg_rtotal = clpo_lim_fg_rtotal;
	}

	public String getElse_lim_dom_fg_rtotal() {
		return else_lim_dom_fg_rtotal;
	}

	public void setElse_lim_dom_fg_rtotal(String else_lim_dom_fg_rtotal) {
		this.else_lim_dom_fg_rtotal = else_lim_dom_fg_rtotal;
	}

	public String getDom_lpo_lim_fg_rtotal() {
		return dom_lpo_lim_fg_rtotal;
	}

	public void setDom_lpo_lim_fg_rtotal(String dom_lpo_lim_fg_rtotal) {
		this.dom_lpo_lim_fg_rtotal = dom_lpo_lim_fg_rtotal;
	}

	public String getDom_npo_lim_fg_rtotal() {
		return dom_npo_lim_fg_rtotal;
	}

	public void setDom_npo_lim_fg_rtotal(String dom_npo_lim_fg_rtotal) {
		this.dom_npo_lim_fg_rtotal = dom_npo_lim_fg_rtotal;
	}

	public String getLim_fi_fg_rtotal() {
		return lim_fi_fg_rtotal;
	}

	public void setLim_fi_fg_rtotal(String lim_fi_fg_rtotal) {
		this.lim_fi_fg_rtotal = lim_fi_fg_rtotal;
	}

	public String getOver_lpo_lim_fg_rtotal() {
		return over_lpo_lim_fg_rtotal;
	}

	public void setOver_lpo_lim_fg_rtotal(String over_lpo_lim_fg_rtotal) {
		this.over_lpo_lim_fg_rtotal = over_lpo_lim_fg_rtotal;
	}

	public String getOver_npo_lim_fg_rtotal() {
		return over_npo_lim_fg_rtotal;
	}

	public void setOver_npo_lim_fg_rtotal(String over_npo_lim_fg_rtotal) {
		this.over_npo_lim_fg_rtotal = over_npo_lim_fg_rtotal;
	}

	public String getElse_lim_fg_rtotal() {
		return else_lim_fg_rtotal;
	}

	public void setElse_lim_fg_rtotal(String else_lim_fg_rtotal) {
		this.else_lim_fg_rtotal = else_lim_fg_rtotal;
	}

	public String getLim_fg_rtotal() {
		return lim_fg_rtotal;
	}

	public void setLim_fg_rtotal(String lim_fg_rtotal) {
		this.lim_fg_rtotal = lim_fg_rtotal;
	}

	public String getUnlim_rmb_gg_rtotal() {
		return unlim_rmb_gg_rtotal;
	}

	public void setUnlim_rmb_gg_rtotal(String unlim_rmb_gg_rtotal) {
		this.unlim_rmb_gg_rtotal = unlim_rmb_gg_rtotal;
	}

	public String getUnlim_dom_lis_fi_rtotal() {
		return unlim_dom_lis_fi_rtotal;
	}

	public void setUnlim_dom_lis_fi_rtotal(String unlim_dom_lis_fi_rtotal) {
		this.unlim_dom_lis_fi_rtotal = unlim_dom_lis_fi_rtotal;
	}

	public String getUnlim_over_lis_fi_rtotal() {
		return unlim_over_lis_fi_rtotal;
	}

	public void setUnlim_over_lis_fi_rtotal(String unlim_over_lis_fi_rtotal) {
		this.unlim_over_lis_fi_rtotal = unlim_over_lis_fi_rtotal;
	}

	public String getElse_unlim_lis_fg_rtotal() {
		return else_unlim_lis_fg_rtotal;
	}

	public void setElse_unlim_lis_fg_rtotal(String else_unlim_lis_fg_rtotal) {
		this.else_unlim_lis_fg_rtotal = else_unlim_lis_fg_rtotal;
	}

	public String getUnlim_fg_rtotal() {
		return unlim_fg_rtotal;
	}

	public void setUnlim_fg_rtotal(String unlim_fg_rtotal) {
		this.unlim_fg_rtotal = unlim_fg_rtotal;
	}

	public String getGf_total_rtotal() {
		return gf_total_rtotal;
	}

	public void setGf_total_rtotal(String gf_total_rtotal) {
		this.gf_total_rtotal = gf_total_rtotal;
	}

	
	
}
