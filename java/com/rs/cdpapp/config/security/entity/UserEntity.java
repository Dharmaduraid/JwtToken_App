/**
 * 
 */
package com.rs.cdpapp.config.security.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Nandhu
 *
 */
@Entity(name = "CDP_A_USERS")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CDP_A_USERS_SEQ")
	@SequenceGenerator(name = "CDP_A_USERS_SEQ", sequenceName = "CDP_A_USERS_SEQ", allocationSize = 1)
	@Column(name="ID")
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "PASSWORD")
	@JsonIgnore
	private String password;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL, })
	@JoinTable(name = "CDP_A_USERS_ROLES_MAPPING", joinColumns = {
			@JoinColumn(name = "A_USERS_ID") }, inverseJoinColumns = { @JoinColumn(name = "A_ROLES_ID") })
	private Set<UserRolesEntity> userRoles = new HashSet<>();

	@Column(name = "STATUS")
	private String status;
	
	@Column(name="MOBILE_NUM")
	private String mobileNum;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="LASTMODIFIED_DATE")
	private Date lastModifiedDate;
	
	@Column(name="EMPLOYEE_ID")
	private String employeeId;
	
	@Column(name="EMAIL_ID")
	private String email;
	
	@Column(name="CREATED_BY")
	private String creadtedBy;
	
	
	
	public String getCreadtedBy() {
		return creadtedBy;
	}

	public void setCreadtedBy(String creadtedBy) {
		this.creadtedBy = creadtedBy;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserRolesEntity> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRolesEntity> userRoles) {
		this.userRoles = userRoles;
	}

}
