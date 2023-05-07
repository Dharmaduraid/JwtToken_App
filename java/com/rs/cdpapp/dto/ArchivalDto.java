package com.rs.cdpapp.dto;

import java.io.Serializable;

public class ArchivalDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String serialNo;
	private String customerName;
	private String iType;
	private String classification;
	private String uCause;
	private String capturedDate;
	private String documentId;
	private String dbName;
	private String policyNo;
	private String talismaId;
	private String sirdareferNo;
	private String complaintNo;
	
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getiType() {
		return iType;
	}
	public void setiType(String iType) {
		this.iType = iType;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getuCause() {
		return uCause;
	}
	public void setuCause(String uCause) {
		this.uCause = uCause;
	}
	public String getCapturedDate() {
		return capturedDate;
	}
	public void setCapturedDate(String capturedDate) {
		this.capturedDate = capturedDate;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getTalismaId() {
		return talismaId;
	}
	public void setTalismaId(String talismaId) {
		this.talismaId = talismaId;
	}
	public String getSirdareferNo() {
		return sirdareferNo;
	}
	public void setSirdareferNo(String sirdareferNo) {
		this.sirdareferNo = sirdareferNo;
	}
	public String getComplaintNo() {
		return complaintNo;
	}
	public void setComplaintNo(String complaintNo) {
		this.complaintNo = complaintNo;
	}
	
	

	
}
