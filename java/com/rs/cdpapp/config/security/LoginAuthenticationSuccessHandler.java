package com.rs.cdpapp.config.security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rs.cdpapp.config.security.dto.UserContext;
import com.rs.cdpapp.config.security.jwt.service.JWTTokenService;
import com.rs.cdpapp.config.security.service.LoginService;

/**
 * If authentication success, the configured LoginAuthenticationSuccessHandler
 * will be invoked and it returns JWT Token.
 * 
 * @author Nandhu
 */
@Component
public class LoginAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Resource
	JWTTokenService jWTTokenService;

	@Resource
	LoginService loginService;

	/**
	 * This method is used to create the JWT Token. while the authentication
	 * success.
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		UserContext userContext = (UserContext) authentication.getDetails();
		String accessToken = null;
		accessToken = jWTTokenService.createAccessJwtToken(userContext);
		
		loginService.updateToLoginHistory(userContext, accessToken, request, response);
		// String refershToken =
		// jWTTokenService.createRefreshToken(userContext);
		Map<String, Object> tokenMap = new HashMap<String, Object>();
		userContext.setAuthToken(accessToken);
		// tokenMap.put("token", accessToken);
		tokenMap.put("userDetails", userContext);
		// tokenMap.put("refreshToken", refershToken);
		response.setStatus(HttpStatus.OK.value());
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.setHeader("auth-token", accessToken);
		new ObjectMapper().writeValue(response.getWriter(), tokenMap);
		clearAuthenticationAttributes(request);

	}

	/**
	 * Removes temporary authentication-related data which may have been stored
	 * in the session during the authentication process..
	 * 
	 */
	protected final void clearAuthenticationAttributes(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			return;
		}
		session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
	}

}
