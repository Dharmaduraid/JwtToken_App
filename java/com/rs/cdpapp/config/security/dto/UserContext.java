package com.rs.cdpapp.config.security.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author Nandhu
 */

public class UserContext implements Serializable {

	private static final long serialVersionUID = 543534534534534234L;

	public UserContext() {
	}

	@JsonProperty("Username")
	private String userName;
	
	@JsonProperty("loginId")
	private String userId;

	@JsonIgnore
	private List<GrantedAuthority> authorities;

	@JsonProperty("authToken")
	private String authToken;

	@JsonProperty("userRoles")
	private List<String> userRoles;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public List<String> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<String> userRoles) {
		this.userRoles = userRoles;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
