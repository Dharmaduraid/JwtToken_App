package com.rs.cdpapp.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rs.cdpapp.config.security.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	Optional<List<UserEntity>> findByCreadtedBy(String userName);
	
	
Optional<UserEntity> findByUsername(String userName);
	
@Query(value="select USER_NAME from CDP_A_USERS WHERE USER_NAME=?1",nativeQuery=true)
List<String> findByUserName(String userName);

}
