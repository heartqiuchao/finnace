package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orm.hushen.key.LisCmCfInfoKey;

@SuppressWarnings("serial")
@Entity
@Table(name = "LIS_CM_CF", schema = "FINANCE")
public class LisCmCfInfo implements Serializable {

	@Id
	LisCmCfInfoKey LisCmCfInfoKey;

	@Column(name = "CB_TYPE", length = 20)
	private String cb_type;

	@Column(name = "SALE_PC_CASH", length = 20)
	private String sale_pc_cash;

	@Column(name = "CD_IND_NI", length = 20)
	private String cd_ind_ni;

	@Column(name = "BCB_NI", length = 20)
	private String bcb_ni;

	@Column(name = "LFOB_NI_ELSE", length = 20)
	private String lfob_ni_else;

	@Column(name = "OIC_PREM_CASH", length = 20)
	private String oic_prem_cash;

	@Column(name = "RB_CASH_NET", length = 20)
	private String rb_cash_net;

	@Column(name = "INSD_INV_NI", length = 20)
	private String insd_inv_ni;

	@Column(name = "TRA_FIN_ASS_NI", length = 20)
	private String tra_fin_ass_ni;

	@Column(name = "INTE_FC_CASH_GET", length = 20)
	private String inte_fc_cash_get;

	@Column(name = "LFOB_NI", length = 20)
	private String lfob_ni;

	@Column(name = "RO_ASS_NI", length = 20)
	private String ro_ass_ni;

	@Column(name = "TAX_REF_GET", length = 20)
	private String tax_ref_get;

	@Column(name = "ACT_CASH_ELSE_GET", length = 20)
	private String act_cash_else_get;

	@Column(name = "ACT_CASH_INF_TOTAL", length = 20)
	private String act_cash_inf_total;

	@Column(name = "PAS_CASH", length = 20)
	private String pas_cash;

	@Column(name = "LOAN_ADV_NI", length = 20)
	private String loan_adv_ni;

	@Column(name = "CB_IND_NI", length = 20)
	private String cb_ind_ni;

	@Column(name = "PAY_OIC_CP_CASH", length = 20)
	private String pay_oic_cp_cash;

	@Column(name = "PAY_INTE_FC_CASH", length = 20)
	private String pay_inte_fc_cash;

	@Column(name = "PAY_BD_BONUS_CASH", length = 20)
	private String pay_bd_bonus_cash;

	@Column(name = "PAY_EMP_CASH", length = 20)
	private String pay_emp_cash;

	@Column(name = "PAY_TAX", length = 20)
	private String pay_tax;

	@Column(name = "PAY_ACT_CASH", length = 20)
	private String pay_act_cash;

	@Column(name = "ACT_CASH_TOTAL", length = 20)
	private String act_cash_out_total;

	@Column(name = "ACT_CASH_NET", length = 20)
	private String act_cash_net;

	@Column(name = "INV_CASH_GET", length = 20)
	private String inv_cash_get;

	@Column(name = "INV_INC_CASH_GET", length = 20)
	private String inv_inc_cash_get;

	@Column(name = "FIX_INTA_LONG_ASS_CASH_ELSE_GET", length = 20)
	private String fix_inta_else_long_ass_cash_get;

	@Column(name = "SALE_SUB_CM_CASH_GET", length = 20)
	private String sale_sub_cm_cash_get;

	@Column(name = "INV_CASH_ELSE_GET", length = 20)
	private String inv_cash_else_get;

	@Column(name = "INV_CASH_INF_TOTAL", length = 20)
	private String inv_cash_inf_total;

	@Column(name = "PAY_FIX_INTA_LONG_ASS_CASH_ELSE", length = 20)
	private String pay_fix_inta_long_ass_cash_else;

	@Column(name = "PAY_INV_CASH", length = 20)
	private String pay_inv_cash;

	@Column(name = "PLE_LOAN_NI", length = 20)
	private String ple_loan_ni;

	@Column(name = "SUB_CM_CASH_NET_GET", length = 20)
	private String sub_cm_cash_net_get;

	@Column(name = "PAY_INV_CASH_ELSE", length = 20)
	private String pay_inv_cash_else;

	@Column(name = "INV_CASH_TOTAL", length = 20)
	private String inv_cash_total;

	@Column(name = "INV_CASH_NET", length = 20)
	private String inv_cash_net;

	@Column(name = "ADM_INV_GET_CASH", length = 20)
	private String adm_inv_cash_get;

