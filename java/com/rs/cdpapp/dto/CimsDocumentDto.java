package com.rs.cdpapp.dto;

import java.io.Serializable;

public class CimsDocumentDto implements Serializable {
	
	private String documentPath;
	
	private String serialNumber;
	
	

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	
	

}
