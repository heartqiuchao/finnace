package com.action;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.service.CatchInfoService;

@SuppressWarnings("serial")
public class CatchInfoAction extends ActionSupport {
	private int startY=2008;
	private int endY=Calendar.getInstance().get(Calendar.YEAR);
	private String infoArea="all";
	@Autowired
	CatchInfoService catchInfoService;
	
	public String startCatch() {
		return "startCatch";
	}
	
	public String catchWeb() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest(); 
			if (request.getParameter("starty")!=null) 
				startY=Integer.parseInt(request.getParameter("starty"));
			if (request.getParameter("endy")!=null) 
				endY=Integer.parseInt(request.getParameter("endy"));
			if (request.getParameter("area")!=null) 
				infoArea = request.getParameter("area");
			//抓取服务
			catchInfoService.catchInfo(startY, endY ,infoArea);
			
			return "storeSuccess";
		} catch (Exception e) {
			return ERROR;
		}
	}
}
