package com.rs.cdpapp.common.util;

public interface QueryString {
	
	//public final  static String GETVALUEBYSERIALORPOLICYNUM=" select *  from rsa_cims_updatedinfo where SERIALNO = :serialNumber";

	//public final  static String GETVALUEBYRPOLICYNUMBER=" select *  from rsa_cims_updatedinfo where sPolicynoSRCH = :policyNumber";

	//public final  static String GETVALUEBYSERIALNUM=" select *  from rsa_cims_updatedinfo where SERIALNO like :serialNumber";
	
	public final static String GETDOCUMENTPATH=" select SERIALNO,SATTACHMENTLINK from rsa_cims_attachment where SERIALNO = :serialNumber";
	
	public final static String GETUSERNAME="SELECT * FROM CDP_A_USERS WHERE USER_NAME = :userName";
	
	public final static String GETARCHIVALDATA="SELECT * FROM RSA_CIMS_ARCHIVAL_INDEX WHERE POLICYNO=:policyNo and SERIALNO NOT IN(:serialNumber)";
	
	public final  static String GETVALUEBYSERIALNUM="SELECT A.serialno,A.dtcapturedate,A.sempcode,A.sactivityno,A.sIRDAAccepted,A.sIRDAAcceptedDisp,A.sIRDALetterDate,A.sIRDALetterDateDisp,A.sIRDAVRemarks,A.sIRDAVRemarksDisp,"
			+"A.sIRDASuggestion,A.sIRDAActionDisp,A.sIRDAAction,A.sIRDASuggestionDisp,A.spriorityhandlingid,A.spriorityhandlingname,A.sremarks,A.sComplaintOrigination,A.stxReopenOrigination,A.sctxtenamAddressedTo,"
			+"A.snamesearchby,A.scitysrch_1,A.schqnosrch_1,A.svehiclenosrch_1,A.ssearchcriteria,A.spolicy,A.semailsrch,A.scontactno,A.sInteractionTypeDisp,"
			+"A.svip,A.spolicynosrch,A.slifepolicynosrch,A.scombipolicynosrch,A.schqnosrch,A.svehiclenosrch_1,A.saddressdisp1,A.spermaddressdisp1,A.sstate,A.spermaddressdisp4,"
			+"A.stelno,A.sregphdisp,A.slifepolicynodisp,A.scombipolicynodisp,A.scitysrch_1,A.speriodfromdisptp,A.speriodtodisptp,A.svehiclenodisp,A.svehiclemakedisp,A.smodeldisp,"
			+"A.sagcode1,A.sagmobileno,A.saglocation,A.sagstate,A.sagregion,A.sagemailid,A.saglicence,A.sagpanno,A.spudisp,A.scustpolicynodisp,A.shcnodisp,A.ssatisfy_score_tx,"
			+"A.swwcidvdisp,A.swwcrnlncbdisp,A.swwcpremiumdisp,A.swwcstatusdisp,A.swwconlinerenewaloptiondisp,A.sbccmembers,A.sclaimreportnewdisp,A.sclaimpaiddisp,A.sclaimscity,A.sclaimlocation,"
			+"A.sclaimarea,A.sclaimareaother,A.sresponseyear1,A.sResponseMon1,A.slinkdisp,A.scoviddisp,A.scomplaintclaimmailsent,A.siclassificationdisp,A.shealthsubcat,A.scs_ops,A.sadresscorrection,"
			+"A.sadresscorrectiondisp,A.sctxtadd1,A.sctxtadd2,A.sctxtadd3,A.sctxtadd4,A.sctxtastate,A.sapincode,A.sctxtacity,A.saccitycodedb,A.sacstateid,A.saccityid,A.sacstatecodedb,"
			+"A.sstatehide,A.scityhide,A.srenewalnotice,A.srenewalteamcallback,A.scustemail,A.smailrequest,A.sd2c,A.scbunderlyingcause_5,A.scbunderlyingcause_6,A.scbunderlyingcause_7,"
			+"A.sneftclaim_1,A.sneftclaimsform_1,A.scustemaildisp_1,A.sclaim_2,A.sclaimsform_2,A.scustemaildisp_2,A.sclaim_3,A.sclaimsform_3,A.scustemaildisp_3,A.sclaim_4,A.sclaimsform_4,A.scustemaildisp_4,"
			+"A.sclaim_5,A.sclaimsform_5,A.scustemaildisp_5,A.sclaim_6,A.sclaimsform_6,A.scustemaildisp_6,A.sretention_tool,A.sbranch,A.sinstapaylink,A.spremiumamountdisp,A.sackstatusdisp,"
			+"A.sfinalresstatusdisp,A.sclaimsform,A.scustemaildisp,A.soirdatokenno,A.scomplaintinformeddisp,A.sacceprej_1,A.SReassign,A.SReassignTo,A.SIntimatedBy,A.SDateofloss,A.sintdatetime,"
			+"A.sdateofloss,A.SClaimHours,A.SClaimMins,A.SClaimAM,A.SRepairerName,A.SRepairerAddss,A.SRepairerContNo,A.SRelationship,A.SPersonSpoc,A.SMobilenoClaim,A.SDriverName,A.SIsInjured,"
			+"A.SAccState,A.SAccCity,A.SCurrentVLocation,A.SLossLocation,A.SModofIntimation,A.SDPReassign,A.SDPReassignTo,A.SIRDAComment,A.SApprComment,A.SCustomerUpdation,A.SNRCause,"
			+"A.SCAComment,A.SRCF,A.SCommunicate,A.SModeCom,A.SCCMail,A.SCloseCall,A.SFollowUpCount,A.SnmFollowUpDays,A.SFollowUpDone,A.SFollowUpDate,A.SActivityno,A.SActivityname,A.SFlag,A.sEmail_4,A.sResPh_5,A.sOfficePh_6,A.sOfficeFax_7,"
			+"A.SFunction,A.SThirdParty,A.SACTIVITYNO,A.SACTIVITYNAME,A.SCondition,A.SDatetimeLog_1,A.STeamName,A.SMemberResp,A.SIRDAID,A.SIRDADescID,A.SIRDATAT,A.sretention_tool,A.SRESOLUTIONMODE1,A.SRESOLUTIONMODE2,A.SRESOLUTIONMODE3,A.SRESOLUTIONMODE4,"
			+"A.sdeliverystatusdisp,A.smailingdtdisp,A.sdespdtdisp,A.sdespmodedisp,A.sdespthrudisp,A.sdeliveredtodisp,A.sdeliverydtdisp,A.sconsignnodisp,A.sawbnumber,A.ssla,A.ssla_1,A.ssla_2,A.sactivitynamelog,A.SActivitynoLog,A.sactivitynamelog,A.sreassignedlog,A.swaitingtimelog,"
			+"B.scustomername,B.scurrentstatus,B.stypeofinteraction,B.sinteractionclassification,B.sinteractioncause,B.soperator,B.slocation,B.scurrentstatus,B.smobile,B.smobile2,B.sproductdesc,B.scampaign,B.dtpolicyincepdate,A.sNatureofloss,"
			+"B.dtpolicyexpdate,B.sagent,B.sagent_name,B.sbank_ac_number,B.sclient_premium,B.scheque_number,B.sreceiptno,B.sfeedback,A.SCOVERNOTESRCHSPY,A.ssla1datetime,A.ssla2datetime,A.ssla3datetime,A.sescalation1,A.sescalation2,A.sescalation3,A.SIRDAID,A.SIRDADescID,A.SIRDATAT,"
			+"A.SCAMPCODESRCHSPY from RSA_CIMS_UPDATEDINFO A LEFT JOIN RSA_CIMS_INTERACTION_DETAIL B ON A.SERIALNO=B.SERIALNO WHERE (A.SERIALNO   like :serialNumber AND B.SERIALNO   like :serialNumber) OR A.SERIALNO   like :serialNumber";


