package com.rs.cdpapp.config.security.jwt;

import javax.annotation.Resource;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.rs.cdpapp.config.security.dto.UserContext;
import com.rs.cdpapp.config.security.jwt.service.JWTTokenService;

/**
 * 
 * @author Nandhu 
 * This class implements AuthenticationProvider.
 * 
 */
@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {

	@Resource
	JWTTokenService twtTokenService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String rawAccessToken = (String) authentication.getCredentials();
		UserContext userContext = twtTokenService.parseClaims(rawAccessToken);

		
		return new JwtAuthenticationToken(userContext, userContext.getAuthorities(),userContext);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
	}
}