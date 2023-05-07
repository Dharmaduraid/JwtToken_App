/**
 * 
 */
package com.rs.cdpapp.config.constants;

/**
 * @author FAsupport2
 *
 */
public enum ApiResponseConstants {
	
	SUCCESS(0, "OK"), VALIDATE_FAILED(-1, "validate failed");

    private Integer code;
    private String msg;

    ApiResponseConstants(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
