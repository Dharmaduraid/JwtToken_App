package com.rs.cdpapp.dto;

import java.io.Serializable;


public class CimsUpdatedDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String finalStatus;
	private String employeeCode;
	private String complaintOrigination;
	private String complaintReopenOrigination;
	private String addressTo;
	private String isClosureAccepted;
	private String isClosureAccesspted;
	private String closureRequstLetterDate;
	private String closureRequestLetterDate;
	private String isClosureViolated;
	private String closureViolationRemark;
	private String isRegularityImprovementSuggested;
	private String closureActionSuggested;
	private String closeactionSuggested;
	private String regularityImprovementSuggestions;
	private String priorityHandlingId;
	private String priorityHandlingName;
	private String remarks;
    private String claimHour;
    private String claimMin;
    private String claimAM;

	public String getClaimHour() {
		return claimHour;
	}
	public void setClaimHour(String claimHour) {
		this.claimHour = claimHour;
	}
	public String getClaimMin() {
		return claimMin;
	}
	public void setClaimMin(String claimMin) {
		this.claimMin = claimMin;
	}
	public String getClaimAM() {
		return claimAM;
	}
	public void setClaimAM(String claimAM) {
		this.claimAM = claimAM;
	}
	private String coverNoteNumber;
	private String campaignCode;
	private String policyAddress;
	private String chequeNumber;
	private String vehicleNumber;

	private String telephoneNumber;
	private String address;
	private String permanentAddress;






	private String permanentMobile;
	private String deliveryDate;
	private String mailingDate;
	private String despatchDate;
	private String deliveryStatus;
	private String converNoteIssueDate;
	private String consignmentNumber;
	private String modeOfDispatch;
	private String despatchThrough;
	private String deliveredTo;
	private String searchCriteria;
	private String name;
	private String nameSearchBy;
	private String chequeNumberPay;
	private String policies;
	private String phoneNo;
	private String vip;
	private String policyAsh;
	private String productName;
	private String chequeNo;
	

	private String combiPolicy;
	private String lifePolicy;

	private String bankAccountNumber;
	private String debitCard;

	private String creditCard;
	private String email;
	private String healthCardNumber;
	private String teleNumber;
	private String enterAgentCode;
	private String topRight;
	private String agCode;
	private String agnetName;
	private String dateOfBirth;
	private String agMobileNumber;
	private String agCity;
	private String agState;
	private String region;
	private String emaiId;
	private String licencedNonLicenced;
	private String panNo;
	private String lifePolicyAsh;
	private String combiPolicyAsh;
	private String policyPeriodFromTp;
	private String policyPeriodToTp;
	private String vehicalAsh;
	private String vehicalMake;
	private String model;
	private String policyPassword;
	private String registeredNumber;
	private String mobileNumber;
	private String state;
	private String alernateMobileNumber;
	private String email4;
	private String residencePhone;
	private String officePhone;
	private String officeFax;
	private String receiptNumber;
	private String processingUnit;
	private String agentMobileNo;
	private String renewalIdvNumber;
	private String renewalNcb;
	private String renewalPremium;
	private String status;
	private String onlineRenewalOption;
	private String satisfactoryScore;
	private String customerPolicyAsh;
	private String healthCardNo;
	private String claimReportedNew;
	private String claimPaid;
	private String linkNumber;
	private String responseCommitedMonth;
	private String responseCommitedYear;
	private String claims;
	private String covid19;
	private String mailSentForComplaintClaim;
	private String intimationOfBccMembers;
	private String city;
	private String claimLocation;
	private String claimArea;
	private String newArea;
	private String interactionType;
	private String classification;
	private String healthSubCategory;
	private String underlyingCause;

    private String policyPeriodFrom;
    private String policyPeriodTo;
    private String clientPremium;





	public String getClientPremium() {
		return clientPremium;
	}
	public void setClientPremium(String clientPremium) {
		this.clientPremium = clientPremium;
	}
	public String getPolicyPeriodFrom() {
		return policyPeriodFrom;
	}
	public void setPolicyPeriodFrom(String policyPeriodFrom) {
		this.policyPeriodFrom = policyPeriodFrom;
	}
	public String getPolicyPeriodTo() {
		return policyPeriodTo;
	}
	public void setPolicyPeriodTo(String policyPeriodTo) {
		this.policyPeriodTo = policyPeriodTo;
	}
	private String stateIc;
	private String cityIc;





	private String irdaStateId;

	private String receivedRenewalNotice;
	private String receivedRenewalTeamCallback;
	private String instaPayLink;
	private String customerEmail;
	private String mailRequestSent;
	private String d2c;



	private String selectNeft;
	private String neftTransferForm;
	private String customerMailId1;
	private String selectChangeRequestFormForInclusion;
	private String changeReqyestFormForInclusionForInsuredProcedure;
	private String customerEmailId2;
	private String selectChangeRequestForm;
	private String changeRequestFormForSumIlnsuredProcedure;
	private String customerMailId3;
	private String selectNameTransferMotorCarFormForInclusion;
	private String nameTransferFormMotorCar;
	private String customerMailId4;
	private String selectNameTransferTwoWheelerFormForInclusion;
	private String nameTransferFormForTwoWheeler;
	private String customerMailId5;
	private String selectProposerNameChangeRequestForm;
	private String proposerNameChangeForm;
	private String customerMailId;
	private String retentionTool;
	private String branch;
	private String premium;
	private String acknowledgedmentSent;
	private String finalResolutionSent;
	private String claimForms;
	private String customerEmailDisp;
	private String irdaOriginalTokenNumber;
	private String complaintInformed;
	private String acceptedRejected;
	private String doYouWantToToReassign;
	private String reassignto;
	private String intimatedBy;
	private String intimatedDateAndTime;

	private String dateOfLoss;
	private String timeOfLossHours;
	private String timeOfLossMin;
	private String timeOfLossAm;
	private String activityNumber;

	public String getActivityNumber() {
		return activityNumber;
	}
	public void setActivityNumber(String activityNumber) {
		this.activityNumber = activityNumber;
	}
	private String operator;
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	private String repairerName;
	private String repairerAddress;
	private String repairerContact;
	private String relationshipOfTheCaller;
	private String spocPersonToBeContacted;
	private String spocPersonMobileNumber;
	private String driverNameAtTheTimeOfAccident;
	private String isInjured;
	private String accidentState;
	private String accidentCity;
	private String currentVehicalLocation;
	private String lossLocation;
	private String natureOfLoss;
	private String modeOfIntimation;
	private String doYouWantToDpReassign;
	private String dpReassignTo;
	private String irdaComments;
	private String approverComments;
	private String commentsComplaintMotorClaim;
	private String natureOfRootCause;
	private String resolutionForRootCause;
	private String rootCauseFixed;
	private String communicateWithTheCustomer;
	private String selectTheModeOfCommunication;
	private String mailWillBeSentTo;
	private String doYouWantToCloseTheCall;
	private String feedback;
	private String followUpCount;
	private String followUpDays;
	private String followupDone;
	private String followUpDate;
	private String resolutionMode1;
	private String resolutionMode2;
	private String resolutionMode3;
	private String resolutionMode4;
	private String activityNo;
	private String activityName;
	private String flag;
	private String function;
	private String thirdParty;
	private String slaDate;
	private String teamName;
	private String membersResponsible;
	private String sla;
	private String endDateTime;
	private String escalationTo;
	private String ashNumber;
	private String activityName1;
	private String conditions;
	private String sla1;
	private String endDateTime2;
	private String escalationTo2;
	private String sla2;
	private String endDateTime3;
	private String escalationTo3;
	private String irdaComplaintTypeId;
	private String irdaComplaintDescriptionId;
	private String irdaTat;
	private String activitynoLog;
	private String activityNameLog;
	private String ifReassignedToWhom;
	private String waitingDays;
	private String awbNumber;
	
	private String serialNumber;
	
	private String isClosureRequsted;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private String address4;
	
	private String isAddressCorrection;
	
	private String isAddressCorrectionDis;
	
	private String pincode;
	
	private String cityCode;
	private String stateId;
	private String cityId;
	private String stateCode;
	private String irdaCityId;
	
	private String subUnderLyingCause1;
	private String subUnderLyingCause2;
	private String subUnderLyingCause3;
	
	private String customerName;
	
	private String iType;
	private String iCode;
	private String ucCode;
	private String interactionNum;
	private String location;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInteractionNum() {
		return interactionNum;
	}
	public void setInteractionNum(String interactionNum) {
		this.interactionNum = interactionNum;
	}
	public String getiType() {
		return iType;
	}
	public void setiType(String iType) {
		this.iType = iType;
	}
	public String getiCode() {
		return iCode;
	}
	public void setiCode(String iCode) {
		this.iCode = iCode;
	}
	public String getUcCode() {
		return ucCode;
	}
	public void setUcCode(String ucCode) {
		this.ucCode = ucCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	private String documentPath;
		
	public String getDocumentPath() {
		return documentPath;
	}
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	public String getSubUnderLyingCause1() {
		return subUnderLyingCause1;
	}
	public void setSubUnderLyingCause1(String subUnderLyingCause1) {
		this.subUnderLyingCause1 = subUnderLyingCause1;
	}
	public String getSubUnderLyingCause2() {
		return subUnderLyingCause2;
	}
	public void setSubUnderLyingCause2(String subUnderLyingCause2) {
		this.subUnderLyingCause2 = subUnderLyingCause2;
	}
	public String getSubUnderLyingCause3() {
		return subUnderLyingCause3;
	}
	public void setSubUnderLyingCause3(String subUnderLyingCause3) {
		this.subUnderLyingCause3 = subUnderLyingCause3;
	}
	public String getIrdaCityId() {
		return irdaCityId;
	}
	public void setIrdaCityId(String irdaCityId) {
		this.irdaCityId = irdaCityId;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getAddress4() {
		return address4;
	}
	public void setAddress4(String address4) {
		this.address4 = address4;
	}
	public String getIsAddressCorrection() {
		return isAddressCorrection;
	}
	public void setIsAddressCorrection(String isAddressCorrection) {
		this.isAddressCorrection = isAddressCorrection;
	}
	public String getIsAddressCorrectionDis() {
		return isAddressCorrectionDis;
	}
	public void setIsAddressCorrectionDis(String isAddressCorrectionDis) {
		this.isAddressCorrectionDis = isAddressCorrectionDis;
	}
	public String getIsClosureRequsted() {
		return isClosureRequsted;
	}
	public void setIsClosureRequsted(String isClosureRequsted) {
		this.isClosureRequsted = isClosureRequsted;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getComplaintOrigination() {
		return complaintOrigination;
	}
	public void setComplaintOrigination(String complaintOrigination) {
		this.complaintOrigination = complaintOrigination;
	}
	public String getComplaintReopenOrigination() {
		return complaintReopenOrigination;
	}
	public void setComplaintReopenOrigination(String complaintReopenOrigination) {
		this.complaintReopenOrigination = complaintReopenOrigination;
	}
	public String getAddressTo() {
		return addressTo;
	}
	public void setAddressTo(String addressTo) {
		this.addressTo = addressTo;
	}
	public String getIsClosureAccepted() {
		return isClosureAccepted;
	}
	public void setIsClosureAccepted(String isClosureAccepted) {
		this.isClosureAccepted = isClosureAccepted;
	}
	public String getIsClosureAccesspted() {
		return isClosureAccesspted;
	}
	public void setIsClosureAccesspted(String isClosureAccesspted) {
		this.isClosureAccesspted = isClosureAccesspted;
	}
	public String getClosureRequstLetterDate() {
		return closureRequstLetterDate;
	}
	public void setClosureRequstLetterDate(String closureRequstLetterDate) {
		this.closureRequstLetterDate = closureRequstLetterDate;
	}
	public String getClosureRequestLetterDate() {
		return closureRequestLetterDate;
	}
	public void setClosureRequestLetterDate(String closureRequestLetterDate) {
		this.closureRequestLetterDate = closureRequestLetterDate;
	}
	public String getIsClosureViolated() {
		return isClosureViolated;
	}
	public void setIsClosureViolated(String isClosureViolated) {
		this.isClosureViolated = isClosureViolated;
	}
	public String getClosureViolationRemark() {
		return closureViolationRemark;
	}
	public void setClosureViolationRemark(String closureViolationRemark) {
		this.closureViolationRemark = closureViolationRemark;
	}
	public String getIsRegularityImprovementSuggested() {
		return isRegularityImprovementSuggested;
	}
	public void setIsRegularityImprovementSuggested(String isRegularityImprovementSuggested) {
		this.isRegularityImprovementSuggested = isRegularityImprovementSuggested;
	}
	public String getClosureActionSuggested() {
		return closureActionSuggested;
	}
	public void setClosureActionSuggested(String closureActionSuggested) {
		this.closureActionSuggested = closureActionSuggested;
	}
	public String getCloseactionSuggested() {
		return closeactionSuggested;
	}
	public void setCloseactionSuggested(String closeactionSuggested) {
		this.closeactionSuggested = closeactionSuggested;
	}
	public String getRegularityImprovementSuggestions() {
		return regularityImprovementSuggestions;
	}
	public void setRegularityImprovementSuggestions(String regularityImprovementSuggestions) {
		this.regularityImprovementSuggestions = regularityImprovementSuggestions;
	}
	public String getPriorityHandlingId() {
		return priorityHandlingId;
	}
	public void setPriorityHandlingId(String priorityHandlingId) {
		this.priorityHandlingId = priorityHandlingId;
	}
	public String getPriorityHandlingName() {
		return priorityHandlingName;
	}
	public void setPriorityHandlingName(String priorityHandlingName) {
		this.priorityHandlingName = priorityHandlingName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCoverNoteNumber() {
		return coverNoteNumber;
	}
	public void setCoverNoteNumber(String coverNoteNumber) {
		this.coverNoteNumber = coverNoteNumber;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public String getPolicyAddress() {
		return policyAddress;
	}
	public void setPolicyAddress(String policyAddress) {
		this.policyAddress = policyAddress;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPermanentMobile() {
		return permanentMobile;
	}
	public void setPermanentMobile(String permanentMobile) {
		this.permanentMobile = permanentMobile;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getMailingDate() {
		return mailingDate;
	}
	public void setMailingDate(String mailingDate) {
		this.mailingDate = mailingDate;
	}
	public String getDespatchDate() {
		return despatchDate;
	}
	public void setDespatchDate(String despatchDate) {
		this.despatchDate = despatchDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getConverNoteIssueDate() {
		return converNoteIssueDate;
	}
	public void setConverNoteIssueDate(String converNoteIssueDate) {
		this.converNoteIssueDate = converNoteIssueDate;
	}
	public String getConsignmentNumber() {
		return consignmentNumber;
	}
	public void setConsignmentNumber(String consignmentNumber) {
		this.consignmentNumber = consignmentNumber;
	}
	public String getModeOfDispatch() {
		return modeOfDispatch;
	}
	public void setModeOfDispatch(String modeOfDispatch) {
		this.modeOfDispatch = modeOfDispatch;
	}
	public String getDespatchThrough() {
		return despatchThrough;
	}
	public void setDespatchThrough(String despatchThrough) {
		this.despatchThrough = despatchThrough;
	}
	public String getDeliveredTo() {
		return deliveredTo;
	}
	public void setDeliveredTo(String deliveredTo) {
		this.deliveredTo = deliveredTo;
	}
	public String getSearchCriteria() {
		return searchCriteria;
	}
	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameSearchBy() {
		return nameSearchBy;
	}
	public void setNameSearchBy(String nameSearchBy) {
		this.nameSearchBy = nameSearchBy;
	}
	public String getChequeNumberPay() {
		return chequeNumberPay;
	}
	public void setChequeNumberPay(String chequeNumberPay) {
		this.chequeNumberPay = chequeNumberPay;
	}
	public String getPolicies() {
		return policies;
	}
	public void setPolicies(String policies) {
		this.policies = policies;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public String getPolicyAsh() {
		return policyAsh;
	}
	public void setPolicyAsh(String policyAsh) {
		this.policyAsh = policyAsh;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCombiPolicy() {
		return combiPolicy;
	}
	public void setCombiPolicy(String combiPolicy) {
		this.combiPolicy = combiPolicy;
	}
	public String getLifePolicy() {
		return lifePolicy;
	}
	public void setLifePolicy(String lifePolicy) {
		this.lifePolicy = lifePolicy;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	public String getEmail() {
		return email;
	}
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHealthCardNumber() {
		return healthCardNumber;
	}
	public void setHealthCardNumber(String healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}
	public String getTeleNumber() {
		return teleNumber;
	}
	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}
	public String getEnterAgentCode() {
		return enterAgentCode;
	}
	public void setEnterAgentCode(String enterAgentCode) {
		this.enterAgentCode = enterAgentCode;
	}
	public String getTopRight() {
		return topRight;
	}
	public void setTopRight(String topRight) {
		this.topRight = topRight;
	}
	public String getAgCode() {
		return agCode;
	}
	public void setAgCode(String agCode) {
		this.agCode = agCode;
	}
	public String getAgnetName() {
		return agnetName;
	}
	public void setAgnetName(String agnetName) {
		this.agnetName = agnetName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAgMobileNumber() {
		return agMobileNumber;
	}
	public void setAgMobileNumber(String agMobileNumber) {
		this.agMobileNumber = agMobileNumber;
	}
	public String getAgCity() {
		return agCity;
	}
	public void setAgCity(String agCity) {
		this.agCity = agCity;
	}
	public String getAgState() {
		return agState;
	}
	public void setAgState(String agState) {
		this.agState = agState;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getEmaiId() {
		return emaiId;
	}
	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}
	public String getLicencedNonLicenced() {
		return licencedNonLicenced;
	}
	public void setLicencedNonLicenced(String licencedNonLicenced) {
		this.licencedNonLicenced = licencedNonLicenced;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getLifePolicyAsh() {
		return lifePolicyAsh;
	}
	public void setLifePolicyAsh(String lifePolicyAsh) {
		this.lifePolicyAsh = lifePolicyAsh;
	}
	public String getCombiPolicyAsh() {
		return combiPolicyAsh;
	}
	public void setCombiPolicyAsh(String combiPolicyAsh) {
		this.combiPolicyAsh = combiPolicyAsh;
	}
	public String getPolicyPeriodFromTp() {
		return policyPeriodFromTp;
	}
	public void setPolicyPeriodFromTp(String policyPeriodFromTp) {
		this.policyPeriodFromTp = policyPeriodFromTp;
	}
	public String getPolicyPeriodToTp() {
		return policyPeriodToTp;
	}
	public void setPolicyPeriodToTp(String policyPeriodToTp) {
		this.policyPeriodToTp = policyPeriodToTp;
	}
	public String getVehicalAsh() {
		return vehicalAsh;
	}
	public void setVehicalAsh(String vehicalAsh) {
		this.vehicalAsh = vehicalAsh;
	}
	public String getVehicalMake() {
		return vehicalMake;
	}
	public void setVehicalMake(String vehicalMake) {
		this.vehicalMake = vehicalMake;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPolicyPassword() {
		return policyPassword;
	}
	public void setPolicyPassword(String policyPassword) {
		this.policyPassword = policyPassword;
	}
	public String getRegisteredNumber() {
		return registeredNumber;
	}
	public void setRegisteredNumber(String registeredNumber) {
		this.registeredNumber = registeredNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAlernateMobileNumber() {
		return alernateMobileNumber;
	}
	public void setAlernateMobileNumber(String alernateMobileNumber) {
		this.alernateMobileNumber = alernateMobileNumber;
	}
	public String getEmail4() {
		return email4;
	}
	public void setEmail4(String email4) {
		this.email4 = email4;
	}
	public String getResidencePhone() {
		return residencePhone;
	}
	public void setResidencePhone(String residencePhone) {
		this.residencePhone = residencePhone;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getOfficeFax() {
		return officeFax;
	}
	public void setOfficeFax(String officeFax) {
		this.officeFax = officeFax;
	}
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public String getProcessingUnit() {
		return processingUnit;
	}
	public void setProcessingUnit(String processingUnit) {
		this.processingUnit = processingUnit;
	}
	public String getAgentMobileNo() {
		return agentMobileNo;
	}
	public void setAgentMobileNo(String agentMobileNo) {
		this.agentMobileNo = agentMobileNo;
	}
	public String getRenewalIdvNumber() {
		return renewalIdvNumber;
	}
	public void setRenewalIdvNumber(String renewalIdvNumber) {
		this.renewalIdvNumber = renewalIdvNumber;
	}
	public String getRenewalNcb() {
		return renewalNcb;
	}
	public void setRenewalNcb(String renewalNcb) {
		this.renewalNcb = renewalNcb;
	}
	public String getRenewalPremium() {
		return renewalPremium;
	}
	public void setRenewalPremium(String renewalPremium) {
		this.renewalPremium = renewalPremium;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOnlineRenewalOption() {
		return onlineRenewalOption;
	}
	public void setOnlineRenewalOption(String onlineRenewalOption) {
		this.onlineRenewalOption = onlineRenewalOption;
	}
	public String getSatisfactoryScore() {
		return satisfactoryScore;
	}
	public void setSatisfactoryScore(String satisfactoryScore) {
		this.satisfactoryScore = satisfactoryScore;
	}
	public String getCustomerPolicyAsh() {
		return customerPolicyAsh;
	}
	public void setCustomerPolicyAsh(String customerPolicyAsh) {
		this.customerPolicyAsh = customerPolicyAsh;
	}
	public String getHealthCardNo() {
		return healthCardNo;
	}
	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}
	public String getClaimReportedNew() {
		return claimReportedNew;
	}
	public void setClaimReportedNew(String claimReportedNew) {
		this.claimReportedNew = claimReportedNew;
	}
	public String getClaimPaid() {
		return claimPaid;
	}
	public void setClaimPaid(String claimPaid) {
		this.claimPaid = claimPaid;
	}
	public String getLinkNumber() {
		return linkNumber;
	}
	public void setLinkNumber(String linkNumber) {
		this.linkNumber = linkNumber;
	}
	public String getResponseCommitedMonth() {
		return responseCommitedMonth;
	}
	public void setResponseCommitedMonth(String responseCommitedMonth) {
		this.responseCommitedMonth = responseCommitedMonth;
	}
	public String getResponseCommitedYear() {
		return responseCommitedYear;
	}
	public void setResponseCommitedYear(String responseCommitedYear) {
		this.responseCommitedYear = responseCommitedYear;
	}
	public String getClaims() {
		return claims;
	}
	public void setClaims(String claims) {
		this.claims = claims;
	}
	public String getCovid19() {
		return covid19;
	}
	public void setCovid19(String covid19) {
		this.covid19 = covid19;
	}
	public String getMailSentForComplaintClaim() {
		return mailSentForComplaintClaim;
	}
	public void setMailSentForComplaintClaim(String mailSentForComplaintClaim) {
		this.mailSentForComplaintClaim = mailSentForComplaintClaim;
	}
	public String getIntimationOfBccMembers() {
		return intimationOfBccMembers;
	}
	public void setIntimationOfBccMembers(String intimationOfBccMembers) {
		this.intimationOfBccMembers = intimationOfBccMembers;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClaimLocation() {
		return claimLocation;
	}
	public void setClaimLocation(String claimLocation) {
		this.claimLocation = claimLocation;
	}
	public String getClaimArea() {
		return claimArea;
	}
	public void setClaimArea(String claimArea) {
		this.claimArea = claimArea;
	}
	public String getNewArea() {
		return newArea;
	}
	public void setNewArea(String newArea) {
		this.newArea = newArea;
	}
	public String getInteractionType() {
		return interactionType;
	}
	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getHealthSubCategory() {
		return healthSubCategory;
	}
	public void setHealthSubCategory(String healthSubCategory) {
		this.healthSubCategory = healthSubCategory;
	}
	public String getUnderlyingCause() {
		return underlyingCause;
	}
	public void setUnderlyingCause(String underlyingCause) {
		this.underlyingCause = underlyingCause;
	}
	public String getStateIc() {
		return stateIc;
	}
	public void setStateIc(String stateIc) {
		this.stateIc = stateIc;
	}
	public String getCityIc() {
		return cityIc;
	}
	public void setCityIc(String cityIc) {
		this.cityIc = cityIc;
	}
	public String getIrdaStateId() {
		return irdaStateId;
	}
	public void setIrdaStateId(String irdaStateId) {
		this.irdaStateId = irdaStateId;
	}
	public String getReceivedRenewalNotice() {
		return receivedRenewalNotice;
	}
	public void setReceivedRenewalNotice(String receivedRenewalNotice) {
		this.receivedRenewalNotice = receivedRenewalNotice;
	}
	public String getReceivedRenewalTeamCallback() {
		return receivedRenewalTeamCallback;
	}
	public void setReceivedRenewalTeamCallback(String receivedRenewalTeamCallback) {
		this.receivedRenewalTeamCallback = receivedRenewalTeamCallback;
	}
	public String getInstaPayLink() {
		return instaPayLink;
	}
	public void setInstaPayLink(String instaPayLink) {
		this.instaPayLink = instaPayLink;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getMailRequestSent() {
		return mailRequestSent;
	}
	public void setMailRequestSent(String mailRequestSent) {
		this.mailRequestSent = mailRequestSent;
	}
	public String getD2c() {
		return d2c;
	}
	public void setD2c(String d2c) {
		this.d2c = d2c;
	}
	public String getSelectNeft() {
		return selectNeft;
	}
	public void setSelectNeft(String selectNeft) {
		this.selectNeft = selectNeft;
	}
	public String getNeftTransferForm() {
		return neftTransferForm;
	}
	public void setNeftTransferForm(String neftTransferForm) {
		this.neftTransferForm = neftTransferForm;
	}
	public String getCustomerMailId1() {
		return customerMailId1;
	}
	public void setCustomerMailId1(String customerMailId1) {
		this.customerMailId1 = customerMailId1;
	}
	public String getSelectChangeRequestFormForInclusion() {
		return selectChangeRequestFormForInclusion;
	}
	public void setSelectChangeRequestFormForInclusion(String selectChangeRequestFormForInclusion) {
		this.selectChangeRequestFormForInclusion = selectChangeRequestFormForInclusion;
	}
	public String getChangeReqyestFormForInclusionForInsuredProcedure() {
		return changeReqyestFormForInclusionForInsuredProcedure;
	}
	public void setChangeReqyestFormForInclusionForInsuredProcedure(
			String changeReqyestFormForInclusionForInsuredProcedure) {
		this.changeReqyestFormForInclusionForInsuredProcedure = changeReqyestFormForInclusionForInsuredProcedure;
	}
	public String getCustomerEmailId2() {
		return customerEmailId2;
	}
	public void setCustomerEmailId2(String customerEmailId2) {
		this.customerEmailId2 = customerEmailId2;
	}
	public String getSelectChangeRequestForm() {
		return selectChangeRequestForm;
	}
	public void setSelectChangeRequestForm(String selectChangeRequestForm) {
		this.selectChangeRequestForm = selectChangeRequestForm;
	}
	public String getChangeRequestFormForSumIlnsuredProcedure() {
		return changeRequestFormForSumIlnsuredProcedure;
	}
	public void setChangeRequestFormForSumIlnsuredProcedure(String changeRequestFormForSumIlnsuredProcedure) {
		this.changeRequestFormForSumIlnsuredProcedure = changeRequestFormForSumIlnsuredProcedure;
	}
	public String getCustomerMailId3() {
		return customerMailId3;
	}
	public void setCustomerMailId3(String customerMailId3) {
		this.customerMailId3 = customerMailId3;
	}
	public String getSelectNameTransferMotorCarFormForInclusion() {
		return selectNameTransferMotorCarFormForInclusion;
	}
	public void setSelectNameTransferMotorCarFormForInclusion(String selectNameTransferMotorCarFormForInclusion) {
		this.selectNameTransferMotorCarFormForInclusion = selectNameTransferMotorCarFormForInclusion;
	}
	public String getNameTransferFormMotorCar() {
		return nameTransferFormMotorCar;
	}
	public void setNameTransferFormMotorCar(String nameTransferFormMotorCar) {
		this.nameTransferFormMotorCar = nameTransferFormMotorCar;
	}
	public String getCustomerMailId4() {
		return customerMailId4;
	}
	public void setCustomerMailId4(String customerMailId4) {
		this.customerMailId4 = customerMailId4;
	}
	public String getSelectNameTransferTwoWheelerFormForInclusion() {
		return selectNameTransferTwoWheelerFormForInclusion;
	}
	public void setSelectNameTransferTwoWheelerFormForInclusion(String selectNameTransferTwoWheelerFormForInclusion) {
		this.selectNameTransferTwoWheelerFormForInclusion = selectNameTransferTwoWheelerFormForInclusion;
	}
	public String getNameTransferFormForTwoWheeler() {
		return nameTransferFormForTwoWheeler;
	}
	public void setNameTransferFormForTwoWheeler(String nameTransferFormForTwoWheeler) {
		this.nameTransferFormForTwoWheeler = nameTransferFormForTwoWheeler;
	}
	public String getCustomerMailId5() {
		return customerMailId5;
	}
	public void setCustomerMailId5(String customerMailId5) {
		this.customerMailId5 = customerMailId5;
	}
	public String getSelectProposerNameChangeRequestForm() {
		return selectProposerNameChangeRequestForm;
	}
	public void setSelectProposerNameChangeRequestForm(String selectProposerNameChangeRequestForm) {
		this.selectProposerNameChangeRequestForm = selectProposerNameChangeRequestForm;
	}
	public String getProposerNameChangeForm() {
		return proposerNameChangeForm;
	}
	public void setProposerNameChangeForm(String proposerNameChangeForm) {
		this.proposerNameChangeForm = proposerNameChangeForm;
	}
	public String getCustomerMailId() {
		return customerMailId;
	}
	public void setCustomerMailId(String customerMailId) {
		this.customerMailId = customerMailId;
	}
	public String getRetentionTool() {
		return retentionTool;
	}
	public void setRetentionTool(String retentionTool) {
		this.retentionTool = retentionTool;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getAcknowledgedmentSent() {
		return acknowledgedmentSent;
	}
	public void setAcknowledgedmentSent(String acknowledgedmentSent) {
		this.acknowledgedmentSent = acknowledgedmentSent;
	}
	public String getFinalResolutionSent() {
		return finalResolutionSent;
	}
	public void setFinalResolutionSent(String finalResolutionSent) {
		this.finalResolutionSent = finalResolutionSent;
	}
	public String getClaimForms() {
		return claimForms;
	}
	public void setClaimForms(String claimForms) {
		this.claimForms = claimForms;
	}
	public String getCustomerEmailDisp() {
		return customerEmailDisp;
	}
	public void setCustomerEmailDisp(String customerEmailDisp) {
		this.customerEmailDisp = customerEmailDisp;
	}
	public String getIrdaOriginalTokenNumber() {
		return irdaOriginalTokenNumber;
	}
	public void setIrdaOriginalTokenNumber(String irdaOriginalTokenNumber) {
		this.irdaOriginalTokenNumber = irdaOriginalTokenNumber;
	}
	public String getComplaintInformed() {
		return complaintInformed;
	}
	public void setComplaintInformed(String complaintInformed) {
		this.complaintInformed = complaintInformed;
	}
	public String getAcceptedRejected() {
		return acceptedRejected;
	}
	public void setAcceptedRejected(String acceptedRejected) {
		this.acceptedRejected = acceptedRejected;
	}
	public String getDoYouWantToToReassign() {
		return doYouWantToToReassign;
	}
	public void setDoYouWantToToReassign(String doYouWantToToReassign) {
		this.doYouWantToToReassign = doYouWantToToReassign;
	}
	public String getReassignto() {
		return reassignto;
	}
	public void setReassignto(String reassignto) {
		this.reassignto = reassignto;
	}
	public String getIntimatedBy() {
		return intimatedBy;
	}
	public void setIntimatedBy(String intimatedBy) {
		this.intimatedBy = intimatedBy;
	}
	public String getIntimatedDateAndTime() {
		return intimatedDateAndTime;
	}
	public void setIntimatedDateAndTime(String intimatedDateAndTime) {
		this.intimatedDateAndTime = intimatedDateAndTime;
	}
	public String getDateOfLoss() {
		return dateOfLoss;
	}
	public void setDateOfLoss(String dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}
	public String getTimeOfLossHours() {
		return timeOfLossHours;
	}
	public void setTimeOfLossHours(String timeOfLossHours) {
		this.timeOfLossHours = timeOfLossHours;
	}
	public String getTimeOfLossMin() {
		return timeOfLossMin;
	}
	public void setTimeOfLossMin(String timeOfLossMin) {
		this.timeOfLossMin = timeOfLossMin;
	}
	public String getTimeOfLossAm() {
		return timeOfLossAm;
	}
	public void setTimeOfLossAm(String timeOfLossAm) {
		this.timeOfLossAm = timeOfLossAm;
	}
	public String getRepairerName() {
		return repairerName;
	}
	public void setRepairerName(String repairerName) {
		this.repairerName = repairerName;
	}
	public String getRepairerAddress() {
		return repairerAddress;
	}
	public void setRepairerAddress(String repairerAddress) {
		this.repairerAddress = repairerAddress;
	}
	public String getRepairerContact() {
		return repairerContact;
	}
	public void setRepairerContact(String repairerContact) {
		this.repairerContact = repairerContact;
	}
	public String getRelationshipOfTheCaller() {
		return relationshipOfTheCaller;
	}
	public void setRelationshipOfTheCaller(String relationshipOfTheCaller) {
		this.relationshipOfTheCaller = relationshipOfTheCaller;
	}
	public String getSpocPersonToBeContacted() {
		return spocPersonToBeContacted;
	}
	public void setSpocPersonToBeContacted(String spocPersonToBeContacted) {
		this.spocPersonToBeContacted = spocPersonToBeContacted;
	}
	public String getSpocPersonMobileNumber() {
		return spocPersonMobileNumber;
	}
	public void setSpocPersonMobileNumber(String spocPersonMobileNumber) {
		this.spocPersonMobileNumber = spocPersonMobileNumber;
	}
	public String getDriverNameAtTheTimeOfAccident() {
		return driverNameAtTheTimeOfAccident;
	}
	public void setDriverNameAtTheTimeOfAccident(String driverNameAtTheTimeOfAccident) {
		this.driverNameAtTheTimeOfAccident = driverNameAtTheTimeOfAccident;
	}
	public String getIsInjured() {
		return isInjured;
	}
	public void setIsInjured(String isInjured) {
		this.isInjured = isInjured;
	}
	public String getAccidentState() {
		return accidentState;
	}
	public void setAccidentState(String accidentState) {
		this.accidentState = accidentState;
	}
	public String getAccidentCity() {
		return accidentCity;
	}
	public void setAccidentCity(String accidentCity) {
		this.accidentCity = accidentCity;
	}
	public String getCurrentVehicalLocation() {
		return currentVehicalLocation;
	}
	public void setCurrentVehicalLocation(String currentVehicalLocation) {
		this.currentVehicalLocation = currentVehicalLocation;
	}
	public String getLossLocation() {
		return lossLocation;
	}
	public void setLossLocation(String lossLocation) {
		this.lossLocation = lossLocation;
	}
	public String getNatureOfLoss() {
		return natureOfLoss;
	}
	public void setNatureOfLoss(String natureOfLoss) {
		this.natureOfLoss = natureOfLoss;
	}
	public String getModeOfIntimation() {
		return modeOfIntimation;
	}
	public void setModeOfIntimation(String modeOfIntimation) {
		this.modeOfIntimation = modeOfIntimation;
	}
	public String getDoYouWantToDpReassign() {
		return doYouWantToDpReassign;
	}
	public void setDoYouWantToDpReassign(String doYouWantToDpReassign) {
		this.doYouWantToDpReassign = doYouWantToDpReassign;
	}
	public String getDpReassignTo() {
		return dpReassignTo;
	}
	public void setDpReassignTo(String dpReassignTo) {
		this.dpReassignTo = dpReassignTo;
	}
	public String getIrdaComments() {
		return irdaComments;
	}
	public void setIrdaComments(String irdaComments) {
		this.irdaComments = irdaComments;
	}
	public String getApproverComments() {
		return approverComments;
	}
	public void setApproverComments(String approverComments) {
		this.approverComments = approverComments;
	}
	public String getCommentsComplaintMotorClaim() {
		return commentsComplaintMotorClaim;
	}
	public void setCommentsComplaintMotorClaim(String commentsComplaintMotorClaim) {
		this.commentsComplaintMotorClaim = commentsComplaintMotorClaim;
	}
	public String getNatureOfRootCause() {
		return natureOfRootCause;
	}
	public void setNatureOfRootCause(String natureOfRootCause) {
		this.natureOfRootCause = natureOfRootCause;
	}
	public String getResolutionForRootCause() {
		return resolutionForRootCause;
	}
	public void setResolutionForRootCause(String resolutionForRootCause) {
		this.resolutionForRootCause = resolutionForRootCause;
	}
	public String getRootCauseFixed() {
		return rootCauseFixed;
	}
	public void setRootCauseFixed(String rootCauseFixed) {
		this.rootCauseFixed = rootCauseFixed;
	}
	public String getCommunicateWithTheCustomer() {
		return communicateWithTheCustomer;
	}
	public void setCommunicateWithTheCustomer(String communicateWithTheCustomer) {
		this.communicateWithTheCustomer = communicateWithTheCustomer;
	}
	public String getSelectTheModeOfCommunication() {
		return selectTheModeOfCommunication;
	}
	public void setSelectTheModeOfCommunication(String selectTheModeOfCommunication) {
		this.selectTheModeOfCommunication = selectTheModeOfCommunication;
	}
	public String getMailWillBeSentTo() {
		return mailWillBeSentTo;
	}
	public void setMailWillBeSentTo(String mailWillBeSentTo) {
		this.mailWillBeSentTo = mailWillBeSentTo;
	}
	public String getDoYouWantToCloseTheCall() {
		return doYouWantToCloseTheCall;
	}
	public void setDoYouWantToCloseTheCall(String doYouWantToCloseTheCall) {
		this.doYouWantToCloseTheCall = doYouWantToCloseTheCall;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getFollowUpCount() {
		return followUpCount;
	}
	public void setFollowUpCount(String followUpCount) {
		this.followUpCount = followUpCount;
	}
	public String getFollowUpDays() {
		return followUpDays;
	}
	public void setFollowUpDays(String followUpDays) {
		this.followUpDays = followUpDays;
	}
	public String getFollowupDone() {
		return followupDone;
	}
	public void setFollowupDone(String followupDone) {
		this.followupDone = followupDone;
	}
	public String getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(String followUpDate) {
		this.followUpDate = followUpDate;
	}
	public String getResolutionMode1() {
		return resolutionMode1;
	}
	public void setResolutionMode1(String resolutionMode1) {
		this.resolutionMode1 = resolutionMode1;
	}
	public String getResolutionMode2() {
		return resolutionMode2;
	}
	public void setResolutionMode2(String resolutionMode2) {
		this.resolutionMode2 = resolutionMode2;
	}
	public String getResolutionMode3() {
		return resolutionMode3;
	}
	public void setResolutionMode3(String resolutionMode3) {
		this.resolutionMode3 = resolutionMode3;
	}
	public String getResolutionMode4() {
		return resolutionMode4;
	}
	public void setResolutionMode4(String resolutionMode4) {
		this.resolutionMode4 = resolutionMode4;
	}
	public String getActivityNo() {
		return activityNo;
	}
	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getThirdParty() {
		return thirdParty;
	}
	public void setThirdParty(String thirdParty) {
		this.thirdParty = thirdParty;
	}
	public String getSlaDate() {
		return slaDate;
	}
	public void setSlaDate(String slaDate) {
		this.slaDate = slaDate;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getMembersResponsible() {
		return membersResponsible;
	}
	public void setMembersResponsible(String membersResponsible) {
		this.membersResponsible = membersResponsible;
	}
	public String getSla() {
		return sla;
	}
	public void setSla(String sla) {
		this.sla = sla;
	}
	public String getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getEscalationTo() {
		return escalationTo;
	}
	public void setEscalationTo(String escalationTo) {
		this.escalationTo = escalationTo;
	}
	public String getAshNumber() {
		return ashNumber;
	}
	public void setAshNumber(String ashNumber) {
		this.ashNumber = ashNumber;
	}
	public String getActivityName1() {
		return activityName1;
	}
	public void setActivityName1(String activityName1) {
		this.activityName1 = activityName1;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getSla1() {
		return sla1;
	}
	public void setSla1(String sla1) {
		this.sla1 = sla1;
	}
	public String getEndDateTime2() {
		return endDateTime2;
	}
	public void setEndDateTime2(String endDateTime2) {
		this.endDateTime2 = endDateTime2;
	}
	public String getEscalationTo2() {
		return escalationTo2;
	}
	public void setEscalationTo2(String escalationTo2) {
		this.escalationTo2 = escalationTo2;
	}
	public String getSla2() {
		return sla2;
	}
	public void setSla2(String sla2) {
		this.sla2 = sla2;
	}
	public String getEndDateTime3() {
		return endDateTime3;
	}
	public void setEndDateTime3(String endDateTime3) {
		this.endDateTime3 = endDateTime3;
	}
	public String getEscalationTo3() {
		return escalationTo3;
	}
	public void setEscalationTo3(String escalationTo3) {
		this.escalationTo3 = escalationTo3;
	}
	public String getIrdaComplaintTypeId() {
		return irdaComplaintTypeId;
	}
	public void setIrdaComplaintTypeId(String irdaComplaintTypeId) {
		this.irdaComplaintTypeId = irdaComplaintTypeId;
	}
	public String getIrdaComplaintDescriptionId() {
		return irdaComplaintDescriptionId;
	}
	public void setIrdaComplaintDescriptionId(String irdaComplaintDescriptionId) {
		this.irdaComplaintDescriptionId = irdaComplaintDescriptionId;
	}
	public String getIrdaTat() {
		return irdaTat;
	}
	public void setIrdaTat(String irdaTat) {
		this.irdaTat = irdaTat;
	}
	public String getActivitynoLog() {
		return activitynoLog;
	}
	public void setActivitynoLog(String activitynoLog) {
		this.activitynoLog = activitynoLog;
	}
	public String getActivityNameLog() {
		return activityNameLog;
	}
	public void setActivityNameLog(String activityNameLog) {
		this.activityNameLog = activityNameLog;
	}
	public String getIfReassignedToWhom() {
		return ifReassignedToWhom;
	}
	public void setIfReassignedToWhom(String ifReassignedToWhom) {
		this.ifReassignedToWhom = ifReassignedToWhom;
	}
	public String getWaitingDays() {
		return waitingDays;
	}
	public void setWaitingDays(String waitingDays) {
		this.waitingDays = waitingDays;
	}
	public String getAwbNumber() {
		return awbNumber;
	}
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


}
