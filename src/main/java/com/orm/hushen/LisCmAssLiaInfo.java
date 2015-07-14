package com.orm.hushen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.orm.hushen.key.LisCmAssLiaInfoKey;

@SuppressWarnings("serial")
@Entity
@Table(name = "LIS_CM_ASS_LIA_INFO", schema = "FINANCE")
public class LisCmAssLiaInfo implements Serializable {

	@Id
	LisCmAssLiaInfoKey LisCmAssLiaInfoKey;

	@Column(name = "CB_TYPE", length = 20)
	private String cb_type;

	@Column(name = "MON_FUND", length = 20)
	private String mon_fund;

	@Column(name = "SP", length = 20)
	private String sp;

	@Column(name = "LEND_FUND", length = 20)
	private String lend_fund;

	@Column(name = "TRA_FA", length = 20)
	private String tra_fa;

	@Column(name = "REC_BILL", length = 20)
	private String rec_bill;

	@Column(name = "REC_ACC", length = 20)
	private String rec_acc;

	@Column(name = "PRE_ACC", length = 20)
	private String pre_acc;

	@Column(name = "REC_PREM", length = 20)
	private String rec_prem;

	@Column(name = "REC_REI_ACC", length = 20)
	private String rec_rei_acc;

	@Column(name = "REC_REI_CR", length = 20)
	private String rec_rei_cr;

	@Column(name = "REC_INTE", length = 20)
	private String rec_inte;

	@Column(name = "REC_GL", length = 20)
	private String rec_gl;

	@Column(name = "REC_ACC_ELSE", length = 20)
	private String rec_acc_else;

	@Column(name = "RES_FA", length = 20)
	private String res_fa;

	@Column(name = "STO", length = 20)
	private String sto;

	@Column(name = "DOY_NFA", length = 20)
	private String doy_nfa;

	@Column(name = "FA_ELSE", length = 20)
	private String fa_else;

	@Column(name = "FA_TOTAL", length = 20)
	private String fa_total;

	@Column(name = "LOAN_ADV", length = 20)
	private String loan_adv;

	@Column(name = "AFS_FA", length = 20)
	private String afs_fa;

	@Column(name = "HMI", length = 20)
	private String hmi;

	@Column(name = "LONG_REC_ACC", length = 20)
	private String long_rec_acc;

	@Column(name = "LONG_GQ_INV", length = 20)
	private String long_gq_inv;

	@Column(name = "INV_EST", length = 20)
	private String inv_est;

	@Column(name = "FIX_ASS_NET", length = 20)
	private String fix_ass_net;

	@Column(name = "CIP", length = 20)
	private String cip;

	@Column(name = "EM", length = 20)
	private String em;

	@Column(name = "FIX_ASS_CLEAR", length = 20)
	private String fix_ass_clear;

	@Column(name = "PB_ASS", length = 20)
	private String pb_ass;

	@Column(name = "OG_ASS", length = 20)
	private String og_ass;

	@Column(name = "INTA_ASS", length = 20)
	private String inta_ass;

	@Column(name = "DE", length = 20)
	private String de;

	@Column(name = "CREDIT", length = 20)
	private String credit;

	@Column(name = "LONG_PE", length = 20)
	private String long_pe;

	@Column(name = "DTA_TOTOAL", length = 20)
	private String dta_totoal;

	@Column(name = "LONG_ASS_ELSE", length = 20)
	private String long_ass_else;

	@Column(name = "NFA_ASS_TOTAL", length = 20)
	private String nfa_ass_total;

	@Column(name = "SHORT_LOAN", length = 20)
	private String short_loan;

	@Column(name = "BCB", length = 20)
	private String bcb;

	@Column(name = "DEP_IND", length = 20)
	private String dep_ind;

	@Column(name = "LFOB", length = 20)
	private String lfob;

	@Column(name = "TFL", length = 20)
	private String tfl;

	@Column(name = "PAY_BILL", length = 20)
	private String pay_bill;

	@Column(name = "PAY_ACC", length = 20)
	private String pay_acc;

	@Column(name = "AR_ACC", length = 20)
	private String ar_acc;

	@Column(name = "FASFR", length = 20)
	private String fasfr;

	@Column(name = "REC_FC", length = 20)
	private String rec_fc;

	@Column(name = "REC_EB", length = 20)
	private String rec_eb;

	@Column(name = "PAY_TAX", length = 20)
	private String pay_tax;

	@Column(name = "PAY_INTE", length = 20)
	private String pay_inte;

	@Column(name = "PAY_GL", length = 20)
	private String pay_gl;

	@Column(name = "PAY_ACC_ELSE", length = 20)
	private String pay_acc_else;

