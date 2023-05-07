package com.rs.cdpapp.dto;


public class UserRoleEntityDto {

	private Long id;
	private String roleName;
	
	private String roleCreater;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCreater() {
		return roleCreater;
	}

	public void setRoleCreater(String roleCreater) {
		this.roleCreater = roleCreater;
	}
	
	
}
