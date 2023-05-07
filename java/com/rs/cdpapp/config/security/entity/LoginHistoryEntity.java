/**
 * 
 */
package com.rs.cdpapp.config.security.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Nandhu
 *
 */
@Entity
@Table(name = "CDP_LOGIN_HISTORY")
public class LoginHistoryEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CDP_LOGIN_HISTORY_SEQ")
	@SequenceGenerator(name = "CDP_LOGIN_HISTORY_SEQ", sequenceName = "CDP_LOGIN_HISTORY_SEQ", allocationSize = 1)
	@Column(name="ID")
	private Integer id;

	@Column(name = "USERID")
	private String userid;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "HOSTNAME")
	private String hostName;

	@Column(name = "IPADDRESS")
	private String ipAddress;

	@Column(name = "STATUS")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOGINTIME")
	private Date loginTime = new Date();

	@Column(name = "BROWSER")
	private String browser;

	@Column(name = "TOKEN")
	private String token;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