	@Column(name = "ADM_SUB_CM_MIN_GD_INV_CASH", length = 20)
	private String adm_sub_cm_min_gd_inv_cash;

	@Column(name = "LOAN_CASH_GET", length = 20)
	private String loan_cash_get;

	@Column(name = "BOND_CASH_GET", length = 20)
	private String bond_cash_get;

	@Column(name = "FIA_CASH_ELSE_GET", length = 20)
	private String fia_cash_else_get;

	@Column(name = "FIA_CASH-INF_TOTAL", length = 20)
	private String fia_cash_inf_total;

	@Column(name = "PAY_DEB_CASH", length = 20)
	private String pay_deb_cash;

	@Column(name = "PAY_GL_PRO_INTE_CASH", length = 20)
	private String pay_gl_pro_inte_cash;

	@Column(name = "PAY_MIN_GD_GL", length = 20)
	private String pay_min_gd_gl;

	@Column(name = "PAY_FIA_CASH_ELSE", length = 20)
	private String pay_fia_cash_else;

	@Column(name = "FIA_CASH_OUT_TOTAL", length = 20)
	private String fia_cash_out_total;

	@Column(name = "FIA_CASH_NET", length = 20)
	private String fia_cash_net;

	@Column(name = "EFFECT", length = 20)
	private String effect;

	@Column(name = "CASH_NI", length = 20)
	private String cash_ni;

	@Column(name = "CASH_BAL", length = 20)
	private String cash_bal;

	public LisCmCfInfoKey getLisCmCfInfoKey() {
		return LisCmCfInfoKey;
	}

	public void setLisCmCfInfoKey(LisCmCfInfoKey lisCmCfInfoKey) {
		LisCmCfInfoKey = lisCmCfInfoKey;
	}

	public String getCb_type() {
		return cb_type;
	}

	public void setCb_type(String cb_type) {
		this.cb_type = cb_type;
	}

	public String getSale_pc_cash() {
		return sale_pc_cash;
	}

	public void setSale_pc_cash(String sale_pc_cash) {
		this.sale_pc_cash = sale_pc_cash;
	}

	public String getCd_ind_ni() {
		return cd_ind_ni;
	}

	public void setCd_ind_ni(String cd_ind_ni) {
		this.cd_ind_ni = cd_ind_ni;
	}

	public String getBcb_ni() {
		return bcb_ni;
	}

	public void setBcb_ni(String bcb_ni) {
		this.bcb_ni = bcb_ni;
	}

	public String getLfob_ni_else() {
		return lfob_ni_else;
	}

	public void setLfob_ni_else(String lfob_ni_else) {
		this.lfob_ni_else = lfob_ni_else;
	}

	public String getOic_prem_cash() {
		return oic_prem_cash;
	}

	public void setOic_prem_cash(String oic_prem_cash) {
		this.oic_prem_cash = oic_prem_cash;
	}

	public String getRb_cash_net() {
		return rb_cash_net;
	}

	public void setRb_cash_net(String rb_cash_net) {
		this.rb_cash_net = rb_cash_net;
	}

	public String getInsd_inv_ni() {
		return insd_inv_ni;
	}

	public void setInsd_inv_ni(String insd_inv_ni) {
		this.insd_inv_ni = insd_inv_ni;
	}

	public String getTra_fin_ass_ni() {
		return tra_fin_ass_ni;
	}

	public void setTra_fin_ass_ni(String tra_fin_ass_ni) {
		this.tra_fin_ass_ni = tra_fin_ass_ni;
	}

	public String getInte_fc_cash_get() {
		return inte_fc_cash_get;
	}

	public void setInte_fc_cash_get(String inte_fc_cash_get) {
		this.inte_fc_cash_get = inte_fc_cash_get;
	}

	public String getLfob_ni() {
		return lfob_ni;
	}

	public void setLfob_ni(String lfob_ni) {
		this.lfob_ni = lfob_ni;
	}

	public String getRo_ass_ni() {
		return ro_ass_ni;
	}

	public void setRo_ass_ni(String ro_ass_ni) {
		this.ro_ass_ni = ro_ass_ni;
	}

	public String getTax_ref_get() {
		return tax_ref_get;
	}

	public void setTax_ref_get(String tax_ref_get) {
		this.tax_ref_get = tax_ref_get;
	}

	public String getAct_cash_else_get() {
		return act_cash_else_get;
	}

