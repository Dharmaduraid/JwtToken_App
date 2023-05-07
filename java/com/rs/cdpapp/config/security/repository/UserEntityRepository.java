package com.rs.cdpapp.config.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.cdpapp.config.security.entity.UserEntity;

/**
 * 
 * @author Nandhu
 *
 */
@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findByUsername(String username);

	Optional<UserEntity> findById(Long id);

	UserEntity findByUsernameAndStatus(String userId, String value);

}