	@Column(name = "PAY_PEI_ACC", length = 20)
	private String pay_pei_acc;

	@Column(name = "ICR", length = 20)
	private String icr;

	@Column(name = "ACTI_TS", length = 20)
	private String acti_ts;

	@Column(name = "ACTI_US", length = 20)
	private String acti_us;

	@Column(name = "DOY_LONG_LIA", length = 20)
	private String doy_long_lia;

	@Column(name = "FG_LIA_ELSE", length = 20)
	private String fg_lia_else;

	@Column(name = "FG_LIA_TOTAL", length = 20)
	private String fg_lia_total;

	@Column(name = "LONG_LOAN", length = 20)
	private String long_loan;

	@Column(name = "PAY_BOND", length = 20)
	private String pay_bond;

	@Column(name = "LONG_PAY_ACC", length = 20)
	private String long_pay_acc;

	@Column(name = "SPE_PAY_ACC", length = 20)
	private String spe_pay_acc;

	@Column(name = "PRE_LIA", length = 20)
	private String pre_lia;

	@Column(name = "DTC_TOTAL", length = 20)
	private String dtc_total;

	@Column(name = "LONG_LIA_ELSE", length = 20)
	private String long_lia_else;

	@Column(name = "LONG_LIA_TOTAL", length = 20)
	private String long_lia_total;

	@Column(name = "LIA_TOTAL", length = 20)
	private String lia_total;

	@Column(name = "GB", length = 20)
	private String gb;

	@Column(name = "APIC", length = 20)
	private String apic;

	@Column(name = "TS", length = 20)
	private String ts;

	@Column(name = "FS", length = 20)
	private String fs;

	@Column(name = "GRP", length = 20)
	private String grp;

	@Column(name = "UND_PRO", length = 20)
	private String und_pro;

	@Column(name = "CDIFCS", length = 20)
	private String cdifcs;

	@Column(name = "OEATPC_TOTAL", length = 20)
	private String oeatpc_total;

	@Column(name = "MIN_SI", length = 20)
	private String min_si;

	@Column(name = "SI_TOTAL", length = 20)
	private String si_total;

	@Column(name = "LIA_SI_TOTAL", length = 20)
	private String lia_si_total;

	public LisCmAssLiaInfoKey getLisCmAssLiaInfoKey() {
		return LisCmAssLiaInfoKey;
	}

	public void setLisCmAssLiaInfoKey(LisCmAssLiaInfoKey lisCmAssLiaInfoKey) {
		LisCmAssLiaInfoKey = lisCmAssLiaInfoKey;
	}

	public String getCb_type() {
		return cb_type;
	}

	public void setCb_type(String cb_type) {
		this.cb_type = cb_type;
	}

	public String getMon_fund() {
		return mon_fund;
	}