	public void setAct_cash_else_get(String act_cash_else_get) {
		this.act_cash_else_get = act_cash_else_get;
	}

	public String getAct_cash_inf_total() {
		return act_cash_inf_total;
	}

	public void setAct_cash_inf_total(String act_cash_inf_total) {
		this.act_cash_inf_total = act_cash_inf_total;
	}

	public String getPas_cash() {
		return pas_cash;
	}

	public void setPas_cash(String pas_cash) {
		this.pas_cash = pas_cash;
	}

	public String getLoan_adv_ni() {
		return loan_adv_ni;
	}

	public void setLoan_adv_ni(String loan_adv_ni) {
		this.loan_adv_ni = loan_adv_ni;
	}

	public String getCb_ind_ni() {
		return cb_ind_ni;
	}

	public void setCb_ind_ni(String cb_ind_ni) {
		this.cb_ind_ni = cb_ind_ni;
	}

	public String getPay_oic_cp_cash() {
		return pay_oic_cp_cash;
	}

	public void setPay_oic_cp_cash(String pay_oic_cp_cash) {
		this.pay_oic_cp_cash = pay_oic_cp_cash;
	}

	public String getPay_inte_fc_cash() {
		return pay_inte_fc_cash;
	}

	public void setPay_inte_fc_cash(String pay_inte_fc_cash) {
		this.pay_inte_fc_cash = pay_inte_fc_cash;
	}

	public String getPay_bd_bonus_cash() {
		return pay_bd_bonus_cash;
	}

	public void setPay_bd_bonus_cash(String pay_bd_bonus_cash) {
		this.pay_bd_bonus_cash = pay_bd_bonus_cash;
	}

	public String getPay_emp_cash() {
		return pay_emp_cash;
	}

	public void setPay_emp_cash(String pay_emp_cash) {
		this.pay_emp_cash = pay_emp_cash;
	}

	public String getPay_tax() {
		return pay_tax;
	}

	public void setPay_tax(String pay_tax) {
		this.pay_tax = pay_tax;
	}

	public String getPay_act_cash() {
		return pay_act_cash;
	}

	public void setPay_act_cash(String pay_act_cash) {
		this.pay_act_cash = pay_act_cash;
	}

	public String getAct_cash_out_total() {
		return act_cash_out_total;
	}

	public void setAct_cash_out_total(String act_cash_out_total) {
		this.act_cash_out_total = act_cash_out_total;
	}

	public String getAct_cash_net() {
		return act_cash_net;
	}

	public void setAct_cash_net(String act_cash_net) {
		this.act_cash_net = act_cash_net;
	}

	public String getInv_cash_get() {
		return inv_cash_get;
	}

	public void setInv_cash_get(String inv_cash_get) {
		this.inv_cash_get = inv_cash_get;
	}

	public String getInv_inc_cash_get() {
		return inv_inc_cash_get;
	}

	public void setInv_inc_cash_get(String inv_inc_cash_get) {
		this.inv_inc_cash_get = inv_inc_cash_get;
	}

	public String getFix_inta_else_long_ass_cash_get() {
		return fix_inta_else_long_ass_cash_get;
	}

	public void setFix_inta_else_long_ass_cash_get(
			String fix_inta_else_long_ass_cash_get) {
		this.fix_inta_else_long_ass_cash_get = fix_inta_else_long_ass_cash_get;
	}

	public String getSale_sub_cm_cash_get() {
		return sale_sub_cm_cash_get;
	}

	public void setSale_sub_cm_cash_get(String sale_sub_cm_cash_get) {
		this.sale_sub_cm_cash_get = sale_sub_cm_cash_get;
	}

	public String getInv_cash_else_get() {
		return inv_cash_else_get;
	}

	public void setInv_cash_else_get(String inv_cash_else_get) {
		this.inv_cash_else_get = inv_cash_else_get;
	}

	public String getInv_cash_inf_total() {
		return inv_cash_inf_total;
	}

	public void setInv_cash_inf_total(String inv_cash_inf_total) {
		this.inv_cash_inf_total = inv_cash_inf_total;
	}

	public String getPay_fix_inta_long_ass_cash_else() {
		return pay_fix_inta_long_ass_cash_else;
	}

	public void setPay_fix_inta_long_ass_cash_else(
			String pay_fix_inta_long_ass_cash_else) {
		this.pay_fix_inta_long_ass_cash_else = pay_fix_inta_long_ass_cash_else;
	}

