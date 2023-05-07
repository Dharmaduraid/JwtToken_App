/**
 * 
 */
package com.rs.cdpapp.config.security.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

/**
 * @author Nandhu
 *
 */
@Entity(name = "CDP_A_ROLES")
public class UserRolesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CDP_A_ROLES_SEQ")
	@SequenceGenerator(name = "CDP_A_ROLES_SEQ", sequenceName = "CDP_A_ROLES_SEQ", allocationSize = 1)
	@Column(name="ID")
	private Long id;

	@Column(name = "ROLE_NAME")
	private String roleName;
	
	
	@Column(name = "ROLE_CREATER")
	private String roleCreater;

	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL, }, mappedBy = "userRoles")
	private Set<UserEntity> aUsers = new HashSet<>();
	
	

	public String getRoleCreater() {
		return roleCreater;
	}

	public void setRoleCreater(String roleCreater) {
		this.roleCreater = roleCreater;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserEntity> getaUsers() {
		return aUsers;
	}

	public void setaUsers(Set<UserEntity> aUsers) {
		this.aUsers = aUsers;
	}

}
