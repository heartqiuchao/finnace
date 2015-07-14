package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orm.hushen.key.LisCmCbBiInfoKey;

@SuppressWarnings("serial")
@Entity
@Table(name = "LIS_CM_CB_BI", schema = "FINANCE")
public class LisCmCbBiInfo implements Serializable {

	@Id
	LisCmCbBiInfoKey LisCmCbBiInfoKey;

	@Column(name = "CB_TYPE", length = 20)
	private String cb_type;

	@Column(name = "BG_FINAL_GD_TOTAL", length = 20)
	private String bg_final_gd_total;

	@Column(name = "M10_SH_GS", length = 20)
	private String mt_sh_gs;

	@Column(name = "M10_DIV", length = 20)
	private String mt_div;

	@Column(name = "M10_ZGS", length = 20)
	private String mt_zgs;

	@Column(name = "BQ_YY_INC", length = 20)
	private String bq_yy_inc;

	@Column(name = "BQ_YY_PRO", length = 20)
	private String bq_yy_pro;

	@Column(name = "PROFIT_TOTAL", length = 20)
	private String profit_total;

	@Column(name = "OWN_MAR_CM_GD_NPRO", length = 20)
	private String own_mar_cm_gd_npro;

	@Column(name = "OWN_MAR_CM_GD_DBL_NPRO", length = 20)
	private String own_mar_cm_gd_dbl_npro;

	@Column(name = "ACT_CF_NET", length = 20)
	private String act_cf_net;

	@Column(name = "ASS_TOTAL", length = 20)
	private String ass_total;

	@Column(name = "GD_RIG", length = 20)
	private String gd_rig;

	@Column(name = "BASE_M1_INC", length = 20)
	private String base_mo_inc;

	@Column(name = "DIL_M1_INC", length = 20)
	private String dil_mo_inc;

	@Column(name = "DUBL_BASE_M1_INC", length = 20)
	private String dubl_base_mo_inc;

	@Column(name = "FD_NASS_INCR", length = 20)
	private String fd_nass_incr;

	@Column(name = "WA_NASS_INCR", length = 20)
	private String wa_nass_incr;

	@Column(name = "DUBL_FD_NASS_INCR", length = 20)
	private String dubl_fd_nass_incr;

	@Column(name = "DUBL_WA_NASS_INCR", length = 20)
	private String dubl_wa_nass_incr;

	@Column(name = "M1_ACT_CF_NET", length = 20)
	private String mo_act_cf_net;

	@Column(name = "OWN_LIS_M1_NASS", length = 20)
	private String own_lts_mo_nass;

	public LisCmCbBiInfoKey getLisCmCbBiInfoKey() {
		return LisCmCbBiInfoKey;
	}

	public void setLisCmCbBiInfoKey(LisCmCbBiInfoKey lisCmCbBiInfoKey) {
		LisCmCbBiInfoKey = lisCmCbBiInfoKey;
	}

	public String getCb_type() {
		return cb_type;
	}

	public void setCb_type(String cb_type) {
		this.cb_type = cb_type;
	}

	public String getBg_final_gd_total() {
		return bg_final_gd_total;
	}

	public void setBg_final_gd_total(String bg_final_gd_total) {
		this.bg_final_gd_total = bg_final_gd_total;
	}

	public String getMt_sh_gs() {
		return mt_sh_gs;
	}

	public void setMt_sh_gs(String mt_sh_gs) {
		this.mt_sh_gs = mt_sh_gs;
	}

	public String getMt_div() {
		return mt_div;
	}

	public void setMt_div(String mt_div) {
		this.mt_div = mt_div;
	}

	public String getMt_zgs() {
		return mt_zgs;
	}

	public void setMt_zgs(String mt_zgs) {
		this.mt_zgs = mt_zgs;
	}

	public String getBq_yy_inc() {
		return bq_yy_inc;
	}

	public void setBq_yy_inc(String bq_yy_inc) {
		this.bq_yy_inc = bq_yy_inc;
	}

	public String getBq_yy_pro() {
		return bq_yy_pro;
	}

	public void setBq_yy_pro(String bq_yy_pro) {
		this.bq_yy_pro = bq_yy_pro;
	}

	public String getProfit_total() {
		return profit_total;
	}

	public void setProfit_total(String profit_total) {
		this.profit_total = profit_total;
	}

	public String getOwn_mar_cm_gd_npro() {
		return own_mar_cm_gd_npro;
	}

	public void setOwn_mar_cm_gd_npro(String own_mar_cm_gd_npro) {
		this.own_mar_cm_gd_npro = own_mar_cm_gd_npro;
	}

	public String getOwn_mar_cm_gd_dbl_npro() {
		return own_mar_cm_gd_dbl_npro;
	}

	public void setOwn_mar_cm_gd_dbl_npro(String own_mar_cm_gd_dbl_npro) {
		this.own_mar_cm_gd_dbl_npro = own_mar_cm_gd_dbl_npro;
	}

	public String getAct_cf_net() {
		return act_cf_net;
	}

	public void setAct_cf_net(String act_cf_net) {
		this.act_cf_net = act_cf_net;
	}

	public String getAss_total() {
		return ass_total;
	}

	public void setAss_total(String ass_total) {
		this.ass_total = ass_total;
	}

	public String getGd_rig() {
		return gd_rig;
	}

	public void setGd_rig(String gd_rig) {
		this.gd_rig = gd_rig;
	}

	public String getBase_mo_inc() {
		return base_mo_inc;
	}

	public void setBase_mo_inc(String base_mo_inc) {
		this.base_mo_inc = base_mo_inc;
	}

	public String getDil_mo_inc() {
		return dil_mo_inc;
	}

	public void setDil_mo_inc(String dil_mo_inc) {
		this.dil_mo_inc = dil_mo_inc;
	}

	public String getDubl_base_mo_inc() {
		return dubl_base_mo_inc;
	}

	public void setDubl_base_mo_inc(String dubl_base_mo_inc) {
		this.dubl_base_mo_inc = dubl_base_mo_inc;
	}

	public String getFd_nass_incr() {
		return fd_nass_incr;
	}

	public void setFd_nass_incr(String fd_nass_incr) {
		this.fd_nass_incr = fd_nass_incr;
	}

	public String getWa_nass_incr() {
		return wa_nass_incr;
	}

	public void setWa_nass_incr(String wa_nass_incr) {
		this.wa_nass_incr = wa_nass_incr;
	}

	public String getDubl_fd_nass_incr() {
		return dubl_fd_nass_incr;
	}

	public void setDubl_fd_nass_incr(String dubl_fd_nass_incr) {
		this.dubl_fd_nass_incr = dubl_fd_nass_incr;
	}

	public String getDubl_wa_nass_incr() {
		return dubl_wa_nass_incr;
	}

	public void setDubl_wa_nass_incr(String dubl_wa_nass_incr) {
		this.dubl_wa_nass_incr = dubl_wa_nass_incr;
	}

	public String getMo_act_cf_net() {
		return mo_act_cf_net;
	}

	public void setMo_act_cf_net(String mo_act_cf_net) {
		this.mo_act_cf_net = mo_act_cf_net;
	}

	public String getOwn_lts_mo_nass() {
		return own_lts_mo_nass;
	}

	public void setOwn_lts_mo_nass(String own_lts_mo_nass) {
		this.own_lts_mo_nass = own_lts_mo_nass;
	}

}
