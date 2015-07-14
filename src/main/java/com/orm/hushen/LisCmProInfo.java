package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orm.hushen.key.LisCmProInfoKey;

@SuppressWarnings("serial")
@Entity
@Table(name = "LIS_CM_PRO", schema = "FINANCE")
public class LisCmProInfo implements Serializable {

	@Id
	private LisCmProInfoKey LisCmProInfoKey;

	@Column(name = "CB_TYPE", length = 20)
	private String cb_type;

	@Column(name = "YY_INC_TOTAL", length = 20)
	private String yy_inc_total;

	@Column(name = "YY_INC", length = 20)
	private String yy_inc;

	@Column(name = "FA_INTE_INC", length = 20)
	private String fa_inte_inc;

	@Column(name = "PREM_GET", length = 20)
	private String prem_get;

	@Column(name = "FC_INC", length = 20)
	private String fc_inc;

	@Column(name = "YY_COST_TOTAL", length = 20)
	private String yy_cost_total;

	@Column(name = "YY_COST", length = 20)
	private String yy_cost;

	@Column(name = "FA_INTE_EXP", length = 20)
	private String fa_inte_exp;

	@Column(name = "FC_EXP", length = 20)
	private String fc_exp;

	@Column(name = "SUR", length = 20)
	private String sur;

	@Column(name = "CP_EXP_NET", length = 20)
	private String cp_exp_net;

	@Column(name = "ICR_NET", length = 20)
	private String icr_net;

	@Column(name = "BD_BONUS_EXP", length = 20)
	private String bd_bonus_exp;

	@Column(name = "REI_EXP", length = 20)
	private String rei_exp;

	@Column(name = "BTS", length = 20)
	private String bts;

	@Column(name = "SALE_EXP", length = 20)
	private String sale_exp;

	@Column(name = "MANAGE_EXP", length = 20)
	private String manage_exp;

	@Column(name = "FIN_EXP", length = 20)
	private String fin_exp;

	@Column(name = "AIL", length = 20)
	private String ail;

	@Column(name = "FVC_INC", length = 20)
	private String fvc_inc;

	@Column(name = "INV_INC", length = 20)
	private String inv_inc;

	@Column(name = "JOE_JV_INV_INC", length = 20)
	private String joe_jv_inv_inc;

	@Column(name = "EXC_INC", length = 20)
	private String exc_inc;

	@Column(name = "YY_PRO", length = 20)
	private String yy_pro;

	@Column(name = "NB_INC", length = 20)
	private String nb_inc;

	@Column(name = "NB_EXP", length = 20)
	private String nb_exp;

	@Column(name = "NFA_NET_LOSS", length = 20)
	private String nfa_net_loss;

	@Column(name = "POR_TOTAL", length = 20)
	private String por_total;

	@Column(name = "IT", length = 20)
	private String it;

	@Column(name = "NET_PRO", length = 20)
	private String net_pro;

	@Column(name = "ATOOTP_NET_PRO", length = 20)
	private String atootp_net_pro;

	@Column(name = "MIN_GD_II", length = 20)
	private String min_gd_ii;

	@Column(name = "BASE_MO_INC", length = 20)
	private String base_mo_inc;

	@Column(name = "DIL_MO_INC", length = 20)
	private String dil_mo_inc;

	public LisCmProInfoKey getLisCmProInfoKey() {
		return LisCmProInfoKey;
	}

	public void setLisCmProInfoKey(LisCmProInfoKey lisCmProInfoKey) {
		LisCmProInfoKey = lisCmProInfoKey;
	}

	public String getCb_type() {
		return cb_type;
	}

	public void setCb_type(String cb_type) {
		this.cb_type = cb_type;
	}

	public String getYy_inc_total() {
		return yy_inc_total;
	}

	public void setYy_inc_total(String yy_inc_total) {
		this.yy_inc_total = yy_inc_total;
	}

	public String getYy_inc() {
		return yy_inc;
	}

	public void setYy_inc(String yy_inc) {
		this.yy_inc = yy_inc;
	}

	public String getFa_inte_inc() {
		return fa_inte_inc;
	}

	public void setFa_inte_inc(String fa_inte_inc) {
		this.fa_inte_inc = fa_inte_inc;
	}

	public String getPrem_get() {
		return prem_get;
	}

	public void setPrem_get(String prem_get) {
		this.prem_get = prem_get;
	}

	public String getFc_inc() {
		return fc_inc;
	}

