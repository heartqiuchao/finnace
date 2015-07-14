package com.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BaseDao;
import com.orm.hushen.CmBiInfo;
import com.orm.hushen.CmIdInfo;
import com.orm.hushen.CmLisGpIdInfo;
import com.orm.hushen.LisCmAssLiaInfo;
import com.orm.hushen.LisCmCbBiInfo;
import com.orm.hushen.LisCmCfInfo;
import com.orm.hushen.LisCmGbOrgInfo;
import com.orm.hushen.LisCmProInfo;
import com.orm.hushen.LisCmTtGdInfo;
import com.orm.hushen.key.LisCmAssLiaInfoKey;
import com.orm.hushen.key.LisCmCbBiInfoKey;
import com.orm.hushen.key.LisCmCfInfoKey;
import com.orm.hushen.key.LisCmGbOrgInfoKey;
import com.orm.hushen.key.LisCmProInfoKey;
import com.orm.hushen.key.LisCmTtGdInfoKey;
import com.service.StoreInfoService;

@Service
public class StoreInfoServiceimpl implements StoreInfoService {
	@Autowired
	BaseDao dao;

	public void storeAllInfo(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		storeCmBi(data, startY, spaceY);
		storeCmId(data, startY, spaceY);
		storeCmLisGpId(data, startY, spaceY);
		storeLisCmAssLia(data, startY, spaceY);
		storeLisCmCbBi(data, startY, spaceY);
		storeLisCmCf(data, startY, spaceY);
		storeLisCmGbOrg(data, startY, spaceY);
		storeLisCmPro(data, startY, spaceY);
		storeLisCmTtGd(data, startY, spaceY);
	}

