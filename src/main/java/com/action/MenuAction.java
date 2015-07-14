package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.orm.SystemMenu;
import com.service.MenuService;

@SuppressWarnings("serial")
public class MenuAction extends ActionSupport {

	private SystemMenu menu;
	private static SystemMenu oldmenu;
	@Autowired
	MenuService menuService ;
	@Override
    public String execute() throws Exception {
        //鍒楀嚭鎵�鏈夌敤鎴�
        return ERROR;
    }
	public String ListAll() throws Exception {
        return "ListAll";
    }
	public String List() throws Exception {
        return "List";
    }
	public String addmenu(){
		if(oldmenu!=null){
			menu.setSystemroles(oldmenu.getSystemroles());
		}
		boolean flag=menuService.saveOrUpdate(menu);
		if(flag){
			return "Success";
		}
		return ERROR;
	}
	public String delmenu(){
		HttpServletRequest request = ServletActionContext.getRequest(); 
		boolean flag=menuService.deleteMenuByid(request.getParameter("id"));
		if(flag){
			return "Success";
		}
		return ERROR;
	}
	public String modmenu(){
		HttpServletRequest request = ServletActionContext.getRequest(); 
		menu=menuService.findMenuByid(request.getParameter("id"));
		oldmenu=menu;
		if(menu!=null){
			return "modpage";
		}
		return ERROR;
	}
	public SystemMenu getMenu() {
		return menu;
	}
	public void setMenu(SystemMenu menu) {
		this.menu = menu;
	}
}