	public final  static String GETVALUEBYRPOLICYNUMBER="SELECT A.serialno,A.dtcapturedate,A.sempcode,A.sactivityno,A.sIRDAAccepted,A.sIRDAAcceptedDisp,A.sIRDALetterDate,A.sIRDALetterDateDisp,A.sIRDAVRemarks,A.sIRDAVRemarksDisp,"
			+"A.sIRDASuggestion,A.sIRDAActionDisp,A.sIRDAAction,A.sIRDASuggestionDisp,A.spriorityhandlingid,A.spriorityhandlingname,A.sremarks,A.sComplaintOrigination,A.stxReopenOrigination,A.sctxtenamAddressedTo,"
			+"A.snamesearchby,A.scitysrch_1,A.schqnosrch_1,A.svehiclenosrch_1,A.ssearchcriteria,A.spolicy,A.semailsrch,A.scontactno,A.sInteractionTypeDisp,"
			+"A.svip,A.spolicynosrch,A.slifepolicynosrch,A.scombipolicynosrch,A.schqnosrch,A.svehiclenosrch_1,A.saddressdisp1,A.spermaddressdisp1,A.sstate,A.spermaddressdisp4,"
			+"A.stelno,A.sregphdisp,A.slifepolicynodisp,A.scombipolicynodisp,A.scitysrch_1,A.speriodfromdisptp,A.speriodtodisptp,A.svehiclenodisp,A.svehiclemakedisp,A.smodeldisp,"
			+"A.sagcode1,A.sagmobileno,A.saglocation,A.sagstate,A.sagregion,A.sagemailid,A.saglicence,A.sagpanno,A.spudisp,A.scustpolicynodisp,A.shcnodisp,A.ssatisfy_score_tx,"
			+"A.swwcidvdisp,A.swwcrnlncbdisp,A.swwcpremiumdisp,A.swwcstatusdisp,A.swwconlinerenewaloptiondisp,A.sbccmembers,A.sclaimreportnewdisp,A.sclaimpaiddisp,A.sclaimscity,A.sclaimlocation,"
			+"A.sclaimarea,A.sclaimareaother,A.sresponseyear1,A.sResponseMon1,A.slinkdisp,A.scoviddisp,A.scomplaintclaimmailsent,A.siclassificationdisp,A.shealthsubcat,A.scs_ops,A.sadresscorrection,"
			+"A.sadresscorrectiondisp,A.sctxtadd1,A.sctxtadd2,A.sctxtadd3,A.sctxtadd4,A.sctxtastate,A.sapincode,A.sctxtacity,A.saccitycodedb,A.sacstateid,A.saccityid,A.sacstatecodedb,"
			+"A.sstatehide,A.scityhide,A.srenewalnotice,A.srenewalteamcallback,A.scustemail,A.smailrequest,A.sd2c,A.scbunderlyingcause_5,A.scbunderlyingcause_6,A.scbunderlyingcause_7,"
			+"A.sneftclaim_1,A.sneftclaimsform_1,A.scustemaildisp_1,A.sclaim_2,A.sclaimsform_2,A.scustemaildisp_2,A.sclaim_3,A.sclaimsform_3,A.scustemaildisp_3,A.sclaim_4,A.sclaimsform_4,A.scustemaildisp_4,"
			+"A.sclaim_5,A.sclaimsform_5,A.scustemaildisp_5,A.sclaim_6,A.sclaimsform_6,A.scustemaildisp_6,A.sretention_tool,A.sbranch,A.sinstapaylink,A.spremiumamountdisp,A.sackstatusdisp,"
			+"A.sfinalresstatusdisp,A.sclaimsform,A.scustemaildisp,A.soirdatokenno,A.scomplaintinformeddisp,A.sacceprej_1,A.SReassign,A.SReassignTo,A.SIntimatedBy,A.SDateofloss,A.sintdatetime,"
			+"A.sdateofloss,A.SClaimHours,A.SClaimMins,A.SClaimAM,A.SRepairerName,A.SRepairerAddss,A.SRepairerContNo,A.SRelationship,A.SPersonSpoc,A.SMobilenoClaim,A.SDriverName,A.SIsInjured,"
			+"A.SAccState,A.SAccCity,A.SCurrentVLocation,A.SLossLocation,A.SModofIntimation,A.SDPReassign,A.SDPReassignTo,A.SIRDAComment,A.SApprComment,A.SCustomerUpdation,A.SNRCause,"
			+"A.SCAComment,A.SRCF,A.SCommunicate,A.SModeCom,A.SCCMail,A.SCloseCall,A.SFollowUpCount,A.SnmFollowUpDays,A.SFollowUpDone,A.SFollowUpDate,A.SActivityno,A.SActivityname,A.SFlag,A.sEmail_4,A.sResPh_5,A.sOfficePh_6,A.sOfficeFax_7,"
			+"A.SFunction,A.SThirdParty,A.SACTIVITYNO,A.SACTIVITYNAME,A.SCondition,A.SDatetimeLog_1,A.STeamName,A.SMemberResp,A.SIRDAID,A.SIRDADescID,A.SIRDATAT,A.sretention_tool,A.SRESOLUTIONMODE1,A.SRESOLUTIONMODE2,A.SRESOLUTIONMODE3,A.SRESOLUTIONMODE4,"
			+"A.sdeliverystatusdisp,A.smailingdtdisp,A.sdespdtdisp,A.sdespmodedisp,A.sdespthrudisp,A.sdeliveredtodisp,A.sdeliverydtdisp,A.sconsignnodisp,A.sawbnumber,A.ssla,A.ssla_1,A.ssla_2,A.sactivitynamelog,A.SActivitynoLog,A.sactivitynamelog,A.sreassignedlog,A.swaitingtimelog,"
			+"B.scustomername,B.scurrentstatus,B.stypeofinteraction,B.sinteractionclassification,B.sinteractioncause,B.soperator,B.slocation,B.scurrentstatus,B.smobile,B.smobile2,B.sproductdesc,B.scampaign,B.dtpolicyincepdate,A.sNatureofloss,"
			+"B.dtpolicyexpdate,B.sagent,B.sagent_name,B.sbank_ac_number,B.sclient_premium,B.scheque_number,B.sreceiptno,B.sfeedback,A.SCOVERNOTESRCHSPY,A.ssla1datetime,A.ssla2datetime,A.ssla3datetime,A.sescalation1,A.sescalation2,A.sescalation3,A.SIRDAID,A.SIRDADescID,A.SIRDATAT,"
			+"A.SCAMPCODESRCHSPY from RSA_CIMS_UPDATEDINFO A LEFT JOIN RSA_CIMS_INTERACTION_DETAIL B ON A.SPOLICYNOSRCH=B.SPOLICYNOSRCH WHERE (A.SPOLICYNOSRCH=:policyNumber AND B.SPOLICYNOSRCH=:policyNumber) OR A.SPOLICYNOSRCH=:policyNumber";


	
	public final static String GETVALUEBYSERIALORPOLICYNUM="SELECT A.serialno,A.dtcapturedate,A.sempcode,A.sactivityno,A.sIRDAAccepted,A.sIRDAAcceptedDisp,A.sIRDALetterDate,A.sIRDALetterDateDisp,A.sIRDAVRemarks,A.sIRDAVRemarksDisp,"
			+"A.sIRDASuggestion,A.sIRDAActionDisp,A.sIRDAAction,A.sIRDASuggestionDisp,A.spriorityhandlingid,A.spriorityhandlingname,A.sremarks,A.sComplaintOrigination,A.stxReopenOrigination,A.sctxtenamAddressedTo,"
			+"A.snamesearchby,A.scitysrch_1,A.schqnosrch_1,A.svehiclenosrch_1,A.ssearchcriteria,A.spolicy,A.semailsrch,A.scontactno,A.sInteractionTypeDisp,"
			+"A.svip,A.spolicynosrch,A.slifepolicynosrch,A.scombipolicynosrch,A.schqnosrch,A.svehiclenosrch_1,A.saddressdisp1,A.spermaddressdisp1,A.sstate,A.spermaddressdisp4,"
			+"A.stelno,A.sregphdisp,A.slifepolicynodisp,A.scombipolicynodisp,A.scitysrch_1,A.speriodfromdisptp,A.speriodtodisptp,A.svehiclenodisp,A.svehiclemakedisp,A.smodeldisp,"
			+"A.sagcode1,A.sagmobileno,A.saglocation,A.sagstate,A.sagregion,A.sagemailid,A.saglicence,A.sagpanno,A.spudisp,A.scustpolicynodisp,A.shcnodisp,A.ssatisfy_score_tx,"
			+"A.swwcidvdisp,A.swwcrnlncbdisp,A.swwcpremiumdisp,A.swwcstatusdisp,A.swwconlinerenewaloptiondisp,A.sbccmembers,A.sclaimreportnewdisp,A.sclaimpaiddisp,A.sclaimscity,A.sclaimlocation,"
			+"A.sclaimarea,A.sclaimareaother,A.sresponseyear1,A.sResponseMon1,A.slinkdisp,A.scoviddisp,A.scomplaintclaimmailsent,A.siclassificationdisp,A.shealthsubcat,A.scs_ops,A.sadresscorrection,"
			+"A.sadresscorrectiondisp,A.sctxtadd1,A.sctxtadd2,A.sctxtadd3,A.sctxtadd4,A.sctxtastate,A.sapincode,A.sctxtacity,A.saccitycodedb,A.sacstateid,A.saccityid,A.sacstatecodedb,"
			+"A.sstatehide,A.scityhide,A.srenewalnotice,A.srenewalteamcallback,A.scustemail,A.smailrequest,A.sd2c,A.scbunderlyingcause_5,A.scbunderlyingcause_6,A.scbunderlyingcause_7,"
			+"A.sneftclaim_1,A.sneftclaimsform_1,A.scustemaildisp_1,A.sclaim_2,A.sclaimsform_2,A.scustemaildisp_2,A.sclaim_3,A.sclaimsform_3,A.scustemaildisp_3,A.sclaim_4,A.sclaimsform_4,A.scustemaildisp_4,"
			+"A.sclaim_5,A.sclaimsform_5,A.scustemaildisp_5,A.sclaim_6,A.sclaimsform_6,A.scustemaildisp_6,A.sretention_tool,A.sbranch,A.sinstapaylink,A.spremiumamountdisp,A.sackstatusdisp,"
			+"A.sfinalresstatusdisp,A.sclaimsform,A.scustemaildisp,A.soirdatokenno,A.scomplaintinformeddisp,A.sacceprej_1,A.SReassign,A.SReassignTo,A.SIntimatedBy,A.SDateofloss,A.sintdatetime,"
			+"A.sdateofloss,A.SClaimHours,A.SClaimMins,A.SClaimAM,A.SRepairerName,A.SRepairerAddss,A.SRepairerContNo,A.SRelationship,A.SPersonSpoc,A.SMobilenoClaim,A.SDriverName,A.SIsInjured,"
			+"A.SAccState,A.SAccCity,A.SCurrentVLocation,A.SLossLocation,A.SModofIntimation,A.SDPReassign,A.SDPReassignTo,A.SIRDAComment,A.SApprComment,A.SCustomerUpdation,A.SNRCause,"
			+"A.SCAComment,A.SRCF,A.SCommunicate,A.SModeCom,A.SCCMail,A.SCloseCall,A.SFollowUpCount,A.SnmFollowUpDays,A.SFollowUpDone,A.SFollowUpDate,A.SActivityno,A.SActivityname,A.SFlag,A.sEmail_4,A.sResPh_5,A.sOfficePh_6,A.sOfficeFax_7,"
			+"A.SFunction,A.SThirdParty,A.SACTIVITYNO,A.SACTIVITYNAME,A.SCondition,A.SDatetimeLog_1,A.STeamName,A.SMemberResp,A.SIRDAID,A.SIRDADescID,A.SIRDATAT,A.sretention_tool,A.SRESOLUTIONMODE1,A.SRESOLUTIONMODE2,A.SRESOLUTIONMODE3,A.SRESOLUTIONMODE4,"
			+"A.sdeliverystatusdisp,A.smailingdtdisp,A.sdespdtdisp,A.sdespmodedisp,A.sdespthrudisp,A.sdeliveredtodisp,A.sdeliverydtdisp,A.sconsignnodisp,A.sawbnumber,A.ssla,A.ssla_1,A.ssla_2,A.sactivitynamelog,A.SActivitynoLog,A.sactivitynamelog,A.sreassignedlog,A.swaitingtimelog,"
			+"B.scustomername,B.scurrentstatus,B.stypeofinteraction,B.sinteractionclassification,B.sinteractioncause,B.soperator,B.slocation,B.scurrentstatus,B.smobile,B.smobile2,B.sproductdesc,B.scampaign,B.dtpolicyincepdate,A.sNatureofloss,"
			+"B.dtpolicyexpdate,B.sagent,B.sagent_name,B.sbank_ac_number,B.sclient_premium,B.scheque_number,B.sreceiptno,B.sfeedback,A.SCOVERNOTESRCHSPY,A.ssla1datetime,A.ssla2datetime,A.ssla3datetime,A.sescalation1,A.sescalation2,A.sescalation3,A.SIRDAID,A.SIRDADescID,A.SIRDATAT,"
			+"A.SCAMPCODESRCHSPY from rsa_cims_updatedinfo A,RSA_CIMS_INTERACTION_DETAIL B WHERE A.SERIALNO=:serialNumber OR B.SERIALNO=:serialNumber";

	



// public final static String GETVALUEBYSERIALNUMSEARCH="select A.SERIALNO,A.SCUSTOMERNAME,A.DTCAPTUREDATE,A.SOPERATOR ,A.SCURRENTSTATUS,A.STYPEOFINTERACTION,A.SINTERACTIONCLASSIFICATION,A.SINTERACTIONCAUSE FROM"
// 		+ " RSA_CIMS_INTERACTION_DETAIL A LEFT JOIN RSA_CIMS_UPDATEDINFO B ON A.SERIALNO=B.SERIALNO WHERE (A.SERIALNO  like :serialNumber AND B.SERIALNO  LIKE:serialNumber) OR A.SERIALNO  like:serialNumber";

 
//public final static String GETVALUEFORSOURCE="SELECT B.SEMPCODE,A.SOPERATOR,B.SACTIVITYNO,B.SIRDAACCEPTED,B.SIRDAACCEPTEDDISP,B.SIRDALETTERDATE,B.SIRDALETTERDATEDISP,B.SIRDAVREMARKS,"
//     +"B.SIRDAVREMARKSDISP,B.SIRDASUGGESTION,B.SIRDAACTIONDISP,B.SIRDAACTION,B.SIRDASUGGESTIONDISP,B.SPRIORITYHANDLINGID,B.SPRIORITYHANDLINGNAME,B.SREMARKS,A.SLOCATION,A.SCURRENTSTATUS,B.SCOMPLAINTORIGINATION,"
//     + "B.STXREOPENORIGINATION,B.SCTXTENAMADDRESSEDTOfrom RSA_CIMS_INTERACTION_DETAIL A,RSA_CIMS_UPDATEDINFO B WHERE A.SERIALNO=:serialNumber OR B.SERIALNO=:serialNumber";
//
//public final static String GETVALUEFORPOLICY="SELECT B.SNAMESEARCHBY,B.SCOVERNOTESRCHSPY,B.SCAMPCODESRCHSPY,B.SCITYSRCH_1,B.SCHQNOSRCH_1,B.SVEHICLENOSRCH_1,B.SSEARCHCRITERIA,"
//+ "B.SPOLICY,B.SEMAILSRCH,B.SCONTACTNO,B.SVIP,B.SPOLICYNOSRCH,B.SLIFEPOLICYNOSRCH,B.SCOMBIPOLICYNOSRCH,B.SCHQNOSRCH,B.SVEHICLENOSRCH_1,B.SADDRESSDISP1,"
//+ "B.SPERMADDRESSDISP1,B.SSTATE,B.SPERMADDRESSDISP4,A.SMOBILE,A.SMOBILE2,B.STELNO,B.SREGPHDISP,A.SPRODUCTDESC,A.SCAMPAIGN,B.SLIFEPOLICYNODISP,"
//+ "B.SCOMBIPOLICYNODISP,B.SCITYSRCH_1,A.DTPOLICYINCEPDATE,A.DTPOLICYEXPDATE,B.SPERIODFROMDISPTP,B.SPERIODTODISPTP,B.SVEHICLENODISP,"
//+ "B.SVEHICLEMAKEDISP,B.SMODELDISP,A.spolicypassworddisp,A.SAGENT,B.SAGCODE1,A.SAGENT_NAME,B.SAGMOBILENO,B.SAGLOCATION,B.SAGSTATE,"
//+ "B.SAGREGION,B.SAGEMAILID,B.SAGLICENCE,B.SAGPANNO,B.SPUDISP,A.SBANK_AC_NUMBER,A.SCLIENT_PREMIUM,A.SCHEQUE_NUMBER,A.SRECEIPTNO,"
//+ "B.SCUSTPOLICYNODISP,B.SHCNODISP,B.SSATISFY_SCORE_TX FROM RSA_CIMS_INTERACTION_DETAIL A,RSA_CIMS_UPDATEDINFO B WHEREA.SERIALNO=:serialNumber OR B.SERIALNO=:serialNumber";

}

