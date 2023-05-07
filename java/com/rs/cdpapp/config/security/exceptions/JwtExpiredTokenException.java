package com.rs.cdpapp.config.security.exceptions;

import org.springframework.security.core.AuthenticationException;

/**
 * Thrown if an JWT Token is expired.
 *
 * @author Nandhu
 */
public class JwtExpiredTokenException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a <code>JwtExpiredTokenException</code> with the specified
	 * message.
	 *
	 * @param msg
	 *            the detail message
	 */
	public JwtExpiredTokenException(String msg) {
		super(msg);
	}

	/**
	 * Constructs a <code>JwtExpiredTokenException</code> with the specified
	 * message and root cause.
	 *
	 * @param msg
	 *            the detail message
	 * @param t
	 *            root cause
	 */
	public JwtExpiredTokenException(String msg, Throwable t) {
		super(msg, t);
	}
}
