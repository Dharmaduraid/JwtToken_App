/**
 * 
 */
package com.rs.cdpapp.config.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rs.cdpapp.config.security.entity.LoginHistoryEntity;
/**
 * @author Nandhu
 *
 */
@Repository
public interface LoginHistoryRepository extends JpaRepository<LoginHistoryEntity, Long> {

	
	@Modifying
	@Transactional
	@Query(value = "UPDATE CDP_LOGIN_HISTORY SET STATUS=?3 WHERE USERID=?1 AND STATUS=?2", nativeQuery = true)
	void loginHistoryUpdate(String userId, String status,String updateStatus);

	List<LoginHistoryEntity> findByUseridAndStatus(String userid, String value);

}
