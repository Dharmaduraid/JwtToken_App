package com.rs.cdpapp.config.security.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.PersistenceException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rs.cdpapp.config.constants.ApplicationConstants;
import com.rs.cdpapp.config.security.dto.UserContext;
import com.rs.cdpapp.config.security.entity.LoginHistoryEntity;
import com.rs.cdpapp.config.security.entity.UserEntity;
import com.rs.cdpapp.config.security.repository.LoginHistoryRepository;
import com.rs.cdpapp.config.security.repository.UserEntityRepository;
import com.rs.cdpapp.config.security.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	UserEntityRepository userEntityRepository;

	@Resource
	LoginHistoryRepository loginHistoryRepository;

	@Override
	public UserEntity getByUserName(String userId) {
		return userEntityRepository.findByUsernameAndStatus(userId, ApplicationConstants.ACTIVE.getValue());
	}

	@Override
	public void updateToLoginHistory(UserContext userContext, String accessToken, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("Enter into loginServiceImpl  -- updateToLoginHistory ");
		try {
			loginHistoryRepository.loginHistoryUpdate(userContext.getUserId(),
					ApplicationConstants.ACTIVE.getValue(), ApplicationConstants.INACTIVE.getValue());

			LoginHistoryEntity loginHistoryEntity = new LoginHistoryEntity();
			loginHistoryEntity.setUserName(userContext.getUserName());
			loginHistoryEntity.setHostName(request.getRemoteHost());
			loginHistoryEntity.setIpAddress(request.getRemoteAddr());
			loginHistoryEntity.setBrowser(request.getHeader("User-Agent"));
			loginHistoryEntity.setToken(accessToken);
			loginHistoryEntity.setUserid(userContext.getUserId());
			loginHistoryEntity.setStatus(ApplicationConstants.ACTIVE.getValue());
			if (loginHistoryRepository.save(loginHistoryEntity).getId() != null) {
				logger.info("Login History Details Stored Successfully");
			} else {
				logger.info("Login History Details will not Store Failure");
			}
		} catch (Exception e) {
			logger.error("updateToLoginHistory in LoginServiceImpl :: Error in Store the LoginHistory Details", e);
		}
		logger.info("Exit From loginServiceImpl  -- updateToLoginHistory ");
	}

	@Override
	public String getTokenDetails(String userid) {

		List<LoginHistoryEntity> loginHistoryMaster = null;
		try {
			loginHistoryMaster = loginHistoryRepository.findByUseridAndStatus(userid,
					ApplicationConstants.ACTIVE.getValue());
			if (null != loginHistoryMaster) {
				return loginHistoryMaster.get(0).getToken();
			} else {
				logger.error("Token Details Not Available for the user in DB");
			}
		} catch (PersistenceException e) {
			logger.info("Error in getTokenDetails in  loginservice Impl ", e);
		}
		return "";
	}

}
