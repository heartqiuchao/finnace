package com.serviceimpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.CatchInfoService;
import com.service.StoreInfoService;

@Service
public class CatchInfoServiceimpl implements CatchInfoService {
	@Autowired
	StoreInfoService storeInfoService;

	public void catchInfo(int startY, int endY, String infoArea) {
		int left = 0, right = 0;
	    int count = 0;
	    int count_x = 0, count_y = 0;
	    int keyid = 1;
	    int spaceY = endY - startY + 1;
		int tempY = 2008;
		
	    ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		ArrayList<String> tempArray = new ArrayList<String>();
		
		while (keyid<=100) {
			tempY = startY;
			while (tempY <= endY) {
				count = 0;
				count_x = 0;
				count_y = 0;
				try {
					String keyid_str = intToString(keyid);
					System.err.println("keyid_str:"+keyid_str);
					String strURL = "http://xbrl.cninfo.com.cn/XBRL/allinfo.jsp?stkid="
							+keyid_str + "&getyear=" + startY;
					URL url = new URL(strURL);

					HttpURLConnection httpcon = (HttpURLConnection) url
							.openConnection();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(httpcon.getInputStream(),
									"gbk"));
					String line = null;
					while ((line = reader.readLine()) != null) {

						left = line.indexOf("('");
						right = line.indexOf("')");
						if (left != -1 && right != -1) {
							count++;
							String tempLine = line.substring(left + 2, right);
							if (tempLine.indexOf("年") == -1 && count > 2) {
								tempArray.add(tempLine);
								count_x++;
								if (count_x > 4) {
									data.add(tempArray);
									tempArray = new ArrayList<String>();
									count_y++;
									count_x = 0;
								}// #end if
							}// #end if
						}// #end if
					}// #end while
				} catch (Exception e) {
					// TODO: handle exception
				}
				// Save data
				storeByArea(data, infoArea, tempY, spaceY);
				
				for(ArrayList<String> tempList:data) {
					for(String tempstr:tempList) {
						System.out.print(tempstr+" ");// 调试输出
					}
					System.out.println();
				}
				data = new ArrayList<ArrayList<String>>();
				tempY += 5;
				spaceY -= 5;
			}// #end while
			keyid++;
			System.out.println("$$$$$$keyid:" + keyid);
		}// end while

	}

	private void storeByArea(ArrayList<ArrayList<String>> currentdata,
			String area, int startY, int spaceY) {
		if (area.equals("all")) {
			System.err.println("$$$$$----all");
			storeInfoService.storeAllInfo(currentdata, startY, spaceY);
		} else if (area.equals("cmbi")) {
			System.err.println("$$$$$----cmbi");
			storeInfoService.storeCmBi(currentdata, startY, spaceY);
		} else if (area.equals("cmid")) {
			System.err.println("$$$$$----cmid");
			storeInfoService.storeCmId(currentdata, startY, spaceY);
		} else if (area.equals("cmlisgpid")) {
			System.err.println("$$$$$----cmlisgpid");
			storeInfoService.storeCmLisGpId(currentdata, startY, spaceY);
		} else if (area.equals("liscmasslia")) {
			System.err.println("$$$$$----liscmasslia");
			storeInfoService.storeLisCmAssLia(currentdata, startY, spaceY);
		} else if (area.equals("liscmcbbi")) {
			System.err.println("$$$$$----liscmcbbi");
			storeInfoService.storeLisCmCbBi(currentdata, startY, spaceY);
		} else if (area.equals("liscmcf")) {
			System.err.println("$$$$$----liscmcf");
			storeInfoService.storeLisCmCf(currentdata, startY, spaceY);
		} else if (area.equals("liscmgborg")) {
			System.err.println("$$$$$----liscmgborg");
			storeInfoService.storeLisCmGbOrg(currentdata, startY, spaceY);
		} else if (area.equals("liscmpro")) {
			System.err.println("$$$$$----liscmpro");
			storeInfoService.storeLisCmPro(currentdata, startY, spaceY);
		} else if (area.equals("liscmttgd")) {
			System.err.println("$$$$$----liscmttgd");
			storeInfoService.storeLisCmTtGd(currentdata, startY, spaceY);
		}
	}

	private String intToString(int id) {
		Integer integer = id;
		String str_id = integer.toString();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6 - str_id.length(); i++) {
			sb.append(0);
		}
		sb.append(str_id);
		return sb.toString();
	}
}