	public void setFc_inc(String fc_inc) {
		this.fc_inc = fc_inc;
	}

	public String getYy_cost_total() {
		return yy_cost_total;
	}

	public void setYy_cost_total(String yy_cost_total) {
		this.yy_cost_total = yy_cost_total;
	}

	public String getYy_cost() {
		return yy_cost;
	}

	public void setYy_cost(String yy_cost) {
		this.yy_cost = yy_cost;
	}

	public String getFa_inte_exp() {
		return fa_inte_exp;
	}

	public void setFa_inte_exp(String fa_inte_exp) {
		this.fa_inte_exp = fa_inte_exp;
	}

	public String getFc_exp() {
		return fc_exp;
	}

	public void setFc_exp(String fc_exp) {
		this.fc_exp = fc_exp;
	}

	public String getSur() {
		return sur;
	}

	public void setSur(String sur) {
		this.sur = sur;
	}

	public String getCp_exp_net() {
		return cp_exp_net;
	}

	public void setCp_exp_net(String cp_exp_net) {
		this.cp_exp_net = cp_exp_net;
	}

	public String getIcr_net() {
		return icr_net;
	}

	public void setIcr_net(String icr_net) {
		this.icr_net = icr_net;
	}

	public String getBd_bonus_exp() {
		return bd_bonus_exp;
	}

	public void setBd_bonus_exp(String bd_bonus_exp) {
		this.bd_bonus_exp = bd_bonus_exp;
	}

	public String getRei_exp() {
		return rei_exp;
	}

	public void setRei_exp(String rei_exp) {
		this.rei_exp = rei_exp;
	}

	public String getBts() {
		return bts;
	}

	public void setBts(String bts) {
		this.bts = bts;
	}

	public String getSale_exp() {
		return sale_exp;
	}

	public void setSale_exp(String sale_exp) {
		this.sale_exp = sale_exp;
	}

	public String getManage_exp() {
		return manage_exp;
	}

	public void setManage_exp(String manage_exp) {
		this.manage_exp = manage_exp;
	}

	public String getFin_exp() {
		return fin_exp;
	}

	public void setFin_exp(String fin_exp) {
		this.fin_exp = fin_exp;
	}

	public String getAil() {
		return ail;
	}

	public void setAil(String ail) {
		this.ail = ail;
	}

	public String getFvc_inc() {
		return fvc_inc;
	}

	public void setFvc_inc(String fvc_inc) {
		this.fvc_inc = fvc_inc;
	}

	public String getInv_inc() {
		return inv_inc;
	}

	public void setInv_inc(String inv_inc) {
		this.inv_inc = inv_inc;
	}

	public String getJoe_jv_inv_inc() {
		return joe_jv_inv_inc;
	}

	public void setJoe_jv_inv_inc(String joe_jv_inv_inc) {
		this.joe_jv_inv_inc = joe_jv_inv_inc;
	}

	public String getExc_inc() {
		return exc_inc;
	}

	public void setExc_inc(String exc_inc) {
		this.exc_inc = exc_inc;
	}

	public String getYy_pro() {
		return yy_pro;
	}

	public void setYy_pro(String yy_pro) {
		this.yy_pro = yy_pro;
	}

	public String getNb_inc() {
		return nb_inc;
	}

	public void setNb_inc(String nb_inc) {
		this.nb_inc = nb_inc;
	}

	public String getNb_exp() {
		return nb_exp;
	}

	public void setNb_exp(String nb_exp) {
		this.nb_exp = nb_exp;
	}

	public String getNfa_net_loss() {
		return nfa_net_loss;
	}

	public void setNfa_net_loss(String nfa_net_loss) {
		this.nfa_net_loss = nfa_net_loss;
	}

	public String getPor_total() {
		return por_total;
	}

	public void setPor_total(String por_total) {
		this.por_total = por_total;
	}

	public String getIt() {
		return it;
	}

	public void setIt(String it) {
		this.it = it;
	}

	public String getNet_pro() {
		return net_pro;
	}

	public void setNet_pro(String net_pro) {
		this.net_pro = net_pro;
	}

	public String getAtootp_net_pro() {
		return atootp_net_pro;
	}

	public void setAtootp_net_pro(String atootp_net_pro) {
		this.atootp_net_pro = atootp_net_pro;
	}

	public String getMin_gd_ii() {
		return min_gd_ii;
	}

	public void setMin_gd_ii(String min_gd_ii) {
		this.min_gd_ii = min_gd_ii;
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

}
