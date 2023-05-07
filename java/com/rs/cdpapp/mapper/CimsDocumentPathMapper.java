package com.rs.cdpapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rs.cdpapp.dto.CimsDocumentDto;

public class CimsDocumentPathMapper implements RowMapper<CimsDocumentDto> {

	@Override
	public CimsDocumentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CimsDocumentDto dto=new CimsDocumentDto();
		
		dto.setDocumentPath(rs.getString("SATTACHMENTLINK"));
		dto.setSerialNumber(rs.getString("SERIALNO"));
		
		return dto;
	}

}
