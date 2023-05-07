package com.rs.cdpapp.mapper;

import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.rs.cdpapp.dto.ArchivalDto;



public class CimsArchivalDataMapper implements RowMapper<ArchivalDto> {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public  ArchivalDto mapRow(ResultSet rs, int rowNum)  {
		
		ArchivalDto dto=new ArchivalDto();
		try{
			dto.setSerialNo(rs.getString("SERIALNO"));
			dto.setCustomerName(rs.getString("CUSTOMERNAME"));
			dto.setiType(rs.getString("ITYPE"));
			dto.setClassification(rs.getString("CLASSIFICATION"));
			dto.setuCause(rs.getString("UCAUSE"));
			dto.setCapturedDate(rs.getString("CAPTUREDDATE"));
			dto.setPolicyNo(rs.getString("POLICYNO"));
		}
		catch(Exception e){
			logger.info("Exception on CimsUpdatedMapper ",e);
		}
		return dto;
	}

}
