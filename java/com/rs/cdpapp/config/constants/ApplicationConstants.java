/**
 * 
 */
package com.rs.cdpapp.config.constants;

/**
 * @author FAsupport2
 *
 */
public enum ApplicationConstants {
	
	ACTIVE("ACTIVE"), INACTIVE("INACTIVE"), ENCRYPT_DECRYPT_KEY("FASRSA");
	
	
	private String value = null;

	private ApplicationConstants(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