	public void setMon_fund(String mon_fund) {
		this.mon_fund = mon_fund;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public String getLend_fund() {
		return lend_fund;
	}

	public void setLend_fund(String lend_fund) {
		this.lend_fund = lend_fund;
	}

	public String getTra_fa() {
		return tra_fa;
	}

	public void setTra_fa(String tra_fa) {
		this.tra_fa = tra_fa;
	}

	public String getRec_bill() {
		return rec_bill;
	}

	public void setRec_bill(String rec_bill) {
		this.rec_bill = rec_bill;
	}

	public String getRec_acc() {
		return rec_acc;
	}

	public void setRec_acc(String rec_acc) {
		this.rec_acc = rec_acc;
	}

	public String getPre_acc() {
		return pre_acc;
	}

	public void setPre_acc(String pre_acc) {
		this.pre_acc = pre_acc;
	}

	public String getRec_prem() {
		return rec_prem;
	}

	public void setRec_prem(String rec_prem) {
		this.rec_prem = rec_prem;
	}

	public String getRec_rei_acc() {
		return rec_rei_acc;
	}

	public void setRec_rei_acc(String rec_rei_acc) {
		this.rec_rei_acc = rec_rei_acc;
	}

	public String getRec_rei_cr() {
		return rec_rei_cr;
	}

	public void setRec_rei_cr(String rec_rei_cr) {
		this.rec_rei_cr = rec_rei_cr;
	}

	public String getRec_inte() {
		return rec_inte;
	}

	public void setRec_inte(String rec_inte) {
		this.rec_inte = rec_inte;
	}

	public String getRec_gl() {
		return rec_gl;
	}

	public void setRec_gl(String rec_gl) {
		this.rec_gl = rec_gl;
	}

	public String getRes_fa() {
		return res_fa;
	}

	public void setRes_fa(String res_fa) {
		this.res_fa = res_fa;
	}

	public String getSto() {
		return sto;
	}

	public void setSto(String sto) {
		this.sto = sto;
	}

	public String getDoy_nfa() {
		return doy_nfa;
	}

	public void setDoy_nfa(String doy_nfa) {
		this.doy_nfa = doy_nfa;
	}

	public String getFa_total() {
		return fa_total;
	}

	public void setFa_total(String fa_total) {
		this.fa_total = fa_total;
	}

	public String getLoan_adv() {
		return loan_adv;
	}

	public void setLoan_adv(String loan_adv) {
		this.loan_adv = loan_adv;
	}

	public String getAfs_fa() {
		return afs_fa;
	}

	public void setAfs_fa(String afs_fa) {
		this.afs_fa = afs_fa;
	}

	public String getHmi() {
		return hmi;
	}

	public void setHmi(String hmi) {
		this.hmi = hmi;
	}

	public String getLong_rec_acc() {
		return long_rec_acc;
	}

	public void setLong_rec_acc(String long_rec_acc) {
		this.long_rec_acc = long_rec_acc;
	}

	public String getLong_gq_inv() {
		return long_gq_inv;
	}

	public void setLong_gq_inv(String long_gq_inv) {
		this.long_gq_inv = long_gq_inv;
	}

	public String getInv_est() {
		return inv_est;
	}

	public void setInv_est(String inv_est) {
		this.inv_est = inv_est;
	}

	public String getFix_ass_net() {
		return fix_ass_net;
	}

	public void setFix_ass_net(String fix_ass_net) {
		this.fix_ass_net = fix_ass_net;
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getEm() {
		return em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getFix_ass_clear() {
		return fix_ass_clear;
	}

	public void setFix_ass_clear(String fix_ass_clear) {
		this.fix_ass_clear = fix_ass_clear;
	}

	public String getPb_ass() {
		return pb_ass;
	}

	public void setPb_ass(String pb_ass) {
		this.pb_ass = pb_ass;
	}

	public String getOg_ass() {
		return og_ass;
	}

	public void setOg_ass(String og_ass) {
		this.og_ass = og_ass;
	}

	public String getInta_ass() {
		return inta_ass;
	}

	public void setInta_ass(String inta_ass) {
		this.inta_ass = inta_ass;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getLong_pe() {
		return long_pe;
	}

	public void setLong_pe(String long_pe) {
		this.long_pe = long_pe;
	}

	public String getDta_totoal() {
		return dta_totoal;
	}

	public void setDta_totoal(String dta_totoal) {
		this.dta_totoal = dta_totoal;
	}

	public String getNfa_ass_total() {
		return nfa_ass_total;
	}

	public void setNfa_ass_total(String nfa_ass_total) {
		this.nfa_ass_total = nfa_ass_total;
	}

	public String getShort_loan() {
		return short_loan;
	}

	public void setShort_loan(String short_loan) {
		this.short_loan = short_loan;
	}

	public String getBcb() {
		return bcb;
	}

	public void setBcb(String bcb) {
		this.bcb = bcb;
	}

	public String getDep_ind() {
		return dep_ind;
	}

	public void setDep_ind(String dep_ind) {
		this.dep_ind = dep_ind;
	}

	public String getLfob() {
		return lfob;
	}

	public void setLfob(String lfob) {
		this.lfob = lfob;
	}

	public String getTfl() {
		return tfl;
	}

	public void setTfl(String tfl) {
		this.tfl = tfl;
	}

	public String getPay_bill() {
		return pay_bill;
	}

	public void setPay_bill(String pay_bill) {
		this.pay_bill = pay_bill;
	}

	public String getPay_acc() {
		return pay_acc;
	}

	public void setPay_acc(String pay_acc) {
		this.pay_acc = pay_acc;
	}

	public String getAr_acc() {
		return ar_acc;
	}

	public void setAr_acc(String ar_acc) {
		this.ar_acc = ar_acc;
	}

	public String getFasfr() {
		return fasfr;
	}

	public void setFasfr(String fasfr) {
		this.fasfr = fasfr;
	}

	public String getRec_fc() {
		return rec_fc;
	}

	public void setRec_fc(String rec_fc) {
		this.rec_fc = rec_fc;
	}

	public String getRec_eb() {
		return rec_eb;
	}

	public void setRec_eb(String rec_eb) {
		this.rec_eb = rec_eb;
	}

	public String getPay_tax() {
		return pay_tax;
	}

	public void setPay_tax(String pay_tax) {
		this.pay_tax = pay_tax;
	}

	public String getPay_inte() {
		return pay_inte;
	}

	public void setPay_inte(String pay_inte) {
		this.pay_inte = pay_inte;
	}

	public String getPay_gl() {
		return pay_gl;
	}

	public void setPay_gl(String pay_gl) {
		this.pay_gl = pay_gl;
	}

	public String getPay_pei_acc() {
		return pay_pei_acc;
	}

	public void setPay_pei_acc(String pay_pei_acc) {
		this.pay_pei_acc = pay_pei_acc;
	}

	public String getIcr() {
		return icr;
	}

	public void setIcr(String icr) {
		this.icr = icr;
	}

	public String getActi_ts() {
		return acti_ts;
	}

	public void setActi_ts(String acti_ts) {
		this.acti_ts = acti_ts;
	}

	public String getActi_us() {
		return acti_us;
	}

	public void setActi_us(String acti_us) {
		this.acti_us = acti_us;
	}

	public String getDoy_long_lia() {
		return doy_long_lia;
	}

	public void setDoy_long_lia(String doy_long_lia) {
		this.doy_long_lia = doy_long_lia;
	}

	public String getFg_lia_total() {
		return fg_lia_total;
	}

	public void setFg_lia_total(String fg_lia_total) {
		this.fg_lia_total = fg_lia_total;
	}

	public String getLong_loan() {
		return long_loan;
	}

	public void setLong_loan(String long_loan) {
		this.long_loan = long_loan;
	}

	public String getPay_bond() {
		return pay_bond;
	}

	public void setPay_bond(String pay_bond) {
		this.pay_bond = pay_bond;
	}

	public String getLong_pay_acc() {
		return long_pay_acc;
	}

	public void setLong_pay_acc(String long_pay_acc) {
		this.long_pay_acc = long_pay_acc;
	}

	public String getSpe_pay_acc() {
		return spe_pay_acc;
	}

	public void setSpe_pay_acc(String spe_pay_acc) {
		this.spe_pay_acc = spe_pay_acc;
	}

	public String getPre_lia() {
		return pre_lia;
	}

	public void setPre_lia(String pre_lia) {
		this.pre_lia = pre_lia;
	}

	public String getDtc_total() {
		return dtc_total;
	}

	public void setDtc_total(String dtc_total) {
		this.dtc_total = dtc_total;
	}

	public String getRec_acc_else() {
		return rec_acc_else;
	}

	public void setRec_acc_else(String rec_acc_else) {
		this.rec_acc_else = rec_acc_else;
	}

	public String getFa_else() {
		return fa_else;
	}

	public void setFa_else(String fa_else) {
		this.fa_else = fa_else;
	}

	public String getLong_ass_else() {
		return long_ass_else;
	}

	public void setLong_ass_else(String long_ass_else) {
		this.long_ass_else = long_ass_else;
	}

	public String getPay_acc_else() {
		return pay_acc_else;
	}

	public void setPay_acc_else(String pay_acc_else) {
		this.pay_acc_else = pay_acc_else;
	}

	public String getFg_lia_else() {
		return fg_lia_else;
	}

	public void setFg_lia_else(String fg_lia_else) {
		this.fg_lia_else = fg_lia_else;
	}

	public String getLong_lia_else() {
		return long_lia_else;
	}

	public void setLong_lia_else(String long_lia_else) {
		this.long_lia_else = long_lia_else;
	}

	public String getLong_lia_total() {
		return long_lia_total;
	}

	public void setLong_lia_total(String long_lia_total) {
		this.long_lia_total = long_lia_total;
	}

	public String getLia_total() {
		return lia_total;
	}

	public void setLia_total(String lia_total) {
		this.lia_total = lia_total;
	}

	public String getGb() {
		return gb;
	}

	public void setGb(String gb) {
		this.gb = gb;
	}

	public String getApic() {
		return apic;
	}

	public void setApic(String apic) {
		this.apic = apic;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getFs() {
		return fs;
	}

	public void setFs(String fs) {
		this.fs = fs;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public String getUnd_pro() {
		return und_pro;
	}

	public void setUnd_pro(String und_pro) {
		this.und_pro = und_pro;
	}

	public String getCdifcs() {
		return cdifcs;
	}

	public void setCdifcs(String cdifcs) {
		this.cdifcs = cdifcs;
	}

	public String getOeatpc_total() {
		return oeatpc_total;
	}

	public void setOeatpc_total(String oeatpc_total) {
		this.oeatpc_total = oeatpc_total;
	}

	public String getMin_si() {
		return min_si;
	}

	public void setMin_si(String min_si) {
		this.min_si = min_si;
	}

	public String getSi_total() {
		return si_total;
	}

	public void setSi_total(String si_total) {
		this.si_total = si_total;
	}

	public String getLia_si_total() {
		return lia_si_total;
	}

	public void setLia_si_total(String lia_si_total) {
		this.lia_si_total = lia_si_total;
	}

}