	public String getPay_inv_cash() {
		return pay_inv_cash;
	}

	public void setPay_inv_cash(String pay_inv_cash) {
		this.pay_inv_cash = pay_inv_cash;
	}

	public String getPle_loan_ni() {
		return ple_loan_ni;
	}

	public void setPle_loan_ni(String ple_loan_ni) {
		this.ple_loan_ni = ple_loan_ni;
	}

	public String getSub_cm_cash_net_get() {
		return sub_cm_cash_net_get;
	}

	public void setSub_cm_cash_net_get(String sub_cm_cash_net_get) {
		this.sub_cm_cash_net_get = sub_cm_cash_net_get;
	}

	public String getPay_inv_cash_else() {
		return pay_inv_cash_else;
	}

	public void setPay_inv_cash_else(String pay_inv_cash_else) {
		this.pay_inv_cash_else = pay_inv_cash_else;
	}

	public String getInv_cash_total() {
		return inv_cash_total;
	}

	public void setInv_cash_total(String inv_cash_total) {
		this.inv_cash_total = inv_cash_total;
	}

	public String getInv_cash_net() {
		return inv_cash_net;
	}

	public void setInv_cash_net(String inv_cash_net) {
		this.inv_cash_net = inv_cash_net;
	}

	public String getAdm_inv_cash_get() {
		return adm_inv_cash_get;
	}

	public void setAdm_inv_cash_get(String adm_inv_cash_get) {
		this.adm_inv_cash_get = adm_inv_cash_get;
	}

	public String getAdm_sub_cm_min_gd_inv_cash() {
		return adm_sub_cm_min_gd_inv_cash;
	}

	public void setAdm_sub_cm_min_gd_inv_cash(String adm_sub_cm_min_gd_inv_cash) {
		this.adm_sub_cm_min_gd_inv_cash = adm_sub_cm_min_gd_inv_cash;
	}

	public String getLoan_cash_get() {
		return loan_cash_get;
	}

	public void setLoan_cash_get(String loan_cash_get) {
		this.loan_cash_get = loan_cash_get;
	}

	public String getBond_cash_get() {
		return bond_cash_get;
	}

	public void setBond_cash_get(String bond_cash_get) {
		this.bond_cash_get = bond_cash_get;
	}

	public String getFia_cash_else_get() {
		return fia_cash_else_get;
	}

	public void setFia_cash_else_get(String fia_cash_else_get) {
		this.fia_cash_else_get = fia_cash_else_get;
	}

	public String getFia_cash_inf_total() {
		return fia_cash_inf_total;
	}

	public void setFia_cash_inf_total(String fia_cash_inf_total) {
		this.fia_cash_inf_total = fia_cash_inf_total;
	}

	public String getPay_deb_cash() {
		return pay_deb_cash;
	}

	public void setPay_deb_cash(String pay_deb_cash) {
		this.pay_deb_cash = pay_deb_cash;
	}

	public String getPay_gl_pro_inte_cash() {
		return pay_gl_pro_inte_cash;
	}

	public void setPay_gl_pro_inte_cash(String pay_gl_pro_inte_cash) {
		this.pay_gl_pro_inte_cash = pay_gl_pro_inte_cash;
	}

	public String getPay_min_gd_gl() {
		return pay_min_gd_gl;
	}

	public void setPay_min_gd_gl(String pay_min_gd_gl) {
		this.pay_min_gd_gl = pay_min_gd_gl;
	}

	public String getPay_fia_cash_else() {
		return pay_fia_cash_else;
	}

	public void setPay_fia_cash_else(String pay_fia_cash_else) {
		this.pay_fia_cash_else = pay_fia_cash_else;
	}

	public String getFia_cash_out_total() {
		return fia_cash_out_total;
	}

	public void setFia_cash_out_total(String fia_cash_out_total) {
		this.fia_cash_out_total = fia_cash_out_total;
	}

	public String getFia_cash_net() {
		return fia_cash_net;
	}

	public void setFia_cash_net(String fia_cash_net) {
		this.fia_cash_net = fia_cash_net;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getCash_ni() {
		return cash_ni;
	}

	public void setCash_ni(String cash_ni) {
		this.cash_ni = cash_ni;
	}

	public String getCash_bal() {
		return cash_bal;
	}

	public void setCash_bal(String cash_bal) {
		this.cash_bal = cash_bal;
	}

}
