package com.rs.cdpapp.config.security.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rs.cdpapp.config.security.dto.UserContext;
import com.rs.cdpapp.config.security.entity.UserEntity;

public interface LoginService {

	public UserEntity getByUserName(String userName);

	void updateToLoginHistory(UserContext userContextm, String accessToken, HttpServletRequest request,
			HttpServletResponse response);

	String getTokenDetails(String userid);

}
