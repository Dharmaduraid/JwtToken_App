package com.rs.cdpapp.config.security.jwt.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.rs.cdpapp.config.security.dto.UserContext;

public interface JWTTokenService {

	String createAccessJwtToken(UserContext userContext);

	String createRefreshToken(UserContext userContext);

	String ExtractToken(HttpServletRequest request);

	UserContext parseClaims(String accessToken);
	
	String createRefreshToken(String accessTokenStr);
	
}
