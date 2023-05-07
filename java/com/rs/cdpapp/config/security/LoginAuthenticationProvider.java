
package com.rs.cdpapp.config.security;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.www.NonceExpiredException;
import org.springframework.stereotype.Component;

import com.rs.cdpapp.config.constants.ApplicationConstants;
import com.rs.cdpapp.config.security.dto.UserContext;
import com.rs.cdpapp.config.security.entity.UserEntity;
import com.rs.cdpapp.config.security.service.LoginService;
import com.rs.cdpapp.config.security.service.impl.EncryptionDecryptionComponent;


/***
 * @author Nandhu Responsibility of the LoginAuthenticationProvider class is to:
 *         1. Verify user credentials against database which holds the user
 *         data. 2. If user name and password do not match the record in the
 *         database authentication exception is thrown otherwise Create
 *         UserContext and populate it with user data you need. 3. Upon
 *         successful authentication delegate creation of JWT Token
 */
@Component
public class LoginAuthenticationProvider implements AuthenticationProvider {

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private LoginService loginService;

	@Resource
	EncryptionDecryptionComponent encryptionDecryptionComponent;

	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		UsernamePasswordAuthenticationToken authentication = null;
		try {
			String username = (String) auth.getPrincipal();
			String password = (String) auth.getCredentials();

			UserEntity user = loginService.getByUserName(username);
			/**
			 * Check user is exist or not
			 */
			if (user == null) {
				logger.error("LoginAuthenticationProvider -- authenticate -- UserId not found in DataBase " + username);
				throw new UsernameNotFoundException("User not found: " + username);
			}
			/**
			 * Check User Password.
			 */
			String encryptPassword = encryptionDecryptionComponent.encryptionText(password, ApplicationConstants.ENCRYPT_DECRYPT_KEY.getValue());
			if (!password.equals(user.getPassword())) {
				logger.error(
						"LoginAuthenticationProvider -- authenticate -- Authentication Failed. Username or Password not valid---->Userid "
								+ username);
				throw new BadCredentialsException("Authentication Failed. Username or Password not valid.");
			}

			/**
			 * 
			 * Check Password in db based on Expiry Details
			 **/

			/**
			 * Check the user having authority
			 */
			if (user.getUserRoles() == null) {
				logger.error("LoginAuthenticationProvider -- authenticate -- User has no roles assigned " + username);
				throw new InsufficientAuthenticationException("User has no roles assigned");
			}

			/**
			 * Check the user having access
			 */
			if (null == user.getUserRoles() || user.getUserRoles().isEmpty()) {
				throw new InsufficientAuthenticationException("User has no roles assigned");
			}

			List<GrantedAuthority> authorities = getAuthority(user);
			List<String> userRoles = authorities.stream().map(x -> x.getAuthority()).collect(Collectors.toList());

			UserContext userContext = new UserContext();
			userContext.setAuthorities(authorities);
			userContext.setUserName(user.getUsername());
			userContext.setUserRoles(userRoles);
			userContext.setUserId(String.valueOf(user.getId()));

			authentication = new UsernamePasswordAuthenticationToken(username, password, authorities);
			authentication.setDetails(userContext);
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
		} catch (PersistenceException e) {
			logger.info("Error in LoginAuthenticationProvider ", e);
		} catch (NonceExpiredException e) {
			logger.error("User or Password Details Expired", e);
			throw new NonceExpiredException("User or Password Details Expired");
		} catch (Exception e) {
			logger.info("Error in LoginAuthenticationProvider ", e);
		}
		return authentication;
	}

	public boolean supports(Class<?> auth) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(auth));
	}

	private List<GrantedAuthority> getAuthority(UserEntity user) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		user.getUserRoles().forEach(role -> {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		});
		return authorities;
	}
}
