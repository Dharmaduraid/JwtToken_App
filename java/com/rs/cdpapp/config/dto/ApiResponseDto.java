/**
 * 
 */
package com.rs.cdpapp.config.dto;

import java.util.List;

import com.rs.cdpapp.config.constants.ApiResponseConstants;

/**
 * @author FAsupport2
 *
 */
public class ApiResponseDto<T> {

	private Integer code;
	private String message;
	private T data;
	
	private List<?> commonList;
	
	public List<?> getCommonList() {
		return commonList;
	}

	public void setCommonList(List<?> commonList) {
		this.commonList = commonList;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public ApiResponseDto(){
		
	}

	public ApiResponseDto(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public static <T> ApiResponseDto<T> success(T data) {
		return new ApiResponseDto<>(ApiResponseConstants.SUCCESS.getCode(), ApiResponseConstants.SUCCESS.getMsg(),
				data);
	}

	public static <T> ApiResponseDto<T> success(String msg, T data) {
		return new ApiResponseDto<>(ApiResponseConstants.SUCCESS.getCode(), msg, data);
	}

	public static ApiResponseDto<?> failed(Integer code, String msg) {
		return new ApiResponseDto<>(code, msg, null);
	}

}
