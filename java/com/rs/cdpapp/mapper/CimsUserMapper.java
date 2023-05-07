package com.rs.cdpapp.mapper;

import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;


import com.rs.cdpapp.dto.UserEntityDto;

public class CimsUserMapper implements RowMapper<UserEntityDto> {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public UserEntityDto  mapRow(ResultSet rs, int rowNum)  {
		
		UserEntityDto dto=new UserEntityDto();
		try{
			dto.setUsername(rs.getString("USER_NAME"));
		}
		catch(Exception e){
			logger.info("Exception on CimsUpdatedMapper ",e);
		}
		return dto;
	}

}
