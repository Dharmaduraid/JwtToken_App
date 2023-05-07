package com.rs.cdpapp.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.dto.UserDto;
import com.rs.cdpapp.service.UserService;

@CrossOrigin(allowedHeaders = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api")
public class CdpUserConroller {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	UserService userService;

	@PostMapping(value = "/saveUser")
	public ResponseEntity<?> saveUserData(@RequestBody UserDto userDto, Authentication auth) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			logger.info("started on saveUserData in CdpUserConroller");
			apiResponseDto = userService.saveUserData(userDto, auth);
		} catch (Exception e) {
			logger.info("Exception on saveUserData in CdpUserConroller", e);
		}

		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}

	@GetMapping(value = "/getUserById")
	public ResponseEntity<?> updateUserData(@RequestParam("loginId") Long loginId, Principal principal) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			apiResponseDto = userService.updateUserData(loginId);
		} catch (Exception e) {
			logger.info("Exception on updateUserData in CdpUserConroller", e);
		}

		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}

	@GetMapping(value = "/viewUserData")
	public ResponseEntity<?> viewUserData(@RequestParam("userName") String userName) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			apiResponseDto = userService.viewUserData(userName);
		} catch (Exception e) {
			logger.info("Exception on viewUserData on CdpUserConroller", e);
		}
		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}

	@PostMapping(value = "/updateUserByid")
	public ResponseEntity<?> saveUserDataById(@RequestParam("loginId") Long loginId, @RequestBody UserDto userDto,
			Principal principal) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			apiResponseDto = userService.saveUserDataById(loginId, userDto, principal.getName());
		} catch (Exception e) {
			logger.info("Exception on saveUserDataById in CdpUserConroller", e);
		}

		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllRoleName")
	public ResponseEntity<?> getAllRole(@RequestParam("userName") String userName) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			apiResponseDto = userService.getAllRole(userName);
		} catch (Exception e) {
			logger.info("Exception on getAllRole in CdpUserConroller", e);
		}
		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}

	@GetMapping(value = "/findUserName")
	public ResponseEntity<?> findUserName(@RequestParam("userName") String userName) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			apiResponseDto = userService.findUserName(userName);
		} catch (Exception e) {
			logger.info("Exception on getAllRole in CdpUserConroller", e);
		}
		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}
	
	@GetMapping(value="/searchByUserName")
	public ResponseEntity<?> searchByUserame(@RequestParam(name="userName") String userName){
		
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		try{
		apiResponseDto=userService.searchByUserName(userName);
		}catch(Exception e){
			logger.info("Exception on searchByUserName in CdpAppUserController",e);
		}
		logger.info("Ended on searchByUserName in CdpAppUserController");
		return new ResponseEntity<ApiResponseDto>(apiResponseDto,HttpStatus.OK);
		
	}

}
