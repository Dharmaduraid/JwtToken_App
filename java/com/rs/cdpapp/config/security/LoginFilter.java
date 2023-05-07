package com.rs.cdpapp.config.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rs.cdpapp.config.security.dto.LoginRequestDto;
import com.rs.cdpapp.config.security.exceptions.AuthMethodNotSupportedException;

/**
 * @author Nandhu
 *
 *         This class used to provide custom processing of authentication
 *         requests. If the api request comes from {/login} then this filter
 *         class will be invoked.
 */
public class LoginFilter extends UsernamePasswordAuthenticationFilter {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private final LoginAuthenticationSuccessHandler successHandler;

	private final LoginAuthenticationFailureHandler failureHandler;

	public LoginFilter(String url, LoginAuthenticationSuccessHandler successHandler,
			LoginAuthenticationFailureHandler failureHandler, AuthenticationManager authManager) {
		// super(url);
//		super("/token/**");
		setAuthenticationManager(authManager);
		this.successHandler = successHandler;
		this.failureHandler = failureHandler;
	}

	/**
	 * This method is used to De-serialization and basic validation of
	 * 
	 * the incoming JSON payload.
	 */
	@Override
	public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
			throws AuthenticationException {
		if (!HttpMethod.POST.name().equals(req.getMethod())) {
			logger.error("Authentication Method Not Supported" + req.getMethod());
			throw new AuthMethodNotSupportedException("Authentication method not supported");
		}

		LoginRequestDto creds = null;
		
		UsernamePasswordAuthenticationToken token = null;
		try {
			creds = new ObjectMapper().readValue(req.getInputStream(), LoginRequestDto.class);

			if (null == creds || StringUtils.isBlank(creds.getUserName()) || StringUtils.isBlank(creds.getPassword())) {
				logger.error("Username or Password not provided");
				throw new AuthenticationServiceException("Username or Password not provided");
			}

			token = new UsernamePasswordAuthenticationToken(creds.getUserName(), creds.getPassword(),
					new ArrayList<>());

		} catch (JsonParseException e) {
			throw new RuntimeException(e);
		} catch (JsonMappingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		
		/**
		 * Here check the role of user
		 */
//		Authentication authentication = 
//		UserContext userContext = (UserContext) authentication.getDetails();

		return this.getAuthenticationManager().authenticate(token);
	}

	/**
	 * This method is invoked while the authentication success.
	 */
	@Override
	protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
			Authentication auth) throws IOException, ServletException {
		
		successHandler.onAuthenticationSuccess(req, res, auth);
	}

	/**
	 * This method is invoked while the authentication unsuccessful.
	 */
	@Override
	protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException failed) throws IOException, ServletException {
		SecurityContextHolder.clearContext();
		failureHandler.onAuthenticationFailure(request, response, failed);
	}

//	public static void main(String[] args) {
//		// Encode data on your side using BASE64
//		byte[] bytesEncoded = Base64.encodeBase64("1".getBytes());
//		System.out.println("encoded value is " + new String(bytesEncoded));
//
//		// Decode data on other side, by processing encoded data
//		byte[] valueDecoded = Base64.decodeBase64(bytesEncoded);
//		System.out.println("Decoded value is " + new String(valueDecoded));
//	}
}