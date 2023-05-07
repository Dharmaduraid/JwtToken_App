package com.rs.cdpapp.service;

import java.io.File;

import org.springframework.security.core.Authentication;

import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.dto.UserDto;


public interface UserService {

	ApiResponseDto saveUserData(UserDto userDto,Authentication auth);
	
	ApiResponseDto viewUserData(String  userName);
	
	ApiResponseDto updateUserData(Long  userId);
	
	ApiResponseDto saveUserDataById(long loginId,UserDto userDto,String userName);

	ApiResponseDto getAllRole(String userName);

	ApiResponseDto findUserName(String userName);

	ApiResponseDto searchByUserName(String userName);
	
	
	
}
