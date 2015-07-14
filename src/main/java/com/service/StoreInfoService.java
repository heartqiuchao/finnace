package com.service;

import java.util.ArrayList;

public interface StoreInfoService {
	/**
	 * 存储上市公司所有信息
	 */
	public void storeAllInfo(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储公司基本信息
	 */
	public void storeCmBi(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储公司编码表
	 */
	public void storeCmId(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储公司上市股票编码表
	 */
	public void storeCmLisGpId(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储上市公司资产负债表
	 */
	public void storeLisCmAssLia(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储上市公司财报基本信息
	 */
	public void storeLisCmCbBi(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储上市公司现金流量表
	 */
	public void storeLisCmCf(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储上市公司股本结构
	 */
	public void storeLisCmGbOrg(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储上市公司利润表
	 */
	public void storeLisCmPro(ArrayList<ArrayList<String>> data, int startY, int spaceY);

	/**
	 * 存储上市公司前十大股东
	 */
	public void storeLisCmTtGd(ArrayList<ArrayList<String>> data, int startY, int spaceY);

}
