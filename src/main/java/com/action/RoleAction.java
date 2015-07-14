package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.orm.SystemRole;
import com.service.RoleService;

@SuppressWarnings("serial")
public class RoleAction extends ActionSupport {

	private SystemRole role;
	
	@Autowired
	RoleService roleService;
	@Override
    public String execute() throws Exception {
        return ERROR;
    }
	public String ListAll() throws Exception {
        return "ListAll";
    }
	public String List() throws Exception {
        return "List";
    }
	
	public String addrole() throws Exception {
        boolean flag=roleService.saveOrUpdate(getRole());
        if (flag) {
            return "addSuccess";
        }
        return ERROR;
    }
	public String modrole() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest(); 
		role=roleService.findRoleByid(request.getParameter("id"));
        if (role!=null) {
            return "modpage";
        }
        return ERROR;
    }
	public String delrole() throws Exception {
        //鍒犻櫎鐢ㄦ埛
		HttpServletRequest request = ServletActionContext.getRequest(); 
        boolean flag=roleService.deleteRoleByid(request.getParameter("id"));
        if (flag) {
            return "delSuccess";
        }
        return ERROR;
    }
	public SystemRole getRole() {
		return role;
	}
	public void setRole(SystemRole role) {
		this.role = role;
	}

}
