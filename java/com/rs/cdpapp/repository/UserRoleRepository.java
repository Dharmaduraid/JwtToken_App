package com.rs.cdpapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rs.cdpapp.config.security.entity.UserRolesEntity;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRolesEntity, Long> {

	@Query(value="select ROLE_NAME from CDP_A_ROLES",nativeQuery=true)
	List<String> findRoleName(String roleCreater);
	
	
	UserRolesEntity findByRoleName(String roleName);
	
}