	public void storeCmBi(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			CmBiInfo cmBiInfo = new CmBiInfo();

			cmBiInfo.setId(data.get(0).get(i));
			cmBiInfo.setCm_jc(data.get(1).get(i));
			cmBiInfo.setCm_oapc(data.get(6).get(i));
			cmBiInfo.setCm_ws(data.get(7).get(i));
			cmBiInfo.setCm_sotb_name(data.get(4).get(i));
			cmBiInfo.setCm_sotb_email(data.get(5).get(i));
			// save
			dao.saveOrUpdate(cmBiInfo);
		}
	}

	public void storeCmId(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			CmIdInfo cmIdInfo = new CmIdInfo();

			cmIdInfo.setId(data.get(0).get(i));
			cmIdInfo.setName(data.get(2).get(i));
			// save
			dao.saveOrUpdate(cmIdInfo);
		}
	}

	public void storeCmLisGpId(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			CmLisGpIdInfo cmLisGpIdInfo = new CmLisGpIdInfo();

			cmLisGpIdInfo.setId(data.get(0).get(i));
			cmLisGpIdInfo.setGp_name(data.get(2).get(i));
			cmLisGpIdInfo.setGp_id(data.get(0).get(i));
			// save
			dao.saveOrUpdate(cmLisGpIdInfo);
		}
	}

	public void storeLisCmAssLia(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			LisCmAssLiaInfo lisCmAssLiaInfo = new LisCmAssLiaInfo();
			// 联合主键
			LisCmAssLiaInfoKey lisCmAssLiaInfoKey = new LisCmAssLiaInfoKey();
			lisCmAssLiaInfoKey.setId(data.get(0).get(i));
			lisCmAssLiaInfoKey.setYear(String.valueOf(startY + i));
			lisCmAssLiaInfo.setLisCmAssLiaInfoKey(lisCmAssLiaInfoKey);

			lisCmAssLiaInfo.setMon_fund(data.get(68).get(i));
			lisCmAssLiaInfo.setSp(data.get(69).get(i));
			lisCmAssLiaInfo.setLend_fund(data.get(70).get(i));
			lisCmAssLiaInfo.setTra_fa(data.get(71).get(i));
			lisCmAssLiaInfo.setRec_bill(data.get(72).get(i));
			lisCmAssLiaInfo.setRec_acc(data.get(73).get(i));
			lisCmAssLiaInfo.setPre_acc(data.get(74).get(i));
			lisCmAssLiaInfo.setRec_prem(data.get(75).get(i));
			lisCmAssLiaInfo.setRec_rei_acc(data.get(76).get(i));
			lisCmAssLiaInfo.setRec_rei_cr(data.get(77).get(i));
			lisCmAssLiaInfo.setRec_inte(data.get(78).get(i));
			lisCmAssLiaInfo.setRes_fa(data.get(80).get(i));
			lisCmAssLiaInfo.setSto(data.get(81).get(i));
			lisCmAssLiaInfo.setDoy_nfa(data.get(82).get(i));
			lisCmAssLiaInfo.setFa_else(data.get(23).get(i));
			lisCmAssLiaInfo.setFa_total(data.get(24).get(i));
			lisCmAssLiaInfo.setLoan_adv(data.get(85).get(i));
			lisCmAssLiaInfo.setAfs_fa(data.get(86).get(i));
			lisCmAssLiaInfo.setHmi(data.get(87).get(i));
			lisCmAssLiaInfo.setLong_rec_acc(data.get(88).get(i));
			lisCmAssLiaInfo.setLong_gq_inv(data.get(89).get(i));
			lisCmAssLiaInfo.setInv_est(data.get(90).get(i));
			lisCmAssLiaInfo.setFix_ass_net(data.get(91).get(i));
			lisCmAssLiaInfo.setCip(data.get(92).get(i));
			lisCmAssLiaInfo.setEm(data.get(93).get(i));
			lisCmAssLiaInfo.setFix_ass_clear(data.get(94).get(i));
			lisCmAssLiaInfo.setPb_ass(data.get(95).get(i));
			lisCmAssLiaInfo.setOg_ass(data.get(96).get(i));
			lisCmAssLiaInfo.setInta_ass(data.get(97).get(i));
			lisCmAssLiaInfo.setDe(data.get(98).get(i));
			lisCmAssLiaInfo.setCredit(data.get(99).get(i));
			lisCmAssLiaInfo.setLong_pe(data.get(100).get(i));
			lisCmAssLiaInfo.setShort_loan(data.get(107).get(i));
			lisCmAssLiaInfo.setNfa_ass_total(data.get(104).get(i));
			lisCmAssLiaInfo.setBcb(data.get(108).get(i));
			lisCmAssLiaInfo.setDep_ind(data.get(109).get(i));
			lisCmAssLiaInfo.setLfob(data.get(110).get(i));
			lisCmAssLiaInfo.setTfl(data.get(111).get(i));
			lisCmAssLiaInfo.setPay_bill(data.get(112).get(i));
			lisCmAssLiaInfo.setPay_acc(data.get(113).get(i));
			lisCmAssLiaInfo.setAr_acc(data.get(114).get(i));
			lisCmAssLiaInfo.setFasfr(data.get(115).get(i));
			lisCmAssLiaInfo.setRec_fc(data.get(116).get(i));
			lisCmAssLiaInfo.setRec_eb(data.get(117).get(i));
			lisCmAssLiaInfo.setPay_tax(data.get(118).get(i));
			lisCmAssLiaInfo.setPay_inte(data.get(119).get(i));
			lisCmAssLiaInfo.setPay_acc_else(data.get(120).get(i));
			lisCmAssLiaInfo.setPay_pei_acc(data.get(121).get(i));
			lisCmAssLiaInfo.setIcr(data.get(122).get(i));
			lisCmAssLiaInfo.setActi_ts(data.get(123).get(i));
			lisCmAssLiaInfo.setActi_us(data.get(124).get(i));
			lisCmAssLiaInfo.setFg_lia_else(data.get(126).get(i));
			lisCmAssLiaInfo.setFg_lia_total(data.get(127).get(i));
			lisCmAssLiaInfo.setLong_loan(data.get(128).get(i));
			lisCmAssLiaInfo.setPay_bond(data.get(129).get(i));
			lisCmAssLiaInfo.setLong_pay_acc(data.get(120).get(i));
			lisCmAssLiaInfo.setSpe_pay_acc(data.get(131).get(i));
			lisCmAssLiaInfo.setPre_lia(data.get(132).get(i));
			lisCmAssLiaInfo.setLia_total(data.get(137).get(i));
			lisCmAssLiaInfo.setApic(data.get(140).get(i));
			lisCmAssLiaInfo.setTs(data.get(141).get(i));
			lisCmAssLiaInfo.setFs(data.get(142).get(i));
			lisCmAssLiaInfo.setGrp(data.get(143).get(i));
			lisCmAssLiaInfo.setUnd_pro(data.get(144).get(i));
			lisCmAssLiaInfo.setCdifcs(data.get(145).get(i));
			lisCmAssLiaInfo.setOeatpc_total(data.get(146).get(i));
			lisCmAssLiaInfo.setMin_si(data.get(147).get(i));
			lisCmAssLiaInfo.setSi_total(data.get(148).get(i));
			lisCmAssLiaInfo.setLia_si_total(data.get(149).get(i));
			// save
			dao.saveOrUpdate(lisCmAssLiaInfo);
		}
	}

	public void storeLisCmCbBi(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			LisCmCbBiInfo lisCmCbBiInfo = new LisCmCbBiInfo();
			// 联合主键
			LisCmCbBiInfoKey lisCmCbBiInfoKey = new LisCmCbBiInfoKey();
			lisCmCbBiInfoKey.setId(data.get(0).get(i));
			lisCmCbBiInfoKey.setYear(String.valueOf(startY + i));
			lisCmCbBiInfo.setLisCmCbBiInfoKey(lisCmCbBiInfoKey);

			lisCmCbBiInfo.setOwn_mar_cm_gd_dbl_npro(data.get(10).get(i));
			lisCmCbBiInfo.setAss_total(data.get(12).get(i));
			lisCmCbBiInfo.setGd_rig(data.get(13).get(i));
			lisCmCbBiInfo.setBase_mo_inc(data.get(14).get(i));
			lisCmCbBiInfo.setDil_mo_inc(data.get(15).get(i));
			lisCmCbBiInfo.setOwn_lts_mo_nass(data.get(16).get(i));
			lisCmCbBiInfo.setMo_act_cf_net(data.get(18).get(i));
			// save
			dao.saveOrUpdate(lisCmCbBiInfo);
		}
	}

	public void storeLisCmCf(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			LisCmCfInfo lisCmCfInfo = new LisCmCfInfo();
			// 联合主键
			LisCmCfInfoKey lisCmCfInfoKey = new LisCmCfInfoKey();
			lisCmCfInfoKey.setId(data.get(0).get(i));
			lisCmCfInfoKey.setYear(String.valueOf(startY + i));
			lisCmCfInfo.setLisCmCfInfoKey(lisCmCfInfoKey);

			lisCmCfInfo.setSale_pc_cash(data.get(186).get(i));
			lisCmCfInfo.setCd_ind_ni(data.get(187).get(i));
			lisCmCfInfo.setBcb_ni(data.get(188).get(i));
			lisCmCfInfo.setLfob_ni_else(data.get(189).get(i));
			lisCmCfInfo.setOic_prem_cash(data.get(190).get(i));
			lisCmCfInfo.setRb_cash_net(data.get(191).get(i));
			lisCmCfInfo.setInsd_inv_ni(data.get(192).get(i));
			lisCmCfInfo.setTra_fin_ass_ni(data.get(193).get(i));
			lisCmCfInfo.setInte_fc_cash_get(data.get(194).get(i));
			lisCmCfInfo.setLfob_ni(data.get(195).get(i));
			lisCmCfInfo.setRo_ass_ni(data.get(196).get(i));
			lisCmCfInfo.setTax_ref_get(data.get(197).get(i));
			lisCmCfInfo.setAct_cash_else_get(data.get(198).get(i));
			lisCmCfInfo.setAct_cash_inf_total(data.get(199).get(i));
			lisCmCfInfo.setPas_cash(data.get(200).get(i));
			lisCmCfInfo.setLoan_adv_ni(data.get(201).get(i));
			lisCmCfInfo.setCd_ind_ni(data.get(202).get(i));
			lisCmCfInfo.setPay_oic_cp_cash(data.get(203).get(i));
			lisCmCfInfo.setPay_inte_fc_cash(data.get(204).get(i));
			lisCmCfInfo.setPay_bd_bonus_cash(data.get(205).get(i));
			lisCmCfInfo.setPay_emp_cash(data.get(206).get(i));
			lisCmCfInfo.setPay_tax(data.get(207).get(i));
			lisCmCfInfo.setAct_cash_out_total(data.get(208).get(i));
			lisCmCfInfo.setPay_act_cash(data.get(209).get(i));
			lisCmCfInfo.setAct_cash_net(data.get(210).get(i));
			lisCmCfInfo.setInv_cash_get(data.get(212).get(i));
			lisCmCfInfo.setInv_inc_cash_get(data.get(213).get(i));
			lisCmCfInfo
					.setFix_inta_else_long_ass_cash_get(data.get(214).get(i));
			lisCmCfInfo.setInv_cash_inf_total(data.get(217).get(i));
			lisCmCfInfo
					.setPay_fix_inta_long_ass_cash_else(data.get(218).get(i));
			lisCmCfInfo.setPay_inv_cash(data.get(219).get(i));
			lisCmCfInfo.setPle_loan_ni(data.get(220).get(i));
			lisCmCfInfo.setSub_cm_cash_net_get(data.get(221).get(i));
			lisCmCfInfo.setPay_inv_cash_else(data.get(222).get(i));
			lisCmCfInfo.setInv_cash_total(data.get(223).get(i));
			lisCmCfInfo.setInv_cash_net(data.get(224).get(i));
			lisCmCfInfo.setAdm_inv_cash_get(data.get(226).get(i));
			lisCmCfInfo.setAdm_sub_cm_min_gd_inv_cash(data.get(227).get(i));
			lisCmCfInfo.setLoan_cash_get(data.get(228).get(i));
			lisCmCfInfo.setBond_cash_get(data.get(229).get(i));
			lisCmCfInfo.setFia_cash_else_get(data.get(230).get(i));
			lisCmCfInfo.setFia_cash_inf_total(data.get(231).get(i));
			lisCmCfInfo.setPay_deb_cash(data.get(232).get(i));
			lisCmCfInfo.setPay_gl_pro_inte_cash(data.get(233).get(i));
			lisCmCfInfo.setPay_min_gd_gl(data.get(234).get(i));
			lisCmCfInfo.setPay_fia_cash_else(data.get(235).get(i));
			lisCmCfInfo.setFia_cash_out_total(data.get(236).get(i));
			lisCmCfInfo.setFia_cash_net(data.get(237).get(i));
			lisCmCfInfo.setEffect(data.get(238).get(i));
			lisCmCfInfo.setCash_ni(data.get(239).get(i));
			// save
			dao.saveOrUpdate(lisCmCfInfo);
		}
	}

	public void storeLisCmGbOrg(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			LisCmGbOrgInfo lisCmGbOrgInfo = new LisCmGbOrgInfo();
			// 联合主键
			LisCmGbOrgInfoKey lisCmGbOrgInfoKey = new LisCmGbOrgInfoKey();
			lisCmGbOrgInfoKey.setId(data.get(0).get(i));
			lisCmGbOrgInfoKey.setYear(String.valueOf(startY + i));
			lisCmGbOrgInfo.setLisCmGbOrgInfoKey(lisCmGbOrgInfoKey);
			// save
			dao.saveOrUpdate(lisCmGbOrgInfo);
		}
	}

	public void storeLisCmPro(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			LisCmProInfo lisCmProInfo = new LisCmProInfo();
			// 联合主键
			LisCmProInfoKey lisCmProInfoKey = new LisCmProInfoKey();
			lisCmProInfoKey.setId(data.get(0).get(i));
			lisCmProInfoKey.setYear(String.valueOf(startY + i));
			lisCmProInfo.setLisCmProInfoKey(lisCmProInfoKey);

			lisCmProInfo.setYy_inc(data.get(151).get(i));
			lisCmProInfo.setYy_inc_total(data.get(150).get(i));
			lisCmProInfo.setPrem_get(data.get(153).get(i));
			lisCmProInfo.setFc_inc(data.get(154).get(i));
			lisCmProInfo.setYy_cost_total(data.get(155).get(i));
			lisCmProInfo.setYy_cost(data.get(156).get(i));
			lisCmProInfo.setFa_inte_exp(data.get(157).get(i));
			lisCmProInfo.setFc_exp(data.get(158).get(i));
			lisCmProInfo.setSur(data.get(159).get(i));
			lisCmProInfo.setCp_exp_net(data.get(160).get(i));
			lisCmProInfo.setIcr_net(data.get(161).get(i));
			lisCmProInfo.setBd_bonus_exp(data.get(162).get(i));
			lisCmProInfo.setRei_exp(data.get(163).get(i));
			lisCmProInfo.setBts(data.get(164).get(i));
			lisCmProInfo.setSale_exp(data.get(165).get(i));
			lisCmProInfo.setManage_exp(data.get(166).get(i));
			lisCmProInfo.setFin_exp(data.get(167).get(i));
			lisCmProInfo.setAil(data.get(168).get(i));
			lisCmProInfo.setFvc_inc(data.get(169).get(i));
			lisCmProInfo.setInv_inc(data.get(170).get(i));
			lisCmProInfo.setJoe_jv_inv_inc(data.get(171).get(i));
			lisCmProInfo.setExc_inc(data.get(172).get(i));
			lisCmProInfo.setYy_pro(data.get(173).get(i));
			lisCmProInfo.setNb_inc(data.get(174).get(i));
			lisCmProInfo.setNb_exp(data.get(175).get(i));
			lisCmProInfo.setNfa_net_loss(data.get(176).get(i));
			lisCmProInfo.setPor_total(data.get(177).get(i));
			lisCmProInfo.setIt(data.get(178).get(i));
			lisCmProInfo.setNet_pro(data.get(179).get(i));
			lisCmProInfo.setAtootp_net_pro(data.get(180).get(i));
			lisCmProInfo.setMin_gd_ii(data.get(181).get(i));
			lisCmProInfo.setBase_mo_inc(data.get(183).get(i));
			lisCmProInfo.setDil_mo_inc(data.get(184).get(i));
			// save
			dao.saveOrUpdate(lisCmProInfo);
		}
	}

	public void storeLisCmTtGd(ArrayList<ArrayList<String>> data, int startY,
			int spaceY) {
		if (spaceY / 5 > 0) {
			spaceY = 5;
		} else {
			spaceY = spaceY % 5;
		}
		for (int i = 0; i < spaceY; i++) {
			LisCmTtGdInfo lisCmTtGdInfo = new LisCmTtGdInfo();
			// 联合主键
			LisCmTtGdInfoKey lisCmTtGdInfoKey = new LisCmTtGdInfoKey();
			lisCmTtGdInfoKey.setId(data.get(0).get(0));
			lisCmTtGdInfoKey.setYear(String.valueOf(startY + i));
			lisCmTtGdInfoKey.setGd_name(data.get(4).get(i)); // 暂时为董事会秘书名字
			lisCmTtGdInfo.setLisCmTtGdInfoKey(lisCmTtGdInfoKey);

			// save
			dao.saveOrUpdate(lisCmTtGdInfo);
		}
	}

}
