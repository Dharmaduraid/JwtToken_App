package com.rs.cdpapp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.dto.ArchivalDto;
import com.rs.cdpapp.service.SearchService;
@CrossOrigin(origins="*", maxAge = 3600)
@RestController
@RequestMapping(value="/api")
public class CdpAppSearchController {
	
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SearchService searchService;

	
	@PostMapping(value="/searchValues")
	public ResponseEntity<?> getSerachValue(@RequestParam String policyNumber,@RequestParam String serialNumber){
		
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		
		try{
			logger.info("started on getSerachValue in CdpAppSearchController");
			apiResponseDto=searchService.searchValueBySerialNumOrPolicyNum(policyNumber, serialNumber);
			
		}catch(Exception e){
			
			logger.info("Exception on getSerachValue in CdpAppSearchController",e);
			
		}
		logger.info("ended on getSerachValue in CdpAppSearchController");
		return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
	}
	
	@GetMapping(value="/viewSearch")
	public ResponseEntity<?> viewSearch(@RequestParam(name="serialNumber") String  serialNumber){
		
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		try{
		apiResponseDto=searchService.sourceValueBySerialNum(serialNumber);
		}catch(Exception e){
			logger.info("Exception on viewSearch in CdpAppSearchController",e);
		}
		logger.info("ended on viewSearch in CdpAppSearchController");
		return new ResponseEntity<ApiResponseDto>(apiResponseDto,HttpStatus.OK);
		
	}
	
	@RequestMapping(value ="/getDocumentFile", method = RequestMethod.GET)
	public ResponseEntity<?> getDocumentFile(@RequestParam String serialNumber) {
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		ResponseEntity<InputStreamResource> responseEntity = null;
		try {
			logger.info("started on getDocumentFile in CdpAppSearchController");
			HttpHeaders headers = new HttpHeaders();
			if (serialNumber != null) {
				apiResponseDto = searchService.getDocumentPathDetails(serialNumber);
			}
		 
		} catch (Exception e) {
			
			logger.info("ended on getDocumentFile in CdpAppSearchController");
		}
		return new ResponseEntity<ApiResponseDto>(apiResponseDto,HttpStatus.OK);
	}
	


	
	
	
	@RequestMapping(value ="/viewCimsUploadFile", method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> viewCimsUploadFile(@RequestParam String serialNumber,@RequestParam int index) {
		
		ApiResponseDto apiResponseDto =new ApiResponseDto();
		ResponseEntity<InputStreamResource> responseEntity = null;
		try {
			logger.info("started on viewCimsUploadFile in CdpAppSearchController");
			HttpHeaders headers = new HttpHeaders();
			if (serialNumber != null) {
			//	apiResponseDto = searchService.getDocumentPath(serialNumber);
				File file = searchService.getDocumentPath(serialNumber,index);
				String extension = "";
				FileInputStream fileInputStream = new FileInputStream(file);
				
				if(null != file){
				extension = FilenameUtils.getExtension(file.toString());
				if (null!=extension) {
					headers.add("Content-Disposition", "inline; filename=" + file.getName()); 
					if (extension.equalsIgnoreCase("pdf")) {
						responseEntity = ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
								.body(new InputStreamResource(fileInputStream));
					} else if (extension.equalsIgnoreCase("html")) {
						responseEntity = ResponseEntity.ok().headers(headers).contentType(MediaType.TEXT_HTML)
								.body(new InputStreamResource(fileInputStream));
					}
					}
					
				}
			}
		 
		} catch (Exception e) {
			
			logger.info("Exception on viewCimsUploadFile in CdpAppSearchController");
		}
		return responseEntity;
	}
	
	@GetMapping(value = "/viewArchivalData")
	public ResponseEntity<?> viewArchivalData(@RequestParam("policyNo") String policyNo,@RequestParam("serialNumber") String serialNumber) {

		ApiResponseDto apiResponseDto = new ApiResponseDto();
		try {
			apiResponseDto = searchService.viewArchivalData(policyNo,serialNumber);
		} catch (Exception e) {
			logger.info("Exception on viewUserData on CdpUserConroller", e);
		}
		return new ResponseEntity<ApiResponseDto>(apiResponseDto, HttpStatus.OK);
	}
	


}
