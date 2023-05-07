package com.rs.cdpapp.config.security.constants;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorCode {

	AUTHENTICATION("AUTH_01"),
	JWT_TOKEN_EXPIRED("AUTH_02");

	private String errorCode;

	private ErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@JsonValue
	public String getErrorCode() {
		return errorCode;
	}
}
