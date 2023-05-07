package com.rs.cdpapp.serviceimpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;


import com.rs.cdpapp.common.util.QueryString;
import com.rs.cdpapp.config.dto.ApiResponseDto;
import com.rs.cdpapp.constants.ErrConstatns;
import com.rs.cdpapp.dto.ArchivalDto;
import com.rs.cdpapp.dto.CimsDocumentDto;
import com.rs.cdpapp.dto.CimsUpdatedDto;
import com.rs.cdpapp.mapper.CimsArchivalDataMapper;
import com.rs.cdpapp.mapper.CimsDocumentPathMapper;
import com.rs.cdpapp.mapper.CimsUpdatedMapper;
import com.rs.cdpapp.service.SearchService;


@Service
public class SearchServiceImpl implements SearchService {
	
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	NamedParameterJdbcTemplate cdpAppNamedParameterJdbcTemplate;
	
	@Autowired
	JdbcTemplate cdpAppJdbcTemplate;
	
	@Autowired
	private Environment envronment;

	@Override
	public ApiResponseDto searchValueBySerialNumOrPolicyNum(String policyNum, String serialNum) {
		
		ApiResponseDto<List<CimsUpdatedDto>> apiResponseDto =new ApiResponseDto<List<CimsUpdatedDto>>();
		try{
			
	 logger.info("started on searchValueBySerialNumOrPolicyNum in SearchServiceImpl");
			
		if(!serialNum.isEmpty()){
			 if(serialNum.length()==6 || serialNum.length()==7 || serialNum.length()==8){
		SqlParameterSource parameters = new MapSqlParameterSource()
				.addValue("serialNumber", "%"+serialNum);
		List<CimsUpdatedDto> dto=cdpAppNamedParameterJdbcTemplate.query(QueryString.GETVALUEBYSERIALNUM , parameters,new CimsUpdatedMapper());
		SqlParameterSource parameter = new MapSqlParameterSource().addValue("serialNumber", dto.get(0).getSerialNumber());
		List<CimsDocumentDto> documentPath = cdpAppNamedParameterJdbcTemplate.query(QueryString.GETDOCUMENTPATH, parameter,new CimsDocumentPathMapper());
		apiResponseDto.setCommonList(documentPath);
		apiResponseDto.setMessage("SUCCESS");
		apiResponseDto.setData(dto);
			 }
			 else{
				 System.out.println("No Data");
			 }
		}
		else{
			
			SqlParameterSource parameters = new MapSqlParameterSource()
				
			.addValue("policyNumber",policyNum);
			
			List<CimsUpdatedDto> dto=cdpAppNamedParameterJdbcTemplate.query(QueryString.GETVALUEBYRPOLICYNUMBER, parameters,new CimsUpdatedMapper());
			apiResponseDto.setMessage("SUCCESS");
			apiResponseDto.setData(dto);
		}
		
		
		}catch(Exception e){
			
			logger.info("Exception on searchValueBySerialNumOrPolicyNum in SearchServiceImpl",e);
		}
		return apiResponseDto;
	}

	@Override
	public ApiResponseDto sourceValueBySerialNum(String serialNum) {
		
		 List<CimsUpdatedDto> dto=null;
		ApiResponseDto<List<CimsUpdatedDto>> apiResponseDto =new ApiResponseDto<List<CimsUpdatedDto>>();
		try{
		logger.info("started on sourceValueBySerialNum in SearchServiceImpl");
	 
		SqlParameterSource parameters = new MapSqlParameterSource()
				.addValue("serialNumber", serialNum);
		dto=cdpAppNamedParameterJdbcTemplate.query(QueryString.GETVALUEBYSERIALNUM, parameters,new CimsUpdatedMapper());
//		if(menu.equals("Source")){
//		 dto=cdpAppNamedParameterJdbcTemplate.query(QueryString.GETVALUEFORSOURCE, parameters,new CimsUpdatedMapper());
//		}
       if(null!=dto && !dto.isEmpty()){
		apiResponseDto.setMessage("SUCCESS");
		apiResponseDto.setData(dto);
       }else
       {
    	  apiResponseDto.setMessage("FAIL"); 
       }
		
		}catch(Exception e){
			logger.info("Exception on sourceValueBySerialNum in SearchServiceImpl",e);
		}		return apiResponseDto;
	}


	@Override
	public File getDocumentPath(String serialNumber,int index) {
	
		File file = null;
		try{
			
			logger.info("started on getDocumentPath in SearchServiceImpl");
			
			SqlParameterSource parameters = new MapSqlParameterSource().addValue("serialNumber", serialNumber);
			List<CimsDocumentDto> documentPath = cdpAppNamedParameterJdbcTemplate.query(QueryString.GETDOCUMENTPATH, parameters,new CimsDocumentPathMapper());
				 file = new File(documentPath.get(index).getDocumentPath());
		
		}catch(Exception e){
			
			logger.info("Exception on getDocumentPath in SearchServiceImpl",e);
		}
		return file;
	}

	@Override
	public ApiResponseDto getDocumentPathDetails(String serialNumber) {

		ApiResponseDto apiResponseDto=new ApiResponseDto();
		try{
		
		logger.info("Exception on getDocumentPathDetails in SearchServiceImpl");
		
		SqlParameterSource parameters = new MapSqlParameterSource().addValue("serialNumber", serialNumber);
        List<String> cimsDocumentDtoList =new ArrayList<>();
		List<CimsDocumentDto> documentPath = cdpAppNamedParameterJdbcTemplate.query(QueryString.GETDOCUMENTPATH, parameters,new CimsDocumentPathMapper());
		//String url ="http://localhost:7575/CDPApp/api/viewCimsUploadFile?serialNumber=";
		
		String url=envronment.getProperty("DOCUMENTULR");
		for(int i=0;i< documentPath.size();i++){
			
			cimsDocumentDtoList.add(url.concat(documentPath.get(i).getSerialNumber().concat("&index="+i).concat("#toolbar=0")));
		}
		
		if(null != documentPath && !documentPath.isEmpty()){
		apiResponseDto.setData(cimsDocumentDtoList);
		apiResponseDto.setMessage(ErrConstatns.SUCCESS);
		}else{
			apiResponseDto.setMessage(ErrConstatns.FAIL);
		}
		}catch(Exception e){
			
			logger.info("Exception on getDocumentPathDetails in SearchServiceImpl",e);
		}

		return apiResponseDto;
	}

	@Override
	public ApiResponseDto viewArchivalData(String policyNo,String serialNumber) {
		List<ArchivalDto> dto=null;
		ApiResponseDto<List<ArchivalDto>> apiResponseDto =new ApiResponseDto<List<ArchivalDto>>();
		try{
		logger.info("started on viewArchivalData in SearchServiceImpl");
	 
		SqlParameterSource parameters = new MapSqlParameterSource("serialNumber",serialNumber)
				.addValue("policyNo", policyNo);
		dto=cdpAppNamedParameterJdbcTemplate.query(QueryString.GETARCHIVALDATA, parameters,new CimsArchivalDataMapper());
		apiResponseDto.setMessage("SUCCESS");
		apiResponseDto.setData(dto);
		
		}catch(Exception e){
			logger.info("Exception on viewArchivalData in SearchServiceImpl",e);
		}		return apiResponseDto;
	}
			
		}

	
	

	


