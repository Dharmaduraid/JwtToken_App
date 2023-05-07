package com.rs.cdpapp.service;

import java.io.File;

import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.dto.ArchivalDto;

public interface SearchService {
	
	ApiResponseDto searchValueBySerialNumOrPolicyNum(String policyNum,String serialNum);
	
	
	ApiResponseDto sourceValueBySerialNum(String serialNum);
	
	ApiResponseDto getDocumentPathDetails(String serialNumber);
	
	File getDocumentPath(String serialNumber,int index);


	ApiResponseDto viewArchivalData(String policyNo,String serialNumber);


	


	

}
